<?php /* Smarty version Smarty-3.1.6, created on 2015-06-06 20:07:01
         compiled from "./APP/Admin/View\Role\list.html" */ ?>
<?php /*%%SmartyHeaderCode:7252556dab90c7e093-91624369%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '39dea676d494c33f227579a75a96729146a10843' => 
    array (
      0 => './APP/Admin/View\\Role\\list.html',
      1 => 1433388792,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '7252556dab90c7e093-91624369',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556dab9140a13',
  'variables' => 
  array (
    'mess' => 0,
    'info' => 0,
    'v' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556dab9140a13')) {function content_556dab9140a13($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	    <div class="main-header"><a href="<?php echo @__MODULE__;?>
/Role/add">添加角色</a></div>
		<div class='admin-mess'><?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</div>
	    <ul class="showlist rolelist">
	        <li class="header">
	        	<span>编号</span>
	        	<span>角色名称</span>
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
	        <li>
	        	<!--<span><?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
</span>-->
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->iteration;?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['name'];?>
</span>
	            <span><a href="<?php echo @__CONTROLLER__;?>
/distribute/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
">分配权限</a></span>
	        </li>
	        <?php } ?>
	    </ul>
	</body>
</html><?php }} ?>