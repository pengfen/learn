package com.test;

/*
��һ��java�ļ���д�����ࣺһ���������࣬һ�������ࡣ
ע�⣺�ļ����ƺͲ���������һ�¡�

���ʹ����?
	��������ʹ�á�
	
��δ���������?
	��ʽ������ ������ = new ����();
	
���ʹ�ó�Ա������?
	������.������
���ʹ�ó�Ա������?
	������.������(...)
*/
//����ѧ����
class Student2 {
	//����
	String name; //null
	//����
	int age; //0
	//��ַ
	String address; //null
	
	//ѧϰ
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}
	
	//�Է�
	public void eat() {
		System.out.println("ѧϰ���ˣ�Ҫ�Է�");
	}
	
	//˯��
	public void sleep() {
		System.out.println("ѧϰ���ˣ�Ҫ˯��");
	}
}

//����ѧ��������
class StudentDemo {
	public static void main(String[] args) {
		//���� ������ = new ����();
		Student2 s = new Student2();
		
		//�����Ա����ֵ
		//System.out.println(s.name);
		//System.out.println(s.age);
		//System.out.println(s.address);
		//�Ľ�д��
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		
		//����Ա������ֵ
		s.name = "����ϼ";
		s.age = 27;
		s.address = "����";
		//��ֵ������
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		//���÷���
		s.study();
		s.eat();
		s.sleep();
	}
}
