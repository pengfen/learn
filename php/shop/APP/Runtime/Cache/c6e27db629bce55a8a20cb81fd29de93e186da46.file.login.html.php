<?php /* Smarty version Smarty-3.1.6, created on 2015-06-06 17:09:28
         compiled from "./APP/Admin/View\Manager\login.html" */ ?>
<?php /*%%SmartyHeaderCode:15804556d92322f2ca5-99549558%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    'c6e27db629bce55a8a20cb81fd29de93e186da46' => 
    array (
      0 => './APP/Admin/View\\Manager\\login.html',
      1 => 1433465416,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '15804556d92322f2ca5-99549558',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_556d923242f37',
  'variables' => 
  array (
    'erroruser' => 0,
    'mess' => 0,
    'errorpass' => 0,
    'errorverify' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_556d923242f37')) {function content_556d923242f37($_smarty_tpl) {?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/admin.css">
	</head>
	<body class='bgimg'>
	    <h2>商城管理系统后台登录</h2>
	    <form action="<?php echo @__CONTROLLER__;?>
/checklogin" method="post">
	    	<ul class="login">
				<li>
					<span class='login-text'>用户名</span>
					<input class='login-user' type='text' name='username' placeholder='请输入用户名(5-20位字符)'/>
					<span class='error-text'><?php echo $_smarty_tpl->tpl_vars['erroruser']->value;?>
<?php echo $_smarty_tpl->tpl_vars['mess']->value;?>
</span>
				</li>
				<li>
					<span class='login-text'>密&nbsp;&nbsp;码</span>
					<input class='login-pass' type='password' name='password' placeholder='请输入密码(6-20位字符)'/>
					<span class='error-text'><?php echo $_smarty_tpl->tpl_vars['errorpass']->value;?>
</span>
				</li>
				<li>
					<span class='login-text fl'>验证码</span>
					<input class='login-verify fl' name='code' type='text' size="6" placeholder='输入验证码'/>
					<img class='verify-img fl' src='<?php echo @__CONTROLLER__;?>
/verify' onclick="this.src='<?php echo @__CONTROLLER__;?>
/verify?time='+Math.random()" /> 
					<span class='error-text ml10'><?php echo $_smarty_tpl->tpl_vars['errorverify']->value;?>
</span>
				</li>
				<li>
					<input class="submitbtn" type='submit' value="登 录"/>
				</li>
			</ul>
	    </form>
	</body>
</html><?php }} ?>