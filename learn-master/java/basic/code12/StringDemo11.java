package com.test;

/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������
 * 		"Hello123World"
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 * 
 * ������
 * 		ǰ�᣺�ַ���Ҫ����
 * 		A:��������ͳ�Ʊ���
 * 			bigCount=0
 * 			smallCount=0
 * 			numberCount=0
 * 		B:�����ַ������õ�ÿһ���ַ���
 * 			length()��charAt()���
 * 		C:�жϸ��ַ������������������͵�
 * 			��bigCount++
 * 			С��smallCount++
 * 			���֣�numberCount++
 * 
 * 			�����Ŀ���ѵ��������ж�ĳ���ַ��Ǵ�ģ�����С�ģ��������ֵġ�
 * 			ASCII���
 * 				0	48
 * 				A	65
 * 				a	97
 * 			��Ȼ�����ǰ������ֵ����ֱȽ��ǿ��Եģ���������ˣ��б��⻹�򵥵�
 * 				char ch = s.charAt(x);
 * 
 * 				if(ch>='0' && ch<='9') numberCount++
 * 				if(ch>='a' && ch<='z') smallCount++
 * 				if(ch>='A' && ch<='Z') bigCount++
 *		D:��������
 *
 * ��ϰ���Ѹ����ַ����ķ�ʽ���Ľ�Ϊ����¼���ַ����ķ�ʽ��
 */
public class StringDemo11 {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "Hello123World";
		
		//��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//�����ַ������õ�ÿһ���ַ���
		for(int x=0; x<s.length(); x++){
			char ch = s.charAt(x);
			
			//�жϸ��ַ������������������͵�
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		
		//��������
		System.out.println("��д��ĸ"+bigCount+"��");
		System.out.println("Сд��ĸ"+smallCount+"��");
		System.out.println("����"+numberCount+"��");
	}
}
