<?php
$host = '127.0.0.1';
$user = 'root';
$pass = '';
$link = mysql_connect($host, $user, $pass) or die("数据库连接失败");
mysql_select_db('');
mysql_query("set names 'utf8'");

print($link); // Resource id #3
mysql_close();