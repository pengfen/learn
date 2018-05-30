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
	
<div class="w">
	<div class="fl mt20" id="uc-set-silder">
	    <?php if(is_array($data)): foreach($data as $key=>$v): ?><a href="javascript:void(0);" class="nav"><?php echo ($v['name']); ?></a>
	    <input type="hidden" value="<?php echo U($v['href']);?>"><?php endforeach; endif; ?>
	</div>
    <div class="fl mt20" id="right">
    	<div class="user-info">
    	    <div>
    	        <span>呢称</span>
    	        <input class="username"  type="text" name='username' placeholder="请输入你的名字" value="<?php echo ($info["username"]); ?>" />
    	    </div>
    	    <div>
    	        <span>职位</span>
    	        <select name="vocation" class="vocation">
                    <option value="0">请选择你的职位</option>   
                </select>
    	    </div>
    	    <div>
    	        <span>城市</span>
    	        <select name="province" class="province">
                    <option value="0">选择省份</option>   
                </select>
                <select name="city" class="city">
                    <option value="0">选择城市</option>   
                </select>
                <select name="area" class="area">
                    <option value="0">选择区县</option>   
                </select>
    	    </div>
    	    <div>
    	        <span>性别</span>
    	        <input type="radio" name="sex" value="0"/> 保密
                <input type="radio" name="sex" value="1"/> 男
                <input type="radio" name="sex" value="2"/> 女
    	    </div>
            <div>
                <span>个性签名</span>
                <textarea></textarea>
            </div>
    	    <div>
    	        <span></span>
    	        <input class="addbtn" type="submit" value="保 存" style="background: #39b94e; color: #fff; font-size: 16px; font-weight: bold;" />
    	    </div>
    	</div>
    </div>
</div>
<script type="text/javascript">
	click($('.nav')); // 异步调用
</script>

</body>
</html>