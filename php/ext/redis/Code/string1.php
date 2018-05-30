<?php

$redis = new redis(); // 实例化 redis
$result = $redis->connect('192.168.233.130', 6379); // 创建redis连接 连接成功返回true
if ($result) {
	$redis->select(1); // 选择数据库 默认为0号库 127.0.0.1:6379> select 1
	$res = $redis->set('select1', 'db1');
	echo "success : 连接redis成功".PHP_EOL;
} else {
	echo "fail : 连接redis失败".PHP_EOL;
	exit;
}

// set 设置key value值
$res = $redis->set('test', 'test-set');
if ($res) {
	// get 获取指定键的值
	echo '你设置键为test的值是 : '.$redis->get('test').PHP_EOL;
} else {
	echo '设置key失败'.PHP_EOL;
}