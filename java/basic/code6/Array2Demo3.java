package com.test;
/*
��ʽ3��
	������ʽ��
		��������[][] ������ = new ��������[][]{{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...}};
	�򻯰��ʽ��
		��������[][] ������ = {{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...}};
		
	������
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr = {{1,2,3},{4,5},{6}};
*/
class Array2Demo3 {
	public static void main(String[] args) {
		//��������
		int[][] arr = {{1,2,3},{4,5},{6}};
		
		System.out.println(arr); // [[I@2a139a55
		System.out.println(arr[0]); // [I@15db9742
		System.out.println(arr[1]); // [I@6d06d69c
		System.out.println(arr[2]); // [I@7852e922
		
		System.out.println(arr[0][0]); //1
		System.out.println(arr[1][0]); //4
		System.out.println(arr[2][0]); //6
		
		System.out.println(arr[0][1]); //2
		System.out.println(arr[1][1]); //5
		//Խ��
		System.out.println(arr[2][1]); //���� java.lang.ArrayIndexOutOfBoundsException Խ���쳣
	}
}
