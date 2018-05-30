<?php

$con = new MongoClient(); // 连接
$db = $con->test; // 选择一个数据库
$collection = $db->runoob; // 选择集合

// 删除集合
$collection->remove(array('title'=>'MongoDB 教程'), array('justOne'=>true));

// 显示集合数据
$cursor = $collection->find();
foreach ($cursor as $document) {
	echo $document['title'];
}