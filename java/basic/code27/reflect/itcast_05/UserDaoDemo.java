package cn.itcast_05;

public class UserDaoDemo {
	public static void main(String[] args) {
		// 基本的用户操作
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("---------");
		// 真实的需求应该是这个样子的:
		// 在每个操作执行前：应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.delete();
		ud2.update();
		ud2.find();
		// 假设我还有一个学生类，也具备这样的操作，
		// 我还有一个老师类，也具备同样的操作
		System.out.println("---------");
		StudentDao sd = new StudentDaoImpl();
		sd.login();
		sd.regist();
		System.out.println("---------");
		// 真实的需求应该是这个样子的:
		// 在每个操作执行前：应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录
		StudentDao sd2 = new StudentDaoImpl2();
		sd2.login();
		sd2.regist();
	}
}
