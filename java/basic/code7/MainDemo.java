package com.test;

/*
main�����ĸ�ʽ���⣺
	public static void main(String[] args) {...}
	
	public:�����ģ�����Ȩ�������ġ�����main�����Ǳ�jvm���ã�����Ȩ��Ҫ����
	static:��̬�ģ�����Ҫ��������ͨ�������Ϳ��ԡ�����jvm�ĵ��á�
	void:��Ϊ��������˵���������ķ���ֵ�Ƿ��ظ������ߣ���main�����Ǳ�jvm���á��㷵�����ݸ�jvmû�����塣
	main:��һ�������ķ�����ڡ��Ҽ��������Զ�����main��Ϊ��ڡ�
	String[] args:����һ���ַ������顣ֵȥ������?
		�������������ʲô�ð�?��ô��ֵ��?
			�������������Ϊ�˽��ռ���¼������ݵġ�
			��ʽ�ǣ�
				java MainDemo hello world java
*/
class MainDemo {
	public static void main(String[] args) {
		//System.out.println(args); //[Ljava.lang.String;@175078b
		//System.out.println(args.length); //0
		//System.out.println(args[0]); //ArrayIndexOutOfBoundsException
		
		//�������ݺ�
		System.out.println(args); 
		System.out.println(args.length); 
		//System.out.println(args[0]); 
		for(int x=0; x<args.length; x++) {
			System.out.println(args[x]);
		}
	}
}
