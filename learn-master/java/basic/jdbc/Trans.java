public class Trans {
	public void update(String name, double money) {
		QueryRunner qr = new TxQueryRunner();
		String sql = "update account set balance=balance ?";
	}
}