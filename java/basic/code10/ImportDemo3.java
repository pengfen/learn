package com.test;

/*
包：
	A:其实就是文件夹
	B:作用
		a:把相同的类名放到不同的包中
		b:对类进行分类管理
		
举例：
	学生：增加，删除，修改，查询
	老师：增加，删除，修改，查询
	...
	
	方案1：按照功能分
		cn.itcast.add
			AddStudent
			AddTeacher
		cn.itcast.delete
			DeleteStudent
			DeleteTeacher
		cn.itcast.update
			UpdateStudent
			UpdateTeacher
		cn.itcast.find
			FindStudent
			FindTeacher
	
	方案2：按照模块分
		cn.itcast.teacher
			AddTeacher
			DeleteTeacher
			UpdateTeacher
			FindTeacher
		cn.itcast.student
			AddStudent
			DeleteStudent
			UpdateStudent
			FindStudent
			
包的定义
	package 包名;
		多级包用.分开即可


注意事项:
	A:package语句必须是程序的第一条可执行的代码
	B:package语句在一个java文件中只能有一个
	C:如果没有package，默认表示无包名
	
带包的编译和运行：
	A:手动式
		a:编写一个带包的java文件。
		b:通过javac命令编译该java文件。
		c:手动创建包名。
		d:把b步骤的class文件放到c步骤的最底层包
		e:回到和包根目录在同一目录的地方，然后运行
			带包运行。
			
	B:自动式
		a:编写一个带包的java文件。
		b:javac编译的时候带上-d即可
			javac -d . HelloWorld.java
		c:回到和包根目录在同一目录的地方，然后运行
			带包运行。
*/

class ImportDemo3 {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}