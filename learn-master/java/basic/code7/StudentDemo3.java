package com.test;
/*
��װ��private��Ӧ�ã�
	A:�ѳ�Ա������private����
	B:��߶�Ӧ��getXxx()��setXxx()����
*/
//����ѧ����
class Student3 {
	//����
	private String name;
	//����
	private int age;
	
	//������ȡֵ
	public String getName() {
		return name;
	}
	
	//��������ֵ
	public void setName(String n) {
		name = n;
	}
	
	//�����ȡֵ
	public int getAge() {
		return age;
	}
	
	//���丳ֵ
	public void setAge(int a) {
		age = a;
	}
}

//������
class StudentDemo3 {
	public static void main(String[] args) {
		//����ѧ������
		Student3 s = new Student3();
		
		//ʹ�ó�Ա����
		//���󣺱�˽�������ˣ���粻��ֱ�ӷ�����
		//System.out.println(s.name+"---"+s.age);
		System.out.println(s.getName()+"---"+s.getAge()); // null 0
		
		//����Ա������ֵ
		//s.name = "����ϼ";
		//s.age = 27;
		//ͨ����������ֵ
		s.setName("����ϼ");
		s.setAge(27);
		System.out.println(s.getName()+"---"+s.getAge());
	}
}
