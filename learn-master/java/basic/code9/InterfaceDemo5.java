package com.test;

/*
��ʦ��ѧ������,������̵Ķ��⹦��

�������Ӿ��嵽����
	��ʦ�����������䣬�Է���˯��
	ѧ�������������䣬�Է���˯��
	
	�����й��Թ��ܣ�������ȡ��һ�����࣬���ࡣ
	
	���ࣺ
		����������
		�Է�();
		˯��(){}
		
	���̵Ķ��⹦�ܲ����˻�����ʦ������ѧ��һ��ʼ��Ӧ�þ߱��ģ����ԣ����ǰ�������Ϊ�ӿ�
	
	���̽ӿڡ�

	������ʦ���̣�ʵ�ֳ��̽ӿ�
	����ѧ�����̣�ʵ�ֳ��̽ӿ�
	
ʵ�֣��ӳ��󵽾���
	
ʹ�ã�����
*/
//������̽ӿ�
interface Smoking {
	//���̵ĳ��󷽷�
	public abstract void smoke();
}

//�����������
abstract class Person5 {
	//����
	private String name;
	//����
	private int age;
	
	public Person5() {}
	
	public Person5(String name,int age) {
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
	
	//�Է�();
	public abstract void eat();
	
	//˯��(){}
	public void sleep() {
		System.out.println("˯������");
	}
}

//������ʦ��
class Teacher5 extends Person5 {
	public Teacher5() {}
	
	public Teacher5(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("�Դ�ײ�");
	}
}

//����ѧ����
class Student25 extends Person5 {
	public Student25() {}
	
	public Student25(String name,int age) {
		super(name,age);
	}
	
	public void eat() {
		System.out.println("�Ժ�����");
	}
}

//���̵���ʦ
class SmokingTeacher5 extends Teacher5 implements Smoking {
	public SmokingTeacher5() {}
	
	public SmokingTeacher5(String name,int age) {
		super(name,age);
	}
	
	public void smoke() {
		System.out.println("���̵���ʦ");
	}
	}
	
	//���̵�ѧ��
	class SmokingStudent extends Student25 implements Smoking {
	public SmokingStudent() {}
	
	public SmokingStudent(String name,int age) {
		super(name,age);
	}
	
	public void smoke() {
		System.out.println("���̵�ѧ��");
	}
}

class InterfaceTest2 {
	public static void main(String[] args) {
		//����ѧ��
		SmokingStudent ss = new SmokingStudent();
		ss.setName("����ϼ");
		ss.setAge(27);
		System.out.println(ss.getName()+"---"+ss.getAge());
		ss.eat();
		ss.sleep();
		ss.smoke();
		System.out.println("-------------------");
		
		SmokingStudent ss2 = new SmokingStudent("����",30);
		System.out.println(ss2.getName()+"---"+ss2.getAge());
		ss2.eat();
		ss2.sleep();
		ss2.smoke();
		
		//������ʦ�����Լ���ϰ
	}
}
