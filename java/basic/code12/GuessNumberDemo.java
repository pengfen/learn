package com.test;

import java.util.Scanner;

/*
 * ��ʱ������С��Ϸ�Ĵ���
 */
public class GuessNumberDemo {
	private GuessNumberDemo() {
	}

	public static void start() {
		// ����һ�������
		int number = (int) (Math.random() * 100) + 1;
		// Math.random() [0, 1) double����
		// Math.random() * 100 [0, 100)
		// (Math.random() * 100) + 1 [1, 100]
		// (int) ��double����ת��int����

		while (true) {
			// ����¼������
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����(1-100)��");
			int guessNumber = sc.nextInt();

			// �ж�
			if (guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			} else if (guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			} else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}
}
