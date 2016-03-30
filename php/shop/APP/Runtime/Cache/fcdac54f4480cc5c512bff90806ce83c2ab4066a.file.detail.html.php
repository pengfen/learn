<?php /* Smarty version Smarty-3.1.6, created on 2015-06-12 10:36:07
         compiled from "./APP/Admin/View\Article\detail.html" */ ?>
<?php /*%%SmartyHeaderCode:22469557a438a807f44-32907815%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'fcdac54f4480cc5c512bff90806ce83c2ab4066a' => 
    array (
      0 => './APP/Admin/View\\Article\\detail.html',
      1 => 1434076560,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '22469557a438a807f44-32907815',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557a438a9d8d3',
  'variables' => 
  array (
    'info' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557a438a9d8d3')) {function content_557a438a9d8d3($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class="bgimg">

		<div class="detail">
			<h3><?php echo $_smarty_tpl->tpl_vars['info']->value['title'];?>
</h3>
			<div><?php echo $_smarty_tpl->tpl_vars['info']->value['content'];?>
</div>
		</div>
	</body>
</html><?php }} ?>