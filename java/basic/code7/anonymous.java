package com.test;
/*
�������󣺾���û�����ֵĶ���

���������Ӧ�ó�����
	A:���÷���������ֻ����һ�ε�ʱ��
		ע�⣺���ö�ε�ʱ�򣬲��ʺϡ�
		��ô����������������ʲô�ô���?
			�У��������������Ͼ������������Ա��������������ա�
	B:�������������Ϊʵ�ʲ�������
*/
class Student1 {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class Student1Demo {
	public void method(Student1 s) {
		s.show();
	}
}

class anonymous {
	public static void main(String[] args) {
		//�����ֵĵ���
		Student1 s = new Student1();
		s.show();
		s.show();
		System.out.println("--------------");
		
		//��������
		//new Student();
		//����������÷���
		new Student1().show();
		new Student1().show(); //������ʵ�����´�����һ���µĶ���
		System.out.println("--------------");
		
		
		//����������Ϊʵ�ʲ�������
		Student1Demo sd = new Student1Demo();
		//Student ss = new Student();
		//sd.method(ss); //�����s��һ��ʵ�ʲ���
		//��������
		sd.method(new Student1());
		
		//����һ��
		new Student1Demo().method(new Student1());
	}
}
