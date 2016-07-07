<?php

// 请写一个函数将1234567890转换成1,234,567,890每3位用逗号隔开的形式

$str = '1234567890';
echo '使用系统自带函数 '.number_format($str);

// 反转判断加逗号
function fanstr($str) {
	// 先将字符串反转
	$rstr = strrev($str);
	// 求字符长度 下标从0开始所以需要长度 - 1
	$len = strlen($rstr) - 1;
	$newstr = '';
	for ($i = 0; $i <= $len; $i ++) {
		// 反转后字符串每3位另一个逗号 并且排除和种情况(i = 0)
		if ($i % 3 == 0 && $i != 0) {
			$newstr .= ',';
		}
		$newstr .= $rstr[$i];
		
	}
	// 最后再进行反转返回
	return strrev($newstr);
}

echo '使用反转 '.fanstr($str);

// 正着判断加逗号
function seqstr($str) {
	// 计算字符串长度
	$strlen = strlen($str);
	// 每3位加逗号 其余的也要使用逗号隔开
	// 求字符串长度对3的余数 用来计算逗号放的位置
	$y = $strlen % 3;
	$len = $strlen - 1;
	$newstr = '';
	for ($i = 0; $i <= $len; $i ++) {
		// 如果对3取余等于余数需要加逗号 并且排除(i=0)的情况
		if ($i % 3 == $y && $i != 0) {
			$newstr .= ',';
		}
		$newstr .= $str[$i];
	}
	// 返回处理后的字符串
	return $newstr;
}

echo '正向判断 '.seqstr($str);