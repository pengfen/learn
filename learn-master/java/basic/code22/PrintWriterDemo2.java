package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 1:���Բ����������͵����ݡ�
 * 		print()
 * 		println()
 * 2:�����Զ�ˢ��
 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);
 * 		����Ӧ�õ���println()�ķ����ſ���
 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ��С�
 * 
 * 		println()
 *		��ʵ�ȼ����ڣ�
 *		bw.write();
 *		bw.newLine();		
 *		bw.flush();
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// ������ӡ������
		// PrintWriter pw = new PrintWriter("pw2.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"), true);

		// write()�Ǹ㲻���ģ���ô����?
		// ���Ǿ�Ӧ�ÿ��������·���
		// pw.print(true);
		// pw.print(100);
		// pw.print("hello");

		pw.println("hello");
		pw.println(true);
		pw.println(100);

		pw.close();
	}
}
