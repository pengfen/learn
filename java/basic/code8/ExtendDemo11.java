package com.test;

/*
������д�����
	A:��Ա����	�ͽ�ԭ��
	B:this��super������
		this���ʱ���ĳ�Ա
		super���ʸ���ĳ�Ա
	C:���๹�췽��ִ��ǰĬ����ִ�и�����޲ι��췽��
	D:һ����ĳ�ʼ������
		��Ա�������г�ʼ��
			Ĭ�ϳ�ʼ��
			��ʾ��ʼ��
			���췽����ʼ��
			
�����
	fu
	zi
	30
	20
	10
*/
class Fu{
	public int num = 10; // Ĭ�ϳ�ʼ�� 0  ��ʾ��ʼ�� 10
	public Fu(){
		System.out.println("fu");
	}
}
class Zi extends Fu{
	public int num = 20;
	public Zi(){
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num); //30
		System.out.println(this.num); //20
		System.out.println(super.num); //10
	}
}
class ExtendsDemo11 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}
