package com.test;

/*
����ֵ����
	��������:(��������̫�򵥣��Ҳ�׼������)
	�������ͣ�
		��:���ص��Ǹ���Ķ���
		������:���ص��Ǹó�������������
		�ӿ�:
*/
abstract class Person2 {
	public abstract void study();
}

class PersonDemo2 {
	public Person2 getPerson() {
		//Person p = new Student();
		//return p;
		
		return new Student2();
	}
}

class Student2 extends Person2 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		//������Ҫ����Person���е�study()����
		PersonDemo2 pd = new PersonDemo2();
		Person2 p = pd.getPerson(); //new Student();  Person p = new Student(); ��̬
		p.study();
	}
}
