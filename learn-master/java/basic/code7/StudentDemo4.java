package com.test;
/*
��׼�Ĵ���Ľ���

this:�ĸ���������Ǹ�������this�ʹ����Ǹ�����
*/
class Student4 {
	private String name;
	private int age;
	
	public String getName() {
		return name; //������ʵ��������this
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

class StudentDemo4 {
	public static void main(String[] args) {
		//����һ������
		Student4 s1 = new Student4();
		s1.setName("����ϼ");
		s1.setAge(27);
		System.out.println(s1.getName()+"---"+s1.getAge());
		
		//�����ڶ�������
		Student4 s2 = new Student4();
		s2.setName("����");
		s2.setAge(30);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}

/*
 * �ڴ�ͼ
 * 
 * ˭���÷���, ����������˭
 */
