<?php /* Smarty version Smarty-3.1.6, created on 2015-06-07 16:22:17
         compiled from "./APP/Admin/View\Log\add.html" */ ?>
<?php /*%%SmartyHeaderCode:283465573fee7c9f8b7-04591856%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'a0ceb2089fecab2d35812ae8812adac35b79879f' => 
    array (
      0 => './APP/Admin/View\\Log\\add.html',
      1 => 1433665327,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '283465573fee7c9f8b7-04591856',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5573fee8008ed',
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5573fee8008ed')) {function content_5573fee8008ed($_smarty_tpl) {?><!doctype html>
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
				<span class='add-text'>标题</span>
				<input type='text' name='tit' placeholder='请输入标题' />
			</li>
			<li>
				<span class='add-text'>提问者</span>
				<input type='prob' name='text' value="" />
			</li>
			<li style="height:200px;">
				<span class='add-text' style='vertical-align:middle'>内容</span>
				<textarea cols="60" rows="10" name="content"></textarea>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加文章" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>