<?php

$redis = new redis();
$redis->connect("192.168.233.130", 6379);
$redis->select(1);

$redis->set('multiple1', 'test-multi1'); 
$redis->set('multiple2', 'test-multi2');
$redis->set('multiple3', 'test-multi3');

// 获取所有指定键的值
var_dump($redis->getMultiple(array('multiple1', 'multiple2', 'multiple3')));

// F:\php\redis>php string4.php
// array(3) {
//   [0]=>
//   string(11) "test-multi1"
//   [1]=>
//   string(11) "test-multi2"
//   [2]=>
//   string(11) "test-multi3"
// }