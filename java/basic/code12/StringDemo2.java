package com.test;

/*
 * �ַ������ص㣺һ������ֵ���Ͳ��ܸı䡣
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println("s : " + s); // helloworld
	}
}
/*
�ַ���ֱ�Ӹ�ֵ�ķ�ʽ���ȵ��ַ�������������ȥ�� ����о�ֱ�ӷ��� û�� �ʹ���������
ջ
String s --- 0x001
�Ҳ��� �ᴴ�� �������ָ�� 0x003

������
�ַ���������
"hello" 0x001
"world" 0x002
"hello""world" 0x003
*/