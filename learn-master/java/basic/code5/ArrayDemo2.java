package com.test;
/*
����һ�����飬�������������ƺ�����Ԫ��ֵ��
������Ԫ�ظ�ֵ���ٴ��������������ƺ�����Ԫ��ֵ��
*/
class ArrayDemo2 {
	public static void main(String[] args) {
		//����һ������
		int[] arr = new int[3];
		
		//�����������
		System.out.println(arr);
		//�������Ԫ��ֵ
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("----");
		
		//������Ԫ�ظ�ֵ
		arr[0] = 100;
		arr[2] = 200;
		
		//�����������
		System.out.println(arr);
		//�������Ԫ��ֵ
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
