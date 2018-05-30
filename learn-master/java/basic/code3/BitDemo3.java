package com.demo;
/**
 * << 左移 左边最高位丢弃 右边补齐0
 * >> 左移 最高位是0 左边补齐0 最高位是1 左边补齐1
 * >>> 无符号右移 无论最高位是0还是1 左边补齐0
 * 
 * 面试题
 *    请用最有效率的方式写出计算2乘以8的结果  2*8  2<<3
 *
 */
public class BitDemo3 {
	public static void main(String[] args) {
		// << 把<<左边的数据乘以2的移动次幂
		System.out.println(3 << 2); // 3*2^2 = 3 * 4 = 12
		
		// >> 把 >> 左边的数据除以2的移动次幂
		System.out.println(24 >> 2); // 24 / 2^2 = 24 / 4 = 6
		System.out.println(24 >>> 2); // 6
		
		System.out.println(-24 >> 2); // -6
		System.out.println(-24 >>> 2);
	}
}
/*
计算出3的二进制：11
	00000000 00000000 00000000 00000011
(00)000000 00000000 00000000 0000001100
	
>>的移动：	
计算出24的二进制：11000
	原码：10000000 00000000 00000000 00011000
	反码：11111111 11111111 11111111 11100111
	补码：11111111 11111111 11111111 11101000
	
	11111111 11111111 11111111 11101000
	1111111111 11111111 11111111 111010(00) 补码
	
	补码：1111111111 11111111 11111111 111010
	反码：1111111111 11111111 11111111 111001
	原码：1000000000 00000000 00000000 000110
	
	结果：-6
	
>>>的移动：
	计算出24的二进制：11000
	原码：10000000 00000000 00000000 00011000
	反码：11111111 11111111 11111111 11100111
	补码：11111111 11111111 11111111 11101000
	
	11111111 11111111 11111111 11101000
	0011111111 11111111 11111111 111010(00)
	
	结果：
*/