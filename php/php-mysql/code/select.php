<?php
// 连接数据库
$link = mysql_connect('127.0.0.1', 'root', '') or die("数据库连接失败");
mysql_select_db('blog');
mysql_query("set names 'utf-8'");

// 数据查询
$res = mysql_query('select * from blog_user limit 1');

$row = mysql_fetch_row($res);

echo "<pre>";
print_r($row); // 会输出一条数据
 
mysql_close();