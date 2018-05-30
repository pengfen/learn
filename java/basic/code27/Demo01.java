interface Inter
{
		//���󷽷�
		public abstract void show();
		
		//default����
		public default void defaultPrint() 
		{
				System.out.println("defaultPrint �Ұ�����ϼ");
		}

		//static����
		public static void staticPrint()
		{
				System.out.println("staticPrint �Ұ�����ϼ");
		}
}

//ʵ����
class InterImpl implements Inter
{
		public void show()
		{
				System.out.println("��д�ӿ��еķ���");
		}
}

//������
public class Demo01 
{
		public static void main(String[] args) 
		{
			//Inter.defaultPrint();	 //�Ǿ�̬��������ֱ��ʹ�� 
			Inter.staticPrint();
			
			Inter i = new InterImpl();
			i.defaultPrint();
			i.show();
		}
}