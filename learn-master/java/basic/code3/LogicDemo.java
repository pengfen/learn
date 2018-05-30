package com.demo;
/**
 * �߼������  & | ^ ! && ||
 * 
 * �ص� �߼������һ����������boolean���͵ı��ʽ����ֵ
 * 
 * ���ʽ ������������ѳ������߱������������ķ���java�﷨��ʽ��
 * �������ʽ a + b
 * �Ƚϱ��ʽ a == b
 * 
 * ���� 
 *    & �߼��� ��false��false
 *    | �߼��� ��true��true
 *    ^ �߼���� ��ͬΪfalse ��ͬΪtrue
 *    ���� ���¹�ϵ ���� ��Ů Ů�� ŮŮ
 *    ! �߼��� ��false��true ��true��false
 *    �ص� ż�������ı䱾��
 *
 */
public class LogicDemo {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// & �߼���
		System.out.println((a > b) & (a > c)); // false & false = false
		System.out.println((a > b) & (a < c)); // false & true = false
		System.out.println((a < b) & (a > c)); // true & false = false
		System.out.println((a < b) & (a < c)); // true & true = true
		System.out.println("-------------------------------");
		
		// | �߼���
		System.out.println((a > b) | (a > c)); // false | false = false
		System.out.println((a > b) | (a < c)); // false | true = true
		System.out.println((a < b) | (a > c)); // true | false = true
		System.out.println((a < b) | (a < c)); // true | true = true
		System.out.println("-------------------------------");
		
		// ^ �߼����
		System.out.println((a > b) ^ (a > c)); // false ^ false = false
		System.out.println((a > b) ^ (a < c)); // false ^ true = true
		System.out.println((a < b) ^ (a > c)); // true ^ false = true
		System.out.println((a < b) ^ (a < c)); // true ^ true = false
		System.out.println("-------------------------------");
		
		// ! �߼���
		System.out.println(!(a > b)); // !false = true
		System.out.println(!(a < b)); // !true = false
		System.out.println(!!(a > b)); // !!false = false
		System.out.println(!!!(a > b)); // !!!false = true
		System.out.println("-------------------------------");
	}
}
