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
	
������������ĳ�Ա�������˺ܶ���ͬ�Ķ������������ǾͿ��ǳ�ȡһ�����Ե��ࣺ
�ˣ�
	��Ա����������������
	���췽�����޲Σ�����
	��Ա������getXxx()/setXxx()
	
	ѧ�� �̳� ��
	��ʦ �̳� ��
*/
//��������
class Person14 {
	//����
	private String name;
	//����
	private int age;
	
	public Person14() {
	}
	
	public Person14(String name,int age) { //"����ϼ",27
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

//����ѧ����
class Student14 extends Person14 {
	public Student14() {}
	
	public Student14(String name,int age) { //"����ϼ",27
		//this.name = name;
		//this.age = age;
		super(name,age);
	}
}

//������ʦ��
class Teacher14 extends Person14 {

}

class ExtendsTest4 {
	public static void main(String[] args) {
		//����ѧ�����󲢲���
		//��ʽ1
		Student14 s1 = new Student14();
		s1.setName("����ϼ");
		s1.setAge(27);
		System.out.println(s1.getName()+"---"+s1.getAge());
		
		//��ʽ2
		Student14 s2 = new Student14("����ϼ",27);
		System.out.println(s2.getName()+"---"+s2.getAge());
		
		//������ʦ���еĴ��벢���в��ԡ�
	}
}
