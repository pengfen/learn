package com.test;

/*
�ֻ����
	���ԣ�Ʒ�ƣ��۸���ɫ...
	��Ϊ����绰�������ţ�����Ϸ...
	
�ֻ��ࣺ
	��Ա������Ʒ�ƣ��۸���ɫ
	��Ա��������绰�������ţ�����Ϸ
*/
class Phone {
	//Ʒ��
	String brand;
	//�۸�
	int price;
	//��ɫ
	String color;
	
	//��绰�ķ���
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
	
	//�����ŵķ���
	public void sendMessage() {
		System.out.println("Ⱥ������");
	}
	
	//����Ϸ�ķ���
	public void playGame() {
		System.out.println("����Ϸ");
	}
}
