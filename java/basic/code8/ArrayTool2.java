package com.test;
/**
* �������������в����Ĺ�����
* @author ����
* @version V.10
*/
public class ArrayTool2 {
	
	//�ѹ��췽��˽�У����Ͳ����ڴ���������
	/**
	* ����˽�й���
	*/
	private ArrayTool2(){}

	/**
	* ���Ǳ�������ķ�����������ĸ�ʽ�ǣ�[Ԫ��1, Ԫ��2, Ԫ��3, ...]
	* @param arr ����Ҫ������������
	*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0; x<arr.length; x++) {
			if(x == arr.length-1) {
				System.out.println(arr[x]+"]");
			}else {
				System.out.print(arr[x]+", ");
			}
		}
	}
	
	/**
	* ���ǻ�ȡ���������ֵ�ķ���
	* @param  arr ����Ҫ��ȡ���ֵ������
	* @return ���������е����ֵ
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for(int x=1; x<arr.length; x++) {
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		
		return max;
	}
	
	/**
	* ��ȡָ��Ԫ���������е�һ�γ��ֵ����������Ԫ�ز����ڣ��ͷ���-1
	* @param arr �����ҵ����� 
	* @param value Ҫ���ҵ�Ԫ��
	* @return ����Ԫ���������е���������������ڣ�����-1
	*/
	public static int getIndex(int[] arr,int value) {
		int index = -1;
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		return index;
	}
}
