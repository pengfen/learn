package com.test;

/*
 * JDK5��������
 * �Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 * �Զ����䣺�Ѱ�װ������ת��Ϊ��������
 * 
 * ע��һ��С���⣺
 * 		��ʹ��ʱ��Integer  x = null;����ͻ����NullPointerException��
 * 		�������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
 */
public class IntegerDemo5 {
	public static void main(String[] args) {
		// ������һ��int���͵İ�װ�����ͱ���i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:" + ii);

		// ͨ���������Ĵ���
		// Integer ii = Integer.valueOf(100); //�Զ�װ��
		// ii = Integer.valueOf(ii.intValue() + 200); //�Զ����䣬���Զ�װ��
		// System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		// NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
}

