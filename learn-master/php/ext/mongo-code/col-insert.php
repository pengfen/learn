<?php

$con = new MongoClient(); // 连接
$db = $con->test; // 选择数据库
$collection = $db->runoob; // 选择集合
$document = array(
	'title' => 'MongoDB',
	'description' => 'database',
	'likes' => 100,
	'url' => 'www.peng.com',
	'by' => '教程'
	);
$collection->insert($document);
echo '数据插入成功';

------------------------ 
客户端查看们 (每次执行添加数据时会自动生成_id 生成的_id是唯一的)
> db.runoob.find().pretty();
{
        "_id" : ObjectId("57bd4c3e1e01a7a818000029"),
        "title" : "MongoDB",
        "description" : "database",
        "likes" : 100,
        "url" : "www.peng.com",
        "by" : "教程"
}
>