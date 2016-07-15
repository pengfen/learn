public class JdbcUtils {
	// 配置文件的默认配置 c3p0-config.xml
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	// 事务专用连接
	// private static Connection conn = null;
	// 添加多线程支持
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	// 使用连接池返回一个连接对象
	public static Connection getConnection() {
		// 获取自己的当前线程
		Connection conn = tl.get();
		// 当conn不等于null ---> 已经开启了事务
		if (conn != null) return conn;
		return dataSource.getConnection();
	}

	// 返回连接池对象
	public static DataSource getDataSource() {
		return dataSource;
	}

	// 开启事务
	// 获取一个connection 设置它的setAutocommit(false)
	// 保证dao中使用的连接在事务中是同一个连接

	// 创建一个Connection 设置为手动提交给dao 用让commitTransaction 或是rollbackTransaction 可以获取到
	public static void beginTransaction() {
		Connection conn = tl.get();
		if (conn != null) throw new SQLException("已经开启了事务,不能重复开启");
		conn = getConnection();
		conn.setAutoCommit(false);
		tl.set(conn);
	}

	// 提交事务 获取beginTransaction提供的Connection调用commit方法
	public static void commitTransaction() {
		Connection conn = tl.get(); // 获取当前线程的专用连接
		if (conn == null) throw new SQLException("还没有开启事务,不能提交");
		conn.commit();
		conn.close();
		// conn为null ---> 事务已经结束了 下次再调用getConnection() 返回的就不再是那个conn
		// conn = null
		tl.remove(); // 从tl中移除连接
	}

	// 回滚事务
	public static void roolbackTransaction() {
		Connection conn = tl.get();
		if (conn == null) throw new SQLException("还没有开启事务,不能回滚");
		conn.roolback();
		conn.close();
		// conn = null
		tl.remove();
	}

	// 释放资源
	public static void releaseConnection(Connection connection) {
		Connection conn = tl.get();
		// 判断是不是事务专用 是就不关闭事务专用会自动在提交或回滚中关闭
		// 不是事务专用 就要关闭
		// conn == null ---> 没有事务专用连接
		if (conn == null) {connection.close();}
		// 如果conn != null ---> 有事务就应判断参数连接是否与conn相等
		// 不等 ---> 有普通连接也应该关闭
		if (conn != connection) {connection.close();}
	}
}

//处理连接的问题无需别的类传递
//可以是事务连接也可以是普通连接
//完成对连接的释放及普通连接的关闭
public class TxQueryRunner extends QueryRunner {
	public int[] batch(String sql, Object[][] params) {
		// 得到连接执行父方法释放连接返回值
		Connection conn = JdbcUtils.getConnection();
		int[] result = spuer.batch(conn, sql, params);
		JdbcUtils.releaseConnection(conn);
		return result;
	}
}