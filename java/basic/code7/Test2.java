package com.test;

/*
����һ����������,���� ���ܳ�������ķ�����
Ȼ����һ��������Test2�����в��ԡ�

�����ε��ࣺ
	��Ա������
		������
	��Ա������
		���ܳ���(��+��)*2;
		���������*��
		
ע�⣺
	import������������е�classǰ�档
*/

import java.util.Scanner;

class ChangFangXing {
	//�����εĳ�
	private int length;
	//�����εĿ�
	private int width;
	
	public ChangFangXing(){}
	
	//�����ṩsetXxx()����
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	//���ܳ�
	public int getZhouChang() {
		return (length + width) * 2;
	}
	
	//�����
	public int getArea() {
		return length * width;
	}
}

class Test2 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����볤���εĳ���");
		int length = sc.nextInt();
		System.out.println("�����볤���εĿ�");
		int width = sc.nextInt();
		
		//��������
		ChangFangXing cfx = new ChangFangXing();
		//�ȸ���Ա������ֵ
		cfx.setLength(length);
		cfx.setWidth(width);
		
		System.out.println("�ܳ��ǣ�"+cfx.getZhouChang());
		System.out.println("����ǣ�"+cfx.getArea());
	}
}
