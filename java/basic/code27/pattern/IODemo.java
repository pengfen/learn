package cn.itcast_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo extends GetTime{

	@Override
	public void code() {
		try {
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("a.avi"));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("b.avi"));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
			bos.close();
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
