package peng.com;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Temper implements WritableComparable<Temper>{
	private int year;
	private int hot;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	
	public void readFields(DataInput in) throws IOException{
		this.year = in.readInt();
		this.hot = in.readInt();
	}
	public void write(DataOutput out) throws IOException{
		out.writeInt(year);
		out.writeInt(hot);
	}
	public int compareTo(Temper o) {
		int res = Integer.compare(year, o.getYear());
		if (res != 0) {
			return res;
		}
		return Integer.compare(hot, o.getHot());
	}
	
	public String toString(){
		return year + "\t" + hot;
	}
	public int hashCode(){
		return new Integer(year + hot).hashCode();
	}
}
