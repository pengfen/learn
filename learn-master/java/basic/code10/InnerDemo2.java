package com.test;

/*
�ڲ���λ��
	��Աλ��:�ڳ�Աλ�ö�����࣬����Ϊ��Ա�ڲ��ࡣ	
	�ֲ�λ��:�ھֲ�λ�ö�����࣬����Ϊ�ֲ��ڲ��ࡣ
	
	
��Աλ��:�ڳ�Աλ�ö�����࣬����Ϊ��Ա�ڲ��ࡣ	
	
*/
class Outer2 {
	private int num = 10;
	
	//��Աλ��
	/*
	class Inner {
		
	}
	*/
	
	
	public void method() {
		//�ֲ�λ��
		class Inner {
		
		}
	}
}

class InnerClassDemo2 {
	public static void main(String[] args) {
		
	}
}