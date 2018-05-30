package com.test;

public class Student5 {
	private String name;
	private int age;

	public Student5() {
		super();
	}

	public Student5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student5 other = (Student5) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// return true;
//		//����Ҫ�Ľ�����������Ƚϵĳ�Ա��������������true����false
//		//������ʵҪ�ȼ۵ľ���name��age
//		//���ǣ�name��String���͵ģ���String���������͵ģ����ԣ������ﲻ��ֱ����==�Ƚϣ�Ӧ����equals()�Ƚ�
//		//String��equals()��������д��Object��ģ��Ƚϵ����ַ����������Ƿ���ͬ
//		//this -- s1
//		//obj -- s2
//		//����Ҫʹ�õ���ѧ��������г�Ա����,����Ҫ����ת��
//		Student s = (Student)obj; //s -- obj -- s2;
//		if(this.name.equals(s.name) && this.age == s.age) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		//Ϊ�����Ч��
//		if(this == obj){
//			return true;
//		}
//		
//		//Ϊ���ṩ����Ľ�׳��
//		//�����ж�һ�£�obj�ǲ���ѧ����һ����������ǣ���������ת�ͣ�������ǣ�ֱ�ӷ���false��
//		//���ʱ������Ҫ�жϵ��Ƕ����Ƿ���ĳ����Ķ���?
//		//��סһ����ʽ�������� instanceof ����
//		//��ʾ���жϸö������Ƿ��Ǹ�����һ������
//		if(!(obj instanceof Student)){
//			return false;
//		}
//		//����Ǿͼ���
//		
//		Student s = (Student)obj;
//		//System.out.println("ͬһ�����󣬻���Ҫ����ת�Ͳ��Ƚ���?");
//		return this.name.equals(s.name) && this.age == s.age;
//	}
	
	
}