package com.test;
/*
标准的代码改进版

this:哪个对象调用那个方法，this就代表那个对象
*/
class Student4 {
	private String name;
	private int age;
	
	public String getName() {
		return name; //这里其实是隐含了this
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
}

class StudentDemo4 {
	public static void main(String[] args) {
		//创建一个对象
		Student4 s1 = new Student4();
		s1.setName("林青霞");
		s1.setAge(27);
		System.out.println(s1.getName()+"---"+s1.getAge());
		
		//创建第二个对象
		Student4 s2 = new Student4();
		s2.setName("刘意");
		s2.setAge(30);
		System.out.println(s2.getName()+"---"+s2.getAge());
	}
}

/*
 * 内存图
 * 
 * 谁调用方法, 方法就属于谁
 */
