package cn.itcast_02;

public abstract class PhoneDecorate implements Phone {

	private Phone p;

	public PhoneDecorate(Phone p) {
		this.p = p;
	}

	@Override
	public void call() {
		this.p.call();
	}
}
