package com.test;
/*
�������û���޲ι��췽������ô����Ĺ��췽�������ʲô������?
	����
��ν����?	
	A:�ڸ����м�һ���޲ι��췽��
	B:ͨ��ʹ��super�ؼ���ȥ��ʾ�ĵ��ø���Ĵ��ι��췽��
	C:����ͨ��thisȥ���ñ�����������췽��
		������һ��Ҫ��һ��ȥ�����˸���Ĺ��췽�������������ݾ�û�г�ʼ����
		
ע�����
	this(...)����super(...)��������ڵ�һ������ϡ�
	������Ƿ��ڵ�һ������ϣ��Ϳ��ܶԸ�������ݽ����˶�γ�ʼ�������Ա�����ڵ�һ������ϡ�
*/
class Father7 {
	/*
	public Father() {
		System.out.println("Father���޲ι��췽��");
	}
	*/
	
	public Father7(String name) {
		System.out.println("Father�Ĵ��ι��췽��");
	}
}

class Son7 extends Father7 {
	public Son7() {
		super("����");
		System.out.println("Son���޲ι��췽��");
		//super("����");
	}
	
	public Son7(String name) {
		//super("����");
		this();
		System.out.println("Son�Ĵ��ι��췽��");
	}
}

class ExtendsDemo7 {
	public static void main(String[] args) {
		Son7 s = new Son7();
		System.out.println("----------------");
		Son7 ss = new Son7("����ϼ");
	}
}