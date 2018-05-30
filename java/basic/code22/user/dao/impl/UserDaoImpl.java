package cn.itcast.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * �����û������ľ���ʵ����(IO��)
 * 
 * @author ������
 * @version V1.1
 * 
 */
public class UserDaoImpl implements UserDao {
	// Ϊ�˱�֤�ļ�һ���ؾʹ���
	private static File file = new File("user.txt");

	static {
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("�����ļ�ʧ��");
			// e.printStackTrace();
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;

		BufferedReader br = null;
		try {
			// br = new BufferedReader(new FileReader("user.txt"));
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				// �û���=����
				String[] datas = line.split("=");
				if (datas[0].equals(username) && datas[1].equals(password)) {
					flag = true;
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("�û���¼�Ҳ�����Ϣ���ڵ��ļ�");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�û���¼ʧ��");
			// e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("�û���¼�ͷ���Դʧ��");
					// e.printStackTrace();
				}
			}
		}

		return flag;
	}

	@Override
	public void regist(User user) {
		/*
		 * Ϊ����ע��������ܹ���һ���Ĺ����Ҿ��Լ�������һ������ �û���=����
		 */
		BufferedWriter bw = null;
		try {
			// bw = new BufferedWriter(new FileWriter("user.txt"));
			// bw = new BufferedWriter(new FileWriter(file));
			// Ϊ�˱�֤������׷��д�룬�����true
			bw = new BufferedWriter(new FileWriter(file, true));
			bw.write(user.getUsername() + "=" + user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("�û�ע��ʧ��");
			// e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("�û�ע���ͷ���Դʧ��");
					// e.printStackTrace();
				}
			}
		}
	}
}
