package cn.itcast_03;

/*
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ��α�֤�����ڴ���ֻ��һ��������?
 * 		A���ѹ��췽��˽��
 * 		B:�ڳ�Աλ���Լ�����һ������
 * 		C:ͨ��һ�������ķ����ṩ����
 */
public class StudentDemo {
	public static void main(String[] args) {
		// Student s1 = new Student();
		// Student s2 = new Student();
		// System.out.println(s1 == s2); // false

		// ͨ��������εõ�������?

		// Student.s = null;

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);

		System.out.println(s1); // null��cn.itcast_03.Student@175078b
		System.out.println(s2);// null��cn.itcast_03.Student@175078b
	}
}
