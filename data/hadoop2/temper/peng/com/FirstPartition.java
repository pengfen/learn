package peng.com;

 public class FirstPartition extends Partitioner<KeyPair, Text>{
	
	// ·ÖÇø
	public int getPartition(Temper key, Text value, int num) {
		return (key.getYear() * 127) % num;
	}
}
