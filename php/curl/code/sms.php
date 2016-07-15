<?php

$Telphone = "13585593469"; // 测试手机号
$Content = "本次只是测试而已"; // 测试模板 
$uri = "http://api.gdzt039.com/sendmessageapi"; // 测试地址
/**
 * 需要发送的参数数组
 **/
$data = array (
    'telphone' => $Telphone,
    'content'=> $Content
);
$ch = curl_init ();
curl_setopt ( $ch, CURLOPT_URL, $uri );
curl_setopt ( $ch, CURLOPT_POST, 1 );
curl_setopt ( $ch, CURLOPT_HEADER, 0 );
curl_setopt ( $ch, CURLOPT_RETURNTRANSFER, 1 );
curl_setopt ( $ch, CURLOPT_POSTFIELDS, $data );
$return = curl_exec ( $ch );
curl_close ( $ch );
var_dump($return);

// 第一种判断方式
if (strpos($return, '0')) {
	echo '使用strpos测试 --- 发送成功<br/>';
} else {
	echo '使用strpos测试 --- 发送失败<br/>';
}

// 第二种判断方式
$mess = json_decode($return);
if ($mess->status == 0) {
	echo '使用对象测试 --- 发送成功<br/>';
} else {
	echo '使用对象测试 --- 发送失败<br/>';
}

// 第三种判断方式
$message = json_decode($return, true);
if ($message['status'] == 0) {
	echo '使用数组测试 --- 发送成功<br/>';
} else {
	echo '使用数组测试 --- 发送失败<br/>';
}