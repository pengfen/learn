package com.test;

/*
����
	����һ��Ա����,�Լ�������������Ա��
	Ȼ�������Ա���������췽����getXxx()/setXxx()������
	�Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�

������
	Ա��
		��Ա������
			Ա����ţ�����������
		���췽����
			�޲ι��췽��
		��Ա������
			getXxx()/setXxx()
			show();
*/
class Employee {
	private String employeeId; // Ա�����
	private String name; // ����
	private int age; // ����
	
	public Employee() {}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	
	//��ʾ���г�Ա��Ϣ�ķ���
	public void show() {
		System.out.println("Ա������ǣ�"+employeeId+"��������ǣ�"+name+"�������ǣ�"+age);
	}
}

class EmployeeTest {
	public static void main(String[] args) {
		//��������
		Employee e = new Employee();
		
		//����Ա������ֵ
		e.setEmployeeId("czbk9527");
		e.setName("�Ʋ���");
		e.setAge(18);
		
		//��ȡ����
		//System.out.println(e.getEmployeeId()+"---"+e.getName()+"---"+e.getAge());
	
		//������Employee���ж�����һ��show���������ԣ����ǸĽ�һ�£�ʹ��show����
		e.show();
	}
}

