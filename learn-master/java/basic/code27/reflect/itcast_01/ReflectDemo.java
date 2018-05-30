package cn.itcast_01;

/*
 * ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 * 
 * Person p = new Person();
 * p.ʹ��
 * 
 * Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
 * Class�ࣺ
 * 		��Ա����	Field
 * 		���췽��	Constructor
 * 		��Ա����	Method
 * 
 * ��ȡclass�ļ�����ķ�ʽ��
 * A:Object���getClass()����
 * B:�������͵ľ�̬����class
 * C:Class���еľ�̬����
 * 		public static Class forName(String className)
 * 
 * һ�����ǵ���ʹ��˭��?
 * 		A:�Լ���	��ѡһ�֣��ڶ��ֱȽϷ���
 * 		B:����	������
 * 			Ϊʲô��?��Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ������õ������ļ��С�
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// ��ʽ1
		Person p = new Person();
		Class c = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true

		// ��ʽ2
		Class c3 = Person.class;
		// int.class;
		// String.class;
		System.out.println(c == c3);

		// ��ʽ3
		// ClassNotFoundException
		Class c4 = Class.forName("cn.itcast_01.Person");
		System.out.println(c == c4);
	}
}
