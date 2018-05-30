package com.test;

/*
 * JDK7������һ���µ��쳣��������
 * 		try{
 * 
 * 		}catch(�쳣��1 | �쳣��2 | ...  ���� ) {
 * 			...
 * 		}
 * 
 * 		ע�⣺���������Ȼ��࣬����Ҳ�����á�
 * 			A:����ʽ��һ�µġ�(ʵ�ʿ����У��ö�ʱ����ܾ������ͬ���͵����⣬����ͬһ������)
 *			B:����쳣�������ƽ����ϵ��
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		// try {
		// System.out.println(a / b);
		// System.out.println(arr[3]);
		// System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
		// } catch (ArithmeticException e) {
		// System.out.println("��������Ϊ0");
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("������˲��õķ��ʵ�����");
		// } catch (Exception e) {
		// System.out.println("��������");
		// }

		// JDK7�Ĵ�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		}

		System.out.println("over");
	}

}
