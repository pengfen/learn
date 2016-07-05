/*
    判断101~999之间有多少个素数 并输出所有素数

    分析 判断素数 sqrt计算平方根
         用一个数分别去除2到sqrt(这个数) 如果能被整除 表明不是素数 否则是素数
*/

import java.util.Scanner;

public class ProgDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入素数起始数 ");
		int start = sc.nextInt();
		System.out.println("请输入素数结束数 ");
		int end = sc.nextInt();
		if (start < 1 || end < 1) {
			System.out.println("请输入大于0的数 ");
			System.exit(0);
		}
		if (end < start) {
			System.out.println("起始数不能大于结束数 ");
			System.exit(0);
		}

		int count = 0; // 统计素数个数
		for (int i = start; i < end; i ++) {
			if (isPrime(i)) {
				count ++;
				System.out.print(i + " "); // 输出素数
				if (count % 10 == 0) { // 每行显示十个数
					System.out.println();
				}
			}
		}
	}

	// 判断素数
	private static boolean isPrime(int n) {
		boolean flag = true; // 判断标志
		if (n == 1) {
			flag = false; // 处理1不是素数
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