<?php /* Smarty version Smarty-3.1.6, created on 2016-03-30 21:07:15
         compiled from "./APP/Home/View\Program\index.html" */ ?>
<?php /*%%SmartyHeaderCode:1920557beb1d182218-69800153%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '9d07729308c96afcb5f6c01e8111a7460fcf40cf' => 
    array (
      0 => './APP/Home/View\\Program\\index.html',
      1 => 1457837439,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '1920557beb1d182218-69800153',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_557beb1d3d3ea',
  'variables' => 
  array (
    'cinfo' => 0,
    'cv' => 0,
    'ainfo' => 0,
    'av' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_557beb1d3d3ea')) {function content_557beb1d3d3ea($_smarty_tpl) {?><!doctype html>
<html>
    <head>
    	<meta charset='utf-8'>
    	<title>一号店</title>
        <link rel="stylesheet" type='text/css' href='<?php echo @__ROOT__;?>
/Public/css/font-awesome.min.css'/>
        <link rel="stylesheet" type="text/css" href="<?php echo @__ROOT__;?>
/Public/css/home.css"/>
    </head>
    <body>
        <header>
			<div class="w">
				<div class="topFl fl">
					<div class="hdLogin fl">
						<span>Hi,请</span>
						<a href=''>登录</a>
						<small>/</small>
						<a href=''>注册</a>
						<em><i class='icon-angle-down'></i></em>
					</div>
					<div class="hd"></div>
				</div>
				<div class="topFr fr">
					<span>hi</span> 
					<span style="color:#f00;font-size:16px;font-weight:bold;">
					</span> welcome to here  <small>|</small>
					<a href="">安全退出</a>
					<a href="">个人中心</a>
				</div>
			</div>
		</header>

		<div class="hdNav w mt20">
		<a class='logo' href=''>
		    <img src='<?php echo @__ROOT__;?>
/Public/images/loginlogo.jpg'/>
		</a>
		<div class='fl hdNavFl'>
		    <form class="search" action='/home/goods/all.php#all' method="get">
		    	<i class='icon-search'></i>
		    	<input type="text" placeholder='5.1水果世界纪录日' name='search'/>
		    	<button id='searchBtn'>搜&nbsp;索</button>
		    </form>
		    <div class="keyword">
		        <a href=''>趣多多</a>
		        <a href=''>软抽</a>
		        <a href=''>日本</a>
		        <a href=''>费列罗</a>
		        <a href=''>手帕纸</a>
		        <a href=''>丰胸</a>
		        <a href=''>玉米片</a>
		        <a href=''>休闲食品</a>
		        <a href=''>手机存储卡</a>
		        <a href=''>开心果</a>
		    </div>
		</div>
		<div class="fr hdNavFr">
			<span>福利</span>
			<span><a href='act=order#userc'>订单查询</a></span>
			<span><i class='icon-shopping-cart'></i>&nbsp;<a href='
			'>购物车</a></span>
		</div>
		</div>
		<div class="clear"></div>

		<div class="program w">
			<div class="proFl fl">
				<ul>
				    <?php  $_smarty_tpl->tpl_vars['cv'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['cv']->_loop = false;
 $_smarty_tpl->tpl_vars['ck'] = new Smarty_Variable;
 $_from = $_smarty_tpl->tpl_vars['cinfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['cv']->key => $_smarty_tpl->tpl_vars['cv']->value){
$_smarty_tpl->tpl_vars['cv']->_loop = true;
 $_smarty_tpl->tpl_vars['ck']->value = $_smarty_tpl->tpl_vars['cv']->key;
?>
					<li><a href='<?php echo @__CONTROLLER__;?>
/showlist/id/<?php echo $_smarty_tpl->tpl_vars['cv']->value['id'];?>
'><?php echo $_smarty_tpl->tpl_vars['cv']->value['catename'];?>
</a></li>
					<?php } ?>
				</ul> 
			</div>
			<div class="proFr fr">
			    <?php  $_smarty_tpl->tpl_vars['av'] = new Smarty_Variable; $_smarty_tpl->tpl_vars['av']->_loop = false;
 $_from = $_smarty_tpl->tpl_vars['ainfo']->value; if (!is_array($_from) && !is_object($_from)) { settype($_from, 'array');}
foreach ($_from as $_smarty_tpl->tpl_vars['av']->key => $_smarty_tpl->tpl_vars['av']->value){
$_smarty_tpl->tpl_vars['av']->_loop = true;
?>
				<a href="<?php echo @__CONTROLLER__;?>
/detail/id/<?php echo $_smarty_tpl->tpl_vars['av']->value['id'];?>
"><?php echo $_smarty_tpl->tpl_vars['av']->value['title'];?>
</a>
			    <?php } ?>
			</div>
			<div class="clear"></div>
		</div>
    </body>
</html><?php }} ?>