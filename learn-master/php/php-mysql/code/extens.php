<?php
header("Content-type:text/html;charset=utf8");
$link = mysql_connect('127.0.0.1', 'root', '') or die('数据库连接失败');
mysql_select_db('blog');
mysql_query("set names 'utf8'");
$result = mysql_query('select * from blog_user limit 1');
$row = mysql_fetch_assoc($result);
print_r($row); // Array ( [id] => 52 [username] => apeng1 [password] => e10adc3949ba59abbe56e057f20f883e [sex] => 2 [email] => apeng1@qq.com [telphone] => 13585593461 [grade] => 1 [score] => 1 [experience] => 185 [addtime] => 1439515776 [state] => 1 [address] => [birthday] => 1987-03-01 [vocation] => php程序员 [department] => 江西 [status] => 0 [onlinetime] => )
echo $row['username']; // apeng1
mysql_close($link);