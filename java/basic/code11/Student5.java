package com.test;

public class Student5 {
	private String name;
	private int age;

	public Student5() {
		super();
	}

	public Student5(String name, int age) {
		super();
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student5 other = (Student5) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// return true;
//		//这里要改进，根据这里比较的成员变量来决定返回true还是false
//		//这里其实要比价的就是name和age
//		//但是，name是String类型的，而String是引用类型的，所以，在这里不能直接用==比较，应该用equals()比较
//		//String的equals()方法是重写自Object类的，比较的是字符串的内容是否相同
//		//this -- s1
//		//obj -- s2
//		//我们要使用的是学生类的特有成员变量,所以要向下转型
//		Student s = (Student)obj; //s -- obj -- s2;
//		if(this.name.equals(s.name) && this.age == s.age) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//为了提高效率
//		if(this == obj){
//			return true;
//		}
//		
//		//为了提供程序的健壮性
//		//我先判断一下，obj是不是学生的一个对象，如果是，再做向下转型，如果不是，直接返回false。
//		//这个时候，我们要判断的是对象是否是某个类的对象?
//		//记住一个格式：对象名 instanceof 类名
//		//表示：判断该对象名是否是该类名一个对象
//		if(!(obj instanceof Student)){
//			return false;
//		}
//		//如果是就继续
//		
//		Student s = (Student)obj;
//		//System.out.println("同一个对象，还需要向下转型并比较吗?");
//		return this.name.equals(s.name) && this.age == s.age;
//	}
	
	
}