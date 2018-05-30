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
		.album{
			position:relative;
		}
		.content{
			position:absolute;
			background-color:rgba(153,204,51,0.8);
			color:#fff;
			left:0px;
			bottom:60px;
			width:243px;
			height:25px;
			margin-left:20px;
			font-family: 'Microsoft YaHei';
			cursor:pointer;
		}
	</style>
	<script>
		$(function(){   //相册封面上的动画效果
			$('.album').mouseenter(function(){
				if($(this).parent().next().next('div').is(':animated')){
					return;
				}
				$(this).parent().next().next('div').animate({
					'height':'85px',
				},500);
				 $(this).parent().next().next('div').children('p').css({display:'block'});

			}).mouseleave(function(){
				$(this).parent().next().next('div').animate({
					'height':'25px',
				},200);
				 $(this).parent().next().next('div').children('p').css({display:'none'});
				 $(this).parent().next().next('div').children('p').filter(':first').css({display:'block'});
			});


			//点击相册异步显示照片
			$('.thumbnail').click(function(){
				$id=$(this).next().val();
				$url="<?php echo U('Photo/index');?>";
				$.ajax({
					url:$url,
					data:{'id':$id},
					success:function(html){
						$('.albums').text('');
					    $('.albums').append(html);
					}
				});
			});	

			//修改照片的弹框
			$('.thumbnail').next().next().next('a').click(function(){
				$(this).next().css({display:'block'});
			})

			//异步修改相册封面
			// $('.thumbnail').next().next().next('a').click(function(){
			// 	$url="<?php echo U('Album/edit');?>";
			// 	$id=$(this).siblings('input').val();
			// 	$.ajax({
			// 		url:$url,
			// 		data:{'id':$id},
			// 		success:function(html){
			// 			alert(html);
			// 		}
			// 	})
			// })

			//上传图片异步展示编辑页
			// $('.insertphoto').click(function(){
				
			// 	$url=$('#photoform').attr('action');
			// 	  alert($('#photoform').serialize());
			// 	 alert($url);

				// $.ajax({
				// 	url:$url,
				// 	type:"POST",
			 //        data:$('#myform').serialize(),
				// 	success:function(data){
				// 		$('.albums').append("<div>"+data['album_name']+'::'+data['des']+"</div>");
				// 	}
				// });
			// })


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
				
	<div style="background:#F5EFD3;padding:20px;">
		<div class="row" style="margin-top:60px;">
			<!-- Button trigger modal -->
			<button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">
			  上传照片
			</button>

			<!-- Modal 上传照片-->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			  <div class="modal-dialog" role="document">
			    <div class="modal-content">
			    <form action="<?php echo U('Photo/insert');?>" id="photoform" method="post" enctype="multipart/form-data">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        <h4 class="modal-title" id="myModalLabel">上传图片</h4>
			      </div>
			      <div class="modal-body">
			           <!--start-->
			        
						<div class="row">
							<div class="col-md-12" style="height:50px;background:#F9F2F4;">
								选择相册: 

								<select name="aid" id="sel" style="margin-top:10px;">
									<?php if(is_array($data)): $i = 0; $__LIST__ = $data;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><option value="<?php echo ($vo["id"]); ?>"> &nbsp;&nbsp;<?php echo ($vo["album_name"]); ?> &nbsp;&nbsp;	
										</option><?php endforeach; endif; else: echo "" ;endif; ?>
								</select>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12" style="height:50px;">
								<div style="display:inline">上传照片: </div><input type='file' name='photo_name' multiple='true' style="display:inline">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12" style="height:50px;">
								<div>图片描述: </div>
								<textarea name='photo_des' style="width:200px;height:50px;"></textarea>
							</div>
						</div>

			           <!--end-->
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			        <button type="submit" class="btn btn-primary">确定</button>
			      </div>
			      </form>
			    </div>
			  </div>
			</div><!--Modal end-->

			<!-- Button trigger modal -->
			<button type="button" class="btn btn-warning btn-lg" data-toggle="modal" data-target="#mModal">
			  创建相册
			</button>

			<!-- Modal 相册-->
			<div class="modal fade" id="mModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			 <form  action="<?php echo U('Album/insert');?>" method="post" id="myform">
			  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">创建相册</h4>
				      </div>
				      <div class="modal-body">
		
				      		<table height='200' style="margin-left:40px">
				      			<tr>
				      				<td width='80' style="text-align:right">相册名称：</td>
				      				<td width='200'><input type='text' name="album_name"></td>
				      				<td width='200'></td>
				      			</tr>
					        	<tr>
					        		<td style="text-align:right">相册描述：</td>
					        		<td>
					        			<textarea clos='200' rows='2' name="des"></textarea>
					        		</td>
					        		<td></td>
					        	</tr>
					        	<tr>
					        		<td style="text-align:right">分类：</td>
					        		<td>
					        			<select name="class">
					        				<option value="z">最爱</option>
					        				<option value="r">人物</option>
					        				<option value="f">风景</option>
					        				<option value="y">游记</option>
					        				<option value="k">卡通</option>
					        				<option value="s">生活</option>
					        				<option value="q">其他</option>
					        			</select>
					        		</td>
					        		<td></td>
					        	</tr>
					        	<tr>
					        		<td style="text-align:right">访问权限：</td>
					        		<td>
					        			<select name="power">
					        				<option value="0">所有人可见</option>
					        				<option value="1">好友可见</option>
					        				<option value="2">仅自己可见</option>
					        			</select>
					        		</td>
					        		<td></td>
					        	</tr>
				        	</table>
				        
				      </div>
				      <div class="modal-footer">
				         <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				         <button type="submit" class="btn btn-primary" id="give">确定</button>
				      </div>
				    </div>
				
			  </div>
			  </form>
			</div><!--Modal end-->
								          
		</div>
		<div class="row albums" style="margin-top:30px; background">
		  <?php if(is_array($data)): $i = 0; $__LIST__ = $data;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><div class="col-xs-6 col-md-3">
			    <a href="javascript:void(0)" class="thumbnail">
			      <img class="album" data-src="holder.js/100%*180" src="/blog/Uploads/<?php echo ($vo["first"]); ?>" alt="相册" data-holder-rendered="true" style="height:180px;width:100%;display:block;">
			    </a>
			    <input type='hidden' value="<?php echo ($vo["id"]); ?>">
			    <div class="content">
			    	<p>&nbsp;相册名: <?php echo ($vo["album_name"]); ?></p>
			    	<p style="display:none;">&nbsp;描述: <?php echo ($vo["des"]); ?></p>
			    	<p style="display:none;">&nbsp;浏览数: <?php echo ($vo["scan"]); ?></p>
			    </div>
			    <a href='javascript:void(0)' class='btn' data-toggle='popover' data-placement='top'>修改封面</a>
			    <div class="popover fade top in" style="top:-58px;left:58.5px;display:none;">
			    	<div class='arrow'></div>
			    	<h3 class='popover-title'>选择照片</h3>
					<div class='popover-content'>
						<form action="<?php echo U('Album/edit');?>" method='post' enctype="multipart/form-data">
							<input type='file' name='first'>
							<input type='hidden' value="<?php echo ($vo["id"]); ?>" name='id'>
							<button type="submit" class="btn btn-primary"> 上传</button>
						</form>
					</div>
			    </div>
			  </div><?php endforeach; endif; else: echo "" ;endif; ?>    
		</div>

				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>