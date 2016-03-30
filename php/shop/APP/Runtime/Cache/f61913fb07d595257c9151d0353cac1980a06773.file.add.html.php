<?php /* Smarty version Smarty-3.1.6, created on 2015-06-06 17:32:47
         compiled from "./APP/Admin/View\Auth\add.html" */ ?>
<?php /*%%SmartyHeaderCode:14334556e5cf90f7660-41246490%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'f61913fb07d595257c9151d0353cac1980a06773' => 
    array (
      0 => './APP/Admin/View\\Auth\\add.html',
      1 => 1433582878,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '14334556e5cf90f7660-41246490',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556e5cf90fb4e',
  'variables' => 
  array (
    'authinfo' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556e5cf90fb4e')) {function content_556e5cf90fb4e($_smarty_tpl) {?><?php if (!is_callable('smarty_function_html_options')) include 'D:\\files\\wamp\\www\\shop\\ThinkPHP\\Library\\Vendor\\Smarty\\plugins\\function.html_options.php';
?><!doctype html>
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
		<ul class="exec">
			<li>
				<span class='add-text'>权限名称</span>
				<input type='text' name='name' placeholder='请输入权限名' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>权限父级</span>
				<select name="pid">
					<option value="0">&nbsp;请选择权限&nbsp;</option>
					<?php echo smarty_function_html_options(array('options'=>$_smarty_tpl->tpl_vars['authinfo']->value),$_smarty_tpl);?>

				</select>
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>权限控制器</span>
				<input type='text' name='cont' placeholder='请输入权限控制器' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'>权限操作方法</span>
				<input type='text' name='action' placeholder='请输入权限操作方法' value="" />
				<span class='error-text'></span>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加权限" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>