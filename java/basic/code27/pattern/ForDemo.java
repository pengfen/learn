package cn.itcast_01;

public class ForDemo extends GetTime {

	@Override
	public void code() {
		for (int x = 0; x < 100000; x++) {
			System.out.println(x);
		}
	}

}
