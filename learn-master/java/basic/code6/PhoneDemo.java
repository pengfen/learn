package com.test;

/*
�ֻ���Ĳ���
*/
class Phone2 {
	//Ʒ��
	String brand;
	//�۸�
	int price;
	//��ɫ
	String color;
	
	//��绰�ķ���
	public void call(String name) {
		System.out.println("��" + name + "��绰");
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

class PhoneDemo {
	public static void main(String[] args) {
		//�����ֻ�����
		//���� ������ = new ����();
		Phone2 p = new Phone2();
		
		//ֱ�������Ա����ֵ
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		
		//����Ա������ֵ
		p.brand = "ŵ����";
		p.price = 100;
		p.color = "��ɫ";
		//�ٴ����
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		
		//���÷���
		p.call("����ϼ");
		p.sendMessage();
		p.playGame();
	}
}

/*
 * �����ڴ�ͼ
 * 
 * ջ                                                       ��
 * main����                                        new Phone();
 *                     brand:null
 * Phone p ---Ox001--- price:0
 *                     color:null
 *                     
 *                     0x001 ָ�򷽷����еĳ�Ա����
 *                     
 *                     ������
 *                     class�ļ�����
 *                     PhoneDemo.class
 *                     main����
 *                     
 *                     Phone.class
 *                     ��Ա����
 *                     ��Ա���� 0x001
 *                     
 * ���÷��� call ʱ �Ὣ�������ص�ջ��
 * ������ɺ� �Ὣcall�������ٵ�
 */
