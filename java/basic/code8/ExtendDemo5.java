package com.test;
/*
�����ǣ�
	�Ҳ�����Ҫ����ֲ���Χ��num����Ҫ��������Ա��Χ��num����ô����?
	�һ���Ҫ��������Ա��Χ��num����ô����?
		�����һ��������this���ƣ����ǿ���ֱ�ӷ��ʸ�������ݾͺ��ˡ�
		��ϲ�㣬����ؼ����Ǵ��ڵģ�super��
		
this��super������?
	�ֱ���ʲô��?
		this�������Ӧ�����á�
		super������洢�ռ�ı�ʶ(�������Ϊ��������,���Բ�������ĳ�Ա)

	��ô����?
		A:���ó�Ա����
			this.��Ա���� ���ñ���ĳ�Ա����
			super.��Ա���� ���ø���ĳ�Ա����
		B:���ù��췽��
			this(...)	���ñ���Ĺ��췽��
			super(...)	���ø���Ĺ��췽��
		C:���ó�Ա����
			this.��Ա���� ���ñ���ĳ�Ա����
			super.��Ա���� ���ø���ĳ�Ա����
*/
class Father5 {
	public int num = 10;
	}
	
	class Son5 extends Father5 {
	public int num = 20;
	
	public void show() {
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

class ExtendsDemo5 {
	public static void main(String[] args) {
		Son5 s = new Son5();
		s.show();
	}
}