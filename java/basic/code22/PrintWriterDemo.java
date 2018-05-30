package com.test;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * �ֽ�����ӡ��	PrintStream
 * �ַ���ӡ��	PrintWriter
 * 
 * ��ӡ�����ص㣺
 * 		A:ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
 * 		B:���Բ����������͵����ݡ�
 * 		C:����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
 * 		D:�����ǿ���ֱ�Ӳ����ı��ļ��ġ�
 * 			��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
 * 			FileInputStream
 * 			FileOutputStream
 * 			FileReader
 * 			FileWriter
 * 			PrintStream
 * 			PrintWriter
 * 			��API,��������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵���ǿ���ֱ�Ӳ����ļ��ġ�
 * 
 * 			����
 * 				�������������ܹ�ֱ�Ӷ�д�ļ���
 * 				�߼������ڻ������������ṩ��һЩ�����Ĺ���
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		// ��ΪWriter������ʹ��
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("world");
		pw.write("java");
		
		pw.close();
	}
}
