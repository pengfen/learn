package com.test;
/*
�����������飬�ֱ��������������Ե���������Ԫ��ֵ��
Ȼ���ÿ�������Ԫ�����¸�ֵ���ٴηֱ��������������Ե���������Ԫ��ֵ��
*/
class ArrayDemo3 {
	public static void main(String[] args) {
		//�����һ������
		int[] arr = new int[2];
		//����ڶ�������
		int[] arr2 = new int[3];
		
		//�����������Ԫ��ֵ
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("----");
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("----");
		
		//��Ԫ�����¸�ֵ
		arr[1] = 20;
		
		arr2[1] = 30;
		arr2[0] = 40;
		
		//�����������Ԫ��ֵ
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("----");
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}
}
