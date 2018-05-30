<?php
header("Content-type:text/html; charset=utf8");
// 连接数据库
mysql_connect('127.0.0.1', 'root', '');
mysql_select_db('blog');
mysql_query("set names 'utf8'");
// 数据预处理 防止查询不到数据
$sql = "insert into blog_user(username, password) values('王二', '".md5('123456')."')";
echo '当前添加数据 ---> '.$sql; // 当前添加数据 ---> insert into blog_user(username, password) values('王二', 'e10adc3949ba59abbe56e057f20f883e')
mysql_query($sql);
$id = mysql_insert_id();
// 进行数据查询
$sql = "select * from blog_user where id=$id limit 1";
echo '<br/>当前sql ---> '.$sql; // 当前sql ---> select * from blog_user where id=64 limit 1
$result =  mysql_query($sql);

$row = mysql_fetch_row($result);

print_r($row); // Array ( [0] => 64 [1] => 王二 [2] => e10adc3949ba59abbe56e057f20f883e [3] => 0 [4] => [5] => [6] => 1 [7] => 10 [8] => 100 [9] => [10] => 1 [11] => [12] => [13] => [14] => [15] => 0 [16] => )

mysql_close();