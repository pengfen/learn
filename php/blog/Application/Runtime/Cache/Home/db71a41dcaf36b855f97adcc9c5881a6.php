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
				

	<div class="container">
		
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8" style="background:#FFFBE4;border:1px solid #F6D8A0;border-top:0px">
				<div class="row" style="height:75px">
					<div class="col-md-12" style="background:#FFFBE4;padding:5px;border:1px solid #F6D8A0;border-bottom:0px">
						<h3 style="font-family:'微软雅黑';font-size:22px">&nbsp;&nbsp;&nbsp;&nbsp;上传资料</h3>
					</div>
			    </div>
				<form action="<?php echo U('Resource/insert');?>" method="post" enctype="multipart/form-data">
					<h3 style="font-family:'微软雅黑';font-size:18px;color:#FF9900;display:inline">&nbsp;&nbsp;&nbsp;资料名称: </h3><input type='input' name='header' style="width:300px;" autofocus>
					<h3 style="font-family:'微软雅黑';font-size:18px;color:#FF9900">&nbsp;&nbsp;&nbsp;资料简介:</h3>
				    <script id='container' name='main' type="text/plain"></script>
				    <div style="margin:5px">
				    <br>
				    <b>分类&nbsp;</b><select name="type">
				    	<option value="文学">文学</option>
				    	<option value="技术">技术</option>
				    	<option value="教育">教育</option>
				    </select>&nbsp;&nbsp;&nbsp;
				     <b>分值&nbsp;</b><select name="score">
				    	<option value="0">0</option>
				    	<option value="2">2</option>
				    	<option value="5">5</option>
				    </select><br/><br/>
				    
					<div style="font-family:'微软雅黑';font-size:18px;color:#FF9900;display:inline">上传资料压缩包: </div>	
						<input type='hidden' name="MAX_FILE_SIZE" value="2000000">
						<input type='file' name='zip' value="上传文件" style='display:inline'>
				    </div>
				    <br/>
				    <button class="btn btn-primary">提交</button>
				</form>
				<script type="text/javascript" charset="utf-8" src="/blog/Public/Home/Js/ueditor.config.js"></script>
				<script type="text/javascript" charset="utf-8" src="/blog/Public/Home/Js/ueditor.all.min.js"></script>
				<script type="text/javascript">
					var ue = UE.getEditor('container');
				</script>

				<div class="row" style="height:45px">
					<div class="col-md-12" style="background:#FFFBE4;padding:5px;">
					</div>
			    </div>

			</div>
			<div class="col-md-2"></div>
			
		</div>
	</div>

				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>