<?php /* Smarty version Smarty-3.1.6, created on 2015-06-07 10:28:23
         compiled from "./APP/Admin/View\Manager\list.html" */ ?>
<?php /*%%SmartyHeaderCode:312925572f6c5910314-71437111%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '6a654d4c2ab34a38cab1bffbcc5365db95299621' => 
    array (
      0 => './APP/Admin/View\\Manager\\list.html',
      1 => 1433643902,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '312925572f6c5910314-71437111',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5572f6c5e1183',
  'variables' => 
  array (
    'mess' => 0,
    'info' => 0,
    'v' => 0,
    'reg' => 0,
    'rinfo' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5572f6c5e1183')) {function content_5572f6c5e1183($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	<div class="main-header"><a href="<?php echo @__MODULE__;?>
/Manager/add">添加管理员</a></div>
	<div class='admin-mess'><?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</div>
	    <ul class="showlist">
	        <li class="header">
	        	<span>编号</span>
	        	<span>管理员名字</span>
	        	<span>注册时间</span>
	        	<span>角色</span>
	        	<span>操作</span>
	        </li>
	        <?php  $_smarty_tpl->tpl_vars['v'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['v']->_loop = false;
 $_smarty_tpl->tpl_vars['k'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['info']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
 $_smarty_tpl->tpl_vars['v']->iteration=0;
foreach ($_from as $_smarty_tpl->tpl_vars['v']->key => $_smarty_tpl->tpl_vars['v']->value){
$_smarty_tpl->tpl_vars['v']->_loop = true;
 $_smarty_tpl->tpl_vars['k']->value = $_smarty_tpl->tpl_vars['v']->key;
 $_smarty_tpl->tpl_vars['v']->iteration++;
?>
	        <li class="text">
	            <!--<span><?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
</span>-->
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->iteration;?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['username'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['reg']->value[$_smarty_tpl->tpl_vars['v']->value['id']];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['rinfo']->value[$_smarty_tpl->tpl_vars['v']->value['rid']];?>
</span>
	            <span>
	            	<a href="<?php echo @__CONTROLLER__;?>
/mod/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
">修改</a>
	            	<a href="<?php echo @__CONTROLLER__;?>
/del/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
">删除</a>
	            </span>
	        </li>
	        <?php } ?>
	    </ul>
	</body>
</html><?php }} ?>