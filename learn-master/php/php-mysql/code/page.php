<?php
header("Content-type:text/html; charset=utf8");
//连接数据库
mysql_connect('127.0.0.1', 'root', '');
mysql_select_db('blog');
mysql_query("set names 'utf8'");

// 预设翻页参数
$page = 2;
$pagesize = 2;

// 分页查询
$offset = ($page - 1) * $pagesize;
$sql = "select * from blog_user limit $offset, $pagesize"; // 当前sql ---> select * from blog_user limit 2, 2
echo "当前sql ---> ".$sql;
$result = mysql_query($sql);

// 循环获取当前页的数据
$data = array();
while ($row = mysql_fetch_assoc($result)) {
	$data[] = $row;
}

echo "<pre>";
print_r($data); // 只输出二条

mysql_close();