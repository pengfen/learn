<?php if (!defined('THINK_PATH')) exit();?><!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="/resource/Public/Home/Css/style.css">
		<link rel="stylesheet" type="text/css" href="/resource/Public/Home/Css/font-awesome.min.css">
	    <script type="text/javascript" src='/resource/Public/Home/Js/jquery.js'></script>
	    
	    
	</head>
	<body bgcolor="#fafafa">
	<div class='reg-log'>
		<div class="w log">
			<div class="topFl">
				<!-- <a href="<?php ?>/home/index.php">
					<img width="145" src='<?php ?>/home/include/images/loginlogo.jpg'/>
				</a> -->
				<a href="<?php echo U('Index/index');?>">
					<img width="145" src='/resource/Public/Home/Images/loginlogo.jpg'/>
				</a>
			</div>
			<div class="topFr fr">
				<span class='fl'>你好,欢迎光临1号店!<a href="<?php echo U('Login/login');?>">请登录<a></span>
				<div class='fl' id='help-center'>帮助中心<i class='icon-caret-down'></i>
				    <div class="menu-list">
	                    <ul>
	                        <li><a href="">包裹跟踪</a></li>
	                        <li><a href="">常见问题</a></li>
	                        <li><a href="">在线退换货</a></li>
	                        <li><a href="">在线投诉</a></li>
	                        <li><a href="">配送范围</a></li>
	                    </ul>
	                </div>
				</div>
		    </div>
		</div>
		 <script type="text/javascript" async>
		    $(function(){
		    	$('#help-center').hover(
		    		function(){
		    			$('#help-center').css('border', '1px solid #dfdfdf').css('border-bottom', 'none');
		    			$('.menu-list').css('display', 'block').css('border-top', 'none');
		    		},
		    		function(){
		    			$('#help-center').css('border', 'none');
		    			$('.menu-list').css('display', 'none');
		    		}
		    	);
		    });
		 </script>
	</div>
	
<div class="w content">
    <div class='admin-success'>
	<!-- 回馈信息 -->
	</div>
	<img src="/resource/Public/Home/Images/CgQDslU95J6AT-nqAAC5aJ07N3Q55000.jpg"/>
	
	<div class="contFr fr">
	<form action="<?php echo U('Login/checkLogin');?>" method="post">
	    <div class="login-user">
	        <em class='icon-github-alt'></em>
	        <!-- 邮箱/手机/用户名 -->
	    	<input type='text' autofocus name='username' placeholder='请输入您的邮箱/用户名'/>
	    </div>
		<div class="login-pass">
			<em class='icon-key'></em>
			<input type='password' name='password' placeholder='请输入密码'/>
		</div>
		<em class='user-login'>1号店用户登录</em>
		<em class='icon-sort-up decor-up'></em>
		<a class='user-regist' href="<?php echo U('Login/reg');?>">注册新账号</a>
		<button class="loginBtn">登&nbsp;录</button>
	</form>

	<div class='error-text'>
	<!-- 错误回显 -->
	</div>
	</div>
		
	</div>
	<div class="clear"></div>

	<div id="simplefooter">
    <a href="" target="_blank">沪ICP备13044278号</a>|<a href=''>合字B1.B2-20130004</a>|<a href="" target="_blank">营业执照</a>
    <p>Copyright © 1号店网上超市 2007-2014，All Rights Reserved</p>
</div>
</body>
</html>