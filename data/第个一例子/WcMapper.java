package com.peng.mr;

public class WcMapper extends 	Mapper<LongWritable, Text, Text, IntWritable> {

	// 每次调用 map 方法全传入 split 中一行数据 key 该行数据所有文件中的位置下标 value 这行行数据
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		String line = value.toString();
		StringTokenizer st = new StringTokenizer(line);
		while (token.hasMoreTokens()) {
			String world = st.nextToken();
			context.write(new Text(world), new IntWritable(1)); // map的输出
		}
	}
}
