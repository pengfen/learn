package cn.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class GetTime {
	// 需求：请给我计算出一段代码的运行时间
	public long getTime() {
		long start = System.currentTimeMillis();
		// for循环
		// for (int x = 0; x < 10000; x++) {
		// System.out.println(x);
		// }

		// 视频
		// try {
		// BufferedInputStream bis = new BufferedInputStream(
		// new FileInputStream("a.avi"));
		// BufferedOutputStream bos = new BufferedOutputStream(
		// new FileOutputStream("b.avi"));
		// byte[] bys = new byte[1024];
		// int len = 0;
		// while ((len = bis.read(bys)) != -1) {
		// bos.write(bys, 0, len);
		// }
		// bos.close();
		// bis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// 再给我测试一个代码：集合操作的，多线程操作，常用API操作的等等...
		code();

		long end = System.currentTimeMillis();

		return end - start;
	}

	public abstract void code();
}
