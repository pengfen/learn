package com.test;

/*
�̳��й��췽���Ĺ�ϵ
	A:���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
	B:Ϊʲô��?
		��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
		���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
		
		ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super();
*/
class Father6 {
	int age;
	
	public Father6() {
		System.out.println("Father���޲ι��췽��");
	}
	
	public Father6(String name) {
		System.out.println("Father�Ĵ��ι��췽��");
	}
}

class Son6 extends Father6 {
	public Son6() {
		//super();
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son6(String name) {
		//super();
		System.out.println("Son�Ĵ��ι��췽��");
	}
}	

class ExtendsDemo6 {
	public static void main(String[] args) {
		//��������
		Son6 s = new Son6();
		System.out.println("------------");
		Son6 s2 = new Son6("����ϼ");
	}
}
