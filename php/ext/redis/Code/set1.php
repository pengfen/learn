<?php

$redis = new redis();
$redis->connect("192.168.233.130", 6379);
$redis->select(3);

// 为一个key添加一个值 如果这个值已经在这个key中 则返回false;
$redis->sadd('test', 'sadd1');
// echo $redis->sadd('test', 'sadd1'); // 0

// 会自动排序 2,3,4,sadd1
$redis->sadd('test', '3');
$redis->sadd('test', '4');
$redis->sadd('test', '2');

// 删除key中指定的value值
$redis->sremove('test', 'sadd1');

// 只对整数进行排序
print_r($redis->sort('test'));
$redis->sadd('test', '5');

// 删除test键
$redis->delete('test');

$redis->sadd('test', '12');
$redis->sadd('test', '11');
$redis->sadd('text', '14');
$redis->sadd('text', '15');
// 将key1中的value移动到key2中 集合test中12移到集合text中
$redis->smove('test', 'text', '12');
print_r($redis->sort('text')); // 12,14,15