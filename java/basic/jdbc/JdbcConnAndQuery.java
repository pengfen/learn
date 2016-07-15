public class JdbcConnAndQuery {
	@Test
	public void update() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "123";

		// 加载驱动
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username, password);

		Statement stmt = conn.createStatement();

		// 向jdbc.ab表中插入数据
		String sql = "insert into ab values(4, 4)";
		int rs = stmt.executeUpdate(sql);
		System.out.println(rs); // 输出1 这里是指影响行数

		// executeUpdate 可以做增 删 改 connection ---> statement
		// statement 语句发送器 功能就是向数据库发送语句
		// 可以发送 dml ddl
		// 更新操作
		String sql = "update ab sen num = 5 where id = 4";
		int rs = stmt.executeUpdate(sql);
		System.out.println(rs);
	}

	@Test
	public void query() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "123";

		// 加载驱动
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();

		String sql = "select * from cd";
		ResultSet rs = stmt.executeQuery(sql);

		if (rs.next()) {
			int id = rs.getInt(1);
			int num = rs.getInt("num");

			System.out.println("id = " + id + ", num = " + num);
		}
	}

	// 代码规范化 try{} 外给出引用的定义
	// try{ 内为对象实例化 } finally{ 进行关闭 }
	@Test
	public void format() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "123";

			// 加载驱动
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			// 创建发送语句器
			stmt = conn.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("编号= " + rs.getString("empno") + " 名字为 " + rs.getString("ename") + " 工资为 " + rs.getDouble("sal"));
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			// 关闭资源
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void meta() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "123";

			// 加载驱动
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			// 创建发送语句器
			stmt = conn.createStatement();
			String sql = "select * from emp";
			rs = stmt.executeQuery(sql);

			// 如果不知道表中是否存在记录以及表是什么结构
			// 得到表数据行
			int count = rs.getMetaData().getColumnCount();
			while(rs.next()) {
				for (int i = 1; i <= count; i ++) {
					System.out.print(rs.getString(i));
					if (i < count) {
						System.out.print(",");
					}
				}
				System.out.println();
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			// 关闭资源
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}