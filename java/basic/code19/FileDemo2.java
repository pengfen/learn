package com.test;

import java.io.File;
import java.io.IOException;

/*
 *�������ܣ�
 *public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
 *public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
 *public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
 *
 *�����Ĳ�һ�������ӣ������ǰ೤��
 *ע�⣺�㵽��Ҫ�����ļ������ļ��У����������������Ҫ�����ˡ�
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		// ������Ҫ��e��Ŀ¼�´���һ���ļ���demo
		File file = new File("e:\\demo");
		System.out.println("mkdir:" + file.mkdir());

		// ����:��Ҫ��e��Ŀ¼demo�´���һ���ļ�a.txt
		File file2 = new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:" + file2.createNewFile());

		// ������Ҫ��e��Ŀ¼test�´���һ���ļ�b.txt
		// Exception in thread "main" java.io.IOException: ϵͳ�Ҳ���ָ����·����
		// ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());

		// ����:��Ҫ��e��Ŀ¼test�´���aaaĿ¼
		// File file4 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file4.mkdir());

		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		// ��ʵ�����и��򵥵ķ���
		File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:" + file7.mkdirs());

		// ����������������
		File file8 = new File("e:\\liuyi\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
	}
}

