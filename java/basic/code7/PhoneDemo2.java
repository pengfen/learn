package com.test;
/*
��׼���ֻ�����ϰ

�ֻ��ࣺ
	��Ա������brand,price,color
	���췽�����޲ι���
	��Ա������getXxx()/setXxx()
*/
//�����ֻ���
class Phone {
	//Ʒ��
	private String brand;
	//�۸�
	private int price;
	//��ɫ
	private String color;
	
	//�޲ι��췽��
	public Phone() {}
	
	//getXxx()��setXxx()����
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	} 
}

//�ֻ�������
class PhoneDemo2 {
	public static void main(String[] args) {
		//��������
		Phone p = new Phone();
		
		//����Ա������ֵ
		p.setBrand("ŵ����");
		p.setPrice(199);
		p.setColor("������");
		
		//��ȡֵ
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}
}
