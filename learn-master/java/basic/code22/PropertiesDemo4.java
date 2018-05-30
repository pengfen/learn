package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ����һ���ı��ļ�(user.txt)����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ʵΪ��100��
 * 
 * ������
 * 		A:���ļ��е����ݼ��ص�������
 * 		B:�������ϣ���ȡ�õ�ÿһ����
 * 		C:�жϼ��Ƿ���Ϊ"lisi"�ģ�����о��޸���ֵΪ"100"
 * 		D:�Ѽ����е��������´洢���ļ���
 */
public class PropertiesDemo4 {
	public static void main(String[] args) throws IOException {
		// ���ļ��е����ݼ��ص�������
		Properties prop = new Properties();
		Reader r = new FileReader("user.txt");
		prop.load(r);
		r.close();

		// �������ϣ���ȡ�õ�ÿһ����
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			// �жϼ��Ƿ���Ϊ"lisi"�ģ�����о��޸���ֵΪ"100"
			if ("lisi".equals(key)) {
				prop.setProperty(key, "100");
				break;
			}
		}

		// �Ѽ����е��������´洢���ļ���
		Writer w = new FileWriter("user.txt");
		prop.store(w, null);
		w.close();
	}
}
