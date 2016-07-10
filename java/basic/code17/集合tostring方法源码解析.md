代码：
	Collection c = new ArrayList();
	c.add("hello");
	c.add("world");
	c.add("java");
	
	System.out.println(c);
	
为什么c输出的不是地址值呢?
	A:Collection c = new ArrayList();
		这是多态，所以输出c的toString()方法，其实是输出ArrayList的toString()
	B:看ArrayList的toString()
		而我们在ArrayList里面却没有发现toString()。
		以后遇到这种情况，也不要担心，你认为有，它却没有，就应该去它父亲里面看看。
	C:toString()的方法源码
	
		public String toString() {
	        Iterator<E> it = iterator(); //集合本身调用迭代器方法，得到集合迭代器
	        if (! it.hasNext())
	            return "[]";
	
	        StringBuilder sb = new StringBuilder();
	        sb.append('[');
	        for (;;) {
	            E e = it.next(); //e=hello,world,java
	            sb.append(e == this ? "(this Collection)" : e);
	            if (! it.hasNext())
	            	//[hello, world, java]
	                return sb.append(']').toString();
	            sb.append(',').append(' ');
	        }
	    }