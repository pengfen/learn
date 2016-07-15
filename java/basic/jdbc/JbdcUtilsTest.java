public class JbdcUtilsTest {
	@Test
	public void insert() {
		QueryRunner qr = new QueryRunner(JbdcUtils.getDataSource());
		// 向jdbc库下的stu表中插入一条数据
		String sql = "insert into stu value(?,?,?,?)";
		Object[] params = {1001, "apeng", 20, "male"};
		qr.update(sql, params);
	}

	@Test
	public void query() {
		QueryRunner qr = new QueryRunner(JbdcUtils.getDataSource());
		// 查询表stu表中的记录
		String sql = "select * from stu where sid=?";
		// 参数sid = 1001的记录
		object[] params = {1001};
		// 执行query()方法 需要给出结果处理器(ResultSetHandler的实现类对象)
		// beanHandler 它会把rs中的数据封装到指定类型的javabean对象中 再返回javabean
		Student stu = qr.query(sql, new BeanHandler<Student>(Student.class), params);
		System.out.println(stu);
	}

	// MapHandler单行处理器 把一行转换成一个map对象
	@Test
	public void querymap() {
		QueryRunner qr = new QueryRunner(JbdcUtils.getDataSource());
		String sql = "select * from stu where sid = ?";
		Object[] params = {1001};
		Map map = qr.query(sql, new MapHandler(), params);
		System.out.println(map);
	}

	//MapListHandler 多行处理器 把每行都转换成一个map 就是List<Map>
	@Test
	public void querymapList() {
		QueryRunner qr = new QueryRunner(JbdcUtils.getDataSource());
		String sql = "select * from stu";
		List<Map<String, Object>> mapList = qr.query(sql, new MapListHandler());
		System.out.println(mapList);
	}

	// scalarHandler 单行单列时使用 最为合适
	@Test
	public void querycount() {
		QueryRunner qr = new QueryRunner(JbdcUtils.getDataSource());
		String sql = "select count(*) from stu";
		Object obj = qr.query(sql, new ScalarHandler());

		System.out.println(obj);
	}
}