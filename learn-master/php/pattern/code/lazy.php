<?php
// 匹配姓名
$p = '/:(.*)/'; // (\w+) 匹配 steven
$str = "name:steven jobs";
preg_match($p, $str, $match);
echo $match[1]; // steven jobs 