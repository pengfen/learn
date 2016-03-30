<?php if (!defined('THINK_PATH')) exit();?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="/shop/Public/css/admin.css">
	</head>
	<frameset rows="76, *, 40" frameborder='0' scrolling='no'>
		<frame src='/shop/index.php/Admin/Index/head' ></frame>
		<frameset cols="300, *" frameborder='0'>
			<frame src='/shop/index.php/Admin/Index/left'></frame>
			<frame src='/shop/index.php/Admin/Index/right' name='main'></frame>
		</frameset>
		<frame src='/shop/index.php/Admin/Index/foot'></frame>
	</frameset>
</html>