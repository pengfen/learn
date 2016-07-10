package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：游戏试玩已结束，请付费。
 */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		// 读取某个地方的数据，如果次数不大于5，可以继续玩。否则就提示"游戏试玩已结束，请付费。"
		// 创建一个文件
		// File file = new File("count.txt");
		// if (!file.exists()) {
		// file.createNewFile();
		// }

		// 把数据加载到集合中
		Properties prop = new Properties();
		Reader r = new FileReader("count.txt");
		prop.load(r);
		r.close();

		// 我自己的程序，我当然知道里面的键是谁
		String value = prop.getProperty("count");
		int number = Integer.parseInt(value);

		if (number > 5) {
			System.out.println("游戏试玩已结束，请付费。");
			System.exit(0);
		} else {
			number++;
			prop.setProperty("count", String.valueOf(number));
			Writer w = new FileWriter("count.txt");
			prop.store(w, null);
			w.close();

			GuessNumber.start();
		}
	}
}
