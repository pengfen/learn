package com.test;

/**
 * ���Ǿ���Ĺ���
 * 
 * @author ������
 * @version V1.0
 */
public class Dog2 extends Animal2 implements Jump2 {

	@Override
	public void jump() {
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void sleep() {
		System.out.println("��վ��˯��");
	}

}