package com.test;
/*
�����һ������,������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ�ء�
����ڶ�������,������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ�ء�
�������������,�ѵ�һ������ĵ�ֵַ��ֵ������(ע������һ��)��ͨ�����������������ȥ��Ԫ���ظ���ֵ��
����ٴ������һ�������������ƺ�Ԫ�ء�
*/
class ArrayDemo4 {
	public static void main(String[] args) {
		//�����һ������
		int[] arr = new int[3];
		arr[0] = 88;
		arr[1] = 33;
		arr[2] = 66;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("----");
		
		//����ڶ�������
		int[] arr2 = new int[3];
		arr2[0] = 22;
		arr2[1] = 44;
		arr2[2] = 55;
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("----");
		
		//�������������
		int[] arr3 =  arr;
		arr3[0] = 100;
		arr3[1] = 200;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
