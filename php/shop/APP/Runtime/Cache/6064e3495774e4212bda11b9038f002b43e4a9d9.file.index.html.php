<?php /* Smarty version Smarty-3.1.6, created on 2015-06-27 16:06:16
         compiled from "./APP/Home/View\Code\index.html" */ ?>
<?php /*%%SmartyHeaderCode:2721558cb1c9783221-95127459%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '6064e3495774e4212bda11b9038f002b43e4a9d9' => 
    array (
      0 => './APP/Home/View\\Code\\index.html',
      1 => 1435392371,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '2721558cb1c9783221-95127459',
  'function' => 
  array (
  ),
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_558cb1c9b2caf',
  'variables' => 
  array (
    'res' => 0,
  ),
  'has_nocache_code' => false,
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_558cb1c9b2caf')) {function content_558cb1c9b2caf($_smarty_tpl) {?><!doctype html>
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

		<div class="code w">
		    <form action="<?php echo @__SELF__;?>
" method="post">
		    	输入代码
				<textarea cols="50" rows="5" name="code"></textarea>
				<button>提交</button>
		    </form>
		    
			显示结果
			<div><?php echo $_smarty_tpl->tpl_vars['res']->value;?>
</div>
			<div class="clear"></div>
		</div>
    </body>
</html><?php }} ?>