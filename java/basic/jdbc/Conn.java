public class Conn {
	@Test
	public void conn() {
		/*
		    com.mysql.jdbc.Driver 包名com.mysql.jdbc 加类名 Driver
		    jdbc:mysql://localhost:3306/jdbc 协议名jdbc:子协议mysql://主机名:端口号/数据库名
		    classnotfoundException 没有加载驱动包或com.mysql.jdbc.Driver写错
		    SQLException mysql服务器没有启动或三大参数url username password写错

		    jdbc 四大配置参数
		    dirver com.mysql.jdbc.Driver
		    url jdbc:mysql://localhost:3306/jdbc
		    username root
		    password 123
		    useranem password 数据库的登录用户和密码
		*/
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "123";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println(conn);
	}
}