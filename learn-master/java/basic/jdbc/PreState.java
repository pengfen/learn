public class PreState {
    public boolean login(String username, String password) {
    	// 连接数据库
    	String driver = "com.mysql.jdbc.Driver";
    	String url = "jdbc:mysql://localhost:3306/jdbc";
    	String myUsername = "root";
    	String myPassword = "123";

    	Class.forName(driver);
    	Connection conn = DriverManager.getConnection(url, myUsername, myPassword);

    	Statement stmt = conn.createStatement();
    	// 注意sql语句拼接 username = '" + username + "' and password = '" + password + "'
    	// String sql = "select * from t_user where username = '" + username + "' and password = '" + password + "'";
    	// System.out.println(sql);
    	// return false;

    	String sql = "select * from t_user where username = '" + username + "' and password = '" + password + "'";
    	System.out.println(sql);
    	ResultSet rs = stmt.executeQuery(sql);
    	return rs.next();
    }	

    @Test
    public void loginTest() {
    	// login("lisi", "123");
    	String username = "a ' or ' a ' = ' a";
    	String password = "a ' or ' a ' = ' a";

    	boolean bool = login(username, password);
    	// true sql注入漏洞或sql攻击
    	System.out.println(bool);
    }

    public boolean loginPre(String username, String password) {
    	// 连接数据库
    	String driver = "com.mysql.jdbc.Driver";
    	String url = "jdbc:mysql://localhost:3306/jdbc";
    	String myUsername = "root";
    	String myPassword = "123";

    	Class.forName(driver);
    	Connection conn = DriverManager.getConnection(url, myUsername, myPassword);

    	String sql = "select * from t_user where username = ? and password = ?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);

    	pstmt.setString(1, username);
    	pstmt.setString(2, password);

    	ResultSet rs = stmt.executeQuery();
    	return rs.next();
    }	

    @Test
    public void loginPreTest() {
    	String username = "apeng";
    	String password = "123";
    	boolean bool = loginPre(username, password);
    	System.out.println(bool); // true
    }

    // 预编译注意错误 jdbc-pre.html
}