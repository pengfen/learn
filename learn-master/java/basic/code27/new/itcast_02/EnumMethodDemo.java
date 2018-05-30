package cn.itcast_02;

public class EnumMethodDemo {
	public static void main(String[] args) {
		// int compareTo(E o)
		Direction2 d21 = Direction2.FRONT;
		Direction2 d22 = Direction2.BEHIND;
		Direction2 d23 = Direction2.LEFT;
		Direction2 d24 = Direction2.RIGHT;
		System.out.println(d21.compareTo(d21));
		System.out.println(d21.compareTo(d24));
		System.out.println(d24.compareTo(d21));
		System.out.println("---------------");
		// String name()
		System.out.println(d21.name());
		System.out.println(d22.name());
		System.out.println(d23.name());
		System.out.println(d24.name());
		System.out.println("--------------");
		// int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------");
		// String toString()
		System.out.println(d21.toString());
		System.out.println(d22.toString());
		System.out.println(d23.toString());
		System.out.println(d24.toString());
		System.out.println("--------------");
		// <T> T valueOf(Class<T> type,String name)
		Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		// values()
		// 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
		Direction2[] dirs = Direction2.values();
		for (Direction2 d2 : dirs) {
			System.out.println(d2);
			System.out.println(d2.getName());
		}
	}
}
