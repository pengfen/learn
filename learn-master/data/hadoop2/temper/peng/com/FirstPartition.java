package peng.com;

 public class FirstPartition extends Partitioner<KeyPair, Text>{
	
	// ����
	public int getPartition(Temper key, Text value, int num) {
		return (key.getYear() * 127) % num;
	}
}
