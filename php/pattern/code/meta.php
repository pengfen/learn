<?php
// 匹配电话
$p = '/[\d]{3,4}-[\d]{7,8}/';
$str = "我的电话是 010-12345678";
preg_match($p, $str, $match);
echo $match[0];