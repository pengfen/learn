package com.test;
/*
�̳е�ע�����
	A:����ֻ�ܼ̳и������з�˽�еĳ�Ա(��Ա�����ͳ�Ա����)
	B:���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super(���Ͻ�)�ؼ���ȥ���ʸ��๹�췽����
	C:��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
		class A {
			public void show1(){}
			public void show2(){}
		}
		
		class B {
			public void show2(){}
			public void show3(){}
		}
		
		//���Ƿ���B���г����˺�A��һ����show2()���������ԣ����Ǿ��ü̳�������
		class B extends A {
			public void show3(){}
		}
		������ʵ���ã���Ϊ�����㲻������show2(),������show1()��
		�п���show1()��������Ҫ�ġ�
		
��ô������ʲôʱ����ʹ�ü̳���?
	�̳���ʵ���ֵ���һ�ֹ�ϵ��"is a"��
		Person
			Student
			Teacher
		ˮ��
			ƻ��
			�㽶
			����
			
	���ü��跨��
		�����������A,B��ֻ�����Ƿ���A��B��һ�֣�����B��A��һ�֣��Ϳ��Կ���ʹ�ü̳С�
*/
class Father3 {
	private int num = 10;
	public int num2 = 20;
	
	//˽�з��������಻�ܼ̳�
	private void method() {
		System.out.println(num);
		System.out.println(num2);
	}
	
	public void show() {
		System.out.println(num);
		System.out.println(num2);
	}
}

class Son3 extends Father3 {
	public void function() {
		//num������Father�з���private
		//System.out.println(num); //���಻�ܼ̳и����˽�г�Ա����
		System.out.println(num2);
	}
}

class ExtendsDemo3 {
	public static void main(String[] args) {
		// ��������
		Son3 s = new Son3();
		//s.method(); //���಻�ܼ̳и����˽�г�Ա����
		s.show();
		s.function();
	}
}