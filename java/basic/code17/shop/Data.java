package com.test.shop;

/**
 * 初始化数据
 * 
 * @author Administrator
 * 
 */
public class Data {

	public Data() {
		goodsName = new String[50];
		goodsPrice = new double[50];
		custNo = new int[100];
		custBirth = new String[100];
		custScore = new int[100];
		manager = new Manager();
	}

	public void ini() {
		goodsName[0] = "addidas运动鞋";
		goodsPrice[0] = 880D;
		goodsName[1] = "Kappa网球裙";
		goodsPrice[1] = 200D;
		goodsName[2] = "网球拍";
		goodsPrice[2] = 780D;
		goodsName[3] = "addidasT恤";
		goodsPrice[3] = 420.77999999999997D;
		goodsName[4] = "Nike运动鞋";
		goodsPrice[4] = 900D;
		goodsName[5] = "Kappa网球";
		goodsPrice[5] = 45D;
		goodsName[6] = "KappaT恤";
		goodsPrice[6] = 245D;
		custNo[0] = 1900;
		custBirth[0] = "08/05";
		custScore[0] = 2000;
		custNo[1] = 1711;
		custBirth[1] = "07/13";
		custScore[1] = 4000;
		custNo[2] = 1623;
		custBirth[2] = "06/26";
		custScore[2] = 5000;
		custNo[3] = 1545;
		custBirth[3] = "04/08";
		custScore[3] = 2200;
		custNo[4] = 1464;
		custBirth[4] = "08/16";
		custScore[4] = 1000;
		custNo[5] = 1372;
		custBirth[5] = "12/23";
		custScore[5] = 3000;
		custNo[6] = 1286;
		custBirth[6] = "12/21";
		custScore[6] = 10080;
	}

	public String goodsName[];
	public double goodsPrice[];
	public int custNo[];
	public String custBirth[];
	public int custScore[];
	public Manager manager;
}