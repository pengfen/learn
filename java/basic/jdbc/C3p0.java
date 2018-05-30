public class C3p0 {
	@Test
	public void c3p0() {
		// 创建连接池对象
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// 对池进行四大参数的配置
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/jdbc");
		dataSource.setUser("root");
		dataSource.setPassword("123");

		// 池配置
		dataSource.setAcquireIncrement(5);
		dataSource.setInitialPoolSize(10);
		dataSource.setMinPoolSize(2);
		dataSource.setMaxPoolSize(20);

		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
	}

	// 使用配置文件
	@Test
	public void c3p0conf() throws SQLException {
		// 在创建连接池对象时 这个对象就会自动加载配置文件
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
	}

	@Test
	public void c3p0Nameconf() throws SQLException {
		// 构造器的参数指定命名配置元素的名称 <named-config name="oracle-config">
		ComboPooledDataSource dataSource = new ComboPooledDataSource("oracle-config");
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
	}
}

c3p0-config.xml
<c3p0-config>
	<!-- 命名配置 -->
	<named-config name="oracle-config">
	    <!-- 连接参数配置 -->
	    <property name="jdbcUrl">jdbc:mysql://localhost:3306/jdbc</property>
	    <property name="diriverClass">com.mysql.jdbc.Driver</property>
	    <property name="user">root</property>
	    <property name="password">123</property>
	    <!-- 池参数配置 -->
	    <property name="acquireInorement">3</property>
	    <property name="initialPoolSize">5</property>
	    <property name="minPoolSize">2</property>
	    <property name="maxPoolSize">7</property>
	</named-config>
</c3p0-config>

public class JdbcUtils { // 需要c3p0.jar
	// 配置文件的默认配置c3p0-config.xml
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

	// 使用连接池返回一个连接对象
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	// 返回连接池对象
	public static DataSource getDataSource() {
		return dataSource;
	}
}