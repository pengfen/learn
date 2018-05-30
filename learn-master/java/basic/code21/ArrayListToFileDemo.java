package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			ArrayList������洢�����ַ�����
 * 			����ArrayList���ϣ������ݻ�ȡ����
 * 			Ȼ��洢���ı��ļ��С�
 * 			�ı��ļ�˵��ʹ���ַ�����
 * 
 * ����Դ��
 * 		ArrayList<String> -- �����õ�ÿһ���ַ�������
 * Ŀ�ĵأ�
 * 		a.txt -- FileWriter -- BufferedWriter
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) throws IOException {
		// ��װ������(�������϶���)
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

		// ��������
		for (String s : array) {
			// д����
			bw.write(s);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();
	}
}