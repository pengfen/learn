package cn.itcast_06;

/*
 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建三个线程对象
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new SellTicket();

		// 给线程对象起名字
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");

		// 启动线程
		st1.start();
		st2.start();
		st3.start();
	}
}