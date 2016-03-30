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
				
	<div class="container" style="margin-top:250px;">
		<div class='row'>
			<div class="col-md-9">
				 <ul class="nav nav-tabs" role="tablist">
			    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">为你推荐</a></li>
			    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">我的好友</a></li>
			    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">精确查找</a></li>
			    <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">好友请求</a></li>
			  </ul>

			  <!-- Tab panes -->
			  <div class="tab-content container" style="margin:10px 0px;">
			    <div role="tabpanel" class="tab-pane active" id="home">
			    <style type="text/css">
				#recomend,ul{
					list-style:none;
					margin:0;
					padding:0;
				}
				#recomend li{
					float:left;
					padding-right:20px;
				}
				#recomend li ul li{
					float:none;
					
				}
				.userlist{
					width:150px;
					height:220px;
					text-align: center;
					padding-right:10px; 
				}
				.list li{
					float: left;
					padding: 20px 20px 0 0;
				}
			    </style>
			    <ul id='recomend'>
								
			    	<?php if(is_array($list)): $i = 0; $__LIST__ = $list;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li>
			    		<div class="userlist">
			    			<ul>

			    				<li>
			    					<img src='/blog/Avatar/<?php echo ($vo["src"]); ?>'/>
			    				</li>
			    				<input type="hidden" value="<?php echo U('Visitor/addVisitor');?>" id='visitor_url'>
			    				<input type="hidden" value="<?php echo ($vo["id"]); ?>" id='v_<?php echo ($vo["id"]); ?>'>
			    				
			    				<li >
			    				<!--<a href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["id"]); ?>'>-->
			    				<a id='visitor_<?php echo ($vo["id"]); ?>' href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["id"]); ?>'>

			    				<?php echo ($vo["username"]); ?></a>
			    				</li>
			    				
			    				<li><?php echo ($vo["department"]); ?></li>
			    				<input type="hidden" value="<?php echo U('Notice/add');?>" name='h_url'>
			    				<script type="text/javascript">
			    					$(function(){
			    						$('#u_<?php echo ($vo["id"]); ?>').click(function(){
			    							$.ajax({
			    								url:$("input[name=h_url]").val(),
			    								type:'post',
			    								data:{flag:3,uid:<?php echo ($vo["id"]); ?>,sid:<?php echo ($_SESSION['user']['id']); ?>,message:'我想加你为好友'},
			    								success:function(data){
			    									$('#u_<?php echo ($vo["id"]); ?>').html(data).attr('disabled',true);
			    								},
			    							})

			    						})
			    						
			    					})
			    				</script>
			    				<li><button type="button" id='u_<?php echo ($vo["id"]); ?>' class="btn btn-success">
								加为好友
			    				</button>
</li>
			    			</ul>
			    		
			    			
			    		</div>
							
			    		

			    		</li><?php endforeach; endif; else: echo "" ;endif; ?>

			    </ul>
			    </div>
			    <div role="tabpanel" class="tab-pane" id="profile">
			    	<ul class="list">
			    	<?php if(is_array($friendlist)): $i = 0; $__LIST__ = $friendlist;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li><div class="userlist">
			    		<input type="hidden" id='del_url' value="<?php echo U('Friend/delFriend');?>">
			    					<?php if($vo['head_img'] == '' ): ?><img src='/blog/Avatar/default.jpg'/>

			    						<a id='visitor_<?php echo ($vo["id"]); ?>' href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["uid"]); ?>'>

			    				<?php echo ($vo["username"]); ?></a>

			    					<?php else: ?>
			    						<img src='/blog/Avatar/<?php echo ($vo["head_img"]); ?>'/>

			    						<a id='visitor_<?php echo ($vo["id"]); ?>' href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["uid"]); ?>'>

			    				<?php echo ($vo["username"]); ?></a><?php endif; ?>
			    					<button id='delfriend_<?php echo ($vo["uid"]); ?>' class="btn btn-success" >解除好友关系</button>
			    					</div>
			    					<script type="text/javascript">
			    						$(function(){
			    							$('#delfriend_<?php echo ($vo["uid"]); ?>').click(function(){
			    								$.ajax({
			    									url:$('#del_url').val(),
			    									data:{uid:<?php echo ($vo["uid"]); ?> },
			    									type:'post',
			    									success:function(data){
			    										$('#delfriend_<?php echo ($vo["uid"]); ?>').html(data).attr('disabled',true);
			    									}
			    							
			    								})
			    							})
			    						})
			    					</script>
			    		</li><?php endforeach; endif; else: echo "" ;endif; ?>
			    	</ul>
			    </div>
<!--找人-->
				<style type="text/css">
					#search_result{
						border: 1px solid #ccc;
						background: #fff;
						width: 500px;
						height: 400px;
						margin: 25px;
					}
				</style>
				<div role="tabpanel" class="tab-pane" id="messages">
			    <div class="row">
			    	<div class="col-md-4">
			    		  <div class="form-group">
							    <label for="exampleInputEmail1">用户名</label>
							    <input type="text" name='username' class="form-control" id="exampleInputEmail1" placeholder="输入您要查找的用户名">
							  </div>
							  <div class="form-group">
							    <label for="exampleInputPassword1">地区</label>
							    <input type="text" name='department' class="form-control" id="exampleInputPassword1" placeholder="输入地区名称或所在单位">
							  </div>
							   <div class="form-group">
							    <label for="exampleInputPassword1">职业</label>
							    <input type="text" class="form-control" name='vocation' id="exampleInputPassword1" placeholder="输入您所要查找的职业">
							  </div>
							 
							  <input type="hidden" value="<?php echo U('User/search');?>" name='s_url'>
							  <button type="button" id='search' class="btn btn-default">搜索</button>
			    	</div>
			    	<script type="text/javascript">
			    	//获取所有的图片
					var imgs = document.getElementsByTagName('img');
					//遍历(处理第一次没有上传图片)
					for (var i = 0; i < imgs.length; i ++) {
						imgs[i].onerror = function(){
						    this.src = "/blog/Avatar/default.jpg";
						}
					}
			    		$(function(){

			    			$('#search').click(function(){
			    				$.ajax({
			    					url:$("input[name=s_url]").val(),
			    					type:'post',
			    					
			    					data:{username:$("input[name=username]").val(),
			    						  department:$("input[name=department]").val(),
			    						  vocation:$("input[name=vocation]").val()},
			    					success:function(data){
			    						$("#result").val(data);
			    						var data = eval(data);
							    		$("#s_result").css('display','block');
										$("#headimg").attr('src','/blog/Avatar/'+data[0].head_img);
										$("#username_li").html(data[0].username);
										$("#department_li").html(data[0].department);
										$('#f_href').attr('href','/blog/index.php/Home/User/myhome/id/'+data[0].id);
										$('#s_id').val(data[0].id);

			    					},
			    					
			    				
			    				})
			    			})
			    		})
			    	</script>
			    	<div class="col-md-6">
			    
			    	<style type="text/css">
						#s_result{
							display:none;
							height: 300px;
							width: 300px;
							padding: 50px;
						}
			    	</style>
			    	<input type="hidden" id='result'>
			    		<div id="search_result">
			    			<div id='s_result'>
			    				<ul>
			    				<input type="hidden" id='s_id' >
			    					<li ><a href="" id='f_href'><img id='headimg' src=''></a></li>
			    					<li id='username_li'></li>
			    					<li id='sex_li'></li>
			    					<li id='department_li'></li>
			    					<button id='s_addfriend' type="button" >加为好友</button>
			    				</ul>
								<script type="text/javascript">
			    					$(function(){
			    						$('#s_addfriend').click(function(){
			    							$.ajax({
			    								url:$("input[name=h_url]").val(),
			    								type:'post',
			    								data:{flag:3,uid:$('#s_id').val(),sid:<?php echo ($_SESSION['user']['id']); ?>,message:'我想加你为好友'},
			    								success:function(data){
			    									$('#s_addfriend').html(data).attr('disabled',true);
			    								},
			    							})

			    						})
			    						
			    					})
			    				</script>

			    			</div>
			    		</div>
			    	</div>
			    </div>




			    </div>
<!--找人结束-->
			    <div role="tabpanel" class="tab-pane" id="settings">
			    <div class="row">

			    	<div class="col-md-6">
			    		 <table class="table table-striped" width=400>
			    	<?php if(is_array($msglist)): $i = 0; $__LIST__ = $msglist;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><TBODY>
  							<TR>
  								<td><?php echo ($vo['name']); ?></td>
  								<td><?php echo ($vo["message"]); ?></td>
  								<td><input type="button" id='s_<?php echo ($vo["sid"]); ?>' class="btn btn-success" 
					<?php if($vo[state] == 1): ?>value='已处理' disabled <?php else: ?>value='同意'<?php endif; ?>

					></td>
  							</TR>
  						</TBODY>
					
				
					

					
					<script type="text/javascript">
						$(function(){
										   
										    $('#s_<?php echo ($vo["sid"]); ?>').click(function(){
			    							$.ajax({
			    								url:$("input[name=m_url]").val(),
			    								type:'post',
			    								data:{fid:<?php echo ($vo["sid"]); ?>,nid:<?php echo ($vo["id"]); ?>},
			    								success:function(data){
			    									$('#s_<?php echo ($vo["sid"]); ?>').val(data).attr('disabled',true);
			    								},
			    							})
			    						})
										    
						})
					</script><?php endforeach; endif; else: echo "" ;endif; ?><input type="hidden" value="<?php echo U('Friend/makefriend');?>" name='m_url'>
				</table>
			    	</div>
			    	<div class="col-md-6"></div>
			    </div>

			   
			 
			    </div>
			  </div>
			</div>
			<div class="col-md-3"></div>
				<script type="text/javascript">
			$('#myTabs a').click(function (e) {
			  e.preventDefault()
			  $(this).tab('show')
			})
			
			</script>
			  <!-- Nav tabs -->
			 

	</div>
	</div>


				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>