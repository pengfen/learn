package com.test;

/*
����Ҫ��������в���

��ͬһ���ļ����£��ඨ���������ļ��кͶ�����һ���ļ�����ʵһ���ġ�
*/
class ArrayDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {28,55,37,46,19};
		
		//���󣺱�������
		/*
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
		*/
		
		//������ж�����鶼Ҫ���б�������ô��������ظ��Ⱦͺܸ�
		//��θĽ���?�÷����Ľ�
		//����
		//��̬����
		//printArray(arr);
		
		//�Ǿ�̬����
		//ArrayDemo ad = new ArrayDemo();
		//ad.printArray(arr);
		
		//����������ã�����������Ķ��󣬵���������Ĺ��ܡ�
		//���������ڵĲ����Ǹ�������صģ����ԣ���Ӧ�ð���Щ�������嵽�����������
		//����һ������Ĳ�����
		//�������������֮��ĵ���
		//ArrayTool at = new ArrayTool();
		//at.printArray(arr);
		
		//�����Ľ�Ϊ��̬�󣬾Ϳ���ֱ��ͨ����������
		ArrayTool.printArray(arr);
	}
	
	/*
	public static void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	*/
	
	//����÷������Ǿ�̬��
	/*
	public void printArray(int[] arr) {
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]);
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	*/
}
