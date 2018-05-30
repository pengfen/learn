public class ConnDB {
	private Connection conn = null;
	public Connection getConnection() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jsp";
		String username = "root";
		String password = "123";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void connTest() {
		ConnDB conn = new ConnDB();
		System.out.println(conn.getConnection());
	}
}