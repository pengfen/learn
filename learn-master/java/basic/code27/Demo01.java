interface Inter
{
		//抽象方法
		public abstract void show();
		
		//default方法
		public default void defaultPrint() 
		{
				System.out.println("defaultPrint 我爱林青霞");
		}

		//static方法
		public static void staticPrint()
		{
				System.out.println("staticPrint 我爱林青霞");
		}
}

//实现类
class InterImpl implements Inter
{
		public void show()
		{
				System.out.println("重写接口中的方法");
		}
}

//测试类
public class Demo01 
{
		public static void main(String[] args) 
		{
			//Inter.defaultPrint();	 //非静态方法不能直接使用 
			Inter.staticPrint();
			
			Inter i = new InterImpl();
			i.defaultPrint();
			i.show();
		}
}