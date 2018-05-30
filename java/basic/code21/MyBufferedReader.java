package com.test;

import java.io.IOException;
import java.io.Reader;

/*
 * ��Readerģ��BufferedReader��readLine()����
 * 
 * readLine():һ�ζ�ȡһ�У����ݻ��з��ж��Ƿ������ֻ�������ݣ������ػ��з�
 */
public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	/*
	 * ˼����дһ������������ֵ��һ���ַ�����
	 */
	public String readLine() throws IOException {
		/*
		 * ��Ҫ����һ���ַ������Ҹ���ô����? ���Ǳ���ȥ����r�����ܹ���ȡʲô������? ������ȡ������һ�ζ�ȡһ���ַ�����һ�ζ�ȡһ���ַ�����
		 * ��ô������Ҫ����һ���ַ��������ĸ������ȽϺ���? ���Ǻ������뵽�ַ�����ȽϺã������������ˣ������������ĳ����Ƕ೤��?
		 * ������û�а취��������ĳ��ȣ��㶨��೤�������ʡ� ���ԣ�ֻ��ѡ��һ�ζ�ȡһ���ַ���
		 * �����أ����ַ�ʽ��ʱ�������ٶ�ȡ��һ���ַ���ʱ����һ���ַ��Ͷ�ʧ�� ���ԣ�������Ӧ�ö���һ����ʱ�洢�ռ�Ѷ�ȡ�����ַ����洢������
		 * �����˭�ȽϺ�����?���飬���ϣ��ַ��������������ɹ�ѡ��
		 * �����򵥵ķ���������ѡ��ʹ���ַ������������󡣲���ʹ�õ���StringBuilder
		 */
		StringBuilder sb = new StringBuilder();

		// �������ȡ���鷳�����жϽ����������ڽ���֮ǰӦ����һֱ��ȡ��ֱ��-1
		
		
		/*
		hello
		world
		java	
		
		104101108108111
		119111114108100
		1069711897
		 */
		
		int ch = 0;
		while ((ch = r.read()) != -1) { //104,101,108,108,111
			if (ch == '\r') {
				continue;
			}

			if (ch == '\n') {
				return sb.toString(); //hello
			} else {
				sb.append((char)ch); //hello
			}
		}

		// Ϊ�˷�ֹ���ݶ�ʧ���ж�sb�ĳ��Ȳ��ܴ���0
		if (sb.length() > 0) {
			return sb.toString();
		}

		return null;
	}

	/*
	 * ��дһ���رշ���
	 */
	public void close() throws IOException {
		this.r.close();
	}
}