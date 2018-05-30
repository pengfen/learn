<?php

// 求两个日期的差数 例如 2007-2-5 ~ 2007-3-6 的日期差数

// 使用strtotime
class Dtime {
	function get_days($date1, $date2) {
		$time1 = strtotime($date1);
		$time2 = strtotime($date2);
		// 86400 一天的秒数
		return ($time2 - $time1) / 86400;
	}
}
$Dtime = new Dtime();
echo '使用strtotime时 日期差 '.$Dtime->get_days('2007-2-5', '2007-2-15').PHP_EOL;
echo '<br/>';

// 页面使用br换行 log等文件使用PHP_EOL换行

// 使用mktime
$temp = explode('-', '2007-2-5');
$time1 = mktime(0, 0, 0, $temp[1], $temp[2], $temp[0]);
$temp = explode('-', '2007-2-15');
$time2 = mktime(0, 0, 0, $temp[1], $temp[2], $temp[0]);
echo '使用mktime时 日期差 '.(($time2 - $time1) / 86400);