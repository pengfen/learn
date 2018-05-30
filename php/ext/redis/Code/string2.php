<?php

$redis = new redis(); // 实例化redis
$redis->connect('192.168.233.130', 6379); // 创建redis连接
$redis->select(1); // 选择一号数据库
// 判断键test是否存在
if ($redis->exists('test')) {
	echo '键为test删除前的值是 : '.$redis->get('test');
	// delete 删除指定的键
	$redis->delete('test');
	// 如果键test不存在 就给test设置值
	$redis->setnx('test', 'text-setnx');
	echo '键为test删除后经过setnx设置的值是 : '.$redis->get('test');
} else {
	echo '在一号数据库中键为test不存在';
}
// 如果键test存在 就不给test设置值
$redis->setnx('test', 'setnx2');
echo '键为test第二次setnx设置的值是 : '.$redis->get('test');