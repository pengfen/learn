<?php

$con = new MongoClient(); // 连接
$db = $con->test; // 选择数据库
$collection = $db->runoob; // 选择集合

// 更新集合 (只修改一个)
$collection->update(array('title'=>'MongoDB'), array('$set'=>array('title'=>'MongoDB 教程')));

// 显示更新后的集合
$cursor = $collection->find();

// 循环显示
foreach ($cursor as $document) {
	echo $document['title'];
}

> db.runoob.find().pretty();
{
        "_id" : ObjectId("57bd4c3e1e01a7a818000029"),
        "title" : "MongoDB 教程",
        "description" : "database",
        "likes" : 100,
        "url" : "www.peng.com",
        "by" : "教程"
}
{
        "_id" : ObjectId("57bd4cf81e01a7a81800002a"),
        "title" : "MongoDB",
        "description" : "database",
        "likes" : 100,
        "url" : "www.peng.com",
        "by" : "教程"
}
>