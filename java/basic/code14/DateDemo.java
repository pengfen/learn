package com.test;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。 
 * 
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemo {
	public static void main(String[] args) {
		// 创建对象
		Date d = new Date();
		System.out.println("d:" + d);

		// 创建对象
		// long time = System.currentTimeMillis();
		long time = 1000 * 60 * 60; // 1小时
		Date d2 = new Date(time);
		System.out.println("d2:" + d2);
	}
}

/*
 * 日期类的时间为什么是从1970年1月1日
 * 
I suspect that Java was born and raised on a UNIX system.
UNIX considers the epoch (when did time begin) to be midnight, January 1, 1970.
是说java起源于UNIX系统，而UNIX认为1970年1月1日0点是时间纪元.

但这依然没很好的解释"为什么",出于好奇，继续Google，总算找到了答案:

http://en.wikipedia.org/wiki/Unix_time

这里的解释是:

最初计算机操作系统是32位，而时间也是用32位表示。
System.out.println(Integer.MAX_VALUE);
2147483647
Integer在JAVA内用32位表 示，因此32位能表示的最大值是2147483647。 
另外1年365天的总秒数是31536000，
2147483647/31536000 = 68.1

也就是说32位能表示的最长时间是68年，而实际上到2038年01月19日03时14分07
秒，便会到达最大时间，过了这个时间点，所有32位操作系统时间便会变为
10000000 00000000 00000000 00000000

也就是1901年12月13日20时45分52秒，这样便会出现时间回归的现象，很多软件便会运行异常了。

到这里，我想问题的答案已经出来了:

因为用32位来表示时间的最大间隔是68年，而最早出现的UNIX操作系统考虑到计算
机产生的年代和应用的时限综合取了1970年1月1日作为UNIX TIME的纪元时间(开始
时间)，而java自然也遵循了这一约束。

至于时间回归的现象相信随着64为操作系统的产生逐渐得到解决，因为用64位操作
系统可以表示到292,277,026,596年12月4日15时30分08秒，相信我们的N代子孙，哪
怕地球毁灭那天都不用愁不够用了，因为这个时间已经是千亿年以后了。

最后一个问题:上面System.out.println(new Date(0))，打印出来的时间是8点而非0点，
原因是存在系统时间和本地时间的问题，其实系统时间依然是0点，只不过我的电脑时区
设置为东8区，故打印的结果是8点。
*/