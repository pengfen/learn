package cn.itcast_05;

public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		System.out.println("权限校验");
		System.out.println("添加功能");
		System.out.println("日志记录");
	}

	@Override
	public void delete() {
		System.out.println("权限校验");
		System.out.println("删除功能");
		System.out.println("日志记录");
	}

	@Override
	public void update() {
		System.out.println("权限校验");
		System.out.println("修改功能");
		System.out.println("日志记录");
	}

	@Override
	public void find() {
		System.out.println("权限校验");
		System.out.println("查找功能");
		System.out.println("日志记录");
	}
}
