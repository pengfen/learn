package cn.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:任务
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// 创建定时器对象
		Timer t = new Timer();
		// 3秒后执行爆炸任务第一次，如果不成功，每隔2秒再继续炸
		t.schedule(new MyTask2(), 3000, 2000);
	}
}

// 做一个任务
class MyTask2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("beng,爆炸了");
	}
}