package cn.itcast_03;

/*
 * 单例模式：
 * 		饿汉式：类一加载就创建对象
 * 		懒汉式：用的时候，才去创建对象
 * 
 * 面试题：单例模式的思想是什么?请写一个代码体现。
 * 
 * 		开发：饿汉式(是不会出问题的单例模式)
 * 		面试：懒汉式(可能会出问题的单例模式)
 * 			A:懒加载(延迟加载)	
 * 			B:线程安全问题
 * 				a:是否多线程环境	是
 * 				b:是否有共享数据	是
 * 				c:是否有多条语句操作共享数据 	是
 */
public class Teacher {
	private Teacher() {
	}

	private static Teacher t = null;

	public synchronized static Teacher getTeacher() {
		// t1,t2,t3
		if (t == null) {
			//t1,t2,t3
			t = new Teacher();
		}
		return t;
	}
}
