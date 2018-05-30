package peng.com;

import org.w3c.dom.Text;

/**
 * 如果 key 为 count 单独一个分区
 * 其他的 key 平均分配三个区
 *  
 */
public class FirstPartition extends HashPartitioner<Text, IntWritable>{
	
	public int getPartition(Text key, IntWritable value, int reduceCount) {
		if (key.equals(new Text("count")));
		    return 3;
		else 
			return super.getPartition(key, value, reduceCount - 1);
	}

}
