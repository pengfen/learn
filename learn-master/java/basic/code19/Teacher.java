package com.test;

public class Teacher {
	public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("����������0-100֮��");
		} else {
			System.out.println("����û������");
		}
	}

	// ���MyException�̳���RuntimeException
	// public void check(int score) {
	// if (score > 100 || score < 0) {
	// throw new MyException();
	// } else {
	// System.out.println("����û������");
	// }
	// }
}
