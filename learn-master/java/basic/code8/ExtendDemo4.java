package com.test;

/*
�����ɣ�
	��Ա������
	���췽����
	��Ա������
�����������ֽ����˼̳У����ԣ����Ǿ�Ӧ��������һ�£������ɲ��ֵĸ��Թ�ϵ��

�̳��г�Ա�����Ĺ�ϵ:
	A:�����еĳ�Ա�����͸����еĳ�Ա�������Ʋ�һ�������̫�򵥡�
	B:�����еĳ�Ա�����͸����еĳ�Ա��������һ���������ô����?
		�����෽���з���һ�������Ĳ���˳��
			a:�����෽���ľֲ���Χ�ң��о�ʹ��
			b:������ĳ�Ա��Χ�ң��о�ʹ��
			c:�ڸ���ĳ�Ա��Χ�ң��о�ʹ��
			d:������Ҳ������ͱ���
*/
class Father4 {
	public int num = 10;
	
	public void method() {
		int num = 50;
	}
}

class Son4 extends Father4 {
	public int num2 = 20;
	public int num = 30;
	
	public void show() {
		int num = 40;
		System.out.println(num);
		System.out.println(num2);
		// �Ҳ�������
		// System.out.println(num3);
	}
}

class ExtendsDemo4 {
	public static void main(String[] args) {
		//��������
		Son4 s = new Son4();
		s.show();
	}
}