package com.test;
/*
���������һ��4��5�е�����(*)ͼ����
�����
	*****
	*****
	*****
	*****
	
ѭ��Ƕ�ף�����ѭ������ѭ���屾����һ��ѭ����䡣

ͨ���������֪��������һ�����ۣ�
	��ѭ����������
	��ѭ����������
*/
class ForForDemo {
	public static void main(String[] args) {
		//ԭʼ����
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("-------------");
		
		//��Ȼ����������󣬵��ǲ��Ǻܺ�
		//����Ƕ��ж��оͻ�Ƚ��鷳
		//��������׼���Ľ�
		//��θĽ���?
		//���ȿ������ʵ��һ��*������
		//System.out.println("*****");
		//����Ҫ��������ʵ��һ�����һ��*������
		//System.out.println("*");
		//System.out.println("*");
		//������Ȼ����һ��һ��*������ȴ�����ˣ���Ҫ���ܻ��У���ô����?
		//���������һ�ָ�ʽ��System.out.print(); ����ǲ������е�
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//System.out.print("*");
		//�����Ҫ��һ���ϴ�����*���Ƚ��鷳�����������ظ��ģ������Ҿ�����ѭ���Ľ�
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
		System.out.println();
		
		//��Ȼ�ҿ��Դ��һ�У��ҾͿ��Դ���ڶ���
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
		System.out.println();
	
		//ͬ���������У�������
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
		System.out.println();
		
		//��Ȼ�ҿ��Դ��һ�У��ҾͿ��Դ���ڶ���
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
		System.out.println();
		System.out.println("-----------------");
		//ͬ���Ĵ��������4�Σ�˵�����ǳ���д�Ĳ��ã���ѭ���Ľ�
		for(int y=0; y<4; y++) {
			for(int x=0; x<5; x++) {
				System.out.print("*");
			}
			//���ǿ���ͨ���յ�������ʵ�ֻ��У�System.out.println();
			System.out.println();
		}
	}
}
