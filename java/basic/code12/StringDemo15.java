package com.test;

/*
 * 如果我们看到问题了，看怎么办呢?
 * 看源码。
 */
public class StringDemo15 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hel";
		System.out.println(s1.compareTo(s2)); // 2
	}
}

/*
String 类compareTo方法的源码解析
private final char value[];

字符串会自动转换为一个字符数组。

public int compareTo(String anotherString) {
		//this -- s1 -- "hello"
		//anotherString -- s2 -- "hel"

    int len1 = value.length; //this.value.length--s1.toCharArray().length--5
    int len2 = anotherString.value.length;//s2.value.length -- s2.toCharArray().length--3
    int lim = Math.min(len1, len2); //Math.min(5,3); -- lim=3;
    char v1[] = value; //s1.toCharArray()
    char v2[] = anotherString.value;
    
    //char v1[] = {'h','e','l','l','o'};
    //char v2[] = {'h','e','l'};

    int k = 0;
    while (k < lim) {
        char c1 = v1[k]; //c1='h','e','l'
        char c2 = v2[k]; //c2='h','e','l'
        if (c1 != c2) {
            return c1 - c2;
        }
        k++;
    }
    return len1 - len2; //5-3=2;
}

String s1 = "hello";
String s2 = "hel";
System.out.println(s1.compareTo(s2)); // 2
*/
