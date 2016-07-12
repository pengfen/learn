<?php

/**
    hdfs 设计架构

    基本概念
    块(Block)
    NameNode
    DataNode

    HDFS 的文件被分成块进行存储
    HDFS 块的默认大小 64MB
    块是文件存储处理的逻辑单元

    HDFS 中有两类节点 NameNode 和 DataNode

    NameNode 是管理节点 存放文件元数据
    文件与数据块的映射表
    数据块与数据节点的映射表

    DataNode 是 HDFS 的工作节点 存入数据块
    每个数据块三个副本 分布在两个机架内的三个节点

    心跳检测
    DataNode 定期向 NameNode 发送心跳消息
    二级 NameNode 定期同步元数据映像文件和修改日志 NameNode 发生故障时 备胎转正

    HDFS 的特点
    数据冗余 硬件容错
    流式的数据访问
    存储大文件

    适用性和局限性
    适合数据指读写 吞吐量高
    不适合交互式应用 低延迟很难满足

    适合一次写入多次读取 顺序读写
    不支持多用户并发写相同文件

    HDFS 命令行操作
    hadoop namenode -format
    hadoop fs -ls /
    hadoop fs -ls /hadoop
    hadoop fs -put ./hadoop-env.sh /user/test
    hadoop fs -ls /
    hadoop fs -ls /user

    hadoop fs -mkdir input #创建一个目录
    hadoop fs -ls /user/root #查看创建的目录
    /user/root/input
    hadoop fs -put hadoop-env.sh input/ #将文件上传到目录中
    hadoop fs -ls /user/root/input #查看上传文件
    hadoop fs -cat /user/root/input/hadoop-env.sh #查看上传文件
    hadoop fs -get input/hadoop-env.sh hadoop-env2.sh #下载文件到本地
    ls
    rm -rf hadoop-env2.sh
    ls
    hadoop fs -rm hadoop-env.sh
    hadoop fs -rm -rmr input #删除input 目录
    hadoop dfsadmin -report




*/