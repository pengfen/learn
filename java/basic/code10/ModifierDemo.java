package com.test;
/*
���η���
	Ȩ�����η���private��Ĭ�ϵģ�protected��public
	״̬���η���static��final
	�������η���abstract
	
�ࣺ
	Ȩ�����η���Ĭ�����η���public
	״̬���η���final
	�������η���abstract
	
	�õ����ľ��ǣ�public
	
��Ա������
	Ȩ�����η���private��Ĭ�ϵģ�protected��public
	״̬���η���static��final
	
	�õ����ľ��ǣ�private
	
���췽����
	Ȩ�����η���private��Ĭ�ϵģ�protected��public
	
	�õ����ľ��ǣ�public
	
��Ա������
	Ȩ�����η���private��Ĭ�ϵģ�protected��public
	״̬���η���static��final
	�������η���abstract
	
	�õ����ľ��ǣ�public
	
�����������Ϲ���
	��Ա������public static final
	��Ա������public static 
	          public abstract
			  public final
	
*/
//�˴�������ʹ�����η�private
//�˴�������ʹ�����η�protected
//�˴�������ʹ�����η�static
public class ModifierDemo {
	//��Ա����
	private int x = 10;
	int y = 20;
	protected int z = 30;
	public int a = 40;
	public final int b = 50;
	public static int c = 60;
	public static final int d = 70;
	//�˴�������ʹ�����η�abstract
	//abstract int e = 80;
	
	//���췽��
	private ModifierDemo(){}
	
	ModifierDemo(String name){}
	
	protected ModifierDemo(String name,int age) {}
	
	public ModifierDemo(String name,int age,String address) {}
	
	//�˴�������ʹ�����η�static
	//public static Demo(){}
	//�˴�������ʹ�����η�final
	//public final Demo() {}
	//�˴�������ʹ�����η�abstract
	//public abstract Demo(){}
	
	//��Ա����
	//static void show() {}
	//abstract void show();
	//final void show(){}
}
