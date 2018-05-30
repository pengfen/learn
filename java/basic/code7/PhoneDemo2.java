package com.test;
/*
标准的手机类练习

手机类：
	成员变量：brand,price,color
	构造方法：无参构造
	成员方法：getXxx()/setXxx()
*/
//定义手机类
class Phone {
	//品牌
	private String brand;
	//价格
	private int price;
	//颜色
	private String color;
	
	//无参构造方法
	public Phone() {}
	
	//getXxx()和setXxx()方法
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

//手机测试类
class PhoneDemo2 {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();
		
		//给成员变量赋值
		p.setBrand("诺基亚");
		p.setPrice(199);
		p.setColor("土豪金");
		
		//获取值
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
	}
}
