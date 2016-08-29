<?php

$redis = new redis();
$redis->connect('192.168.233.130', 6379);
$redis->select(2);

// 
$redis->lpush('list', 'header1');
$redis->lpush('list', 'header2');

echo '列表长度是 : '.$redis->lsize('test');

$redis->rpush('list', 'tail1');
$redis->rpush('list', 'tail2');

echo '列表长度是 : '.$redis->llen('test');