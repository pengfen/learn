package com.test;

/*
需求：
	定义一个员工类,自己分析出几个成员，
	然后给出成员变量，构造方法，getXxx()/setXxx()方法，
	以及一个显示所有成员信息的方法。并测试。

分析：
	员工
		成员变量：
			员工编号，姓名，年龄
		构造方法：
			无参构造方法
		成员方法：
			getXxx()/setXxx()
			show();
*/
class Employee {
	private String employeeId; // 员工编号
	private String name; // 姓名
	private int age; // 年龄
	
	public Employee() {}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	
	//显示所有成员信息的方法
	public void show() {
		System.out.println("员工编号是："+employeeId+"的这个人是："+name+"的年龄是："+age);
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		//创建对象
		Employee e = new Employee();
		
		//给成员变量赋值
		e.setEmployeeId("czbk9527");
		e.setName("唐伯虎");
		e.setAge(18);
		
		//获取数据
		//System.out.println(e.getEmployeeId()+"---"+e.getName()+"---"+e.getAge());
	
		//我们在Employee类中定义了一个show方法。所以，我们改进一下，使用show方法
		e.show();
	}
}

