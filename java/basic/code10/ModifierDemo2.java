package com.test;

/*
权限修饰符：
				本类	同一个包下(子类和无关类)	不同包下(子类)	不同包下(无关类)
	private 	Y		
	默认		Y		Y
	protected	Y		Y							Y
	public		Y		Y							Y				Y
*/

public class ModifierDemo2 {
	private void show() {
		System.out.println("show");
	}
	
	void show2() {
		System.out.println("show2");
	}
	
	protected void show3() {
		System.out.println("show3");
	}
	
	public void show4() {
		System.out.println("show4");
	}
	
	public static void main(String[] args) {
		ModifierDemo2 f = new ModifierDemo2();
		f.show();
		f.show2();
		f.show3();
		f.show4();
	}
}