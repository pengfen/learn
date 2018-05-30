<?php
$str = '主要有以下几个文件: index.php, style.css, common.js';
// 文件名替换后增加em标签
$p = '/\w+\.\w+/i';
$str = preg_replace($p, '<em>$0</em>', $str);
echo $str;