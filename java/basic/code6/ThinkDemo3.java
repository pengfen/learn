package com.test;
/*
�ѸղŵĴ���Ľ�һ�£�
	A:�����ݸĽ�Ϊ����¼��
	B:�Ѵ���Ľ�Ϊ����ʵ��
	
	
	��һ�����ݵĲ��ԣ�
	number:1234567
	��һ����7654321
	�ڶ�����2109876
	��������6109872
	
֪ʶ�㣺
	����
	��������
	�����
	����¼��
	���
	����
	����
*/
import java.util.Scanner;

class ThinkDemo3 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//������һ������
		System.out.println("������һ������(С��8λ)��");
		int number = sc.nextInt();
		
		//д����ʵ�ְ�number���м���
		//����
		String result = jiaMi(number);
		System.out.println("���ܺ�Ľ���ǣ�" + result);
	}
	
	/*
		����дһ�����ܣ�������numberʵ�ּ��ܡ�
		������ȷ��
			����ֵ���ͣ�String ��һ���ַ�����ƴ�ӡ�
			�����б�int number
	*/
	public static String jiaMi(int number) {
		//��������
		int[] arr = new int[8];
		
		//��������
		int index = 0;
		
		//��number�е�������취�ŵ�������
		while(number > 0) {
			arr[index] = number%10;
			index++;
			number /= 10;
		}
		
		//��ÿ�����ݼ�5��Ȼ���10ȡ������
		for(int x = 0; x < index; x ++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//�ѵ�һλ�����һλ����
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//�������Ԫ��ƴ�ӳ�һ���ַ�������
		//����һ���������ַ���
		String s = "";
		
		for(int x = 0; x < index; x ++) {
			s += arr[x];
		}
		
		return s;
	}
}
