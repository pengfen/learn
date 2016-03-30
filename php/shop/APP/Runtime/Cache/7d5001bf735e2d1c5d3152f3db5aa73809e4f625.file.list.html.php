<?php /* Smarty version Smarty-3.1.6, created on 2015-06-12 10:49:21
         compiled from "./APP/Admin/View\Cate\list.html" */ ?>
<?php /*%%SmartyHeaderCode:5685557430f07d37a8-73703331%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '7d5001bf735e2d1c5d3152f3db5aa73809e4f625' => 
    array (
      0 => './APP/Admin/View\\Cate\\list.html',
      1 => 1434077353,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '5685557430f07d37a8-73703331',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557430f1d9089',
  'variables' => 
  array (
    'mess' => 0,
    'info' => 0,
    'v' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557430f1d9089')) {function content_557430f1d9089($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	<div class="main-header"><a href="<?php echo @__MODULE__;?>
/Cate/add/id/0">添加分类</a></div>
	<div class='admin-mess'><?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</div>
	    <ul class="showlist">
	        <li class="header">
	        	<span>编号</span>
				<span>分类名</span>
				<span>父id</span>
				<span>添加时间</span>
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
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['catename'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['pid'];?>
</span>
	            <span><?php echo $_smarty_tpl->tpl_vars['v']->value['addtime'];?>
</span>
	            <span>
	                <a href="<?php echo @__CONTROLLER__;?>
/add/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
">添加子分类</a>
	            	<a href="<?php echo @__CONTROLLER__;?>
/upd/id/<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
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