多态的问题理解：
	class 孔子爹 {
		public int age = 40;
		
		public void teach() {
			System.out.println("讲解JavaSE");
		}
	}
	
	class 孔子 extends 孔子爹 {
		public int age = 20;
		
		public void teach() {
			System.out.println("讲解论语");
		}
		
		public void playGame() {
			System.out.println("英雄联盟");
		}
	}
	
	//Java培训特别火,很多人来请孔子爹去讲课，这一天孔子爹被请走了
	//但是还有人来请，就剩孔子在家，价格还挺高。孔子一想，我是不是可以考虑去呢?
	//然后就穿上爹的衣服，带上爹的眼睛，粘上爹的胡子。就开始装爹
	//向上转型
	孔子爹 k爹 = new 孔子();
	//到人家那里去了
	System.out.println(k爹.age); //40
	k爹.teach(); //讲解论语
	//k爹.playGame(); //这是儿子才能做的
	
	
	//讲完了，下班回家了
	//脱下爹的装备，换上自己的装备
	//向下转型
	孔子 k = (孔子) k爹; 
	System.out.println(k.age); //20
	k.teach(); //讲解论语
	k.playGame(); //英雄联盟
	