<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><?php echo ($title); ?></title>
    <link href="/blog/Public/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/blog/Public/Home/Js/jquery-2.1.4.min.js"></script>
    <script src="/blog/Public/Bootstrap/js/bootstrap.min.js"></script>
    <style type="text/css">
		body{
			background: url('/blog/Public/Home/Images/bg.jpg') repeat-x;
			background-position:10px 50px;
			background-color:#F1E9D6;
		}
    </style>
    
	<style>
		ul{
			list-style: none;
		}
	</style>
	<script type="text/javascript">
		$(function(){
			//光告轮播
			setInterval(function(){
				$('.Jsimg li:last').prependTo('.Jsimg').show().siblings('li').hide();
			},1500);

			//异步加载主体内容
			click($('#liter'));
			click($('#tech'));
			click($('#edu')); 
			function click(click){
				click.click(function(){
					$url=$(this).next('input')[0].value;
					ajax($url);
				})
			}
			function ajax($url){
				$.ajax({
					url:$url,
					success:function(html){
						$('.mains').html('');
						$('.mains').append(html);
					}
				})
			}

			//异步搜索
			$('.selects').blur(function(){
				// alert('hello');
				$url="<?php echo U('Resource/selects');?>";
				$val=$(this).val();
				$.ajax({
					url:$url,
					data:{val:$val},
					success:function(data){
						alert(data);
					}
				});

			});


		});
	</script>

  </head>
  <body >
   <!--header-->
    <nav class="navbar navbar-default navbar-fixed-top" id='head' style='background-color:#f90;color: #fff;' style="position:relative">
      <div class="container-fluid container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand " href="<?php echo U('Index/index');?>" style='color:#fff;'><b>畅享世界</b></a>
        </div>
        <script type="text/javascript">
        $(function(){
           $('#mynav .nav_li').mouseover(function(){
           	 $(this).css('background','#9c3').siblings().css('background','#f90');

          //alert('ok');
         
        })
           $('#mynav #<?php echo ACTION_NAME;?>').css('background','#9c3');
           	
        })
       
        </script>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        
          <ul class="nav navbar-nav" id='mynav'>
            <li class="nav_li" id='index'><a href="<?php echo U('Index/index');?>" style='color:#fff;font-size:bloder'><b>个人中心 </b><span class="sr-only">(current)</span></a></li>
            <li class="nav_li" id='resource'><a href="<?php echo U('Resource/index');?>" style='color:#fff'><b>资料交易 </b></a></li>
            <li class="nav_li" id='searchfriend'><a href="<?php echo U('Friend/searchfriend');?>" style='color:#fff'><b>找好友</b></a></li>
             <li class="nav_li" id='myhome'><a href="<?php echo U('User/myhome');?>"  style='color:#fff'><b>我的主页</b></a></li>
             <!--
            <li class="dropdown nav_li"  id='myhome'>
              <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style='color:#fff'><b></b> <span class="caret"></span></a>
              
              <ul class="dropdown-menu" >
                <li><a href="<?php echo U('Say/index');?>">说说</a></li>
                <li><a href="<?php echo U('Log/index');?>">日志</a></li>
                <li><a href="<?php echo U('Album/index');?>">相册</a></li>
                <li><a href="<?php echo U('Message/index');?>">留言</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="<?php echo U('Resource/index');?>">我的资料库</a></li>
                <li role="separator" class="divider"></li>
           
              </ul>
            </li>-->
          </ul>
          
          <!-- <form class="navbar-form navbar-left" role="search" action="<?php echo U('Search/index');?>">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="用户/应用/动态">
            </div>
            <button type="submit" class="btn btn-default">搜索</button>
          </form> -->
          <ul class="nav navbar-nav navbar-right">
           <li><a style="color:#fff"><b>欢迎你<?php echo $_SESSION['user']['username']?></b></a></li>
            <li><a href="<?php echo U('Login/logout');?>" style='color:#fff'><b>退出</b></a></li>
           
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style='color:#fff'><b>设置</b> <span class="caret"></span></a>
              <ul class="dropdown-menu">
                
                <li><a href="<?php echo U('User/auth');?>">权限设置</a></li>
                <li><a href="<?php echo U('User/edit');?>">修改资料</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="Index/help">帮助中心 </a></li>
              </ul>
            </li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
      <div id="tipmess" style="width:100px; height:100px; line-height: 100px; text-align:center; color:#fff; border-radius: 50px; background: pink; box-shadow: 0px 0px 10px red; position: absolute; left:600px; top 500px; z-index:5; display:none;">添加成功</div>
    </nav>  

	
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<!--main-->
				
	<div class='container' style='margin-top:80px'>
		<div class='row'>
			<div class='col-md-2 left'>
				<div class="list-group">
				  <a href="javascript:void(0)" class="list-group-item active" style="background:#99CC33;border:1px solid #86B729">
				    分类列表
				  </a>
				  <a href="javascript:void(0)" class="list-group-item" id='liter'>文学</a>
				  <input type='hidden' value="<?php echo U("Resource/literature");?>">
				  <a href="javascript:void(0)" class="list-group-item" id='tech'>技术</a>
				  <input type='hidden' value="<?php echo U("Resource/technology");?>">
				  <a href="javascript:void(0)" class="list-group-item" id='edu'>教育</a>
				  <input type='hidden' value="<?php echo U("Resource/education");?>">
				  <a href="<?php echo U('Resource/add');?>" class="list-group-item">共享我的资料</a><br>
				  &nbsp;分类中搜索<input class="selects" type='text' placeholder="输入关键字">
				</div>
			</div>
			<div class='col-md-7 mains' style='background:#FFFBE4;border-top:3px solid #99CC33;height:1000px'>

				<!--主体开始-->
				<script type="text/javascript">
						function load($id){	
						    var $url="<?php echo U('Resource/download');?>";
							$.ajax({
								url:$url,
								data:{id:$id},
								success:function(demo){
									if(demo){
										var path=$('#test').attr('data')+'/Uploads/'+demo;
										location.href = path;
									 	 // alert(demo);
									 }else{
									 	alert('您的积分不够，请分享资源！');	 
									 }	
								}
							});
						}
					</script>
					<div id='test' data="/blog"></div>
					<h1 class="label label-success">高下载量</h1><br/><br/>
					<?php if(is_array($data)): $i = 0; $__LIST__ = $data;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><div class="panel panel-success">
							<div class="panel-heading">
								<h3 class="panel-title">题目：<?php echo ($vo["header"]); ?>
									&nbsp;&nbsp;<span class="badge"><?php echo ($vo["score"]); ?></span> 
									<small><span>&nbsp;&nbsp;&nbsp;&nbsp;分享者:<?php echo ($vo["username"]); ?> &nbsp; 分享时间:<?php echo date('Y-m-d',$vo['addtime']);?> &nbsp;下载: <?php echo ($vo["download"]); ?> 次</span></small>
								</h3>
							</div>
							<div class="panel-body">
								简介：<?php echo htmlspecialchars_decode($vo['main']);?>
								<nav>
								  <ul class="pager" style="margin:0px">  
								    <li class="next"><a><button onclick="load(<?php echo ($vo["id"]); ?>)">下载 <span aria-hidden="true">&rarr;</span></button></a></li>
								  </ul>
								</nav>
							</div>
						</div><?php endforeach; endif; else: echo "" ;endif; ?>
					<center>
						<nav>
							<ul class="pagination">
								<li>
									<a href="#" aria-label="Previous">
										<span aria-hidden="true"><<</span>
									</a>
								</li>
								<li>
									<a href="#">1</a>
								</li>
								<li>
									<a href="#">2</a>
								</li>
								<li>
									<a href="#">3</a>
								</li>
								<li>
									<a href="#">4</a>
								</li>
								<li>
									<a href="#" aria-label="Next">
										<span aria-hidden="true">>></span>
									</a>
								</li>
							</ul>
						</nav>
					</center>

				<!--主体结束-->
			</div>
	    <div class='col-md-3'>
	   		<div>
	   			<ul class='Jsimg' style="padding-left:0px;">
	   				<li style="display:block">
	   					<img src='/blog/Public/Home/Images/resource/r1.jpg'>
	   				</li >
	   				<li>
	   					<img src='/blog/Public/Home/Images/resource/r2.jpg'>
	   				</li>
	   				<li>
	   					<img src='/blog/Public/Home/Images/resource/r3.jpg'>
	   				</li>
	   				<li>
	   					<img src='/blog/Public/Home/Images/resource/r4.jpg'>
	   				</li>
	   			</ul>
			</div>
	   </div>
	</div>
 </div>

				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>