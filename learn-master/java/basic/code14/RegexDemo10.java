package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ���ܣ�
 * ��ȡ��������ַ������������ַ���ɵĵ���
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexDemo10 {
	public static void main(String[] args) {
		// �����ַ���
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		// ����
		String regex = "\\b\\w{3}\\b";

		// �ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		// ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		// ����ƥ��������Ĺ���
		// ͨ��find�������ǲ�����û�������������Ӵ�
		// public boolean find()
		// boolean flag = m.find();
		// System.out.println(flag);
		// // ��εõ�ֵ��?
		// // public String group()
		// String ss = m.group();
		// System.out.println(ss);
		//
		// // ����һ��
		// flag = m.find();
		// System.out.println(flag);
		// ss = m.group();
		// System.out.println(ss);

		while (m.find()) {
			System.out.println(m.group());
		}

		// ע�⣺һ��Ҫ��find()��Ȼ�����group()
		// IllegalStateException: No match found
		// String ss = m.group();
		// System.out.println(ss);
	}
}
