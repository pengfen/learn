package com.test;

/*
��ʽ������
	��������(̫�򵥣������ҽ���Ҫ�����)
	��������
		����:(���������ʱ����ʵ�����Ѿ�������) ��Ҫ���Ǹ���Ķ���
		������:
		�ӿ�
*/
class Student3 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public void method(Student3 s) { //ss; ss = new Student();  Student s = new Student();
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//������Ҫ����Student���study()����
		Student3 s = new Student3();
		s.study();
		System.out.println("----------------");
		
		//����2����Ҫ����StudentDemo���е�method()����
		StudentDemo sd = new StudentDemo();
		Student3 ss = new Student3();
		sd.method(ss);
		System.out.println("----------------");
		
		//���������÷�
		new StudentDemo().method(new Student3());
	}
}
