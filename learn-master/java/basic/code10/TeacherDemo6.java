package com.test;

/*
��ʽ������
	��������(̫�򵥣������ҽ���Ҫ�����)
	��������
		����:(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
		������:��Ҫ���Ǹó�������������
		�ӿ�:��Ҫ���Ǹýӿڵ�ʵ�������
*/
//����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public void method(Love l) { //l; l = new Teacher();  Love l = new Teacher(); ��̬
		l.love();
	}
}

//���������ʵ�ֽӿ�
class Teacher implements Love {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest {
	public static void main(String[] args) {
		//������Ҫ����LoveDemo���е�love()����
		LoveDemo ld = new LoveDemo();
		Love l = new Teacher();
		ld.method(l);
	}
}
