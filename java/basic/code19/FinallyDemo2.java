package com.test;

/*
 * �����⣺
 * 1:final,finally��finalize������
 * final�����յ���˼�����������࣬��Ա��������Ա����
 * 		�����࣬�಻�ܱ��̳�
 * 		���α����������ǳ���
 * 		���η������������ܱ���д
 * finally�����쳣�����һ���֣������ͷ���Դ��
 * 		һ����˵������϶���ִ�У������������ִ�е�finally֮ǰjvm�˳���
 * finalize����Object���һ��������������������
 * 
 * 2:���catch������return��䣬����finally����Ĵ��뻹��ִ����?
 *   ����ᣬ��������returnǰ������return��
 * 	   �ᡣǰ��
 * 
 * 	 ׼ȷ��˵��Ӧ�������м䡣
 * 
 * 3:try...catch...finally�ĸ�ʽ����
 * 		A:try...catch...finally
 * 		B:try...catch
 * 		C:try...catch...catch...
 * 		D:try...catch...catch...finally
 * 		E:try...finally
 * 			����������Ŀǰ��Ϊ���ͷ���Դ��
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return a�ڳ���ִ�е���һ����ʱ�����ﲻ��return a����return 30;�������·�����γ��ˡ�
			 * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40
			 * �ٴλص���ǰ�ķ���·����������return 30;
			 */
		} finally {
			a = 40;
			return a;//��������������40�ˡ�
		}
		// return a;
	}
}
