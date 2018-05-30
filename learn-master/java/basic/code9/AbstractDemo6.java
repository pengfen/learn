package com.test;

/*
ѧ������
	�������񣺻�����ѧԱ����ҵ��ѧԱ
	���ԣ����������䣬�༶��ѧϰ���Է�

������
	������ѧԱ
		��Ա���������������䣬�༶
		��Ա������ѧϰ���Է�
	��ҵ��ѧԱ
		��Ա���������������䣬�༶
		��Ա������ѧϰ���Է�
		
	�õ�һ��ѧԱ�ࡣ
		��Ա���������������䣬�༶
		��Ա������ѧϰ���Է�
		
ʵ�֣�
	ѧԱ��
	������ѧԱ
	��ҵ��ѧԱ
*/
//�������ѧԱ��
abstract class Student5 {
	//����
	private String name;
	//����
	private int age;
	//�༶
	private String grand;
	
	public Student5() {}
	
	public Student5(String name,int age,String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
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
	
	public String getGrand() {
		return grand;
	}
	
	public void setGrand(String grand) {
		this.grand = grand;
	}
	
	//ѧϰ
	public abstract void study();
	
	//�Է�
	public void eat() {
		System.out.println("ѧϰ����,�͸óԷ�");
	}
}

//���������ѧԱ��
class BasicStudent extends Student5 {
	public BasicStudent() {}
	
	public BasicStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("������ѧԱѧϰ����JavaSE");
	}
}

//�����ҵ��ѧԱ��
class WorkStudent extends Student5 {
	public WorkStudent() {}
	
	public WorkStudent(String name,int age,String grand) {
		super(name,age,grand);
	}
	
	public void study() {
		System.out.println("��ҵ��ѧԱѧϰ����JavaEE");
	}
}

class AbstractTest3 {
	public static void main(String[] args) {
		//�ҽ������Ի�����ѧԱ
		//���ն�̬�ķ�ʽ����
		Student5 s = new BasicStudent();
		s.setName("����ϼ");
		s.setAge(27);
		s.setGrand("1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.study();
		s.eat();
		System.out.println("--------------");
		
		s = new BasicStudent("����",48,"1111");
		System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getGrand());
		s.study();
		s.eat();
		
		//��ҵ����������Լ���
	}
}