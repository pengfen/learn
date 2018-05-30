package cn.itcast_02;

/*
 * ͨ��JDK5�ṩ��ö������ö����
 */
public enum Direction3 {
	FRONT("ǰ") {
		@Override
		public void show() {
			System.out.println("ǰ");
		}
	},
	BEHIND("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},
	LEFT("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	},
	RIGHT("��") {
		@Override
		public void show() {
			System.out.println("��");
		}
	};

	private String name;

	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void show();
}
