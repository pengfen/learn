package peng.com;

import org.w3c.dom.Text;
/**
 *  第一个 job 数据结果为
 *  九阳-001 2
 *  count 19 总微博数
 * */
public class FirstReduce extends Reducer<Text, IntWritable, Text, IntWritable>{
	protected void reduce(Text text, Iterable<IntWritable> iter, Context ct){
		int sum = 0;
		for ( IntWritable i : iter) {
			sum = sum + i.get();
		}
		if (text.equals(new Text("count"))) {
			System.out.println(text.toString());
		}
		ct.write(text, new IntWritable(sum));
	}
}
