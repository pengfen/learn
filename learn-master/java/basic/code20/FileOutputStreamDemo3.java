package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���?
 * 		Ϊʲô����û�л�����?��Ϊ��ֵд���ֽ����ݣ���û��д�뻻�з��š�
 * 		���ʵ����?д�뻻�з��ż����¡�
 * 		�ղ����ǿ�������д�ı��ļ����ǿ��Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô��?
 * 		��Ϊ��ͬ��ϵͳ��Բ�ͬ�Ļ��з���ʶ���ǲ�һ����?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		��һЩ�����ĸ��߼����±����ǿ���ʶ�����⻻�з��ŵġ�
 * 
 * ���ʵ�����ݵ�׷��д��?
 * 		�ù��췽�����ڶ���������true���������
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		// �����ֽ����������
		// FileOutputStream fos = new FileOutputStream("fos3.txt");
		// ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ���������ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ����
		FileOutputStream fos = new FileOutputStream("fos3.txt", true);

		// д����
		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x).getBytes());
			fos.write("\r\n".getBytes());
		}

		// �ͷ���Դ
		fos.close();
	}
}
