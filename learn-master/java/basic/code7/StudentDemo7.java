package com.test;
/*
static���ص㣺(���������γ�Ա���������������γ�Ա����)
	A:������ļ��ض�����
		����main������
	B:�����ڶ������
	C:��������ж�����
		���������ǰ༶��ѧ��Ӧ�ù���ͬһ���༶��š�
		��ʵ����ص�Ҳ���ڸ�������ʲôʱ��ʹ�þ�̬?
			���ĳ����Ա�����Ǳ����ж�����ģ���ô����Ӧ�ö���Ϊ��̬�ġ�
		������
			��ˮ��(�þ�̬����)
			ˮ��(�����þ�̬����)
	D:����ͨ����������
		��ʵ������Ҳ����ͨ�����������á�
		�Ƽ�ʹ���������á�
		
		��̬���ε�����һ�����ǳ���Ϊ��������صģ����Ա
*/
class Student9 {
	//�Ǿ�̬����
	int num = 10;
	
	//��̬����
	static int num2 = 20;
}

class StudentDemo7 {
	public static void main(String[] args) {
		Student9 s = new Student9();
		System.out.println(s.num);
		
		System.out.println(Student9.num2);
		System.out.println(s.num2);
	}
}
