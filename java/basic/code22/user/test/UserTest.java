package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessNumber;
import cn.itcast.pojo.User;

/**
 * �û�������
 * 
 * @author ������
 * @version V1.1
 * 
 */
public class UserTest {
	public static void main(String[] args) {
		// Ϊ���ܹ�����
		while (true) {
			// ��ӭ���棬����ѡ����
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��:");
			// ����¼��ѡ�񣬸���ѡ������ͬ�Ĳ���
			Scanner sc = new Scanner(System.in);
			// Ϊ�˺����¼����Ϣ�ķ��㣬�����е�����¼��ȫ�����ַ�����
			String choiceString = sc.nextLine();

			// switch���Ķ���ط�Ҫʹ�ã��ҾͶ��嵽����
			UserDao ud = new UserDaoImpl();

			// �����򵥵�˼������ѡ����switch
			switch (choiceString) {
			case "1":
				// ��¼���棬�������û���������
				System.out.println("--------------��¼����--------------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("���������룺");
				String password = sc.nextLine();

				// ���õ�¼����
				// UserDao ud = new UserDaomImpl();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�,���Կ�ʼ����Ϸ��");

					System.out.println("������?y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) {
							// ����Ϸ
							GuessNumber.start();
							System.out.println("�㻹����?y/n");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
					// break; //����дbreak����������switch
				} else {
					System.out.println("�û���������������,��¼ʧ��");
				}
				break;
			case "2":
				// ��ӭ���棬�������û���������
				System.out.println("--------------ע�����--------------");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("���������룺");
				String newPassword = sc.nextLine();

				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);

				// ����ע�Ṧ��
				// ��̬
				// UserDao ud = new UserDaoImpl();
				// ������ʹ��
				// UserDaoImpl udi = new UserDaoImpl();

				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
				break;
			}
		}
	}
}
