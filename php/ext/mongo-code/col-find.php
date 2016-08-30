<?php

$con = new MongoClient(); // 连接
$db = $con->test; // 选择数据库
$collection = $db->runoob; // 选择集合
$cursor = $collection->find(); // 查找集合

// 迭代显示文档标题
foreach ($cursor as $document) {
	echo $document['title']."<br/>";
}