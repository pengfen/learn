package com.test;

/*
������С��Ϸ(������1-100֮��)

������
	A:�������һ���������(���µ�)
	B:����¼�����ݡ�(��µ�)
	C:����µĺͱ��µĽ��бȽ�
		a:����
		b:С��
		c:������
	D:������βµĻ��ᣬ���оͽ�����
		while()ѭ�������о�break
*/
import java.util.Scanner;

class GuessDemo {
	public static void main(String[] args) {
		//�������һ���������(���µ�)
		int number = (int)(Math.random()*100)+1;
		//System.out.println(number);
		
		//������βµĻ��ᣬ���оͽ�����
		while(true) {
			//����¼�����ݡ�(��µ�)
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����(1-100) : ");
			int guessNumber = sc.nextInt();
			
			//����µĺͱ��µĽ��бȽ�
			if(guessNumber > number) {
				System.out.println("��µ�����" + guessNumber + "����");
			}else if(guessNumber < number) {
				System.out.println("��µ�����" + guessNumber + "С��");
			}else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}
}
