package com.test;
/*
����¼�������������������Ӧ������
*/
import java.util.Scanner;

class FunctionTest4 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������������");
		int m = sc.nextInt();
		
		System.out.println("������������");
		int n = sc.nextInt();
		
		//void���͵ķ�������
		pringXing(m,n);
	}
	
	/*
		�������
		
		������ȷ��
			����ֵ���ͣ�void
			�����б�int m,int n
	*/
	public static void pringXing(int m,int n) {
		for(int x=0; x<m; x++) {
			for(int y=0; y<n; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
