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
		<div class="col-md-10">
			<ul class="nav nav-tabs" style="margin:10px;">
              <li  ><a href="<?php echo U('User/myhome');?>">我的动态</a></li>
              <li role="presentation" class='active'><a href='<?php echo U('Mood/index');?>'>说说</a></li>
              <li role="presentation"><a href="<?php echo U('Log/index');?>">日志</a></li>
              <li role="presentation"><a href="<?php echo U('Album/index');?>">相册</a></li>
              <li role="presentation" ><a href="<?php echo U('Message/index');?>">留言板</a></li>
           	  <li role="presentation"><a href="<?php echo U('Resource/index');?>">资料库</a></li>
            </ul>
		</div>
		 <script type="text/javascript">
                  $(function(){
                    $('#issue_mood').click(function(){
                     
                      $.ajax({
                        url:$('#addmood').val(),
                        data:{content:$('#mood_content').val(),uid:<?php echo ($_SESSION['user']['id']); ?>},
                        type:'post',
                        success:function(data){
                                $('#tipmess').html(data).slideDown(500).animate({
					    			top: '+200px'
					    		}, 2000).slideUp(500);
                                //window.location = window.location.href;	
                        }
                       
                      })
                    })
                  })
              </script>
		<div class="col-md-12">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="panel panel-default">
					  <div class="panel-heading">写下现在的心情</div>
					   <input type="hidden" id='addmood' value='<?php echo U('Mood/addMood');?>'>
					  <div class="panel-body">
					    <textarea class="form-control" rows="3" id='mood_content'></textarea>
					    <button class='btn btn-default' style="margin:10px 30px 0 0" id='issue_mood'>发表</button>
					  </div>
				</div>
			</div>
		
		</div>
		<div class="col-md-12">
			<div class="col-md-1"></div>
			<div class="col-md-10">
				<div class="panel panel-default">
					  <div class="panel-heading">全部说说</div>
					  <div class="panel-body">
					  <ul>
					  
					  <script type="text/javascript">
						    		$(function(){
						    			$('.huifu-btn').click(function(){
						    				//alert();
						    				$.ajax({
						    					url:$('#addReview').val(),
						    					type:'post',
						    					data:{uid:$(this).next('input').next('input').val(),content:$(this).parent('span').prev('input').val(),pid:$(this).next('input').val(),rid:$(this).next('input').next('input').val()},
						    					success:function(data){
						    						alert('回复成功！');
						    						window.location = window.location.href;	
						    					}
						    				})
						    			})

						    			$('.huifu-btn-c').click(function(){
						    				$(this).next('input').attr('type','text').attr('placeholder',$(this).prev('input').val());
						    				$(this).next('input').next('button').css('display','block');
						    			})

						    			$('.huifu-btn-d').click(function(){
						    				$.ajax({
						    					url:$('#addReview').val(),
						    					type:'post',
						    					data:{uid:$(this).next().next().val(),rid:$(this).next().val(),content:$(this).prev().val(),pid:$(this).next().next().next().val(),path:$(this).next().next().next().next().val()},
						    					success:function(data){
						    						alert('回复成功！');
						    						window.location = window.location.href;	
						    					}
						    				})
						    			})


						    		})

						    	</script>
						    	 <input type="hidden" id='addReview' value='<?php echo U('Review/addReview');?>'>
					  <?php if(is_array($list)): $i = 0; $__LIST__ = $list;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li>
						    <table class='table table-bordered '>
						    	<tr>
						    		<td rowspan="4" width="60">
						    			<img src="/blog/Avatar/<?php echo ($vo["headimg"]); ?>">
						    		</td>
						    		<td><?php echo ($vo["username"]); ?>: <?php echo ($vo["content"]); ?></td>
						    	</tr>
						    	<tr><td><small style='color:#999'>发表于 <?php echo date('Y-m-d H:i:s',$vo['addtime']);?></small></td></tr>
						    	<tr>
						    		<td>
						    			<ul>
							    			<?php if(is_array($vo['review'])): $i = 0; $__LIST__ = $vo['review'];if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$voc): $mod = ($i % 2 );++$i;?><li>
							    				<table class="table">
							    					<tr><td rowspan="2"><img src="/blog/Avatar/<?php echo ($voc["headimg"]); ?>"></td><td><?php echo ($voc["username"]); ?>: 	<?php echo ($voc["content"]); ?></td></tr>
							    					<tr><td>
							    						<?php echo date('Y-m-d H:i:s',$vo['addtime']);?>
							    						<input type="hidden" class='username' value="回复<?php echo ($voc["username"]); ?>">
							    						 <button class="btn btn-xs btn-default huifu-btn-c" type="button" >回复</button>
							    						 <input type="hidden" > <button class="btn btn-xs btn-default huifu-btn-d" type="button" style="display:none;float:right">发表</button>
														 <input type="hidden"  value='<?php echo ($voc["sender"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($vo["uid"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($voc["id"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($voc["path"]); ?>,<?php echo ($voc["id"]); ?>'>
									         			<ul>
														<?php if(is_array($voc['nr'])): $i = 0; $__LIST__ = $voc['nr'];if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vod): $mod = ($i % 2 );++$i;?><table >
							    					<tr><td rowspan="2"><img src="/blog/Avatar/<?php echo ($vod["headimg"]); ?>"></td><td><?php echo ($vod["username"]); ?>回复<?php echo ($vod["name"]); ?>: <?php echo ($vod["content"]); ?></td></tr>
							    					<tr><td>
							    						<?php echo date('Y-m-d H:i:s',$vo['addtime']);?>
							    						<input type="hidden" class='username' value="回复给<?php echo ($vod["sender"]); ?>">
							    						<input type="hidden" class='username' value="回复给<?php echo ($vod["username"]); ?>">
							    						 <button class="btn btn-xs btn-default huifu-btn-c" type="button" >回复</button>
							    						 <input type="hidden" > <button class="btn btn-xs btn-default huifu-btn-d" type="button" style="display:none;float:right">发表</button>
														 <input type="hidden"  value='<?php echo ($vod["sender"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($vo["uid"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($voc["id"]); ?>'>
									         			<input type="hidden"  value='<?php echo ($voc["path"]); ?>,<?php echo ($voc["id"]); ?>'>
															
															</ul>

							    					</td></tr>
							    					
							    				</table><?php endforeach; endif; else: echo "" ;endif; ?>
														</ul>

							    					</td></tr>
							    					
							    				</table>
							    			</li><?php endforeach; endif; else: echo "" ;endif; ?>
						    			</ul>
						    		</td>
						    	</tr>
						    	
						    	<tr>
						    		<td>
						    			<div class="col-lg-6">
									    <div class="input-group">
									      <input type="text" class="form-control huifu-con" placeholder="我也说一句">
									      <span class="input-group-btn">
									        <button class="btn btn-default huifu-btn" type="button" >发表</button>
									         <input type="hidden" class='pid' value='<?php echo ($vo["id"]); ?>'>
									         <input type="hidden" class='uid' value='<?php echo ($vo["uid"]); ?>'>
									      </span>
									    </div><!-- /input-group -->
									  </div><!-- /.col-lg-6 -->
						    		</td>
								</tr>

						    </table>
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