package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * 
 * 分析：
 * 		A:创建学生类
 * 		B:创建集合对象
 * 			TreeSet<Student>
 * 		C:键盘录入学生信息存储到集合
 * 		D:遍历集合，把数据写到文本文件
 */
public class StudentDemo {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
				int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
				int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName())
						: num4;
				return num5;
			}
		});

		// 键盘录入学生信息存储到集合
		for (int x = 1; x <= 5; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请录入第" + x + "个的学习信息");
			System.out.println("姓名：");
			String name = sc.nextLine();
			System.out.println("语文成绩：");
			int chinese = sc.nextInt();
			System.out.println("数学成绩：");
			int math = sc.nextInt();
			System.out.println("英语成绩：");
			int english = sc.nextInt();

			// 创建学生对象
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			// 把学生信息添加到集合
			ts.add(s);
		}

		// 遍历集合，把数据写到文本文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
		bw.write("学生信息如下：");
		bw.newLine();
		bw.flush();
		bw.write("姓名,语文成绩,数学成绩,英语成绩");
		bw.newLine();
		bw.flush();
		for (Student s : ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese())
					.append(",").append(s.getMath()).append(",")
					.append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		// 释放资源
		bw.close();
		System.out.println("学习信息存储完毕");
	}
}
