<?php if (!defined('THINK_PATH')) exit();?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="/shop/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	    <h2>商城管理系统后台登录</h2>
	    <form action="/shop/index.php/Admin/Manager/checklogin" method="post">
	    	<ul class="login">
				<li>
					<span class='login-text'>用户名</span>
					<input class='login-user' type='text' name='username' placeholder='请输入用户名(5-20位字符)'/>
					<span class='error-text'><?php echo ($erroruser); ?></span>
				</li>
				<li>
					<span class='login-text'>密&nbsp;&nbsp;码</span>
					<input class='login-pass' type='password' name='password' placeholder='请输入密码(6-20位字符)'/>
					<span class='error-text'><?php echo ($errorpass); ?></span>
				</li>
				<li>
					<span class='login-text fl'>验证码</span>
					<input class='login-verify fl' name='code' type='text' size="6" placeholder='输入验证码'/>
					<img class='verify-img fl' src='/shop/index.php/Admin/Manager/verify' onclick="this.src='/shop/index.php/Admin/Manager/verify?time='+Math.random()" /> 
					<span class='error-text ml10'><?php echo ($errorverify); ?></span>
				</li>
				<li>
					<input class="submitbtn" type='submit' value="登 录"/>
				</li>
			</ul>
	    </form>
	</body>
</html>