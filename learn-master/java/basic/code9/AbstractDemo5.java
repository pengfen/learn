package com.test;

/*
��ʦ����
	���������������ʦ����ҵ����ʦ
	���ԣ����������䣬���Ρ�

������	
	��������ʦ
		����������
		���Ρ�
	��ҵ����ʦ
		����������
		���Ρ�
ʵ�֣�
	��ʦ��
		��������ʦ
		��ҵ����ʦ
*/
//����������ʦ��
abstract class Teacher {
	//����
	private String name;
	//����
	private int age;
	
	public Teacher() {}
	
	public Teacher(String name,int age) {
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
	
	//���󷽷�
	public abstract void teach();
}

//��������ʦ��
class BasicTeacher extends Teacher {
	public BasicTeacher(){}
	
	public BasicTeacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("��������ʦ����JavaSE");
	}
}

//��ҵ����ʦ��
class WorkTeacher extends Teacher {
	public WorkTeacher(){}
	
	public WorkTeacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("��ҵ����ʦ����JavaEE");
	}
}

class AbstractTest2 {
	public static void main(String[] args) {
		//���������ԣ��Լ���
		
		//����(��̬)
		//��������ʦ
		Teacher t = new BasicTeacher();
		t.setName("����");
		t.setAge(30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		t = new BasicTeacher("����",30);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		//��ҵ����ʦ
		t = new WorkTeacher();
		t.setName("����ϼ");
		t.setAge(27);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
		System.out.println("--------------");
		
		t = new WorkTeacher("����ϼ",27);
		System.out.println(t.getName()+"---"+t.getAge());
		t.teach();
	}
}
