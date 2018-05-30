<?php
header("Content-type:text/html;charset=utf8");
// 连接数据库
mysql_connect('127.0.0.1', 'root', '');
mysql_select_db('blog');
mysql_query("set names 'utf8'");
// 预设数据以便进行更新操作
mysql_query("insert into blog_user(username, password) values('王二', '".md5('123456')."')");

$id = mysql_insert_id();
$sql = "update user set name = '李白' where id=$id"; // 更新sql ---> update user set name = '李白' where id=65
echo '更新sql ---> '.$sql;
if (mysql_query($sql)) {
	echo '数据更新行数: '.mysql_affected_rows();
} 

mysql_query("delete from user where id=$id");

mysql_close();