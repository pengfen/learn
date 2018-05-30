package com.java;

public class TestString {
	public static void main(String[] args) {
		// �����ַ���
		String hobby = "learn";
		String url = "www.learn.com";
		
		// ����ַ���
		System.out.println("hobby: " + hobby);
		System.out.println("url: " + url);
		
		String s1 = "peng";
		String s2 = "peng";
		// �����ַ��� s3 ���� "I love" �� s1 ƴ�Ӻ������
		String s3 = "I love" + s1;
		// �Ƚ��ַ��� s1 �� s2
		// peng Ϊ�����ַ��� ��γ���ʱ�ᱻ�������Ż� ֻ����һ������
		System.out.println("s1��s2�ڴ��ַ��ͬ�� " + (s1 == s2));
		// �Ƚ��ַ��� s1 �� s3
		System.out.println("s1��s3�ڴ��ַ��ͬ�� " + (s1 == s3));
		String s4 = "I love" + s1;
		// �Ƚ��ַ��� s4 �� s3
		// s1 �Ǳ��� s4 ������ʱ��֪������ֵ ���� s3 �� s4 �ǲ�ͬ�Ķ���
		System.out.println("s3 �� s4 �ڴ��ַ��ͬ��?" + (s4 == s3));
		
		String fileName = "TestString.java"; // �����ļ���
		String email = "peng8787@163.com"; // ��������
		
		// �ж� .java �ļ����Ƿ���ȷ �Ϸ����ļ���Ӧ���� .java ��β
		// 1 ��ȡ�ļ��������һ�γ��� '.' �ŵ�λ��
		// 2 ���� '.' �ŵ�λ�� ��ȡ�ļ��ĺ�׺
		// 3 �ж� '.' ��λ�ü��ļ���׺��
		// ��ȡ�ļ��������һ�γ��� '.' �ŵ�λ��
		int index = fileName.lastIndexOf('.');
		// ��ȡ�ļ��ĺ�׺
		String prefix = fileName.substring(index);
		// �жϱ������ "." ��, �Ҳ��ܳ�������λ ͬʱ��׺��Ϊ java
		// fileName.indexOf('.') != -1 �жϱ������ '.'
		// index != 0 �жϲ��ܳ�������λ
		// prefix.equals(".java") �жϺ�׺��Ϊ java
		if (fileName.indexOf('.') != -1 && index != 0 && prefix.equals(".java")) {
			System.out.println("Java �ļ�����ȷ");
		} else {
			System.out.println("Java �ļ�����Ч");
		}
		
		// �ж������ʽ�Ƿ���ȷ �Ϸ���������������Ҫ���� "@" ���� "@" ���� "." ֮ǰ
		// 1  ��ȡ�ļ����� "@" ���ŵ�λ��
		// 2  ��ȡ������ "." �ŵ�λ��
		// 3  �жϱ������ "@" ���� �� "@" ������ "." ֮ǰ
		
		// ��ȡ������ "@" ���ŵ�λ��
		int index2 = email.lastIndexOf("@");
		// ��ȡ������ "." �ŵ�λ��
		int index3 =  email.indexOf('.');
		// �жϱ������ "@" ���� �� "@" ������ "." ��ǰ
		if (index2 != -1 && index3 > index2) {
			System.out.println("�����ʽ��ȷ");
		} else {
			System.out.println("�����ʽ��Ч");
		}
		
		// ����һ���ַ���
		String s = "asdfglfghjklaaakljlkjaakkkjooj";
		// ���ִ���
		int num = 0;
		// ѭ������ÿ���ַ� �ж��Ƿ����ַ� a ����� �ۼӴ���
		for (byte bt : s.getBytes()) { // ��ȡ�� ASCII ֵ
			// ��ȡÿ���ַ�, �ж��Ƿ����ַ� a
			// System.out.println("bt ��ֵ: " + bt);
			if (bt == 'a') {
				num ++; // �ۼ�ͳ�ƴ���
			}
		}
		System.out.println("�ַ� a ���ֵĴ���: " + num);
		
		// ����һ�� StringBuilder ���� �����洢�ַ���
		StringBuilder peng = new StringBuilder("peng");
		System.out.println(peng);
		
		// ����һ�� StringBuilder ����
		StringBuilder sb = new StringBuilder();
		// ׷���ַ���
		sb.append("lkjlklkdddlka");
		System.out.println(sb);
		// �Ӻ���ǰÿ����λ���붺�� ����治�� , ʹ�� sb.length() -3
		for(int i = (sb.length() - 3); i > 0; i-=3){
		    sb.insert(i, ","); 
		}
		
		// �� StringBuilder ����ת��Ϊ String �������
		System.out.println(sb.toString());
	}
}
