<?php /* Smarty version Smarty-3.1.6, created on 2015-07-25 18:55:55
         compiled from "./APP/Admin/View\Auth\list.html" */ ?>
<?php /*%%SmartyHeaderCode:31144556e556ab26480-59688197%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'b6992ee47b4e585a73fd91c21d6e92f1a881c379' => 
    array (
      0 => './APP/Admin/View\\Auth\\list.html',
      1 => 1435068539,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '31144556e556ab26480-59688197',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556e556ad87b1',
  'variables' => 
  array (
    'mess' => 0,
    'info' => 0,
    'v' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556e556ad87b1')) {function content_556e556ad87b1($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	<div class="main-header"><a href="<?php echo @__MODULE__;?>
/Auth/add">添加权限</a></div>
	<div class='admin-mess'><?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</div>
	    <ul class="showlist">
	        <li class="header">
	        	<span>编号</span>
	        	<span>权限名称</span>
	        	<span>控制器</span>
	        	<span>操作方法</span>
	        	<span>全路径</span>
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
	            <span style="text-align:left;color:red;"><?php echo $_smarty_tpl->tpl_vars['v']->value['name'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['cont'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['action'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['path'];?>
</span>
	        </li>
	        <?php } ?>
	    </ul>
	</body>
</html><?php }} ?>