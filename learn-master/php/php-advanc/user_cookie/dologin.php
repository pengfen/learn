<?php
header('Content-type:text/html;charset=utf-8');

//接收表单数据
$username = $_POST['username'];
$password = $_POST['password'];

//判断 用户名 和 密码 是否 正确  模拟
if ($username == 'admin' && $password == '123456'){
	//把用户信息存储到cookie中
	setcookie('username', $username, time()+3600*24, '/');
	
	echo  '登陆成功....';
	echo "<meta http-equiv='refresh' content='3;url=index.php'>";
}else {
	header('Location:login.php?errno=1');
	exit;
}