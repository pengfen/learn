<?php

$redis = new redis();
$redis->connect("192.168.233.130", 6379);
$redis->select(3);

// 检查集合中是否存在指定的值
$redis->sadd('contain', '111');
var_dump($redis->scontains('contain', '111')); // bool(true)

// 返回集合中存储值的数量
echo 'test集合的长度是 : '.$redis->ssize('test');

print_r($redis->sort('text'));
// 随机移除并返回key中的一个值
echo 'text集合移除的值是 : '.$redis->spop('text');
print_r($redis->sort('text'));

$redis->delete('test');
$redis->delete('text');
$redis->sadd("test","111");  
$redis->sadd("test","222");  
$redis->sadd("test","333");  
$redis->sadd("text","111");  
$redis->sadd("text","333"); 
// 返回二集合的交集
print_r($redis->sinter('test', 'text')); // 111,333

// 获取test集合的所有值
print_r($redis->smembers('test')); // 111,222,333

// 执行sinter命令并把结果存储到新建的变量中 成功返回交集的个数 失败返回false
echo $redis->sinterstore('new', 'test', 'text');
// 返回集合的内容 smembers sgetmembers
print_r($redis->smembers('new')); // 111,333