package com.test;
/*
ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
	���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
	��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
	Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 
	
��ĿҪ��
	A:������С��8λ������
		����һ��int���͵�����
		int number = 123456;
	B:���ܹ���
		a:���Ƚ����ݵ���
			��� 654321
		b:Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
			��� 109876
		c:��󽫵�һλ�����һλ���ֽ���
			��� 609871
	C:�Ѽ��ܺ�Ľ������ڿ���̨
	
	ͨ���򵥵ķ���������֪����������а취��������ݱ������ͺ��ˡ�
	����ֱ��д��������ӵģ�
		int[] arr = {1,2,3,4,5,6};
		
	��ΰ�����ת��������?
		A:����һ������
			int number = 123456;
		B:����һ������,���ʱ����������ˣ�����ĳ����Ƕ�����?
			int[] arr = new int[8]; //�����ܳ���8
			�ڸ�ֵ��ʱ������һ��������¼�����ı仯��
			����һ������ֵ��0
			int index = 0;
		C:��ȡÿһ������
			int ge = number%10
			int shi = number/10%10
			int bai = number/10/10%10
			
			arr[index] = ge;
			index++;
			arr[index] = shi;
			index++;
			arr[index] = bai;
			...
*/
class ThinkDemo2 {
	public static void main(String[] args) {
		//����һ������
		int number = 123456;
		
		//����һ������
		int[] arr = new int[8];
		
		//��������ÿһλ�ϵ����ݻ�ȡ����洢��������
		/*
		int index = 0;
		arr[index] = number%10; //arr[0]=6;
		index++;
		arr[index] = number/10%10; //arr[1]=5;
		index++;
		arr[index] = mumber/10/10%10; //arr[2]=4;
		*/
		
		//ͨ���۲�������룬���Ƿ���Ӧ���ǿ���ͨ��ѭ���Ľ���
		int index = 0;
		
		while(number > 0) { //number=123456,number=12345,number=1234,number=123,number=12,number=1,number=0
			arr[index] = number % 10; //arr[0]=6,arr[1]=5,arr[2]=4,arr[3]=3,arr[4]=2,arr[5]=1
			index++;//index=1,index=2,index=3,index=4,index=5,index=6
			number /= 10;//number=12345,number=1234,number=123,number=12,number=1,number=0
		}
		
		//Ȼ��ÿλ���ֶ�����5�����úͳ���10���������������
		for(int x = 0; x < index; x ++) {
			arr[x] += 5;
			arr[x] %= 10;
		}
		
		//��󽫵�һλ�����һλ���ֽ���
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		//�������
		for(int x = 0; x < index; x ++) {
			System.out.print(arr[x]); // 609871
		}
		System.out.println();
	}
}
