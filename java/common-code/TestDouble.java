package com.java;

public class TestDouble {
	public static void main(String[] args) {
		// ���� double ���ͱ���
		double a = 91.5;
		// �ֶ�װ��
		Double b = new Double(a);
		// �Զ�װ��
		Double c = a;
		System.out.println("װ���Ľ��Ϊ: " + b + "��" + c);
		// ����һ�� Double ��װ����� ֵΪ 8
		Double d = new Double(87.0);
		// �ֶ�����
		double e = d.doubleValue();
		// �Զ�����
		double f = d;
		System.out.println("�����Ľ��Ϊ: " + e + "��" + f);
		
		double m = 78.5;
		String str1 = Double.toString(m); // ����������ת��Ϊ�ַ�
		System.out.println("m ת��Ϊ String �ͺ������� 20 ����ͽ��Ϊ: " + (str1 + 20));
		String str = "180.20";
		// ���ַ���ת��Ϊ��������
		Double a1 = Double.parseDouble(str);
		System.out.println("str ת��Ϊ double �ͺ������� 20 ����ͽ��Ϊ: " + (a + 20));
	}
}
