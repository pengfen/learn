package com.test;
/*
��ʽ2��
	��������[][] ������ = new ��������[m][];
	
	m:��ʾ�����ά�����ж��ٸ�һά���顣
	����û�и��������Զ�̬�ĸ�����һ����һ���仯��������
*/
class Array2Demo2 {
	public static void main(String[] args) {
		//��������
		int[][] arr = new int[3][];
		
		System.out.println(arr);	//[[I@175078b
		System.out.println(arr[0]); //null ��ʼֵΪnull new ֮������ռ� ֵΪ�ռ�ĵ�ֵַ
		System.out.println(arr[1]); //null
		System.out.println(arr[2]); //null
		
		//��̬��Ϊÿһ��һά�������ռ�
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[1];
		
		System.out.println(arr[0]); //[I@42552c
		System.out.println(arr[1]); //[I@e5bbd6
		System.out.println(arr[2]); //[I@8ee016
		
		System.out.println(arr[0][0]); //0
		System.out.println(arr[0][1]); //0
		//ArrayIndexOutOfBoundsException
		//System.out.println(arr[0][2]); //����
		
		arr[1][0] = 100;
		arr[1][2] = 200;
	}
}