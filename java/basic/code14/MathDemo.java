package com.test;

/*
 * Math:������ѧ������ࡣ
 * ��Ա������
 * 		public static final double PI
 * 		public static final double E
 * ��Ա������
 * 		public static int abs(int a)������ֵ
 *		public static double ceil(double a):����ȡ��
 *		public static double floor(double a):����ȡ��
 *		public static int max(int a,int b):���ֵ (min��ѧ)
 *		public static double pow(double a,double b):a��b����
 *		public static double random():����� [0.0,1.0)
 *		public static int round(float a) ��������(����Ϊdouble����ѧ)
 *		public static double sqrt(double a):��ƽ����
 */
public class MathDemo {
	public static void main(String[] args) {
		// public static final double PI
		System.out.println("PI:" + Math.PI);
		// public static final double E
		System.out.println("E:" + Math.E);
		System.out.println("--------------");

		// public static int abs(int a)������ֵ
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("--------------");

		// public static double ceil(double a):����ȡ��
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("--------------");

		// public static double floor(double a):����ȡ��
		System.out.println("floor:" + Math.floor(12.34));
		System.out.println("floor:" + Math.floor(12.56));
		System.out.println("--------------");

		// public static int max(int a,int b):���ֵ
		System.out.println("max:" + Math.max(12, 23));
		// ������Ҫ��ȡ���������е����ֵ
		// ������Ƕ�׵���
		System.out.println("max:" + Math.max(Math.max(12, 23), 18));
		// ������Ҫ��ȡ�ĸ������е����ֵ
		System.out.println("max:"
				+ Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("--------------");

		// public static double pow(double a,double b):a��b����
		System.out.println("pow:" + Math.pow(2, 3));
		System.out.println("--------------");

		// public static double random():����� [0.0,1.0)
		System.out.println("random:" + Math.random());
		// ��ȡһ��1-100֮��������
		System.out.println("random:" + ((int) (Math.random() * 100) + 1));
		System.out.println("--------------");

		// public static int round(float a) ��������(����Ϊdouble����ѧ)
		System.out.println("round:" + Math.round(12.34f));
		System.out.println("round:" + Math.round(12.56f));
		System.out.println("--------------");
		
		//public static double sqrt(double a):��ƽ����
		System.out.println("sqrt:"+Math.sqrt(4));
	}
}

