<?php /* Smarty version Smarty-3.1.6, created on 2015-06-07 10:05:35
         compiled from "./APP/Admin/View\Manager\add.html" */ ?>
<?php /*%%SmartyHeaderCode:38135573a4b27931c0-07371660%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '3ad978bdfba256465c07f60bda9f621efb01f2b0' => 
    array (
      0 => './APP/Admin/View\\Manager\\add.html',
      1 => 1433642627,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '38135573a4b27931c0-07371660',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5573a4b3875e9',
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5573a4b3875e9')) {function content_5573a4b3875e9($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class="bgimg">

		<form action="<?php echo @__CONTROLLER__;?>
/insert" method="post">
		<ul class="exec">
			<li>
				<span class='add-text'>用 户 名</span>
				<input type='text' name='username' placeholder='请输入用户名6-12位' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>密 码</span>
				<input type='password' name='password' placeholder='请输入密码6-12位' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>确认密码</span>
				<input type='password' name='repass' placeholder='请再次输入密码' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加管理员" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>