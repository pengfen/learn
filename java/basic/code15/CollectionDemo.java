package com.test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���ϵ�������
 * 		����ѧϰ��������������ԣ�������������Զ������������ͨ���������ֵģ�Ϊ�˷���Զ��������в��������Ǿͱ��������������д洢��
 * 		��Ҫ��洢������󣬾Ͳ�����һ�������ı�������Ӧ����һ���������͵ı�����������Ŀǰ��ѧ����֪ʶ���棬����Щ���������͵���?
 * 		�����StringBuffer��������?StringBuffer�Ľ����һ���ַ�������һ���������ǵ�Ҫ����������ֻ��ѡ�����飬����Ƕ������顣
 * 		�����������ֲ�����Ӧ�仯��������Ϊ����ĳ����ǹ̶��ģ����ʱ��Ϊ����Ӧ�仯������Java���ṩ�˼����๩����ʹ�á�
 * 
 * ����ͼ��ϵ�����?
 * 		A:��������
 * 			����ĳ��ȹ̶�
 * 			���ϳ��ȿɱ�
 * 		B:���ݲ�ͬ
 * 			����洢����ͬһ�����͵�Ԫ��
 * 			�����Ͽ��Դ洢��ͬ���͵�Ԫ��
 * 		C:Ԫ�ص�������������	
 * 			������Դ洢�����������ͣ�Ҳ���Դ洢������������
 * 			����ֻ�ܴ洢��������
 * 
 * ��˵�������Ǵ洢���Ԫ�ģ������أ��洢���Ԫ������Ҳ���в�ͬ����ģ�����˵����Ҫ����Ԫ���в�������ͬ��Ԫ�أ�
 * �ٱ���˵����Ҫ����Ԫ�ذ���ĳ�ֹ�������һ�¡���Բ�ͬ������Java���ṩ�˲�ͬ�ļ����࣬�����أ�Java���ṩ�˺ܶ�������ࡣ
 * ��������������ݽṹ��ͬ,�ṹ��ͬ����Ҫ�ģ���Ҫ������Ҫ�ܹ��洢���������һ�Ҫ�ܹ�ʹ����Щ����������˵�жϣ���ȡ�ȡ�
 * ��Ȼ��������ô���������������й��Ե����ݵģ����ǰ���Щ������Ĺ������ݲ��ϵ�������ȡ�����վ����γɼ��ϵļ̳���ϵ�ṹ��
 * 
 * ���ݽṹ�����ݵĴ洢��ʽ��
 * 
 * Collection:�Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������ġ�(����������Ľ���)
 * 
 * Collection�Ĺ��ܸ�����
 * 1����ӹ���
 * 		boolean add(Object obj):���һ��Ԫ��
 * 		boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * 2:ɾ������
 * 		void clear():�Ƴ�����Ԫ��
 * 		boolean remove(Object o):�Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 * 3:�жϹ���
 * 		boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:��ȡ����
 * 		Iterator<E> iterator()(�ص�)
 * 5:���ȹ���
 * 		int size():Ԫ�صĸ���
 * 		�����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
 * 6:��������
 * 		boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
 * 7���Ѽ���ת��Ϊ����
 * 		Object[] toArray()
 */
public class CollectionDemo {
	public static void main(String[] args) {
		// ���Բ���All�ķ���

		// �������϶���
		// Collection c = new Collection(); //������Ϊ�ӿڲ���ʵ����
		Collection c = new ArrayList();

		// boolean add(Object obj):���һ��Ԫ��
		// System.out.println("add:"+c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");

		// void clear():�Ƴ�����Ԫ��
		// c.clear();

		// boolean remove(Object o):�Ƴ�һ��Ԫ��
		// System.out.println("remove:" + c.remove("hello"));
		// System.out.println("remove:" + c.remove("javaee"));

		// boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
		// System.out.println("contains:"+c.contains("hello"));
		// System.out.println("contains:"+c.contains("android"));

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println("isEmpty:"+c.isEmpty());

		//int size():Ԫ�صĸ���
		System.out.println("size:"+c.size());
		
		System.out.println("c:" + c);
	}
}