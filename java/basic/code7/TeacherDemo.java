package com.test;
/*
static�ؼ���ע������
	A:�ھ�̬��������û��this�ؼ��ֵ�
		��������?
			��̬��������ļ��ض����أ�this�����Ŷ���Ĵ��������ڡ�
			��̬�ȶ����ȴ��ڡ�
	B:��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
			��̬������
				��Ա������ֻ�ܷ��ʾ�̬����
				��Ա������ֻ�ܷ��ʾ�̬��Ա����
			�Ǿ�̬������
				��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
				��Ա�����������Ǿ�̬�ĳ�Ա������Ҳ�����ǷǾ�̬�ĳ�Ա������
		�򵥼ǣ�
			��ֻ̬�ܷ��ʾ�̬��
*/
class Teacher {
	public int num = 10;
	public static int num2 = 20;
	
	public void show() {
		System.out.println(num); //�����ĸ�������ʵ��ǳ�Ա����
		System.out.println(this.num); //��ȷ�ĸ�������ʵ��ǳ�Ա����
		System.out.println(num2);
		
		//function();
		//function2();
	}
	
	public static void method() {
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� num
		//System.out.println(num);
		System.out.println(num2);
		
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� function()
		//function();
		function2();
	}
	
	public void function() {
	
	}
	
	public static void function2() {
	
	}
}

class TeacherDemo {
	public static void main(String[] args) {
		//��������
		Teacher t = new Teacher();
		t.show();
		System.out.println("------------");
		t.method();
	}
}
