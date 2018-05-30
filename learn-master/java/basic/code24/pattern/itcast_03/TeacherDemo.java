package cn.itcast_03;

public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1 == t2);
		System.out.println(t1); // cn.itcast_03.Teacher@175078b
		System.out.println(t2);// cn.itcast_03.Teacher@175078b
	}
}
