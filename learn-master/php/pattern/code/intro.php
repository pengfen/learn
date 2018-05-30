<?php
// 匹配苹果
$p = '/苹果/';

$str = "我喜欢吃苹果";
if (preg_match($p, $str)) {
	echo '匹配成功';
}