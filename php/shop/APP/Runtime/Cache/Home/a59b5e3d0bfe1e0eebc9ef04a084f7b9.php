<?php if (!defined('THINK_PATH')) exit();?><!doctype html>
<html>
    <head>
    	<meta charset='utf-8'>
    	<title>一号店</title>
        <link rel="stylesheet" type='text/css' href='<?php echo ($smarty["const"]["/shop"]); ?>/Public/css/font-awesome.min.css'/>
        <link rel="stylesheet" type="text/css" href="<?php echo ($smarty["const"]["/shop"]); ?>/css/home.css"/>
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
	    <img src='/loginlogo.jpg'/>
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

	<div class="navHead w mt20">
	<div class="all-product">
		<a href=''>所有商品分类<i class='icon-angle-down fr'></i></a>
	</div>
	<ul class="hd-nav">
	    <li><a href='' style="color:#ff3c3c;">首页</a></li>
	    <li><a href='' style="color:#ff3c3c;">自营超市</a></li>
	    <li><a href='' style="color:#ff3c3c;">1号团</a></li>
	    <li><a href=''>1号商城</a></li>
	    <li><a href=''>闪购</a></li>
	    <li><a href=''>活色生鲜</a></li>
	    <li><a href=''>医药</a></li>
	    <li><a href=''>1号钱包</a></li>
	    <li><a href=''>软件技术</a></li>
	</ul>
	</div>
	<div class="clear"></div>
    </body>
</html>