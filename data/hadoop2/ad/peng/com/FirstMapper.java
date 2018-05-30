package peng.com;

import org.w3c.dom.Text;

public class FirstMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	// ÿ�����ڸ���΢���г��ֵĴ���(TF)
	protected void map(LongWritable key, Text value, Context context) {
		String[] v = value.toString().trim().split("\t");
		if (v.length >= 2) {
			String id = v[0].trim(); // ΢�� id
			String content = v[1].trim(); // ΢������
			
			StringReader sr = new StringReader(content);
			IkSegmenter ikSegmenter = new IKSegmenter(sr, true);
			Lexeme word = null;
			while ( (word = ikSegmenter.next()) != null ) {
				String w = word.getLexemeText();
				// ͳ�� TF
				context.write( new Text(w + "_" + id), new IntWritable(1));
			}
			// ͳ�� N (΢��������)
			context.write(new Text("count"), new IntWritable(1));
		} else {
			System.out.println(value.toString() + "---------------");
		}
	}
}
