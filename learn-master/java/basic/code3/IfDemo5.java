package com.demo;

import java.util.Scanner;

/**
 * if���ĸ�ʽ
 *    if (�Ƚϱ��ʽ1) {
 *        �����1;
 *    } else if (�Ƚϱ��ʽ2) {
 *        �����2;
 *    } else if (�Ƚϱ��ʽ3) {
 *        �����3;
 *    }
 *    ...
 *    else {
 *        �����n+1;
 *    }
 *    
 * ִ������
 *    ���ȼ���Ƚϱ��ʽ1���䷵��ֵ��true����false
 *    �����true ��ִ�������1 if������
 *    �����false ���ż���Ƚϱ��ʽ2 ���䷵��ֵ��true����false
 *    
 *    �����true ��ִ�������2 if������
 *    �����false ���ż���Ƚϱ��ʽ3 ���䷵��ֵ��true����false
 *    ...
 *    
 *    �������false ��ִ�������n+1
 *
 */
public class IfDemo5 {
	public static void main(String[] args) {
		// ���� ����¼��һ���ɼ� �жϲ�����ɼ��ĵȼ�
		
		/*
			90-100 ����
			80-90  ��
			70-80  ��
			60-70  ����
			0-60   ������
		*/
		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		
		//¼������
		System.out.println("��������Ŀ��Գɼ���");
		int score = sc.nextInt();
		
		/*
		if(score >= 90 && score <= 100) {
			System.out.println("����");
		}else if(score >= 80 && score < 90) {
			System.out.println("��");
		}else if(score >= 70 && score < 80) {
			System.out.println("��");
		}else if(score >= 60 && score < 70) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
		*/
		//����д�Ѿ������ҵĻ���Ҫ�󣬵��ǿ��ܱ�����ʹ�õ�ʱ�򣬲��ᰴ����Ҫ������ݸ����ˡ�
		//����һ������Ļ������Ե�ʱ��һ��Ҫ���������ļ������⣺
		//��ȷ���ݣ��������ݣ��߽����ݡ�
		//�����Ǹղ�д�ĳ���û�д���������ݣ�������������Ǻܺã�Ҫ�Ľ�
		/*
		if(score >= 90 && score <= 100) {
			System.out.println("����");
		}else if(score >= 80 && score < 90) {
			System.out.println("��");
		}else if(score >= 70 && score < 80) {
			System.out.println("��");
		}else if(score >= 60 && score < 70) {
			System.out.println("����");
		}else if(score >= 0 && score < 60){
			System.out.println("������");
		}else {
			System.out.println("������ĳɼ�����");
		}
		*/
		
		//��һ���жϸĽ�
		if(score < 0 || score > 100) {
			System.out.println("������ĳɼ�����");
		}else if(score >= 90 && score <= 100) {
			System.out.println("����");
		}else if(score >= 80 && score < 90) {
			System.out.println("��");
		}else if(score >= 70 && score < 80) {
			System.out.println("��");
		}else if(score >= 60 && score < 70) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
}
