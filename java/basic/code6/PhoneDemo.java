package com.test;

/*
手机类的测试
*/
class Phone2 {
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;
	
	//打电话的方法
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}
	
	//发短信的方法
	public void sendMessage() {
		System.out.println("群发短信");
	}
	
	//玩游戏的方法
	public void playGame() {
		System.out.println("玩游戏");
	}
}

class PhoneDemo {
	public static void main(String[] args) {
		//创建手机对象
		//类名 对象名 = new 类名();
		Phone2 p = new Phone2();
		
		//直接输出成员变量值
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		
		//给成员变量赋值
		p.brand = "诺基亚";
		p.price = 100;
		p.color = "灰色";
		//再次输出
		System.out.println(p.brand + "---" + p.price + "---" + p.color);
		
		//调用方法
		p.call("林青霞");
		p.sendMessage();
		p.playGame();
	}
}

/*
 * 对象内存图
 * 
 * 栈                                                       堆
 * main方法                                        new Phone();
 *                     brand:null
 * Phone p ---Ox001--- price:0
 *                     color:null
 *                     
 *                     0x001 指向方法区中的成员方法
 *                     
 *                     方法区
 *                     class文件内容
 *                     PhoneDemo.class
 *                     main方法
 *                     
 *                     Phone.class
 *                     成员变量
 *                     成员方法 0x001
 *                     
 * 调用方法 call 时 会将方法加载到栈中
 * 调用完成后 会将call方法销毁掉
 */
