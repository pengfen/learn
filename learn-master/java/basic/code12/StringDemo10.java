package com.test;

/*
 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 * 
 * ������
 * 		A:����ܹ��õ�ÿһ���ַ���?
 * 			char charAt(int index)
 * 		B:����ô֪���ַ������ж��ٸ���?
 * 			int length()
 */
public class StringDemo10 {
	public static void main(String[] args) {
		// �����ַ���
		String s = "helloworld";

		// ԭʼ�汾
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(2));
		// System.out.println(s.charAt(3));
		// System.out.println(s.charAt(4));
		// System.out.println(s.charAt(5));
		// System.out.println(s.charAt(6));
		// System.out.println(s.charAt(7));
		// System.out.println(s.charAt(8));
		// System.out.println(s.charAt(9));

		// ֻ��Ҫ���Ǵ�0ȡ��9
		// for (int x = 0; x < 10; x++) {
		// System.out.println(s.charAt(x));
		// }

		// ��������ر𳤣��Ҳ�����ȥ������������Ҫ�ó��ȹ���
		for (int x = 0; x < s.length(); x++) {
			// char ch = s.charAt(x);
			// System.out.println(ch);
			// ������������Ҿ�ֱ�������
			System.out.println(s.charAt(x));
		}
	}
}

