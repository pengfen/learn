package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
 */
public class IteratorDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("令狐冲", 33);
		Student s4 = new Student("武鑫", 25);
		Student s5 = new Student("刘晓曲", 22);

		// 把学生添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// 遍历
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());

			// NoSuchElementException 不要多次使用it.next()方法
			// System.out.println(((Student) it.next()).getName() + "---"
			// + ((Student) it.next()).getAge());

		}
		// System.out.println("----------------------------------");

		// for循环改写
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