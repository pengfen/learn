package com.test;

/*
private:
	��һ��Ȩ�����η�
	�������γ�Ա�����ͳ�Ա����
	�������εĳ�Աֻ���ڱ����б�����
*/
class Demo1 {
	//int num = 10;
	//��private����
	private int num = 10;
	
	public void show() {
		System.out.println(num);
	}
	
	private void method() {
		System.out.println("method");
	}
	
	public void function() {
		method();
	}
}

class PrivateDemo {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		//���ܷ���˽�еĳ�Ա����
		//System.out.println(d.num);
		d.show();
		//���ܷ���˽�еĳ�Ա����
		//d.method();
		d.function();
	}
}

