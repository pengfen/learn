package com.test;
/*
���췽����
	����������ݽ��г�ʼ��

��ʽ��
	A:��������������ͬ
	B:û�з���ֵ���ͣ���void��û��
	C:û�о���ķ���ֵ
*/
class Student5 {
	private String name; //null
	private int age; //0
	
	public Student5() {
		System.out.println("���ǹ��췽��");
	}
}
	
class ConstructDemo {
	public static void main(String[] args) {
		//��������
		Student5 s = new Student5();
		System.out.println(s); //Student@e5bbd6
	}
}