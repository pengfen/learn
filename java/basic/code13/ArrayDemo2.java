package com.test;

/*
 * ��������֮ѡ������
 * 		��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
 */
public class ArrayDemo2 {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);

		/*
		// ��һ��
		int x = 0;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("��һ�αȽϺ�");
		printArray(arr);

		// �ڶ���
		x = 1;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("�ڶ��αȽϺ�");
		printArray(arr);

		// ������
		x = 2;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("�����αȽϺ�");
		printArray(arr);

		// ���Ĵ�
		x = 3;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("���ĴαȽϺ�");
		printArray(arr);
		*/
		
		/*
		//ͨ���۲췢�ִ�����ظ���̫�ߣ�������ѭ���Ľ�
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[y] <arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					 arr[y] = temp;
				}
			}
		}
		System.out.println("�����");
		printArray(arr);
		*/
		
		//�÷����Ľ�
		selectSort(arr);
		System.out.println("�����");
		printArray(arr);

	}
	
	public static void selectSort(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[y] <arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					 arr[y] = temp;
				}
			}
		}
	}

	// ��������
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x] + ", ");
			}
		}
		System.out.println("]");
	}
}

