package com.test;

/*
����飺��Java�У�ʹ��{}�������Ĵ��뱻��Ϊ����顣
������λ�ú������Ĳ�ͬ�����Է�Ϊ
	�ֲ������:�ֲ�λ��,�����޶��������������ڡ�
	��������:�����еĳ�Աλ��,��{}�������Ĵ��롣ÿ�ε��ù��췽��ִ��ǰ��������ִ�й������顣
		���ã����԰Ѷ�����췽���еĹ�ͬ����ŵ�һ�𣬶Զ�����г�ʼ����
	��̬�����:�����еĳ�Աλ��,��{}�������Ĵ���,ֻ��������static�����ˡ�
		���ã�һ���Ƕ�����г�ʼ����
		
������?
	��̬�����,��������,���췽����ִ��˳��?
	��̬����� -- �������� -- ���췽��
	��̬����飺ִֻ��һ��
	�������飺ÿ�ε��ù��췽����ִ��
*/
class Code {
	// ��̬�����
	static {
		int a = 1000;
		System.out.println(a);
	}
	
	//��������
	{
		int x = 100;
		System.out.println(x);
	}
	
	//���췽��
	public Code(){
		System.out.println("code");
	}
	
	//���췽��
	public Code(int a){
		System.out.println("code");
	}
	
	//��������
	{
		int y = 200;
		System.out.println(y);
	}
	
	//��̬�����
	static {
		int b = 2000;
		System.out.println(b);
	}
}

class CodeDemo {
	public static void main(String[] args) {
		//�ֲ������
		{
			int x = 10;
			System.out.println(x);
		}
		//�Ҳ�������
		//System.out.println(x);
		{
			int y = 20;
			System.out.println(y);
		}
		System.out.println("---------------");
		
		Code c = new Code();	
		System.out.println("---------------");
		Code c2 = new Code();
		System.out.println("---------------");
		Code c3 = new Code(1);
	}
}
