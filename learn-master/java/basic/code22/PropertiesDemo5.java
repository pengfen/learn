package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * ����һ��������С��Ϸ�ĳ�����дһ������ʵ���ڲ�������ֻ����5�Σ�����5����ʾ����Ϸ�����ѽ������븶�ѡ�
 */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		// ��ȡĳ���ط������ݣ��������������5�����Լ����档�������ʾ"��Ϸ�����ѽ������븶�ѡ�"
		// ����һ���ļ�
		// File file = new File("count.txt");
		// if (!file.exists()) {
		// file.createNewFile();
		// }

		// �����ݼ��ص�������
		Properties prop = new Properties();
		Reader r = new FileReader("count.txt");
		prop.load(r);
		r.close();

		// ���Լ��ĳ����ҵ�Ȼ֪������ļ���˭
		String value = prop.getProperty("count");
		int number = Integer.parseInt(value);

		if (number > 5) {
			System.out.println("��Ϸ�����ѽ������븶�ѡ�");
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
