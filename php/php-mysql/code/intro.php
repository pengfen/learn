<?php
header("Content-type:text/html;charset=utf8");

if (function_exists('mysql_connect')) {
	echo 'MySQL扩展已经安装';
}