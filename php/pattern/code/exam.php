<?php
$user = array(
	'name' => 'caopeng8787',
	'email' => 'caopeng8787@163.com',
	'mobile' => '13585593461'
	);

// 进行一般性验证
if (empty($user)) {
	dir('用户信息不能为空');
}
if (strlen($user['name']) < 6) {
	die('用户名长度最少为6位');
}
// 用户名必须为字母 数字与下划线
if (!preg_match('/^\w+$/i', $user['name'])) {
	die('用户名不合法');
}
// 验证邮箱格式是否正确
if (!preg_match('/^[\w\.]+@\w+\.\w+$/i', $user['email'])) {
	die('邮船不合法');
}
// 手机号必须为11位数字 且为1开头
if (!preg_match('/^1\d{10}$/i', $user['mobile'])) {
	dir('手机号不合法');
}

echo '用户信息验证成功';