package com.test;
/*
����һ����MyMath,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�
*/
import java.util.Scanner;

class MyMath {
	//�ӷ�����
	public int add(int a,int b) {
		return a + b;
	}
	
	//��������
	public int sub(int a,int b) {
		return a - b;
	}
	
	//�˷�����
	public int mul(int a,int b){
		return a * b;
	}
	
	//��������
	public int div(int a,int b) {
		return a / b;
	}
}

//������
class MyMathTest {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ����������");
		int firstNumber = sc.nextInt();
		System.out.println("������ڶ�����������");
		int secondNumber = sc.nextInt();
		
		//����MyMath���󣬲�ʹ��
		MyMath mm = new MyMath();
		
		System.out.println("�ӷ������"+mm.add(firstNumber,secondNumber));
		System.out.println("���������"+mm.sub(firstNumber,secondNumber));
		System.out.println("�˷������"+mm.mul(firstNumber,secondNumber));
		System.out.println("���������"+mm.div(firstNumber,secondNumber));
	}
}
