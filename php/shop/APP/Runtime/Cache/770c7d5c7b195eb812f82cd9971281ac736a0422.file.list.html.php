<?php /* Smarty version Smarty-3.1.6, created on 2015-06-19 10:21:01
         compiled from "./APP/Admin/View\Article\list.html" */ ?>
<?php /*%%SmartyHeaderCode:30235557a2b74b3d959-61800308%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '770c7d5c7b195eb812f82cd9971281ac736a0422' => 
    array (
      0 => './APP/Admin/View\\Article\\list.html',
      1 => 1434680451,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '30235557a2b74b3d959-61800308',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557a2b75025cc',
  'variables' => 
  array (
    'mess' => 0,
    'info' => 0,
    'v' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557a2b75025cc')) {function content_557a2b75025cc($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	<div class="main-header"><a href="<?php echo @__MODULE__;?>
/Acticle/add"></a></div>
	<div class='admin-mess'><?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</div>
	    <ul class="showlist">
	        <li class="header">
	        	<span>编号</span>
				<span>作者</span>
				<span>标题</span>
				<span>日期</span>
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
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['uid'];?>
</span>
	            <span><a href="<?php echo @__CONTROLLER__;?>
/detail/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
"><?php echo $_smarty_tpl->tpl_vars['v']->value['title'];?>
</a></span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['addtime'];?>
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