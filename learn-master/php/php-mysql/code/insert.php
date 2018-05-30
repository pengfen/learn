<?php
header("Content-type:text/html;charset=utf8");
// 连接数据库
mysql_connect('127.0.0.1', 'root', '');
mysql_select_db('blog');
mysql_query("set names 'utf8'");

// 已知的数据变量有
$name = '李四';
$pass = md5('123456');

$sql = "insert into blog_user(username, password) values('$name', '$pass')";
echo '当前sql ---> '.$sql; // 当前sql ---> insert into blog_user(username, password) values('李四', 'e10adc3949ba59abbe56e057f20f883e')
mysql_query($sql);
$uid = mysql_insert_id();
echo '当前添加的id ---> '.$uid; // 当前添加的id ---> 63
mysql_close();