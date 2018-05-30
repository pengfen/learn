<?php

$redis = new redis(); // 实例化redis
$redis->connect('192.168.233.130', 6379); // 创建redis连接
$redis->select(1); // 选择一号数据库

$redis->set('add', 5);
// 数字递增 (注意 改变数据库里的值)
echo $redis->incr('add'); // 6
echo $redis->incr('add'); // 7

// 数字递减 (注意 改变数据库里的值)
echo $redis->decr('add'); // 6
echo $redis->decr('add'); // 5
echo $redis->decr('add'); // 4
echo $redis->get('add'); // 4