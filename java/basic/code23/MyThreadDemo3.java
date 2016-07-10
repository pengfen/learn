package cn.itcast_03;

/*
 * 如何获取线程对象的名称呢?
 * public final String getName():获取线程的名称。
 * 如何设置线程对象的名称呢?
 * public final void setName(String name):设置线程的名称
 * 
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// 创建线程对象
		//无参构造+setXxx()
		// MyThread my1 = new MyThread();
		// MyThread my2 = new MyThread();
		// //调用方法设置名称
		// my1.setName("林青霞");
		// my2.setName("刘意");
		// my1.start();
		// my2.start();
		
		//带参构造方法给线程起名字
		// MyThread my1 = new MyThread("林青霞");
		// MyThread my2 = new MyThread("刘意");
		// my1.start();
		// my2.start();
		
		//我要获取main方法所在的线程对象的名称，该怎么办呢?
		//遇到这种情况,Thread类提供了一个很好玩的方法:
		//public static Thread currentThread():返回当前正在执行的线程对象
		System.out.println(Thread.currentThread().getName());
	}
}

/*
名称为什么是：Thread-? 编号

class Thread {
	private char name[];

	public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
    
    private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null);
    }
    
     private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc) {
        //大部分代码被省略了
        this.name = name.toCharArray();
    }
    
    public final void setName(String name) {
        this.name = name.toCharArray();
    }
    
    
    private static int threadInitNumber; //0,1,2
    private static synchronized int nextThreadNum() {
        return threadInitNumber++; //return 0,1
    }
    
    public final String getName() {
        return String.valueOf(name);
    }
}

class MyThread extends Thread {
	public MyThread() {
		super();
	}
}

*/