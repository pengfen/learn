<?php

/**
    mapReduce 的实例

    wordCount 单词计数

    计算文件中出现每个单词的频数
    输入结果按照字母顺序进行排序

    编写 WordCount.java 包含Mapper 类和 Reducer 类
    编译 WordCount.java javac -classpath
    打包 jar -cvf WordCount.jar classes/*
    提交 hadoop jar WordCount.jar WordCount input output

    jps
    ll
    cd ./hadoop
    mkdir examples
    cd examples
    mkdir word_count
    cd word_count
    上传java 文件
    ls
    vim WordCount.java
    javac 编译时须要添加 hadoop 相关的jar包
    /root/hadoop/hadoop-1.2.1/hadoop-core-1.2.1.jar
    /root/hadoop/hadoop-1.2.1/lib/commons-cli-1.2.jar
    mkdir word_count_class
    javac -classpath /root/hadoop/hadoop-1.2.1/hadoop-core-1.2.1.jar:/root/hadoop/hadoop-1.2.1/lib/commons-cli-1.2.jar -d word_count_class WordCount.java
    cd word_count_class
    ls
    编译后的结果
    WordCount.class WordCount$WordCountMap.class WordCount$WordCountReduce.class
    jar -cvf wordcount.jar *.class

    cd ..
    ls
    mkdir input
    cd input
    vim file1 #输入一些单词
    vim file2 #输入一些单词
    cd ..
    hadoop:command not found 
    source /etc/rc.local #立即执行一下 rc.local就可以
    hadoop fs -put input/* input_wordcount/
    hadoop fs -mkdir input_wordcount
    hadoop fs -put input/* input_wordcount/
    hadoop fs -ls
    hadoop fs -ls input_wordcount
    hadoop fs -cat input_wordcount/file
    hadoop fs -cat input_wordcount/file2
    hadoop jar word_count_class/wordcount.jar WordCount input_wordcount output_wordcount
    hadoop fs -ls output_wordcount #查看输出的文件
    hadoop fs -cat output_wordcount/part-r-00000
    hadoop fs -ls




*/