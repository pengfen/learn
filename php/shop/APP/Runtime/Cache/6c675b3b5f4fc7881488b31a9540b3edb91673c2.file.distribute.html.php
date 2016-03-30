<?php /* Smarty version Smarty-3.1.6, created on 2015-06-06 20:37:33
         compiled from "./APP/Admin/View\Role\distribute.html" */ ?>
<?php /*%%SmartyHeaderCode:22525556db1061db124-04570014%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '6c675b3b5f4fc7881488b31a9540b3edb91673c2' => 
    array (
      0 => './APP/Admin/View\\Role\\distribute.html',
      1 => 1433427461,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '22525556db1061db124-04570014',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556db1061db12',
  'variables' => 
  array (
    'name' => 0,
    'pinfo' => 0,
    'pv' => 0,
    'auth_ids_arr' => 0,
    'sinfo' => 0,
    'sv' => 0,
    'tinfo' => 0,
    'tv' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556db1061db12')) {function content_556db1061db12($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	    <div class="main-header">正在为角色 <span style='color:red;'><?php echo $_smarty_tpl->tpl_vars['name']->value;?>
</span> 分配权限</div>

	    <form action="<?php echo @__SELF__;?>
" method="post">
	    <div class="distribute">
	    	<ul>
		    <?php  $_smarty_tpl->tpl_vars['pv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['pv']->_loop = false;
 $_smarty_tpl->tpl_vars['pk'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['pinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['pv']->key => $_smarty_tpl->tpl_vars['pv']->value){
$_smarty_tpl->tpl_vars['pv']->_loop = true;
 $_smarty_tpl->tpl_vars['pk']->value = $_smarty_tpl->tpl_vars['pv']->key;
?>
		    	<li class='plist'>
		    	    <label>
		    	    	<input type='checkbox' name='authname[]' value="<?php echo $_smarty_tpl->tpl_vars['pv']->value['id'];?>
" <?php if (in_array($_smarty_tpl->tpl_vars['pv']->value['id'],$_smarty_tpl->tpl_vars['auth_ids_arr']->value)){?> checked="checked" <?php }?> /> <?php echo $_smarty_tpl->tpl_vars['pv']->value['name'];?>

		    	    </label>
		    		<ul>
		    		<?php  $_smarty_tpl->tpl_vars['sv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['sv']->_loop = false;
 $_smarty_tpl->tpl_vars['sk'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['sinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['sv']->key => $_smarty_tpl->tpl_vars['sv']->value){
$_smarty_tpl->tpl_vars['sv']->_loop = true;
 $_smarty_tpl->tpl_vars['sk']->value = $_smarty_tpl->tpl_vars['sv']->key;
?>
		    		    <?php if ($_smarty_tpl->tpl_vars['sv']->value['pid']==$_smarty_tpl->tpl_vars['pv']->value['id']){?>
		    		    <li class="slist">
		    		    	<input type='checkbox' name='authname[]' value="<?php echo $_smarty_tpl->tpl_vars['sv']->value['id'];?>
" <?php if (in_array($_smarty_tpl->tpl_vars['sv']->value['id'],$_smarty_tpl->tpl_vars['auth_ids_arr']->value)){?> checked="checked" <?php }?>/> <?php echo $_smarty_tpl->tpl_vars['sv']->value['name'];?>

		    		    	<ul>
	    		    		<?php  $_smarty_tpl->tpl_vars['tv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['tv']->_loop = false;
 $_smarty_tpl->tpl_vars['tk'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['tinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['tv']->key => $_smarty_tpl->tpl_vars['tv']->value){
$_smarty_tpl->tpl_vars['tv']->_loop = true;
 $_smarty_tpl->tpl_vars['tk']->value = $_smarty_tpl->tpl_vars['tv']->key;
?>
	    		    		    <?php if ($_smarty_tpl->tpl_vars['tv']->value['pid']==$_smarty_tpl->tpl_vars['sv']->value['id']){?>
	    		    		    <li class="tlist">
	    		    		    	<input type='checkbox' name='authname[]' value="<?php echo $_smarty_tpl->tpl_vars['tv']->value['id'];?>
" <?php if (in_array($_smarty_tpl->tpl_vars['tv']->value['id'],$_smarty_tpl->tpl_vars['auth_ids_arr']->value)){?> checked="checked" <?php }?>/> <?php echo $_smarty_tpl->tpl_vars['tv']->value['name'];?>

	    		    		    </li>
	    		    		    <?php }?>
	    		    		<?php } ?>
		    		    	</ul>
		    		    </li>
		    		    <?php }?>
		    		<?php } ?>
		    		</ul>
		    	</li>
		    <?php } ?>
		    </ul>
		</div>
		<div class="clear"></div>
		<input type='submit' class="submitbtn disbtn" value="分配权限" />
	    </form>
	    
	</body>
</html><?php }} ?>