package peng.com;

import org.w3c.dom.Text;

public class FirstMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	// 每个词在该条微博中出现的次数(TF)
	protected void map(LongWritable key, Text value, Context context) {
		String[] v = value.toString().trim().split("\t");
		if (v.length >= 2) {
			String id = v[0].trim(); // 微博 id
			String content = v[1].trim(); // 微博内容
			
			StringReader sr = new StringReader(content);
			IkSegmenter ikSegmenter = new IKSegmenter(sr, true);
			Lexeme word = null;
			while ( (word = ikSegmenter.next()) != null ) {
				String w = word.getLexemeText();
				// 统计 TF
				context.write( new Text(w + "_" + id), new IntWritable(1));
			}
			// 统计 N (微博总条数)
			context.write(new Text("count"), new IntWritable(1));
		} else {
			System.out.println(value.toString() + "---------------");
		}
	}
}
