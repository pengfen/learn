package com.test;
/*
è����������

���ҵ���������Ȼ���־���������й��ԣ�����ȡ��һ�����ࡣ

è��
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		palyGame()
����
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		lookDoor()
		
���ԣ�
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		
�ѹ��Զ��嵽һ�����У����������ֽУ����
�����ࣺ
	��Ա���������������䣬��ɫ
	���췽�����޲Σ�����
	��Ա������
		getXxx()/setXxx()
		eat()
		
	è��	
		���췽�����޲Σ�����
		��Ա������palyGame()
	����
		���췽�����޲Σ�����
		��Ա������lookDoor()
*/
//���嶯����
class Animal {
	//����
	private String name;
	//����
	private int age;
	//��ɫ
	private String color;
	
	public Animal() {}
	
	public Animal(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("��Ҫ˯��,�óԷ���");
	}
}

//����è��
class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name,int age,String color) {
		super(name,age,color);
	}
	
	public void playGame() {
		System.out.println("è��Ӣ������");
	}
}

//���幷��
class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name,int age,String color) {
		super(name,age,color);
	}
	
	public void lookDoor() {
		System.out.println("������");
	}
}

//������
class ExtendsTest5 {
	public static void main(String[] args) {
		//����è
		//��ʽ1
		Cat c1 = new Cat();
		c1.setName("Tom");
		c1.setAge(3);
		c1.setColor("��ɫ");
		System.out.println("è�������ǣ�"+c1.getName()+";�����ǣ�"+c1.getAge()+";��ɫ�ǣ�"+c1.getColor());
		c1.eat();
		c1.playGame();
		System.out.println("---------------");
		
		//��ʽ2
		Cat c2 = new Cat("����",5,"������");
		System.out.println("è�������ǣ�"+c2.getName()+";�����ǣ�"+c2.getAge()+";��ɫ�ǣ�"+c2.getColor());
		c2.eat();
		c2.playGame();
		
		//��ҵ�����Թ�
	}
}
