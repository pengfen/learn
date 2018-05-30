package com.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * nio����JDK4���֣��ṩ��IO���Ĳ���Ч�ʡ�����Ŀǰ�����Ǵ�Χ��ʹ�á�
 * �пյĻ��˽��£������������ҡ�
 * 
 * JDK7��֮���nio��
 * Path:·��
 * Paths:��һ����̬��������һ��·��
 * 		public static Path get(URI uri)
 * Files:�ṩ�˾�̬����������ʹ��
 * 		public static long copy(Path source,OutputStream out):�����ļ�
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines,Charset cs,OpenOption... options)
 */
public class NIODemo {
	public static void main(String[] args) throws IOException {
		// public static long copy(Path source,OutputStream out)
		// Files.copy(Paths.get("ByteArrayStreamDemo.java"), new
		// FileOutputStream(
		// "Copy.java"));

		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		Files.write(Paths.get("array.txt"), array, Charset.forName("GBK"));
	}
}
