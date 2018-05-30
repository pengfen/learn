package cn.itcast_06;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("-----------");
		// 我们要创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象
		// public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces,InvocationHandler h)
		// 我准备对ud对象做一个代理对象
		MyInvocationHandler handler = new MyInvocationHandler(ud);
		UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass()
				.getClassLoader(), ud.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
		System.out.println("-----------");

		StudentDao sd = new StudentDaoImpl();
		MyInvocationHandler handler2 = new MyInvocationHandler(sd);
		StudentDao proxy2 = (StudentDao) Proxy.newProxyInstance(sd.getClass()
				.getClassLoader(), sd.getClass().getInterfaces(), handler2);
		proxy2.login();
		proxy2.regist();
	}
}
