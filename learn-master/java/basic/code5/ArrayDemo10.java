package com.test;
/*
������(���ݼ���¼������,���Ҷ�Ӧ����)
	��˼�ǣ�String[] strArray = {"����һ","���ڶ�",...};
*/
import java.util.Scanner;

class ArrayTest4 {
	public static void main(String[] args) {
		//����һ���ַ�������
		String[] strArray = {"����һ","���ڶ�","������","������","������","������","������"};
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������(0-6)��");
		int index = sc.nextInt();
		
		System.out.println("��Ҫ���ҵ������ǣ�"+strArray[index]);
	}
}
