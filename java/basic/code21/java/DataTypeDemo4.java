/*
	ǿ��ת����
		�Ӵ���������͵�С���������͡�
		
		��ʽ��
			Ŀ���������� ���� = (Ŀ����������) (��ת��������);
			
		ע�⣺
			��Ҫ�����ȥʹ��ǿ��ת������Ϊ�������˾�����ʧ���⡣
*/
class DataTypeDemo4 {
	public static void main(String[] args) {
		byte a = 3;
		int b = 4;
		
		//����϶�û������
		//int c = a + b;
		
		//byte c = 7;
		//������������
		//byte c = a + b; 
		//��ǿ������ת���Ľ�
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}