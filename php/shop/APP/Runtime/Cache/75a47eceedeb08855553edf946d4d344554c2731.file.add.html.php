<?php /* Smarty version Smarty-3.1.6, created on 2015-06-07 20:25:08
         compiled from "./APP/Admin/View\Cate\add.html" */ ?>
<?php /*%%SmartyHeaderCode:228565574324236fb66-03145742%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '75a47eceedeb08855553edf946d4d344554c2731' => 
    array (
      0 => './APP/Admin/View\\Cate\\add.html',
      1 => 1433679806,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '228565574324236fb66-03145742',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557432425735e',
  'variables' => 
  array (
    'pid' => 0,
    'path' => 0,
    'catename' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557432425735e')) {function content_557432425735e($_smarty_tpl) {?><!doctype html>
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
		<input type="hidden" name='pid' value="<?php echo $_smarty_tpl->tpl_vars['pid']->value;?>
"/>
		<input type="hidden" name="path" value="<?php echo $_smarty_tpl->tpl_vars['path']->value;?>
"/>
		<ul class="exec">
		    <li>
				<span class='add-text'>添加到</span>
				<span><?php echo $_smarty_tpl->tpl_vars['catename']->value;?>
</span>
			</li>
			<li>
				<span class='add-text'>商品类别</span>
				<input type='text' name='catename' placeholder='请输入您要添加的商品类别' autofocus value="" />
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加商品类别" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>