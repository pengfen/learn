package com.test;

/*
һ����׼��������հ档

ѧ���ࣺ
	��Ա������
		name��age
	���췽����
		�޲Σ���������
	��Ա������
		getXxx()/setXxx()
		show()�������������г�Ա����ֵ
		
����Ա������ֵ��
	A:setXxx()����
	B:���췽��
	
�����Ա����ֵ�ķ�ʽ��
	A:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
	B:ͨ������show()�����㶨
*/
class Student8 {
	//����
	private String name;
	//����
	private int age;
	
	//���췽��
	public Student8() {
	}
	
	public Student8(String name,int age) {
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
	
	//������еĳ�Ա����ֵ
	public void show() {
		System.out.println(name+"---"+age);
	}
}

//������
class StudentDemo6 {
	public static void main(String[] args) {
		//��ʽ1����Ա������ֵ
		//�޲ι���+setXxx()
		Student8 s1 = new Student8();
		s1.setName("����ϼ");
		s1.setAge(27);
		//���ֵ
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		System.out.println("----------------------------");
		
		//��ʽ2����Ա������ֵ
		Student8 s2 = new Student8("����",30);
		System.out.println(s2.getName()+"---"+s2.getAge());
		s2.show();
	}
}

/*
 * ջ                                                                   ��                                                ������
 * main                    new Student()    class���� StudentDemo.class main
 * Student s --- 0x001 --- name:null --- ""         Student.class
 *                         age:0 --- 27
 * 
 * Student s = new Student(); ������Щ����
 * 
 * ��Student.class�ļ����ص��ڴ�
 * ��ջ�ڴ��s��������һ���ռ�
 * �ڶ��ڴ�Ϊѧ����������һ���ռ�
 * ����Ա��������Ĭ�ϳ�ʼ�� null 0
 * ����Ա������������ʾ��ʼ�� ����ϼ 27
 * ͨ�����췽������Ա�������г�ʼ�� ���� 30
 * ���ݳ�ʼ����� Ȼ��Ѷ��ڴ�ĵ�ֵַ��ֵ��ջ�ڴ��s����
 */