<?php

$redis = new redis();
$redis->connect('192.168.233.130', 6379);
$redis->select(2);

// 获取test列表的长度
$len = $redis->lsize('test');
for ($i = 0; $i < $len; $i ++) {
	// 返回指定键存储在列表中指定的元素 0第一个元素 ...
	echo "第{$i}个元素的值是 : ".$redis->lget("test", $i);
}

// 为列表指定的索引赋新的值 成功返回true 失败返回false
$redis->lset('test', 1, 'test-lset');
echo 'lset 设置后的值是 : '.$redis->lget('test', 1); // test-lset

// 返回该区域中的指定键列表中开始到结束存储的指定元素 0 第一个元素 -1最后一个元素
print_r($redis->lgetrange('test', 0, -1));

// 删除了header1元素
// 从列表中从头部开始移除count(第三个参数)个匹配的值 如果count为零 所有匹配的元素都被删除 如果count是负数 内容从尾部开始删除 成功返回删除的个数 失败返回false
echo $redis->lremove('test', 'header1', 1); // 1
print_r($redis->lgetrange('test', 0, -1));