package com.test;

/*
��Ա�ڲ�������η���
	private Ϊ�˱�֤���ݵİ�ȫ��
	static Ϊ�˷����������
		ע�⣺��̬�ڲ�����ʵ��ⲿ�����ݱ����þ�̬���Ρ�

����������һ����(�������壬�����������ࡣ)
	
	class Body {
		private class Heart {
			public void operator() {
				System.out.println("�������");
			}
		}
		
		public void method() {
			if(����������ҽ��) {
				Heart h = new Heart();
				h.operator();
			}
		}
	}
	
	�������ǸղŵĽ��⣬��ʹ��һ��
	Body.Heart bh = new Body().new Heart();
	bh.operator();
	//����private�󣬾Ͳ��ܱ������ˣ���ô����ô����?
	Body b =  new Body();
	b.method();
*/
class Outer4 {
	private int num = 10;
	private static int num2 = 100;
	
	//�ڲ����þ�̬��������Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
	public static class Inner {
		public void show() {
			//System.out.println(num);
			System.out.println(num2);
		}
	
		public static void show2() {
			//System.out.println(num);
			System.out.println(num2);
		}		
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		//ʹ���ڲ���
		// �޶����¾�̬��
		//Outer.Inner oi = new Outer().new Inner();
		//oi.show();
		//oi.show2();
		
		//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ��:
		//��ʽ���ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
		Outer4.Inner oi = new Outer4.Inner();
		oi.show();
		oi.show2();
		
		//show2()����һ�ֵ��÷�ʽ
		Outer4.Inner.show2();
	}
}
