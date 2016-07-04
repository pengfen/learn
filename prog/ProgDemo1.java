/*
    有一对兔子 从出生后第三个月起每个月都生一对兔子 小兔子长到第三个月后每个月又生一对兔子 假如兔子都不死 问每个月的兔子对象为多少

    分析 兔子的规则为数列 1, 1, 2, 3, 5, 8 ....
    使用递归处理

    问题 CMD窗口是GBK编码 在CMD编译时注意编码问题
        编码GBK的不可映射字符
        解决方案 记事本打开 使用ANST重新保存文件
*/
import java.util.Scanner;

public class ProgDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");
		int in = sc.nextInt();

		System.out.println("第" + in + "个月兔子总数是" + fun(in) + "对");
	}

	// 使用递归处理兔子数
	private static int fun(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fun(n - 1) + fun(n - 2);
	}
}