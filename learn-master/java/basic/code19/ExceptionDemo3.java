package com.test;

/*
 * A:一个异常
 * B:二个异常的处理
 * 		a:每一个写一个try...catch
 * 		b:写一个try，多个catch
 * 			try{
 * 				...
 * 			}catch(异常类名 变量名) {
 * 				...
 * 			}
 * 			catch(异常类名 变量名) {
 * 				...
 * 			}
 * 			...
 * 
 * 			注意事项：
 * 				1:能明确的尽量明确，不要用大的来处理。
 * 				2:平级关系的异常谁前谁后无所谓，如果出现了子父关系，父必须在后面。
 * 
 * 注意：
 * 		一旦try里面出了问题，就会在这里把问题给抛出去，然后和catch里面的问题进行匹配，
 * 		一旦有匹配的，就执行catch里面的处理，然后结束了try...catch
 * 		继续执行后面的语句。
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

		// 爷爷在最后
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		} catch (Exception e) {
			System.out.println("出问题了");
		}

		// 爷爷在前面是不可以的
		// try {
		// System.out.println(a / b);
		// System.out.println(arr[3]);
		// System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
		// } catch (Exception e) {
		// System.out.println("出问题了");
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能为0");
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("你访问了不该的访问的索引");
		// }

		System.out.println("over");
	}

	// 两个异常的处理
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 两个异常
	public static void method2() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 一个异常
	public static void method1() {
		// 第一阶段
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}

		// 第二阶段
		System.out.println("over");
	}
}
