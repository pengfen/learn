package com.test;

/*
final���α����ĳ�ʼ��ʱ��
	A:��final���εı���ֻ�ܸ�ֵһ�Ρ�
	B:�ڹ��췽�����ǰ��(�Ǿ�̬�ĳ���)
*/
class Demo {
	//int num = 10;
	//final int num2 = 20;
	
	int num;
	final int num2;
	
	{
		//num2 = 10;
	}
	
	public Demo() {
		num = 100;
		//�޷�Ϊ���ձ���num2����ֵ
		num2 = 200;
	}
}

class FinalTest2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.num);
		System.out.println(d.num2);
	}
}