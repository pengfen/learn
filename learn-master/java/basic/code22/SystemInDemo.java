package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in ��׼���������ǴӼ��̻�ȡ���ݵ�
 * 
 * ����¼�����ݣ�
 * 		A:main������args���ղ�����
 * 			java HelloWorld hello world java
 * 		B:Scanner(JDK5�Ժ��)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		C:ͨ���ַ���������װ��׼������ʵ��
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		// //��ȡ��׼������
		// InputStream is = System.in;
		// //��Ҫһ�λ�ȡһ���в�����?
		// //�С�
		// //��ôʵ����?
		// //Ҫ��ʵ�֣��������֪��һ�ζ�ȡһ�����ݵķ������ĸ���?
		// //readLine()
		// //������������ĸ�������?
		// //BufferedReader
		// //���ԣ������Ӧ�ô���BufferedReader�Ķ��󣬵��ǵײ㻹�ǵ�ʹ�ñ�׼������
		// // BufferedReader br = new BufferedReader(is);
		// //�������ǵ����룬����Ӧ�ÿ����ˣ�����ȴ������
		// //ԭ���ǣ��ַ�������ֻ������ַ��������������������ֽ��������Բ�������?
		// //��ô���һ�����ʹ���ˣ����Ҹ���һ���������?
		// //���ֽ���ת��Ϊ�ַ�����Ȼ����ͨ���ַ�����������
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br= new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������һ���ַ�����");
		String line = br.readLine();
		System.out.println("��������ַ����ǣ�" + line);

		System.out.println("������һ��������");
		// int i = Integer.parseInt(br.readLine());
		line = br.readLine();
		int i = Integer.parseInt(line);
		System.out.println("������������ǣ�" + i);
	}
}
