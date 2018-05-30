package com.test;

/*
�������˶�Ա����(ѧ������Ȼ�󽲽�)
	ƹ�����˶�Ա�������˶�Ա��
	ƹ������������������
	Ϊ�˳�����������ƹ������ص���Ա����ҪѧϰӢ�
	������ѧ֪ʶ��
	�������������������Щ�����࣬��Щ�ӿڣ���Щ�����ࡣ

�����������̣�����ͨ����ͼ����ġ�	
*/
//����һ��˵Ӣ��Ľӿ�
interface SpeakEnglish {
	//˵Ӣ��
	public abstract void speak();
}

//�����˵ĳ�����
abstract class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
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
	
	//˯��
	public void sleep() {
		System.out.println("�˶���Ҫ˯����");
	}
	
	//�Է�
	public abstract void eat();
}

//�����˶�Ա������
abstract class Player extends Person {
	public Player() {}
	
	public Player(String name,int age) {
		super(name,age);
	}
	
	//ѧϰ
	public abstract void study();
}

//�������������
abstract class Coach extends Person {
	public Coach() {}
	
	public Coach(String name,int age) {
		super(name,age);
	}
	
	//��
	public abstract void teach();
}

//����ƹ�����˶�Ա������
class PingPangPlayer extends Player implements SpeakEnglish {
	public PingPangPlayer(){}
	
	public PingPangPlayer(String name,int age) {
		super(name,age);
	}
	
	//��
	public void eat() {
		System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
	}
	
	//ѧϰ
	public void study() {
		System.out.println("ƹ�����˶�Աѧϰ��η���ͽ���");
	}
	
	//˵Ӣ��
	public void speak() {
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
}

//���������˶�Ա������
class BasketballPlayer extends Player {
	public BasketballPlayer(){}
	
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	
	//��
	public void eat() {
		System.out.println("�����˶�Ա��ţ�⣬��ţ��");
	}
	
	//ѧϰ
	public void study() {
		System.out.println("�����˶�Աѧϰ��������Ͷ��");
	}
}

//����ƹ�������������
class PingPangCoach extends Coach implements SpeakEnglish {
	public PingPangCoach(){}
	
	public PingPangCoach(String name,int age) {
		super(name,age);
	}
	
	//��
	public void eat() {
		System.out.println("ƹ���������С�ײˣ��ȴ�����");
	}
	
	//��
	public void teach() {
		System.out.println("ƹ�����������η���ͽ���");
	}
	
	//˵Ӣ��
	public void speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}
}

//�����������������
class BasketballCoach extends Coach {
	public BasketballCoach(){}
	
	public BasketballCoach(String name,int age) {
		super(name,age);
	}
	
	//��
	public void eat() {
		System.out.println("������������⣬������");
	}
	
	//��
	public void teach() {
		System.out.println("�����������������Ͷ��");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//�����˶�Ա(ƹ�����˶�Ա�������˶�Ա)
		//ƹ�����˶�Ա
		PingPangPlayer ppp = new PingPangPlayer();
		ppp.setName("����");
		ppp.setAge(33);
		System.out.println(ppp.getName()+"---"+ppp.getAge());
		ppp.eat();
		ppp.sleep();
		ppp.study();
		ppp.speak();
		System.out.println("----------------");
		//ͨ�����ι��������(��������)
		
		//�����˶�Ա
		BasketballPlayer bp = new BasketballPlayer();
		bp.setName("Ҧ��");
		bp.setAge(34);
		System.out.println(bp.getName()+"---"+bp.getAge());
		bp.eat();
		bp.sleep();
		bp.study();
		//bp.speak(); //û�и÷���
		
		//���Խ����Լ���
	}
}

/*
 * �� (������ ���� ���� �Է�() ˯��(){})
 * �˶�Ա (������ ѧϰ()) �̳� ��
 * ���� (������ ��()) �̳� ��
 * ƹ�����˶�Ա (������) �̳� �˶�Ա ʵ�� ѧϰӢ��
 * �����˶�Ա (������) �̳� �˶�Ա
 * ƹ������� (������) �̳� ���� ʵ�� ѧϰӢ��
 * ������� (������) �̳� ����
 * ѧϰӢ�� (�ӿ� ����())
 */
