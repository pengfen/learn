package com.test;

/*
 * Scanner:���ڽ��ռ���¼�����ݡ�
 * 
 * ǰ���ʱ��
 * 		A:����
 * 		B:��������
 * 		C:���÷���
 * 
 * System������һ����̬���ֶΣ�
 * 		public static final InputStream in; ��׼������������Ӧ�ż���¼�롣
 * 
 * 		InputStream is = System.in;
 * 
 * class Demo {
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * int y = Demo.x;
 * Student s = Demo.s;
 * 
 * 
 * ���췽����
 * 		Scanner(InputStream source)

 Scanner ��Ҫ�� nextXXX hasXXX ����
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		System.out.println("x : " + x);
	}
}
