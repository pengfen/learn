package cn.itcast_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：在指定的时间删除我们的指定目录(你可以指定c盘，但是我不建议，我使用项目路径下的demo)
 */

class DeleteFolder extends TimerTask {

	@Override
	public void run() {
		File srcFolder = new File("demo");
		deleteFolder(srcFolder);
	}

	// 递归删除目录
	public void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					System.out.println(file.getName() + ":" + file.delete());
				}
			}
			System.out.println(srcFolder.getName() + ":" + srcFolder.delete());
		}
	}
}

public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();

		String s = "2014-11-27 15:45:00";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);

		t.schedule(new DeleteFolder(), d);
	}
}
