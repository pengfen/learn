package com.test;

/*
�ӿڵ��ص㣺
	A:�ӿ��ùؼ���interface��ʾ	
		interface �ӿ��� {}
	B:��ʵ�ֽӿ���implements��ʾ
		class ���� implements �ӿ��� {}
	C:�ӿڲ���ʵ����
		��ô���ӿ����ʵ������?
		���ն�̬�ķ�ʽ��ʵ������
	D:�ӿڵ�����
		a:�����ǳ����ࡣ�������岻��
		b:�����Ǿ����ࡣҪ��д�ӿ��е����г��󷽷���(�Ƽ�����)

�ɴ˿ɼ���
	A:�������̬(����û��)
	B:�������̬(����)
	C:�ӿڶ�̬(���)
*/
//���嶯����ѵ�ӿ�
interface AnimalTrain {
	public abstract void jump();
}

//������ʵ�ֽӿ�
abstract class Dog21 implements AnimalTrain {
}

//������ʵ�ֽӿ�
class Cat21 implements AnimalTrain {
	public void jump() {
		System.out.println("è����������");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		//AnimalTrain�ǳ����; �޷�ʵ����
		//AnimalTrain at = new AnimalTrain();
		//at.jump();
		
		AnimalTrain at = new Cat21();
		at.jump();
	}
}