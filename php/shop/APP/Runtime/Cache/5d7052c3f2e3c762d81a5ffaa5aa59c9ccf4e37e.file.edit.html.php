<?php /* Smarty version Smarty-3.1.6, created on 2015-06-07 10:37:42
         compiled from "./APP/Admin/View\Manager\edit.html" */ ?>
<?php /*%%SmartyHeaderCode:16375573ac4fbfdf14-57478507%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '5d7052c3f2e3c762d81a5ffaa5aa59c9ccf4e37e' => 
    array (
      0 => './APP/Admin/View\\Manager\\edit.html',
      1 => 1433644654,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '16375573ac4fbfdf14-57478507',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5573ac4fd5d86',
  'variables' => 
  array (
    'info' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5573ac4fd5d86')) {function content_5573ac4fd5d86($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class="bgimg">

		<form action="<?php echo @__CONTROLLER__;?>
/upd/id/<?php echo $_smarty_tpl->tpl_vars['info']->value['id'];?>
" method="post">
		<ul class="exec">
			<li>
				<span class='add-text'>用 户 名</span>
				<input type='text' name='username' placeholder='请输入用户名6-12位' value="<?php echo $_smarty_tpl->tpl_vars['info']->value['username'];?>
" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>旧 密 码</span>
				<input type='password' name='oldpass' placeholder='请输入旧密码6-12位' />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>新密码</span>
				<input type='password' name='pass' placeholder='请输入新密码6-12位' />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>确认密码</span>
				<input type='password' name='repass' placeholder='请输入确认密码6-12位'  />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="修改资料" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>