<?php

$redis = new redis();
$redis->connect('192.168.233.130', 6379);
$redis->select(2);

// 原始列表 2222,1111

// 列表头部添加字符串
$redis->lpush('list', 'header1');
$redis->lpush('list', 'header2');

// 添加后的列表 header2,header1,2222,1111

echo '列表长度是 : '.$redis->lsize('test');

// 列表尾部添加字符串
$redis->rpush('list', 'tail1');
$redis->rpush('list25', 'tail2');

// 添加后的列表 header2,header1,2222,1111,tail1,tail2

echo '列表长度是 : '.$redis->llen('test');

// 返回和移除列表的第一个元素
echo '移除的元素是 : '.$redis->lpop('test'); // header2

// 移除后的列表 header1,2222,1111,tail1,tail2