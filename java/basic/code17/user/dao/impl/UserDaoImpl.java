package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * �����û������ľ���ʵ����(���ϰ�)
 * 
 * @author ������
 * @version V1.0
 * 
 */
public class UserDaoImpl implements UserDao {
	// Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա����
	// Ϊ�˲������˿�������private
	// Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// �������ϣ���ȡÿһ���û������жϸ��û����û����������Ƿ�ʹ��ݹ�����ƥ��
		boolean flag = false;

		for (User u : array) {
			if (u.getUsername().equals(username)
					&& u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		// ���û���Ϣ�洢����
		// ArrayList<User> array = new ArrayList<User>();
		array.add(user);
	}
}
