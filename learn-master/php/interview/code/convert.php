<?php

// 字符串 open_door 转换成 OpenDoor make_by_id 转换成 MakeById

function convert($str) {
	$list = explode('_', $str);
	// foreach ($list as $key => $val) {
	// 	// $list[$key] = ucfirst($val);
	// }
	foreach ($list as &$val) {
		$val = ucfirst($val);
	}
	$str = join("", $list);
	return $str;
}

echo convert('open_door'); // OpenDoor	
echo convert('make_by_id'); // MakeById