<?php /* Smarty version Smarty-3.1.6, created on 2015-06-05 09:51:29
         compiled from "./APP/Admin/View\Index\left.html" */ ?>
<?php /*%%SmartyHeaderCode:7427556d89d7c1d3d4-61424530%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '1d768e67b17da95930e29510246738c4a825d9eb' => 
    array (
      0 => './APP/Admin/View\\Index\\left.html',
      1 => 1433469086,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '7427556d89d7c1d3d4-61424530',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556d89d7d4df1',
  'variables' => 
  array (
    'pinfo' => 0,
    'pv' => 0,
    'sinfo' => 0,
    'sv' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556d89d7d4df1')) {function content_556d89d7d4df1($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body bgcolor="#004288">
		<ul class="menu">
	    <?php  $_smarty_tpl->tpl_vars['pv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['pv']->_loop = false;
 $_smarty_tpl->tpl_vars['pk'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['pinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['pv']->key => $_smarty_tpl->tpl_vars['pv']->value){
$_smarty_tpl->tpl_vars['pv']->_loop = true;
 $_smarty_tpl->tpl_vars['pk']->value = $_smarty_tpl->tpl_vars['pv']->key;
?>
		    <li class="block">
			    <a href="../power/index.php?name=权限管理" target="main"><small class='show'>+</small><small class='hidden'>-</small><?php echo $_smarty_tpl->tpl_vars['pv']->value['name'];?>
</a>
			    <ul class="box">
			    <?php  $_smarty_tpl->tpl_vars['sv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['sv']->_loop = false;
 $_smarty_tpl->tpl_vars['sk'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['sinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['sv']->key => $_smarty_tpl->tpl_vars['sv']->value){
$_smarty_tpl->tpl_vars['sv']->_loop = true;
 $_smarty_tpl->tpl_vars['sk']->value = $_smarty_tpl->tpl_vars['sv']->key;
?>
			        <?php if ($_smarty_tpl->tpl_vars['sv']->value['pid']==$_smarty_tpl->tpl_vars['pv']->value['id']){?>
			        	<li>
			        		<a href="<?php echo @__MODULE__;?>
/<?php echo $_smarty_tpl->tpl_vars['sv']->value['cont'];?>
/<?php echo $_smarty_tpl->tpl_vars['sv']->value['action'];?>
" target="main"><small>></small><?php echo $_smarty_tpl->tpl_vars['sv']->value['name'];?>
</a>
			        	</li>
			        <?php }?>
			    <?php } ?>
		    	</ul>
			</li>
		<?php } ?>
		</ul>
	</body>
</html><?php }} ?>