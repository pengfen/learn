package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ�������ݣ������������д��ss.txt�С�
 * 
 * ������
 * 		A:��s.txt����ļ���������
 * 		B:��ȡ���ļ������ݣ��洢��һ���ַ�����
 * 		C:���ַ���ת��Ϊ�ַ�����
 * 		D:���ַ������������
 * 		E:���������ַ�����ת��Ϊ�ַ���
 * 		F:���ַ����ٴ�д��ss.txt��
 */
public class StringDemo2 {
	public static void main(String[] args) throws IOException {
		// ��ȡ���ļ������ݣ��洢��һ���ַ�����
		BufferedReader br = new BufferedReader(new FileReader("s.txt"));
		String line = br.readLine();
		br.close();

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = line.toCharArray();

		// ���ַ������������
		Arrays.sort(chs);

		// ���������ַ�����ת��Ϊ�ַ���
		String s = new String(chs);

		// ���ַ����ٴ�д��ss.txt��
		BufferedWriter bw = new BufferedWriter(new FileWriter("ss.txt"));
		bw.write(s);
		bw.newLine();
		bw.flush();

		bw.close();
	}
}