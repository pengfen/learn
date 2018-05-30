package com.test;

/*
 * public boolean equals(Object obj):ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 * ���������Ĭ������±Ƚϵ��ǵ�ֵַ���Ƚϵ�ֵַһ����˵���岻����������Ҫ��д�÷�����
 * ��ô��д��?
 * 		һ�㶼�������Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ��
 * ��д�Ĵ����Ż������Ч�ʣ���߳���Ľ�׳�ԡ�
 * ���հ棺
 * 		��ʵ�����Զ����ɡ�
 * 
 * ��Դ�룺
 * 		public boolean equals(Object obj) {
 * 			//this - s1
 * 			//obj - s2
 *       	return (this == obj);
 *   	}
 * 
 * ==:
 * 		�������ͣ��Ƚϵľ���ֵ�Ƿ���ͬ
 * 		�������ͣ��Ƚϵľ��ǵ�ֵַ�Ƿ���ͬ
 * equals:
 * 		�������ͣ�Ĭ������£��Ƚϵ��ǵ�ֵַ��
 * 		���������ǿ��Ը�������Լ���д�÷�����һ����д�����Զ����ɣ��Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ
 */
public class StudentDemo5 {
	public static void main(String[] args) {
		Student5 s1 = new Student5("����ϼ", 27);
		Student5 s2 = new Student5("����ϼ", 27);
		System.out.println(s1 == s2); // false
		Student5 s3 = s1;
		System.out.println(s1 == s3);// true
		System.out.println("---------------");

		System.out.println(s1.equals(s2)); // obj = s2; //false
		System.out.println(s1.equals(s1)); // true
		System.out.println(s1.equals(s3)); // true
		Student5 s4 = new Student5("������",30);
		System.out.println(s1.equals(s4)); //false
		
		Demo2 d = new Demo2();
		System.out.println(s1.equals(d)); //ClassCastException

	}
}

class Demo2 {}