package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �쳣ע������:
 * A:������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣�����ࡣ(���׻���,���Ӳ��ܱȸ��׸���)
 * B:��������׳��˶���쳣,������д����ʱ,ֻ���׳���ͬ���쳣�����������Ӽ�,���಻���׳�����û�е��쳣
 * C:�������д�ķ���û���쳣�׳�,��ô����ķ������Բ������׳��쳣,������෽�������쳣����,��ô����ֻ��try,����throws
 */
public class ExceptionDemo9 {

}

class Fu {
	public void show() throws Exception {
	}

	public void method() {
	}
}

class Zi extends Fu {
	@Override
	public void show() throws ArithmeticException {

	}

	@Override
	public void method() {
		// String s = "2014-11-20";
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// Date d = sdf.parse(s);
		// System.out.println(d);
	}
}
