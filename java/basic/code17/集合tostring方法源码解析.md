���룺
	Collection c = new ArrayList();
	c.add("hello");
	c.add("world");
	c.add("java");
	
	System.out.println(c);
	
Ϊʲôc����Ĳ��ǵ�ֵַ��?
	A:Collection c = new ArrayList();
		���Ƕ�̬���������c��toString()��������ʵ�����ArrayList��toString()
	B:��ArrayList��toString()
		��������ArrayList����ȴû�з���toString()��
		�Ժ��������������Ҳ��Ҫ���ģ�����Ϊ�У���ȴû�У���Ӧ��ȥ���������濴����
	C:toString()�ķ���Դ��
	
		public String toString() {
	        Iterator<E> it = iterator(); //���ϱ�����õ������������õ����ϵ�����
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