<?php
// 连接数据库
mysql_connect("127.0.0.1", 'root', '');
mysql_select_db('blog');
mysql_query("set names 'utf8'");

// 关闭数据库连接
mysql_close();