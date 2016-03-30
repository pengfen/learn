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
		#main{
			margin-top:280px; 
		}
	</style>
	<script type="text/javascript">
		$(function(){
			$('#edit_btn').click(function(){
				$.ajax({
					url:$('#edit_url').val(),
			    		data:{username:$('input[name=username]').val(),department:$('input[name=department]').val(),telphone:$('input[name=telphone]').val(),vocation:$('input[name=vocation]').val(),birthday:$('input[name=birthday]').val(),sex:$('input[name=sex]').val() },
			    		type:'post',
			    		success:function(data){
			    		//$('#edit_btn').html(data).attr('disabled',true);
			    		$('#tipmess').html(data).slideDown(500).animate({
			    			top: '+200px'
			    		}, 2000).slideUp(500);
			    		//alert(data);
			    		//location.href = "#";
			    		}
			    							

				})
			})
		})
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
				
	<div id='main'>
		<div class="panel panel-default">
		  <div class="panel-heading">资料编辑</div>
		  <div class="panel-body">
		  	<div class="row">
		  		<div class="col-md-8">
		  			<form>
			  <div class="form-group">
			    <label for="exampleInputEmail1">昵称</label>
			    <input type="text" name='username' value=<?php echo ($user['username']); ?> class="form-control" id="exampleInputEmail1" placeholder="昵称">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail1">所在地</label>
			    <input type="text" name='department' value="<?php echo empty($user['department'])?'未填写':$user['department']?> " class="form-control" id="exampleInputEmail1" placeholder="所在地">
			  </div>
			  <div class="form-group">
		    <label for="exampleInputPassword1">联系方式</label>
		    <input type="text" name='telphone' value="<?php echo empty($user['telphone'])?'未填写':$user['telphone']?> " class="form-control" id="" placeholder="手机号/QQ号">
		  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">职业</label>
			    <input type="text" name='vocation' value="<?php echo empty($user['vocation'])?'未填写':$user['vocation']?> "  class="form-control" id="exampleInputPassword1" placeholder="您现在的社会角色">
			  </div>
			   <div class="form-group">
			    <label for="exampleInputPassword1">生日</label>
			    <input type="text" name='birthday' value="<?php echo empty($user['birthday'])?'未填写':$user['birthday']?> " class="form-control" id="exampleInputPassword1" placeholder="月/日/年">
			    <input type="hidden" value="<?php echo U('User/doedit');?>" id='edit_url' >
			  </div>
			  <div class="radio">
		    <label>
		      <input type="radio" name='sex' value="2" <?php if($user['sex']==2) echo 'checked'?>>男
		    </label>
		     <label>
		      <input type="radio" name='sex' value="1"<?php if($user['sex']==1) echo 'checked'?>>女
		    </label>
		    <label>
		      <input type="radio" name='sex' value="0" <?php if($user['sex']==0) echo 'checked'?>>保密
		    </label>
		  </div>
			  <button type="button" id='edit_btn' class="btn btn-default">确认修改</button>
			</form>
		  		</div>
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