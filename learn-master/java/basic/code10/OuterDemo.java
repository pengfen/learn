package com.test;
/*
�����ڲ��������⣺
	����Ҫ�󣬲������
		interface Inter { void show(); }
		class Outer { //������� }
		class OuterDemo {
			public static void main(String[] args) {
				  Outer.method().show();
			  }
		}
		Ҫ���ڿ���̨�����HelloWorld��
*/
interface Inter9 { 
	void show(); 
	//public abstract
}

class Outer9 { 
	//�������
	public static Inter9 method() {
		//������� -- ������������
		return new Inter9() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class OuterDemo {
	public static void main(String[] args) {
		Outer9.method().show();
		/*
			1:Outer.method()���Կ���method()Ӧ����Outer�е�һ����̬������
			2:Outer.method().show()���Կ���method()�����ķ���ֵ��һ������
				�����ڽӿ�Inter����һ��show()����,��������Ϊmethod()�����ķ���ֵ������һ���ӿڡ�
		*/
	}
}