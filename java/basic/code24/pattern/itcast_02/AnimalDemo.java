package cn.itcast_02;

public class AnimalDemo {
	public static void main(String[] args) {
		// ������Ҫ��ֻ��
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		System.out.println("-------");
		
		//������Ҫ��ֻè
		f = new CatFactory();
		a = f.createAnimal();
		a.eat();
	}
}
