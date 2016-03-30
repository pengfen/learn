<?php /* Smarty version Smarty-3.1.6, created on 2015-06-17 08:39:51
         compiled from "./APP/Home/View\Model\detail.html" */ ?>
<?php /*%%SmartyHeaderCode:289045580c1d7bb2319-10829444%%*/if(!defined('SMARTY_DIR')) exit('no direct access allowed');
$_valid = $_smarty_tpl->decodeProperties(array (
  'file_dependency' => 
  array (
    '2baa570d716bd2ec3da58fb425b58cd6da783e1c' => 
    array (
      0 => './APP/Home/View\\Model\\detail.html',
      1 => 1434427522,
      2 => 'file',
    ),
  ),
  'nocache_hash' => '289045580c1d7bb2319-10829444',
  'function' => 
  array (
  ),
  'variables' => 
  array (
    'ainfo' => 0,
    'content' => 0,
  ),
  'has_nocache_code' => false,
  'version' => 'Smarty-3.1.6',
  'unifunc' => 'content_5580c1d7d7f28',
),false); /*/%%SmartyHeaderCode%%*/?>
<?php if ($_valid && !is_callable('content_5580c1d7d7f28')) {function content_5580c1d7d7f28($_smarty_tpl) {?><!doctype html>
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

		<div class="program w art_detail" >
			<h3><?php echo $_smarty_tpl->tpl_vars['ainfo']->value['title'];?>
</h3>
			<div><?php echo $_smarty_tpl->tpl_vars['content']->value;?>
</div>
			<?php if ($_smarty_tpl->tpl_vars['ainfo']->value['img']){?>
			<img src="<?php echo @__ROOT__;?>
/Public/<?php echo $_smarty_tpl->tpl_vars['ainfo']->value['img'];?>
" />
			<?php }?>
		</div>
    </body>
</html><?php }} ?>