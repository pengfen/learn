package com.test;

/*
 * ��������֮ð������
 * 		����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
 */
public class ArrayDemo {
	public static void main(String[] args) {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("����ǰ��");
		printArray(arr);

		/*
		// ��һ�αȽ�
		// arr.length - 1��Ϊ�˷�ֹ����Խ��
		// arr.length - 1 - 0��Ϊ�˼��ٱȽϵĴ���
		for (int x = 0; x < arr.length - 1 - 0; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("��һ�αȽϺ�");
		printArray(arr);

		// �ڶ��αȽ�
		// arr.length - 1��Ϊ�˷�ֹ����Խ��
		// arr.length - 1 - 1��Ϊ�˼��ٱȽϵĴ���
		for (int x = 0; x < arr.length - 1 - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("�ڶ��αȽϺ�");
		printArray(arr);

		// �����αȽ�
		// arr.length - 1��Ϊ�˷�ֹ����Խ��
		// arr.length - 1 - 2��Ϊ�˼��ٱȽϵĴ���
		for (int x = 0; x < arr.length - 1 - 2; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("�����αȽϺ�");
		printArray(arr);

		// ���ĴαȽ�
		// arr.length - 1��Ϊ�˷�ֹ����Խ��
		// arr.length - 1 - 3��Ϊ�˼��ٱȽϵĴ���
		for (int x = 0; x < arr.length - 1 - 3; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("���ĴαȽϺ�");
		printArray(arr);
		*/

		// ��Ȼ�����ˣ���ô����Ĵ�������������
		// ������Ĵ����ظ���̫���ˣ�������ѭ���Ľ�
		// for (int y = 0; y < 4; y++) {
		// for (int x = 0; x < arr.length - 1 - y; x++) {
		// if (arr[x] > arr[x + 1]) {
		// int temp = arr[x];
		// arr[x] = arr[x + 1];
		// arr[x + 1] = temp;
		// }
		// }
		// }

		/*
		// ��������֪���ȽϵĴ��������鳤��-1�Σ����ԸĽ����հ����
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
		System.out.println("�����");
		printArray(arr);
		*/
		
		//�����ҿ����ж������Ҫ����������Ҫд�ɷ���
		bubbleSort(arr);
		System.out.println("�����");
		printArray(arr);
	}
	
	//ð���������
	public static void bubbleSort(int[] arr){
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
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