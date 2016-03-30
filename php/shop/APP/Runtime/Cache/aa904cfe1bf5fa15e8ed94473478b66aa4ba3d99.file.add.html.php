<?php /* Smarty version Smarty-3.1.6, created on 2015-06-13 17:45:38
         compiled from "./APP/Admin/View\Article\add.html" */ ?>
<?php /*%%SmartyHeaderCode:4222557a33bc2708d0-18890427%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'aa904cfe1bf5fa15e8ed94473478b66aa4ba3d99' => 
    array (
      0 => './APP/Admin/View\\Article\\add.html',
      1 => 1434188694,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '4222557a33bc2708d0-18890427',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557a33bc362c0',
  'variables' => 
  array (
    'cateinfo' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557a33bc362c0')) {function content_557a33bc362c0($_smarty_tpl) {?><?php if (!is_callable('smarty_function_html_options')) include 'D:\\files\\wamp\\www\\shop\\ThinkPHP\\Library\\Vendor\\Smarty\\plugins\\function.html_options.php';
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
/insert" method="post" enctype="multipart/form-data">
		<ul class="exec">
		    <li>
				<span class='add-text'>标题</span>
				<input type='text' name='title' placeholder='请输入标题' />
			</li>
			<li>
				<span class='add-text'>所属分类</span>
				<select name='pid'>
					<?php echo smarty_function_html_options(array('options'=>$_smarty_tpl->tpl_vars['cateinfo']->value),$_smarty_tpl);?>

				</select>
			</li>
			<li style="height:200px;">
				<span class='add-text' style='vertical-align:middle'>内容</span>
				<textarea cols="60" rows="10" name="content"></textarea>
			</li>
			<li>
				<span class='add-text'>上传图片</span>
				<input type='file' name='image'/>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加文章" />
			</li>
		</ul>
		</form>
	</body>
</html><?php }} ?>