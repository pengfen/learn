package com.test;

/*
��̬��ͬһ������(����)���ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
������
	è��è��è�Ƕ��
	ˮ(Һ�壬���壬��̬)��
	
��̬��ǰ�᣺
	A:Ҫ�м̳й�ϵ��
	B:Ҫ�з�����д��
		��ʵû��Ҳ�ǿ��Եģ��������û�������û�����塣
			���� d = new è();
			d.show();
			���� d = new ��();
			d.show();
	C:Ҫ�и�������ָ���������
		�� f =  new ��();
		
�ô�������һ�¶�̬��

��̬�еĳ�Ա�����ص㣺
	A:��Ա����
		���뿴��ߣ����п���ߡ�
	B:���췽��
		������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
	C:��Ա����
		���뿴��ߣ����п��ұߡ�
	D:��̬����
		���뿴��ߣ����п���ߡ�
		(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
		
	���ڳ�Ա�������ڷ�����д�����������п��ұߡ�
*/
class Fu10 {
	public int num = 100;
	
	public void show() {
		System.out.println("show Fu");
	}
	
	public static void function() {
		System.out.println("function Fu");
	}
}

class Zi10 extends Fu10 {
	public int num = 1000;
	public int num2 = 200;
	
	public void show() {
		System.out.println("show Zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}
	
	public static void function() {
		System.out.println("function Zi");
	}
}

class PloymorphicDemo {
	public static void main(String[] args) {
		//Ҫ�и�������ָ���������
		//�� f =  new ��();
		Fu10 f = new Zi10();
		System.out.println(f.num);
		//�Ҳ�������
		//System.out.println(f.num2);
		
		f.show();
		//�Ҳ�������
		//f.method();
		f.function();
	}
}