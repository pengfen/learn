package cn.itcast_09;

import java.util.concurrent.Callable;

//Callable:是带泛型的接口。
//这里指定的泛型其实是call()方法的返回值类型。
public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		for (int x = 0; x < 100; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
		return null;
	}

}
