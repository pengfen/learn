package com.test;

/*
�ӿڳ�Ա�ص�
	��Ա������ֻ���ǳ����������Ǿ�̬�ġ�
			Ĭ�����η���public static final
			���飺�Լ��ֶ�������
	���췽�����ӿ�û�й��췽����
	��Ա������ֻ���ǳ��󷽷���
			Ĭ�����η���public abstract
			���飺�Լ��ֶ�������
	
���е��඼Ĭ�ϼ̳���һ���ࣺObject��
�� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
*/
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	
	//����: ��Ҫ<��ʶ��>
	//public Inter() {}
	
	//�ӿڷ������ܴ�������
	//public void show() {}
	
	//abstract void show(); //Ĭ��public
	public void show(); //Ĭ��abstract
}

//�ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
/*
class InterImpl implements Inter {
	public InterImpl() {
		super();
	}
}
*/

class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();
	}
	
	public void show() {}
}

//������
class InterfaceDemo2 {
	public static void main(String[] args) {
		//��������
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
		//i.num = 100;
		//i.num2 = 200;
		//System.out.println(i.num); //�޷�Ϊ���ձ���num����ֵ
		//System.out.println(i.num2);//�޷�Ϊ���ձ���num2����ֵ
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
		System.out.println("--------------");
	}
}