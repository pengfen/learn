package cn.itcast_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PhoneDemo {
	public static void main(String[] args) {
		Phone p = new IPhone();
		p.call();
		System.out.println("------------");

		// 需求：我想在接电话前，听彩铃
		PhoneDecorate pd = new RingPhoneDecorate(p);
		pd.call();
		System.out.println("------------");

		// 需求：我想在接电话后，听音乐
		pd = new MusicPhoneDecorate(p);
		pd.call();
		System.out.println("------------");

		// 需求：我要想手机在接前听彩铃，接后听音乐
		// 自己提供装饰类，在打电话前听彩铃，打电话后听音乐
		pd = new RingPhoneDecorate(new MusicPhoneDecorate(p));
		pd.call();
		System.out.println("----------");
		// 想想我们在IO流中的使用
		// InputStream is = System.in;
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(
				System.out)));

		Scanner sc = new Scanner(System.in);
	}
}