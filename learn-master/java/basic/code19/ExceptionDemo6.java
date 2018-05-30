package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��try���淢�������jvm�����������һ���쳣����Ȼ�����������׳�����catch����������ƥ�䡣
 * ����ö�����ĳ�����͵ģ��ͻ�ִ�и�catch����Ĵ�����Ϣ��
 * 
 * �쳣��Ҫ�˽�ļ���������
 * public String getMessage():�쳣����Ϣ�ַ���		
 * public String toString():�����쳣�ļ���Ϣ����
 * 		�˶������� name(ȫ·����)
 * 		": "��ð�ź�һ���ո� 
 * 		���ô˶��� getLocalizedMessage()�����Ľ�� (Ĭ�Ϸ��ص���getMessage()������)
 * printStackTrace() ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
 */
public class ExceptionDemo6 {
	public static void main(String[] args) {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s); // ������һ��ParseException����Ȼ���׳�ȥ����catch�������ƥ��
			System.out.println(d);
		} catch (ParseException e) { // ParseException e = new ParseException();
			// ParseException
			// e.printStackTrace();

			// getMessage()
			// System.out.println(e.getMessage());
			// Unparseable date: "2014-11-20"

			// toString()
			// System.out.println(e.toString());
			// java.text.ParseException: Unparseable date: "2014-11-20"
			
			e.printStackTrace();
			//��ת��ĳ��ָ����ҳ��(index.html)
		}
		
		System.out.println("over");
	}
}
