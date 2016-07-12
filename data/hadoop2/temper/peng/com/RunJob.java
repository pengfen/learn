package peng.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.soap.Text;

public class RunJob {
	public static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd H:i:s");
	
	static class HotMapper extends Mapper<LongWritable, Text, Temper, Text>{
		
		protected void map(LongWritable key, Text value, Context context) {
			String line = value.toString();
			String[] ss = line.split("\t");
			if (ss.length == 2) {
				try{
					Date date = SDF.parse(ss[0]);
					Calendar c = Calendar.getInstance();
					c.setTime(date);
					int year = c.get(1);
					String hot = ss[1].substring(0, ss[1].indexOf("C"));
					Temper tem = new Temper();
					tem.setYear(year);
					tem.setHot(Integer.parseInt(hot));
					context.write(tem, value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class HotReduce extends Reducer<Temper, Text, Temper, Text>{
		
		protected void reduce(Temper tem, Iterable<Text> value, Context context){
			for (Text v : value) {
				context.write(tem, v);
			}
		}
	}
	
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		try {
			Job job = new Job(conf);
			job.setJobName("temper");
			job.setJarByClass(RunJob.class);
			job.setMapperClass(HotMapper.class);
			job.setReducerClass(HotReduce.class);
			job.setMapOutputKeyClass(Temper.class);
			job.setMapOutputValueClass(Text.class);
			
			job.setNumReduceTasks(3); // 根据年份分任务
			job.setPartitionerClass(FirstParition.class);
			job.setSortComparatorClass(SortHot.class);
			job.setGroupingComparatorClass(GroupYear.class);
			
			FileInputFormat.addInputPath(job, new Path("/usr/input/temper/"));
			FileOutputFormat.setOutputPath(job, new Path("/usr/output/temper"));
			System.exit(job.waitForCompletion(true) ? 0 : 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
