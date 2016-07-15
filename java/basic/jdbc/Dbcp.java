public class Dbcp { // dbcp 连接池
	@Test
	public void dbcp() throws SQLException {
		// 创建连接池对象 配置四大参数
		// 配置池参数 得到连接对象
		// dbcp连接所用的basicdatasource是tomcat提供的
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("123");

		dataSource.setMinActive(10);
		dataSource.setMinIdle(3);
		dataSource.setMaxActive(30);

		Connection conn = dataSource.getConnection();
		System.out.println(conn.getClass().getName());
		conn.close();
	}
}