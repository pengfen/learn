package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ����1:����whileѭ��д����������ܲ�����forѭ����?
 * ����2:��Ҫ���ʹ��it.next()��������Ϊÿ��ʹ�ö��Ƿ���һ������
 */
public class IteratorDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("�����", 33);
		Student s4 = new Student("����", 25);
		Student s5 = new Student("������", 22);

		// ��ѧ����ӵ�������
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// ����
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());

			// NoSuchElementException ��Ҫ���ʹ��it.next()����
			// System.out.println(((Student) it.next()).getName() + "---"
			// + ((Student) it.next()).getAge());

		}
		// System.out.println("----------------------------------");

		// forѭ����д
		// for(Iterator it = c.iterator();it.hasNext();){
		// Student s = (Student) it.next();
		// System.out.println(s.getName() + "---" + s.getAge());
		// }
	}
}

/*
public interface Iterator {
boolean hasNext();
Object next(); 
}

public interface Iterable {
Iterator iterator();
}

public interface Collection extends Iterable {
Iterator iterator();
}

public interface List extends Collection {
Iterator iterator();
}

public class ArrayList implements List {
public Iterator iterator() {
    return new Itr();
}

private class Itr implements Iterator {
	public boolean hasNext() {}
	public Object next(){} 
}
}


Collection c = new ArrayList();
c.add("hello");
c.add("world");
c.add("java");
Iterator it = c.iterator();	 //new Itr();
while(it.hasNext()) {
String s = (String)it.next();
System.out.println(s);
}
*/