package com.test;
/*
�������������������������е�ÿһ��Ԫ�ء�

ע�⣺�����ṩ��һ������length�����ڻ�ȡ����ĳ��ȡ�
	  ��ʽ��������.length
*/
class ArrayDemo7 {
	public static void main(String[] args) {
		//��������
		int[] arr = {11,22,33,44,55};
		
		//��ȡÿһ��Ԫ��
		//��λ�ȡ��?����֪����������ϱ��(����)�Ϳ����ҵ�����
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------------");
		
		//��Ȼ�����������ԣ����ǲ�������Ҫ��
		//���Ƿ��֣�������ظ��Ⱥܸ�
		//�����䣬������������ͬ�ģ������������Ǳ仯��
		//���ǾͿ���ʹ��ѭ���㶨����ֵ
		for(int x=0; x<5; x++) {
			//x=0,1,2,3,4
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//��0��ʼ��������ȷ�ģ�����Ϊʲô��5�أ�����������һ������ĸ���
		//�������¸�������α���
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,2,2,3,4,5,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8};
		//�������ںܶ�ʱ�������Ԫ�ز��ܿ���
		//���ʱ������͸������ṩ��һ�����ԣ�lengthר�����ڻ�ȡ����ĳ���
		//��ʽ��������.length ��������ĳ���
		System.out.println(arr.length);
		System.out.println(arr2.length);
		System.out.println("--------------------");
		
		//�Ľ���һ������
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("--------------------");
		
		//���������Ҫ�Զ��������б�����ÿ������ı������Ƕ��Ѵ���дһ�飬�鷳��
		//�鷳�����ԣ�����׼���÷����Ľ���
		//�÷����Ľ��������
		printArray(arr);
		System.out.println("--------------------");
		printArray(arr2);
		System.out.println("--------------------");
		printArray2(arr);
	}
	
	/*
		��������ķ���
		
		������ȷ��
			����ֵ���ͣ�void
			�����б�int[] arr
	*/
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}
	
	//�뿴�Ľ��汾
	public static void printArray2(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) { //�������һ��Ԫ��
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
}
