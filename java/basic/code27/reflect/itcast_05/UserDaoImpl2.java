package cn.itcast_05;

public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		System.out.println("Ȩ��У��");
		System.out.println("��ӹ���");
		System.out.println("��־��¼");
	}

	@Override
	public void delete() {
		System.out.println("Ȩ��У��");
		System.out.println("ɾ������");
		System.out.println("��־��¼");
	}

	@Override
	public void update() {
		System.out.println("Ȩ��У��");
		System.out.println("�޸Ĺ���");
		System.out.println("��־��¼");
	}

	@Override
	public void find() {
		System.out.println("Ȩ��У��");
		System.out.println("���ҹ���");
		System.out.println("��־��¼");
	}
}
