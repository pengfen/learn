package com.test;
/*
����ֵ����
	��������:(��������̫�򵥣��Ҳ�׼������)
	�������ͣ�
		��:���ص��Ǹ���Ķ���
		������:���ص��Ǹó�������������
		�ӿ�:���ص��Ǹýӿڵ�ʵ����Ķ���
*/
//����һ�����õĽӿ�
interface Love7 {
	public abstract void love();
}

class LoveDemo7 {
	public Love7 getLove() {
		//Love l = new Teacher();
		//return l;
		
		return new Teacher7();
	}
}

//���������ʵ�ֽӿ�
class Teacher7 implements Love7 {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest2 {
	public static void main(String[] args) {
		//��β�����?
		LoveDemo7 ld = new LoveDemo7();
		Love7 l = ld.getLove(); //new Teacher(); Love l = new Teacher(); ��̬
		l.love();
	}
}
