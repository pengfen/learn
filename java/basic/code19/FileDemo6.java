package com.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȡ��ֽ���
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 */
public class FileDemo6 {
	public static void main(String[] args) {
		// �����ļ�����
		File file = new File("demo\\test.txt");

		System.out.println("getAbsolutePath:" + file.getAbsolutePath());
		System.out.println("getPath:" + file.getPath());
		System.out.println("getName:" + file.getName());
		System.out.println("length:" + file.length());
		System.out.println("lastModified:" + file.lastModified());

		// 1416471971031
		Date d = new Date(1416471971031L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}
}