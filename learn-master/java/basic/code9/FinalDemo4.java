package com.test;
/*
�̳еĴ�������

���ڼ̳��з�����һ�����󣺷�����д��
���ԣ�����Ĺ��ܣ��ͻᱻ��������ǵ���
��Щʱ�����ǲ���������ȥ���ǵ�����Ĺ��ܣ�ֻ������ʹ�á�
���ʱ��������������Java���ṩ��һ���ؼ��֣�final

final:���յ���˼���������������������࣬������������
*/
class Fu1 {
	public final void show() {
		System.out.println("�����Ǿ�����Դ,�κ��˶������޸�");
	}
}
	
class Zi1 extends Fu1 {
	// Zi�е�show()�޷�����Fu�е�show()
//	public void show() {
//		System.out.println("����һ������");
//	}
}

class ZiDemo {
	public static void main(String[] args) {
		Zi1 z = new Zi1();
		z.show();
	}
}
