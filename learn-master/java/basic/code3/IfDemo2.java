package com.demo;
/**
 * if����ע������
 *     �Ƚϱ��ʽ���ۼ򵥻��Ǹ��� ���������boolean����
 *     if�����Ƶ�����������һ����� �����ſ���ʡ�� ����Ƕ������ �Ͳ���ʡ�� ������Զ��Ҫʡ��
 *     һ����˵ ��������ž�û�зֺ� �зֺž�û���������
 *
 */
public class IfDemo2 {
	public static void main(String[] args) {
		int x = 10;
		
		if (x == 10) {
			System.out.println("x����10");
		}
		
		if ((x > 5) || (x == 10)) {
			System.out.println("x���ڻ��ߵ���10");
		}
		System.out.println("----------------------------");
		
		int a = 100;
		
		/*
		 * if (a == 100) {
		 *     System.out.println("a��ֵ��100");
		 * }
		 */
		
		if (a != 100) {
			System.out.println("a��ֵ��100");
			System.out.println("over");
		}
		System.out.println("----------------------------");
		
		int b = 100;
		if (b != 100); // ������ʵ���������� ֻ�����ǿ������
		
		// �����
		{
			System.out.println("b��ֵ��100");
			System.out.println("over");
		}
	}
}
