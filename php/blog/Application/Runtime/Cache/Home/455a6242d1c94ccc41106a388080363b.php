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
    
	<style type="text/css">
		.main{
		margin-top:235px;
		}
		ul li{
			list-style: none;
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
				
	<div class="main row">
		<div class="col-md-1"></div>
		<div class="col-md-11">
			<ul class="nav nav-tabs" style="margin:10px;">
              <li  ><a href="<?php echo U('User/myhome');?>">我的动态</a></li>
              <li role="presentation"><a href='<?php echo U('Mood/index');?>'>说说</a></li>
              <li role="presentation"><a href="<?php echo U('Log/index');?>">日志</a></li>
              <li role="presentation"><a href="<?php echo U('Album/index');?>">相册</a></li>
              <li role="presentation" class='active'><a href="<?php echo U('Message/index');?>">留言板</a></li>
           
              <li role="presentation"><a href="<?php echo U('Resource/index');?>">资料库</a></li>
            </ul>
		</div>
		<div class="col-md-12">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="panel panel-default">
				  <div class="panel-heading">发表您的留言</div>
				  <div class="panel-body">
				    <textarea class="form-control" rows="3" id='mood_content'></textarea>
				    <button class='btn btn-default' style="margin:10px 30px 0 0" id='leave_message'>留言</button>
				 </div>
				 <input type="hidden" value="<?php echo U('Message/addMessage');?>" id='leave'/>
				 <script type="text/javascript">
					$(function(){
						$('#leave_message').click(function(){
							$.ajax({
								url:$('#leave').val(),
								type:'post',
								data:{content:$('#mood_content').val(),uid:<?php echo ($_SESSION['uid']); ?>},
								success:function(data){
									alert('留言成功');
								}

							})
						})
					})
				</script>

				 <div class="panel panel-default">
				  <div class="panel-heading">留言列表</div>
				  <div class="panel-body">
				  <ul>

				   <?php if(is_array($msglist)): $i = 0; $__LIST__ = $msglist;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li>
				   	<table class="table table-bordered">
				   	<tbody>
				   		<tr><td rowspan ="4" width="100"><div class="col-md-1">

				   			<img src='/blog/Avatar/<?php echo ($vo["headimg"]); ?>'/>
				   		
				   		</div></td>
				   		<td>
				   		<div class="col-md-11">
				   			<a  href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["vid"]); ?>'><?php echo ($vo["username"]); ?></a>
				   		</div></td>
				   		</tr>
				   		<tr><td><?php echo ($vo["content"]); ?></td></tr>
				   		<tr><td><?php echo date('Y-m-d H:i:s',$vo['addtime']);?>
						<button type="button" class="btn btn-default btn-xs" id='recall_<?php echo ($vo["id"]); ?>'>回复</button>
				   		</td></tr>
				   		<tr><td>
				   		
							<?php if(is_array($vo['clist'])): $i = 0; $__LIST__ = $vo['clist'];if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$voc): $mod = ($i % 2 );++$i;?><style type="text/css">
									table td{padding: 5px;}
								</style>
								<table >
								
									<tr><td rowspan="2" width='80'><img src='/blog/Avatar/<?php echo ($voc["headimg"]); ?>'/></td><td>
									<a  href='/blog/index.php/Home/User/myhome/id/<?php echo ($voc["vid"]); ?>'><?php echo ($voc['username']); ?></a>: <?php echo ($voc['content']); ?></td></tr>
									
									<tr><td><?php echo date('Y-m-d H:i:s',$voc['addtime']);?></td></tr>
								</table><?php endforeach; endif; else: echo "" ;endif; ?>
				   			<div style="display:none" id='input_<?php echo ($vo["id"]); ?>'>
				   			<input type="hidden" value="<?php echo U('Message/addChildMessage');?>" id='leavechild_<?php echo ($vo["id"]); ?>'/>
				   			<input type="text"  id='mood_content_c<?php echo ($vo["id"]); ?>' class="form-control" placeholder="Text input" >
							<button type="button" class="btn btn-default btn-xs" id='recallchild_<?php echo ($vo["id"]); ?>'>发表</button>
				   			</div>
				   		</td></tr>
				   		</tbody>
				   	</table>
				   		<script type="text/javascript">
				   			$(function(){
				   				$('#recall_<?php echo ($vo["id"]); ?>').click(function()
				   					{
				   					$('#input_<?php echo ($vo["id"]); ?>').css('display','block');
				   				})

				   				$('#recallchild_<?php echo ($vo["id"]); ?>').click(function()
				   					{
				   					$('#input_<?php echo ($vo["id"]); ?>').css('display','none');
				   					$.ajax({
				   						url:$('#leavechild_<?php echo ($vo["id"]); ?>').val(),
				   						type:'post',
				   						data:{content:$('#mood_content_c<?php echo ($vo["id"]); ?>').val(),pid:<?php echo ($vo['id']); ?>,v_id:<?php echo ($vo['vid']); ?>},
				   						success:function(data){
									alert(data);
								}

				   					})
				   				})
				   			})
				   		</script>
				   		
				   	</li><?php endforeach; endif; else: echo "" ;endif; ?>
				   </ul>
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