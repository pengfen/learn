package cn.itcast_05;

public class StudentDaoImpl2 implements StudentDao {

	@Override
	public void login() {
		System.out.println("权限校验");
		System.out.println("登录功能");
		System.out.println("日志记录");
	}

	@Override
	public void regist() {
		System.out.println("权限校验");
		System.out.println("注册功能");
		System.out.println("日志记录");
	}

}
