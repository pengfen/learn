package com.test;
/*
�̳и�����
	�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ�����С�
	
���ʵ�ּ̳���?	
	Java�ṩ�˹ؼ��֣�extends
	
��ʽ��
	class ������ extends ������ {}
	
�ô���
	A:����˴���ĸ�����
	B:����˴����ά����
	C:��������֮������˹�ϵ���Ƕ�̬��ǰ��

����������˹�ϵ����ʵҲ�Ǽ̳е�һ���׶ˣ�
	����������ǿ�ˡ�
	
	������ԭ�򣺵���ϣ����ھۡ�
	��ϣ�������Ĺ�ϵ
	�ھۣ������Լ����ĳ�����������
*/

//ʹ�ü̳�ǰ
/*
class Student {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
	}
	
	class Teacher {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}
*/

//ʹ�ü̳к�
class Person {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Student1 extends Person {}

class Teacher extends Person {}

class ExtendsDemo {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.eat();
		s.sleep();
		System.out.println("-------------");
		
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}
/*
 * ��������д��������
 *    // ����ѧ����
 *    class Student {
 *        String name;
 *        int age;
 *        
 *        public Student(){}
 *        
 *        // getXxx()/setXxx()
 *        
 *        public void eat() {
 *            System.out.println("�Է�");
 *        }
 *    }
 *    
 *    // ������ʦ��
 *    class Teacher {
 *        String name;
 *        int age;
 *        
 *        public Teacher() {}
 *        
 *        // getXxx()/setXxx()
 *        
 *        public void eat() {
 *            System.our.println("�Է�");
 *        }
 *    }
 *    
 *    ���ǹ۲�������������
 *       ����name age��Ա���� �Լ�getXxx()/setXxx() ����eat()�ȶ�����ͬ��
 *       ������Ǻ������������� ���� ������ ������ �����ǲ���Ҳ�߱���Щ����
 *       ��ô ����ÿһ�ζ������������ʱ�� ��Ҫ����Щ�ظ������ݶ����¶���һ��
 *       �鷳�� �鷳 ���� ����Ҫ���ǸĽ�
 *    ��θĽ���
 *       ������� ���ܲ��ܰ���Щ��ͬ�����ݸ����嵽һ������������
 *       Ȼ�� �����������������������һ����ϵ ���������ϵ��
 *       ������Ϳ��Ծ߱������������Ĺ���
 *       Ϊ��ʵ�����Ч�� java���ṩ��һ������ �̳�
 *       
 *    ���� 4������
 *    �̳���ô��ʾ�� �̳еĸ�ʽ��ʲô���ӵ���
 *    class Fu {}
 *    class Zi extends Fu {}
 *    
 *    ���Ǿͻ�ͷ�޸����ǵĴ���
 *       class Person {
 *           String name;
 *           int age;
 *           
 *           public Person() {}
 *           
 *           // getXxx()/setXxx()
 *           
 *           public void eat() {
 *               System.out.println("�Է�");
 *           }
 *       }
 *       
 *       class Student extends Person {
 *           public Student() {}
 *       }
 *       
 *       class Teacher extends Person {
 *           public Teacher() {}
 *       }
 */