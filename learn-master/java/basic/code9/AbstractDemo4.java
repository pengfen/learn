package com.test;
/*
è������
	�������è����
	���ԣ����������䣬�Է�

�������Ӿ��嵽����
	è:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�(è����)
		
	��:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�(������)
		
	��Ϊ�й��Ե����ݣ����Ծ���ȡ��һ�����ࡣ���
	���������ڳԷ������ݲ�һ�������ԳԷ��ķ����ǳ���ģ�
	�������ǳ�����࣬��ͱ��붨��Ϊ�����ࡣ
	
	�������ࣺ
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�();

ʵ�֣��ӳ��󵽾���
	������:
		��Ա����������������
		���췽�����޲Σ�����
		��Ա�������Է�();
		
	���ࣺ
		�̳��Զ�����
		��д�Է�();
		
	è�ࣺ
		�̳��Զ�����
		��д�Է�();
*/
//�������Ķ�����
abstract class Animal14 {
	//����
	private String name;
	//����
	private int age;
	
	public Animal14() {}
	
	public Animal14(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//����һ�����󷽷�
	public abstract void eat();
}

//�������Ĺ���
class Dog14 extends Animal14 {
	public Dog14() {}
	
	public Dog14(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("������");
	}
}

//��������è��
class Cat14 extends Animal14 {
	public Cat14() {}
	
	public Cat14(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("è����");
	}
}

//������
class AbstractTest {
	public static void main(String[] args) {
		//���Թ���
		//�������÷�
		//��ʽ1��
		Dog14 d = new Dog14();
		d.setName("����");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		//��ʽ2��
		Dog14 d2 = new Dog14("����",3);
		System.out.println(d2.getName()+"---"+d2.getAge());
		d2.eat();
		System.out.println("---------------------------");
		
		Animal14 a = new Dog14();
		a.setName("����");
		a.setAge(3);
		System.out.println(a.getName()+"---"+a.getAge());
		a.eat();
		
		Animal14 a2 = new Dog14("����",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a2.eat();
		
		//��ϰ������è��
	}
}
