package com.test;
/*
��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)

������
	A:����һ�����飬����̬��ʼ����
	B:дһ������ʵ��
		�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
		�����ȣ��ͷ��ص�ǰ������ֵ��
*/
class ArrayDemo11 {
	public static void main(String[] args) {
		//����һ�����飬����̬��ʼ��
		int[] arr = {200,250,38,888,444};
		
		//������Ҫ����250����������е�һ�γ��ֵ�����
		int index = getIndex(arr,250);
		System.out.println("250�������е�һ�γ��ֵ������ǣ�"+index);
		
		int index2 = getIndex2(arr,250);
		System.out.println("250�������е�һ�γ��ֵ������ǣ�"+index2);
		
		int index3 = getIndex2(arr,2500);
		System.out.println("2500�������е�һ�γ��ֵ������ǣ�"+index3);
	}
	
	/*
		���󣺲���ָ�������������е�һ�γ��ֵ�����
		������ȷ��
			����ֵ���ͣ�int
			�����б�int[] arr,int value
	*/
	public static int getIndex(int[] arr,int value) {
		//�������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				//�����ȣ��ͷ��ص�ǰ������ֵ��
				return x;
			}
		}
		
		//Ŀǰ�Ĵ�����һ��С����
		//���Ǽ�����Ҫ���ҵ������������в����ڣ��Ǿ��Ҳ������Ҳ�������Ͷ�Ӧ�ķ�����?
		//���Ա���
		
		//ֻҪ���жϣ��Ϳ�����false�����Դ��Ҫϸ�ġ�
		
		
		//����Ҳ������ݣ�����һ�㷵��һ���������ɣ������Ƿ���-1
		return -1;
	}
	
	public static int getIndex2(int[] arr,int value) {
		//����һ������
		int index = -1;
		
		//�о��޸�����ֵ
		for(int x=0; x<arr.length; x++) {
			if(arr[x] == value) {
				index = x;
				break;
			}
		}
		
		//����index
		return index;
	}
}
