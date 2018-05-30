package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ����DataStreamDemo.java���Ƶ�Copy.java��
 * ����Դ��
 * 		DataStreamDemo.java -- ��ȡ���� -- FileReader -- BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д������ -- FileWriter -- BufferedWriter -- PrintWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		// ��ǰ�İ汾
		// ��װ����Դ
		// BufferedReader br = new BufferedReader(new FileReader(
		// "DataStreamDemo.java"));
		// // ��װĿ�ĵ�
		// BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		//
		// String line = null;
		// while ((line = br.readLine()) != null) {
		// bw.write(line);
		// bw.newLine();
		// bw.flush();
		// }
		//
		// bw.close();
		// br.close();

		// ��ӡ���ĸĽ���
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader(
				"DataStreamDemo.java"));
		// ��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"), true);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}
