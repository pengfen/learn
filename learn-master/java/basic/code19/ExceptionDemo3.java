package com.test;

/*
 * A:һ���쳣
 * B:�����쳣�Ĵ���
 * 		a:ÿһ��дһ��try...catch
 * 		b:дһ��try�����catch
 * 			try{
 * 				...
 * 			}catch(�쳣���� ������) {
 * 				...
 * 			}
 * 			catch(�쳣���� ������) {
 * 				...
 * 			}
 * 			...
 * 
 * 			ע�����
 * 				1:����ȷ�ľ�����ȷ����Ҫ�ô��������
 * 				2:ƽ����ϵ���쳣˭ǰ˭������ν������������Ӹ���ϵ���������ں��档
 * 
 * ע�⣺
 * 		һ��try����������⣬�ͻ��������������׳�ȥ��Ȼ���catch������������ƥ�䣬
 * 		һ����ƥ��ģ���ִ��catch����Ĵ���Ȼ�������try...catch
 * 		����ִ�к������䡣
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		// method1();

		// method2();

		// method3();

		method4();
	}

	public static void method4() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		// үү�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		} catch (Exception e) {
			System.out.println("��������");
		}

		// үү��ǰ���ǲ����Ե�
		// try {
		// System.out.println(a / b);
		// System.out.println(arr[3]);
		// System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
		// } catch (Exception e) {
		// System.out.println("��������");
		// } catch (ArithmeticException e) {
		// System.out.println("��������Ϊ0");
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("������˲��õķ��ʵ�����");
		// }

		System.out.println("over");
	}

	// �����쳣�Ĵ���
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		}

		System.out.println("over");
	}

	// �����쳣
	public static void method2() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		}

		System.out.println("over");
	}

	// һ���쳣
	public static void method1() {
		// ��һ�׶�
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}

		// �ڶ��׶�
		System.out.println("over");
	}
}
