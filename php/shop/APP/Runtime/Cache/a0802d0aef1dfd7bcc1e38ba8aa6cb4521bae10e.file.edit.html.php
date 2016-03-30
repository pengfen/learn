<?php /* Smarty version Smarty-3.1.6, created on 2015-06-19 10:42:01
         compiled from "./APP/Admin/View\Article\edit.html" */ ?>
<?php /*%%SmartyHeaderCode:285555837c8fba3f07-53011316%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'a0802d0aef1dfd7bcc1e38ba8aa6cb4521bae10e' => 
    array (
      0 => './APP/Admin/View\\Article\\edit.html',
      1 => 1434681634,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '285555837c8fba3f07-53011316',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_55837c8fc441b',
  'variables' => 
  array (
    'info' => 0,
    'cateinfo' => 0,
    'v' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_55837c8fc441b')) {function content_55837c8fc441b($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class="bgimg">

		<form action="<?php echo @__CONTROLLER__;?>
/upd" method="post" enctype="multipart/form-data">
		<input type='hidden' name='id' value="<?php echo $_smarty_tpl->tpl_vars['info']->value['id'];?>
">
		<ul class="exec">
		    <li>
				<span class='add-text'>标题</span>
				<input type='text' name='title' placeholder='请输入标题' value="<?php echo $_smarty_tpl->tpl_vars['info']->value['title'];?>
" />
			</li>
			<li>
				<span class='add-text'>所属分类</span>
				<select name='pid'>
				    <?php  $_smarty_tpl->tpl_vars['v'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['v']->_loop = false;
 $_smarty_tpl->tpl_vars['k'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['cateinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['v']->key => $_smarty_tpl->tpl_vars['v']->value){
$_smarty_tpl->tpl_vars['v']->_loop = true;
 $_smarty_tpl->tpl_vars['k']->value = $_smarty_tpl->tpl_vars['v']->key;
?>
				    <option value="<?php echo $_smarty_tpl->tpl_vars['v']->value['id'];?>
" <?php if (!isset($_smarty_tpl->tpl_vars['v']) || !is_array($_smarty_tpl->tpl_vars['v']->value)) $_smarty_tpl->createLocalArrayVariable('v');
if ($_smarty_tpl->tpl_vars['v']->value['id'] = $_smarty_tpl->tpl_vars['info']->value['pid']){?>selected<?php }?>><?php echo $_smarty_tpl->tpl_vars['v']->value['catename'];?>
</option>
				    <?php } ?>
				</select>
			</li>
			<li style="height:200px;">
				<span class='add-text' style='vertical-align:middle'>内容</span>
				<textarea cols="60" rows="10" name="content"><?php echo $_smarty_tpl->tpl_vars['info']->value['content'];?>
</textarea>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加文章" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>