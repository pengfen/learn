package com.test;
/*
������Ҫ�����ĺ�

���ǵ����󲻶ϵķ����ı䣬���ǾͶ�Ӧ���ṩ�˶����͵ķ�����
�����أ����ǵ������ǲ�һ���ġ�
��������Ҫ�󷽷���������������֪�⡣
���ǣ������ԣ�����û��������
��ô����ô����?
�����������������Ĺ�����ͬ�������б�ͬ�������Ϊ�˼���֪�⣬Java����������һ�������֡�

��ʵ�����������һ��רҵ���ʣ��������ء�

�������أ�
	��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹ء�
	
	�����б�ͬ��
		A:����������ͬ
		B:�������Ͳ�ͬ
*/
class FunctionDemo4 {
	public static void main(String[] args) {
		//jvm����ݲ�ͬ�Ĳ���ȥ���ò�ͬ�Ĺ���
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		
		System.out.println(sum(10.5f,20f));
	}
	
	//����1:���������ĺ�
	public static int sum(int a,int b) {
		System.out.println("int");
		return a + b;
	}
	
	//����2:�������ĺ�
	/*
	public static int sum1(int a,int b,int c) {
		return a + b + c;
	}
	*/
	
	public static int sum(int a,int b,int c) {
		return a + b + c;
	}
	
	//����3:���ĸ����ĺ�
	/*
	public static int sum2(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	*/
	public static int sum(int a,int b,int c,int d) {
		return a + b + c + d;
	}
	
	public static float sum(float a,float b) {
		System.out.println("float");
		return a + b;
	}
}
