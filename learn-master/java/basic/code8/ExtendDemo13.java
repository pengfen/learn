package com.test;
/*
ѧ����������ʦ��������

ѧ����
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()
��ʦ��
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()
*/
//����ѧ����
class Student13 {
	//����
	private String name;
	//����
	private int age;
	
	public Student13() {
	}
	
	public Student13(String name,int age) {
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
}

//������ʦ��
class Teacher13 {
	//����
	private String name;
	//����
	private int age;
	
	public Teacher13() {
	}
	
	public Teacher13(String name,int age) {
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
}

class ExtendsTest3 {
	public static void main(String[] args) {
		//����ѧ�����󲢲���
		//��ʽ1
		Student13 s1 = new Student13();
		s1.setName("����ϼ");
		s1.setAge(27);
		System.out.println(s1.getName()+"---"+s1.getAge());
		
		//��ʽ2
		Student13 s2 = new Student13("����ϼ",27);
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//��Ӧ����ʦ�����Ҳ����ˣ����������Լ���ϰ��
	}
}
