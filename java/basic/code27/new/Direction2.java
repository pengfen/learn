package cn.itcast_01;

public class Direction2 {
	// ��������ʵ��
	public static final Direction2 FRONT = new Direction2("ǰ");
	public static final Direction2 BEHIND = new Direction2("��");
	public static final Direction2 LEFT = new Direction2("��");
	public static final Direction2 RIGHT = new Direction2("��");

	// ����˽�У����˾Ͳ������޵Ĵ�����
	// private Direction2() {
	// }

	// �����Ա����,��ȥ���޲ι���
	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}