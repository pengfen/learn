package com.test;

/*
������ĸ�����
	���ﲻӦ�ö���Ϊ����Ķ��������Ҷ����еĳԣ�˯��Ҳ��Ӧ���Ǿ���ġ�
	���ǰ�һ�����Ǿ���Ĺ��ܳ�Ϊ����Ĺ��ܣ���һ����������г���Ĺ��ܣ���������ǳ����ࡣ
	
��������ص㣺
	A:������ͳ��󷽷�������abstract�ؼ�������
	B:�������в�һ���г��󷽷�,�����г��󷽷�������붨��Ϊ������
	C:�����಻��ʵ����
		��Ϊ�����Ǿ���ġ�
		�������й��췽�������ǲ���ʵ����?���췽����������ʲô��?
		����������ʸ������ݵĳ�ʼ��
	D:���������
		a:���������д���󷽷�����������һ�������ࡣ
		b:��д���еĳ��󷽷������ʱ��������һ��������ࡣ
		
	�������ʵ������ʵ�ǿ����������ʵ�ֵġ��Ƕ�̬�ķ�ʽ��
		Animal a = new Cat();
*/

//abstract class Animal //�������������ʽ
abstract class Animal10 {
	//���󷽷�
	//public abstract void eat(){} //�շ�����,����ᱨ�����󷽷�����������
	public abstract void eat();
	
	public Animal10(){}
}

//�����ǳ�����
abstract class Dog10 extends Animal10 {}

//�����Ǿ����࣬��д���󷽷�
class Cat10 extends Animal10 {
	public void eat() {
		System.out.println("è����");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		//��������
		//Animal�ǳ����; �޷�ʵ����
		//Animal a = new Animal();
		//ͨ����̬�ķ�ʽ
		Animal10 a = new Cat10();
		a.eat();
	}
}