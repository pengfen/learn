<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>首页</title>
</head>
<body>
	<center>
	<h1>登陆</h1>
	<form action='dologin.php' method='post'>
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type='text' name='username'></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type='password' name='password'></td>
		</tr>
		<tr>
			<td></td>
			<td><input type='submit' value='登陆'></td>
		</tr>
	</table>
	</form>
	<?php
		if (!empty($_GET['errno'])){
			echo '<span style="color:red">用户名或密码错误</span>';
		}
	?>
	</center>
	
</body>
</html>