package com.test;

/*
����һ������

���������䶼�Ǳ仯�ģ�������ܽ��գ���Ϊÿ���˵������������ǲ�ͬ�ġ�
���ǣ���������ѡȡ�ļ����˶����й��ˣ����ǵĹ�����һ���ġ�
һ���Ĺ�������ÿ�δ��������ڶ��ڴ涼Ҫ���������Ŀռ䣬
�Ҿ;����е��˷��ˡ���ô����? 
	��Զ�������й�ͬ�������ĳ�Ա����ֵ��ʱ��
	Java�������һ���ؼ��������Σ�static��
*/
class Person {
	//����
	String name;
	//����
	int age;
	//����
	//String country;
	static String country;
	
	public Person(){}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show() {
		System.out.println("������"+name+",���䣺"+age+",������"+country);
	}
}

class PersonDemo {
	public static void main(String[] args) {
		//��������1
		Person p1 = new Person("������",16,"�й�");
		p1.show();
		
		//��������2
		//Person p2 = new Person("����",22,"�й�");
		//p2.show();
		Person p2 = new Person("����",22);
		p2.show();
		
		//��������3
		//Person p3 = new Person("���",20,"�й�");
		//p3.show();
		Person p3 = new Person("���",20);
		p3.show();
		
		p3.country = "����";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
