package com.test;

/*
����ֵ����
	��������:(��������̫�򵥣��Ҳ�׼������)
	�������ͣ�
		��:���ص��Ǹ���Ķ���
		������:
		�ӿ�:
*/
class Student4 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo4 {
	public Student4 getStudent() {
		//Student s = new Student();
		//Student ss = s;
		
		//Student s = new Student();
		//return s;
		return new Student4();
	}
}

class StudentTest2 {
	public static void main(String[] args) {
		//������Ҫʹ��Student���е�study()����
		//���ǣ���һ���ҵ�Ҫ���ǣ���Ҫֱ�Ӵ���Student�Ķ���
		//����ʹ��StudentDemo���㴴������
		StudentDemo4 sd = new StudentDemo4();
		Student4 s = sd.getStudent(); //new Student(); Student s = new Student();
		s.study();
	}
}
