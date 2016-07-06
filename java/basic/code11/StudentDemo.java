package com.test;


/*
 * 提高开发效率：
 * A:帮助我们自动提供构造方法
	a:无参构造方法 
		在代码区域右键--source--Generate Constructors from Superclass
	b:带参构造方法 
		在代码区域右键--source--Generate Constructors using fields.. -- finish
		
   B:成对的getXxx()和setXxx()
   		在代码区域右键--source--Generate Getters and Setters...
 */
public class StudentDemo {
	// 成员变量
	private String name;
	private int age;
	
	//构造方法
	public StudentDemo() {
		super();
	}

	public StudentDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//成员方法
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
	
	
	
}