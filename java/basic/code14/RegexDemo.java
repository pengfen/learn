package com.test;

import java.util.Scanner;

/*
 * У��qq����.
 * 		1:Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ������ʵ��У��
 * 		C:���ù��ܣ���������
 */
public class RegexDemo {
	public static void main(String[] args) {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������QQ���룺");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+checkQQ(qq));
	}

	/*
	 * дһ������ʵ��У�� ������ȷ�� ��ȷ����ֵ���ͣ�boolean ��ȷ�����б�String qq
	 */
	public static boolean checkQQ(String qq) {
		boolean flag = true;

		// У�鳤��
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0���ܿ�ͷ
			if (!qq.startsWith("0")) {
				// ����������
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}

		return flag;
	}
}

/*
 * �ַ�
 *    x �ַ�  ����  'a'��ʾ�ַ�a
 *    \\ ��б���ַ�
 *    \n ����(����)�� ('\u000A')
 *    \r �س��� ('\u000D')
 *    
 * �ַ���
 *    [abc] a b �� c (����)
 *    [^abc] �κ��ַ� ���� a b �� c (��)
 *    [a-zA-Z] a �� z �� A �� Z ��ͷ����ĸ�������� (��Χ)
 *    [0-9] 0��9���ַ�������
 *    
 * Ԥ�����ַ���
 *    . �κ��ַ� �ҵľ���.�ַ����� ��ô��ʾ�� \.
 *    \d ����[0-9]
 *    \w �����ַ�[a-zA-Z_0-9] ��������ʽ������ɵ��ʵĶ�����������Щ�������
 *    
 * �߽�ƥ����
 *    ^ �еĿ�ͷ
 *    $ �еĽ�β
 *    \b ���ʱ߽� ���ǲ��ǵ����ַ��ĵط� ���� hello world?haha;xixi
 *    
 * Greedy������
 *     X? X, һ�λ�һ��Ҳû��
 *     X* X, ��λ���
 *     X+ X, һ�λ���
 *     X{n} X, ǡ��n��
 *     X{n,} X, ����n��
 *     X{n,m} X, ����n�� ���ǲ�����m��
 */
