<?php 
$con = new MongoClient(); // 连接
$db = $con->test; // 获取数据库
$collection = $db->createCollection('runoob'); // 创建集合
echo '创建集合成功';