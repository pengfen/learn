/*
	˼����1���������������û������
		double d = 12.345;
		float f = d;
		
	˼����2��������������������û��������?
		float f1 = (float)12.345;
		float f2 = 12.345f;
		
		f1��ʵ��ͨ��һ��double����ת�������ġ�
		��f2�������һ��float���͡�
*/
class DataTypeDemo5 {
	public static void main(String[] args) {
		//��double��ֵ��float������ǿ������ת��
		double d = 12.345;
		float f = (float)d;
		
		//������������������û��������?
		float f1 = (float)12.345;
		float f2 = 12.345F;
	}
}