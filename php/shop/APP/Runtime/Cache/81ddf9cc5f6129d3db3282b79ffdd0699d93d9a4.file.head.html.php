<?php /* Smarty version Smarty-3.1.6, created on 2015-06-02 19:04:24
         compiled from "./APP/Admin/View\Index\head.html" */ ?>
<?php /*%%SmartyHeaderCode:15018556d89d748ba08-42816654%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '81ddf9cc5f6129d3db3282b79ffdd0699d93d9a4' => 
    array (
      0 => './APP/Admin/View\\Index\\head.html',
      1 => 1433242892,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '15018556d89d748ba08-42816654',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556d89d775a6b',
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556d89d775a6b')) {function content_556d89d775a6b($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>后台管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class="bg">
		<h1>商城后台管理系统</h1>
		<ul class="topbar fr">
			<li><a href='<?php echo @__MODULE__;?>
/Manager/logout' target='_parent'>安全退出</a></li>
			<li><small>|</small></li>
			<li><a href="../power/edit.php" target="main">个人设置</a></li>
		</ul>
	</body>
</html><?php }} ?>