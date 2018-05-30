package com.test;

/*
��̬�ĺô���
	A:����˴����ά����(�̳б�֤)
	B:����˴������չ��(�ɶ�̬��֤)
	
è����������
*/
class Animal {
	public void eat(){
		System.out.println("eat");
	}
	
	public void sleep(){
		System.out.println("sleep");
	}
}

class Dog extends Animal {
	public void eat(){
		System.out.println("������");
	}
	
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
	
	public void sleep() {
		System.out.println("èſ��˯��");
	}
	}
	
	class Pig extends Animal {
	public void eat() {
		System.out.println("��԰ײ�");
	}
	
	public void sleep() {
		System.out.println("�����˯");
	}
}

//��Զ�������Ĺ�����
class AnimalTool {
	private AnimalTool(){}
	
	/*
	//����è�Ĺ���
	public static void useCat(Cat c) {
		c.eat();
		c.sleep();
	}
	
	//���ù��Ĺ���
	public static void useDog(Dog d) {
		d.eat();
		d.sleep();
	}
	
	//������Ĺ���
	public static void usePig(Pig p) {
		p.eat();
		p.sleep();
	}
	*/
	public static void useAnimal(Animal a) {
		a.eat();
		a.sleep();
	}

}

class PloymorphicDemo2 {
	public static void main(String[] args) {
		//��ϲ��è��������һֻ
		Cat c = new Cat();
		c.eat();
		c.sleep();
		
		//�Һ�ϲ��è�����ԣ�������һֻ
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		
		//���ر�ϲ��è��������һֻ
		Cat c3 = new Cat();
		c3.eat();
		c3.sleep();
		//...
		System.out.println("--------------");
		//��������,�����˺ܶ�ֻè��ÿ�δ��������ǿ��Խ��ܵ�
		//������?���÷������㲻���ú�������?�����Ƕ�������һ����
		//����׼���÷����Ľ�
		//���÷�ʽ�Ľ��汾
		//useCat(c);
		//useCat(c2);
		//useCat(c3);
		
		//AnimalTool.useCat(c);
		//AnimalTool.useCat(c2);
		//AnimalTool.useCat(c3);
		
		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(c2);
		AnimalTool.useAnimal(c3);
		System.out.println("--------------");
		
		//��ϲ����
		Dog d = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		//AnimalTool.useDog(d);
		//AnimalTool.useDog(d2);
		//AnimalTool.useDog(d3);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(d2);
		AnimalTool.useAnimal(d3);
		System.out.println("--------------");
		
		//��ϲ��������
		//����һ�����࣬��Ҫ�̳��Զ���ṩ�������������һ����ڹ���������Ӹ��෽������
		Pig p = new Pig();
		Pig p2 = new Pig();
		Pig p3 = new Pig();
		//AnimalTool.usePig(p);
		//AnimalTool.usePig(p2);
		//AnimalTool.usePig(p3);
		AnimalTool.useAnimal(p);
		AnimalTool.useAnimal(p2);
		AnimalTool.useAnimal(p3);
		System.out.println("--------------");
		
		//��ϲ�������ǣ��ϻ�������...
		//�����Ӧ���࣬�̳��Զ���ṩ��Ӧ�ķ�����д�����ڹ�������ӷ�������
		//ǰ�漸������д������û�������
		//���ǣ�������ÿ�ζ��ģ��鷳��
		//�Ҿ��룬���ܲ��ܲ�����
		//̫�򵥣������еĶ��ﶼд�ϡ�������������ʲô��?������Щ��Ҫ��������?
		//������һ�ֽ��������
		
	}
	
	/*
	//����è�Ĺ���
	public static void useCat(Cat c) {
		c.eat();
		c.sleep();
	}
	
	//���ù��Ĺ���
	public static void useDog(Dog d) {
		d.eat();
		d.sleep();
	}
	*/
}
