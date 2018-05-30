package peng.com;

import org.w3c.dom.Text;

/**
 * ��� key Ϊ count ����һ������
 * ������ key ƽ������������
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
