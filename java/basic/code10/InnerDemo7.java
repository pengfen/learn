package com.test;

/*
�����⣺
	Ҫ������շֱ����30��20��10��
	
ע�⣺
	1:�ڲ�����ⲿ��û�м̳й�ϵ��
	2:ͨ���ⲿ�����޶�this����
		Outer.this
*/
class Outer7 {
	public int num = 10;
	class Inner {
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			//System.out.println(new Outer().num);
			System.out.println(Outer7.this.num);
		}
	}
}
class InnerClassTest {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}	
}
