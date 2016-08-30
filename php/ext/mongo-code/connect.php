<?php
$m = new MongoClient(); // 连接默认主机和端口为 mongodb://localhost:27017
var_dump($m); // object(MongoClient)#1 (4) { ["connected"]=> bool(true) ["status"]=> NULL ["server":protected]=> NULL ["persistent":protected]=> NULL }
$data = $m->test; // 获取名称为 test 的数据库
echo '<br/>连接数据库后<br/>';
var_dump($data); // object(MongoDB)#2 (2) { ["w"]=> int(1) ["wtimeout"]=> int(10000) }