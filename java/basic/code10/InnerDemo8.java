package com.test;

/*
�����ڲ����ڿ����е�ʹ��
*/
interface Person8 {
	public abstract void study();
}

class PersonDemo8 {
	//�ӿ�����Ϊ��ʽ����
	//��ʵ������Ҫ�Ĳ��ǽӿڣ����Ǹýӿڵ�ʵ����Ķ���
	public void method(Person8 p) {
		p.study();
	}
}

//ʵ����
class Student8 implements Person8 {
	public void study() {
		System.out.println("�ú�ѧϰ,��������");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
		//����
		PersonDemo8 pd = new PersonDemo8();
		Person8 p = new Student8();
		pd.method(p);
		System.out.println("--------------------");
		
		//�����ڲ����ڿ����е�ʹ��
		//�����ڲ���ı����Ǽ̳������ʵ���˽ӿڵ�������������
		pd.method(new Person8(){
			public void study() {
				System.out.println("�ú�ѧϰ,��������");
			}
		});
	}
}