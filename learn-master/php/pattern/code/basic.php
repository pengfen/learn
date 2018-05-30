<?php
// 匹配BBC
$p = '/BBC/';
$str = "BBC是英国的一个电视台";
if (preg_match($p, $str)) {
	echo '匹配成功';
}