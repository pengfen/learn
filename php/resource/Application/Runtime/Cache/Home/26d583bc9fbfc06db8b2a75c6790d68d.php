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
	
<div class="regist-wrap">
    <div class="regist-left fl">
		<ul class="regist-tab">
			<li>邮箱注册<small>|</small></li>
			<li>手机注册</li>
		</ul>
		<form class="regist-form" action="<?php echo U('Login/checkReg');?>" method="post">
			<ul>
				<li class="regist-mail">
					<label>邮&nbsp;&nbsp;&nbsp;&nbsp;箱:</label><input type="text" name="email" placeholder='请输入邮箱地址'/>
				</li>
				<li class="regist-pass">
					<label>设置密码:</label><input type="password" name="password" placeholder='请输入密码'/>
				</li>
				<li class="regist-repass">
					<label>确认密码:</label><input type="password" name="repassword" placeholder='请输入确认密码'/>
				</li>
				<li class="regist-verify">
					<span>验&nbsp;证&nbsp;码:<input type="text" name="code" placeholder='验证码'/></span>
					<!-- <img src="../../common/code.php" id="code" onclick="javascript:this.src='../../common/code.php?tm='+Math.random()" /> -->
					<!--
					<img id='verify-img' src='./code.php'/>
					<a id='verify-a' href="javascript:void(0)">换一张</a>-->
					<img src="/resource/index.php/Home/Login/verify" onclick="javascript:this.src='/resource/index.php/Home/Login/verify?' + (new Date())">
					<div class="clear"></div>
				</li>
				<li class="regist-text">
					点击注册 表示您同意1号店 <a href=''>《服务协议》</a>
				</li>
				<li class="regist-btn">
					<input type='submit' value='注册'/>
				</li>
			</ul>
		</form>
	</div>
	
	<script type="text/javascript" async>
	    $(function(){
	    	$('#verify-a').click(function(){
	    		$('#verify-img').attr('src', './code.php?time=' + Date());
	    	});
	    });
	</script>
	<div class="regist-right fr">
		<div class="error-text">
			<?php
 if (!empty($_GET)){ switch ($_GET['errno']) { case 8: echo '邮箱格式不对'; break; case 3: echo '密码长度不够'; break; case 6: echo '确认密码不一致'; break; case 7: echo '验证码不一致'; break; case 11: echo '用户名已存在'; break; default: break; } } ?>
		</div>
	</div>
	<div class="clear"></div>
</div>

	<div id="simplefooter">
    <a href="" target="_blank">沪ICP备13044278号</a>|<a href=''>合字B1.B2-20130004</a>|<a href="" target="_blank">营业执照</a>
    <p>Copyright © 1号店网上超市 2007-2014，All Rights Reserved</p>
</div>
</body>
</html>