package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺴��ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 * 
 * ������
 * 		ͨ����Ŀ����˼���ǿ���֪�����µ�һЩ���ݣ�
 * 			����Դ��һ���ı��ļ���
 * 			Ŀ�ĵ���һ�����ϡ�
 * 			����Ԫ�����ַ�����
 * 
 * ����Դ��
 * 		b.txt -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		ArrayList<String>
 */
public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		// ��װĿ�ĵ�(�������϶���)
		ArrayList<String> array = new ArrayList<String>();

		// ��ȡ���ݴ洢��������
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}

		// �ͷ���Դ
		br.close();

		// ��������
		for (String s : array) {
			System.out.println(s);
		}
	}
}