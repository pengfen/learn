package peng.com;

public class SortHot extends WritableComparator{
	
	public SortHot() {
		super(Temper.class, true);
	}
	
	public int compare(WritableComparable a, WritableComparable b) {
		Temper o1 = (Temper) a;
		Temper o2 = (Temper) b;
		int res = Integer.compare(o1.getYear(), o2.getYear());
		if (res != 0) {
			return res;
		}
		return -Integer.compare(o1.getHot(), o2.getHot()); // ½µÐò
	}
}
