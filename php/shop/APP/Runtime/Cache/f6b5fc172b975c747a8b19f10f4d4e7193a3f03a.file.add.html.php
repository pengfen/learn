<?php /* Smarty version Smarty-3.1.6, created on 2015-06-06 20:19:24
         compiled from "./APP/Admin/View\Role\add.html" */ ?>
<?php /*%%SmartyHeaderCode:104355572e4c4925357-87432208%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'f6b5fc172b975c747a8b19f10f4d4e7193a3f03a' => 
    array (
      0 => './APP/Admin/View\\Role\\add.html',
      1 => 1433593148,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '104355572e4c4925357-87432208',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5572e4c52b0fe',
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5572e4c52b0fe')) {function content_5572e4c52b0fe($_smarty_tpl) {?><!doctype html>
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
				<span class='add-text'>角色名称</span>
				<input type='text' name='name' placeholder='请输入角色名' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加角色" />
			</li>
		</ul>
		</form>

	</body>
</html><?php }} ?>