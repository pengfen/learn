package com.test;
/*
�ֲ��ڲ���
	A:����ֱ�ӷ����ⲿ��ĳ�Ա
	B:�ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��

�����⣺
	�ֲ��ڲ�����ʾֲ�������ע������?
	A:�ֲ��ڲ�����ʾֲ�����������final����
	B:Ϊʲô��?
		�ֲ����������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ��
		�����ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final���Ρ�
		����final���κ���������ͳ��˳�������Ȼ�ǳ���������ʧ�ˡ�
		�����ڴ��д洢��������20�����ԣ��һ�����������ʹ�á�
*/
class Outer5 {
	private int num  = 10;
	
	public void method() {
		//int num2 = 20;
		//final int num2 = 20;
		class Inner {
			public void show() {
				System.out.println(num);
				//���ڲ����з��ʱ��ر���num2; ��Ҫ������Ϊ��������
				//System.out.println(num2);//20
			}
		}
		
		//System.out.println(num2);
		
		Inner i = new Inner();
		i.show();
	}
}

class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer5 o = new Outer5();
		o.method();
	}
}