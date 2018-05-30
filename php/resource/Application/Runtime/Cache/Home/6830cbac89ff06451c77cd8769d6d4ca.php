<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><?php echo ($title); ?></title>
	<link rel="stylesheet" type="text/css" href="/resource/Public/Home/Css/index.css"/>
	<script type="text/javascript" src="/resource/Public/Bootstrap/js/jquery-2.1.4.min.js"></script>
	
	
</head>
<body>
	<header>
	    <!-- <div class="fl logo">
	    </div> -->
	    <div class="w">
	    	<ul class="fl nav-left">
			    <li><a href="<?php echo U('Index/index');?>">首页</a></li>
			    <?php echo W('Nav/menu');?>
			</ul>
			<ul class="fr nav-right">
			    <li><a href="<?php echo U('User/index');?>">个人中心</a></li>
			    <?php $user = $_SESSION['user']; if ($user) { echo "<li><a href='javascript:void(0);'>".$user['username']." 欢迎</a></li>"; ?>
			    <li><a href="<?php echo U('Login/logout');?>">退出</a></li>;
			    <?php
 } else { ?>
			    <li><a href="<?php echo U('Login/login');?>">登录</a></li>
			    <li><a href="<?php echo U('Login/reg');?>">注册</a></li>
			    <?php	 } ?>
			</ul>
	    </div>
		
	</header>
	<div class="clear"></div>
	
	<script type="text/javascript">
		// 处理单击
		function click(click){
			click.click(function(){
				var $url = $(this).next('input')[0].value;
				ajax($url);
			});
		}
		function ajax($url){
			// 异步请求
			$.ajax({
				url: $url,
				success: function(data){
					$('#right').text(''); // 清空以前的数据
					$('#right').append(data); // 将对应的模板放进主页显示
				}
			});
		}
	</script>
	
<div class="w mt20">
    <div class="fl mt20" id="uc-silder">
        <div class="uc-info">
            <div class="fl uc-img">
                <img src="/resource/Public/Home/Images/01.jpg" width="100%" height="100%" />
            </div>
            <div class="fl" style="padding: 4px 0px 4px 20px;">
                <div class="uc-name">用户名</div>
                <div class="uc-voc">用户职位</div>
                <div class="uc-set"><a href="<?php echo U('UserSetting/index');?>">用户设置</a></div>
            </div>
        </div>
        <div class="clear"></div>

        <div class="uc-sign">
        	<strong>个人签名</strong>
        </div>
        <div class="fl uc-credit">
            <span>0</span>
            <div>学分</div>
        </div>
        <div class="fl uc-exprience">
        	<span>0</span>
            <div>经验</div>
        </div>
        <div class="clear"></div>
        
        <div class="fl mt20" id="uc-set-silder">
        <?php if(is_array($data)): foreach($data as $key=>$v): ?><a href="javascript:void(0);" class="nav"><?php echo ($v['name']); ?></a>
        <input type="hidden" value="<?php echo U($v['href']);?>"><?php endforeach; endif; ?>
    </div>

    </div>
    <div class="fl mt20" id="uc-content">
    	加载内容
    </div>
</div>

</body>
</html>