package com.java;

public class TestTry {
	public static void main(String[] args) {
		TestTry tt = new TestTry();
		int result = tt.test();
		System.out.println("test() ����, ִ����� ����ֵΪ: " + result);
		int result2 = tt.test2();
		System.out.println("������������� test2() ִ�����");
	}
	
	/**
	 * divider(����)
	 * result(���)
	 * try-catch ���� while ѭ��
	 * ÿ��ѭ�� divider ��һ  result = result + 100 / divider
	 * ��� �����쳣 ��ӡ��� "�׳��쳣��" ���� -1
	 * ���� ���� result
	 * @return
	 */
	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider --;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ѭ���׳��쳣��");
			return -1;
		}
	}
	
	/**
	 * divider(����)
	 * result(���)
	 * try-catch ���� while ѭ��
	 * ÿ��ѭ�� divider ��һ  result = result + 100 / divider
	 * ��� �����쳣 ��ӡ��� "�׳��쳣��" ���� result = 999
	 * ���� ���� result
	 * finally ��ӡ��� ���� finally ���� ͬʱ��ӡ��� result ��ֵ
	 * @return
	 */
	public int test2() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider --;
				result = result + 100 / divider;
			}
			return result;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ѭ���׳��쳣��");
			return result = 999;
		} finally {
			System.out.println("���� finally ����");
			System.out.println("���� result �ҵ�ֵ��: " + result);
		}
	}
}
