package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ��������һ���ı��ļ��д洢�˼������ƣ�����дһ������ʵ�������ȡһ���˵����֡�
 * 
 * ������
 * 		A:���ı��ļ��е����ݴ洢��������
 * 		B:�������һ������
 * 		C:���ݸ�������ȡһ��ֵ
 */
public class GetName {
	public static void main(String[] args) throws IOException {
		// ���ı��ļ��е����ݴ洢��������
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> array = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			array.add(line);
		}
		br.close();

		// �������һ������
		Random r = new Random();
		int index = r.nextInt(array.size());

		// ���ݸ�������ȡһ��ֵ
		String name = array.get(index);
		System.out.println("���������ǣ�" + name);
	}
}