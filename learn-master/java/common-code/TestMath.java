package com.java;

public class TestMath {
	public static void main(String[] args) {
		// ����һ���������� ����Ϊ 10
		int[] nums = new int[10];
		// ͨ��ѭ�������鸳ֵ
		for (int i = 0; i < nums.length; i ++) {
			// ���� 10 ���ڵ������
			int x = (int)(Math.random() * 10);
			nums[i] = x; // ΪԪ�ظ�ֵ
		}
		// ʹ�� foreach ѭ����������е�Ԫ��
		for (int num:nums) {
			System.out.println(num + " ");
		}
	}
}
