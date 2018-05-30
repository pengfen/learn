package com.test;

/*
假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及工资。
经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

分析：
	普通员工类
		成员变量：姓名、工号以及工资。
		成员方法：工作
	经理类：
		成员变量：姓名、工号以及工资，奖金属性
		成员方法：工作
		
实现：
	员工类：
	普通员工类：
	经理类：
*/
//定义员工类
abstract class Employee {
	//姓名、工号以及工资
	private String name;
	private String id;
	private int salary;
	
	public Employee() {}
	
	public Employee(String name,String id,int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//工作
	public abstract void work();
}

//普通员工类
class Programmer extends Employee {
	public Programmer(){}
	
	public Programmer(String name,String id,int salary) {
		super(name,id,salary);
	}
	
	public void work() {
		System.out.println("按照需求写代码");
	}
}

//经理类
class Manager extends Employee {
	//奖金
	private int money; //bonus 奖金
	
	public Manager(){}
	
	public Manager(String name,String id,int salary,int money) {
		super(name,id,salary);
		this.money = money;
	}
	
	public void work() {
		System.out.println("跟客户谈需求");
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
}

class AbstractTest4 {
	public static void main(String[] args) {
		//测试普通员工
		Employee emp = new Programmer();
		emp.setName("林青霞");
		emp.setId("czbk001");
		emp.setSalary(18000);
		System.out.println(emp.getName()+"---"+emp.getId()+"---"+emp.getSalary());
		emp.work();
		System.out.println("-------------");
		emp = new Programmer("林青霞","czbk001",18000);
		System.out.println(emp.getName()+"---"+emp.getId()+"---"+emp.getSalary());
		emp.work();
		System.out.println("-------------");
		
		/*
		emp = new Manager();
		emp.setName("刘意");
		emp.setId("czbk002");
		emp.setSalary(8000);
		emp.setMoney(2000);
		*/
		//由于子类有特有的内容，所以我们用子类来测试
		Manager m = new Manager();
		m.setName("刘意");
		m.setId("czbk002");
		m.setSalary(8000);
		m.setMoney(2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
		m.work();
		System.out.println("-------------");
		
		//通过构造方法赋值
		m = new Manager("刘意","czbk002",8000,2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary()+"---"+m.getMoney());
		m.work();
	}
}
