package com.test;
/*
����Ԫ������ (���ǰ�Ԫ�ضԵ�)

������
	A:����һ�����飬�����о�̬��ʼ����
	B:˼·
		��0������arr.length-1�����ݽ���
		��1������arr.length-2�����ݽ���
		...
		ֻҪ����arr.length/2��ʱ�򼴿ɡ�
*/
class ArrayDemo9 {
	public static void main(String[] args) {
		//����һ�����飬�����о�̬��ʼ����
		int[] arr = {12,98,50,34,76};
		
		//����ǰ
		System.out.println("����ǰ��");
		printArray(arr);
		
		//�����
		System.out.println("�����");
		//reverse(arr);
		reverse2(arr);
		printArray(arr);
	}
	
	/*
		������������
		������ȷ��
			����ֵ���ͣ�void (���˻��뵽Ӧ�÷��ص������������飬����û��Ҫ����Ϊ������������ʵ��ͬһ������)
			�����б�int[] arr
	*/
	public static void reverse(int[] arr) {
		/*
		//��һ�ν���
		int temp = arr[0];
		arr[0] = arr[arr.length-1-0];
		arr[arr.length-1-0] = temp;
		
		//�ڶ��ν���
		int temp = arr[1];
		arr[1] = arr[arr.length-1-1];
		arr[arr.length-1-1] = temp;
		
		//�����ν���
		int temp = arr[2];
		arr[2] = arr[arr.length-1-2];
		arr[arr.length-1-2] = temp;
		*/
		//��ѭ���Ľ�
		for(int x=0; x<arr.length/2; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	public static void reverse2(int[] arr) {
		for(int start=0,end=arr.length-1; start<=end; start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
	
	//��������
	public static void printArray(int[] arr) {
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
