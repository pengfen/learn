package com.test;

/*
��ʽ��̡�
	ÿ�ε�����Ϸ����󣬷��ص���һ������
*/
class Student5 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo5 {
	public Student5 getStudent() {
		return new Student5();
	}
}

class StudentTest3 {
	public static void main(String[] args) {
		//��ε��õ���?
		StudentDemo5 sd = new StudentDemo5();
		//Student s = sd.getStudent();
		//s.study();
		
		//���ע����
		sd.getStudent().study();
	}
}
