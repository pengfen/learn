<?php /* Smarty version Smarty-3.1.6, created on 2015-06-02 19:05:04
         compiled from "./APP/Admin/View\Index\index.html" */ ?>
<?php /*%%SmartyHeaderCode:17740556d8739bd5aa5-42894102%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '162710adcfa2139fcf3cfb566dd032461d83d696' => 
    array (
      0 => './APP/Admin/View\\Index\\index.html',
      1 => 1433243101,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '17740556d8739bd5aa5-42894102',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556d8739e2772',
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556d8739e2772')) {function content_556d8739e2772($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<frameset rows="76, *, 40" frameborder='0' scrolling='no'>
		<frame src="<?php echo @__MODULE__;?>
/Index/head" scrolling="0"></frame>
		<frameset cols="300, *" frameborder='0'>
			<frame src="<?php echo @__CONTROLLER__;?>
/left"></frame>
			<frame src="<?php echo @__CONTROLLER__;?>
/right" name='main'></frame>
		</frameset>
		<frame src="<?php echo @__CONTROLLER__;?>
/foot"></frame>
	</frameset>
</html><?php }} ?>