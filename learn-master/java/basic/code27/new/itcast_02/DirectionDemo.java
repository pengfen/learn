package cn.itcast_02;

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d); // FRONT
		// public String toString()����ö�ٳ��������ƣ��������������С�
		System.out.println("-------------");
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("-------------");
		Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		System.out.println("--------------");

		Direction3 dd = Direction3.FRONT;
		dd = Direction3.LEFT;

		switch (dd) {
		case FRONT:
			System.out.println("��ѡ����ǰ");
			break;
		case BEHIND:
			System.out.println("��ѡ���˺�");
			break;
		case LEFT:
			System.out.println("��ѡ������");
			break;
		case RIGHT:
			System.out.println("��ѡ������");
			break;
		}
	}
}