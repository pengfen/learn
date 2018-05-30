<?php

$redis = new redis();
$redis->connect("192.168.233.130", 6379);
$redis->select(3);

$redis->delete('test');
$redis->delete('text');
$redis->sadd("test","111");  
$redis->sadd("test","222");  
$redis->sadd("test","333");  
$redis->sadd("text","111");  
$redis->sadd("text","333"); 
// 返回一个所有指定键的并集
print_r($redis->sunion('test', 'text'));
// 执行sunion命令并把结果存储到新建的变量中 成功返回并集的个数 失败返回false
echo $redis->sunionstore('new', 'test', 'text'); // 3
print_r($redis->sgetmembers('new')); // 111,222,333

// 返回第一个集合中存在并在其他集合中不存在的结果
print_r($redis->sdiff('test', 'text'));

// 执行sdiff命令并把结果存在到新建的变量中
echo $redis->sdiffstore('new', 'test', 'text'); // 1
print_r($redis->sgetmembers('new')); // 222