package com.test;
/*
��ʽ���������⣺
	�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
	�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
*/
//��ʽ�����ǻ�������
class Demo {
	public int sum(int a,int b) {
		return a + b;
	}
}

//��ʽ��������������
class Student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}
	
class StudentDemo {
	//����㿴����һ����������ʽ������һ��������(��������)��������ʵ��Ҫ���Ǹ���Ķ���
	public void method(Student s) { //���õ�ʱ�򣬰�main�����е�s�ĵ�ַ���ݵ������� Student s = new Student();
		s.show();
	}
}

class ArgDemo {
	public static void main(String[] args) {
		//��ʽ�����ǻ������͵ĵ���
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println("result : " + result);
		System.out.println("--------------");
		
		//��ʽ�������������͵ĵ���
		//������Ҫ����StudentDemo���е�method()����
		StudentDemo sd = new StudentDemo();
		//����ѧ������
		Student s = new Student();
		sd.method(s); //��s�ĵ�ַ����������
	}
}
