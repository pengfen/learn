/*
    �ж�101~999֮���ж��ٸ����� �������������

    ���� �ж����� sqrt����ƽ����
         ��һ�����ֱ�ȥ��2��sqrt(�����) ����ܱ����� ������������ ����������
*/

import java.util.Scanner;

public class ProgDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ʼ�� ");
		int start = sc.nextInt();
		System.out.println("���������������� ");
		int end = sc.nextInt();
		if (start < 1 || end < 1) {
			System.out.println("���������0���� ");
			System.exit(0);
		}
		if (end < start) {
			System.out.println("��ʼ�����ܴ��ڽ����� ");
			System.exit(0);
		}

		int count = 0; // ͳ����������
		for (int i = start; i < end; i ++) {
			if (isPrime(i)) {
				count ++;
				System.out.print(i + " "); // �������
				if (count % 10 == 0) { // ÿ����ʾʮ����
					System.out.println();
				}
			}
		}
	}

	// �ж�����
	private static boolean isPrime(int n) {
		boolean flag = true; // �жϱ�־
		if (n == 1) {
			flag = false; // ����1��������
		} else {
			for (int i = 2; i <= Math.sqrt(n); i ++) {
				if ((n % i) == 0 || n == 1) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}