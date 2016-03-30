<?php if (!defined('THINK_PATH')) exit();?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="/shop/Public/css/admin.css">
	</head>
	<body bgcolor="#004288">
		<ul class="menu">
		    <?php if(is_array($pinfo)): foreach($pinfo as $key=>$pinfo): ?><li class="block">
				    <a href="../power/index.php?name=权限管理" target="main"><small class='show'>+</small><small class='hidden'>-</small><?php echo ($pinfo["name"]); ?></a>
				    
				</li><?php endforeach; endif; ?>
		</ul>
	</body>
</html>