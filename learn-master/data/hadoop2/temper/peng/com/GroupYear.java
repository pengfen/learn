package peng.com;

public class GroupYear extends WritableComparator{
	
	public GroupYear() {
		super(Temper.class, true);
	}
	// ·Ö×é
	public int compare(WritableComparable a, WritableComparable b) {
		Temper o1 = (Temper) a;
		Temper o2 = (Temper) b;
		return Integer.compare(o1.getYear(), o2.getYear());
	}
}
