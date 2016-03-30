<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><?php echo ($title); ?></title>
    <link href="/Public/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/Public/Home/Js/jquery-2.1.4.min.js"></script>
    <script src="/Public/Bootstrap/js/bootstrap.min.js"></script>
    <style type="text/css">
		body{
			background: url('/Public/Home/Images/bg.jpg') repeat-x;
			background-position:10px 50px;
			background-color:#F1E9D6;
		}
    </style>
    
<style type="text/css">
	.main{
	margin-top:235px;
	}
	.btn-log, #write-log, #theme-log {
	  padding: 8px 12px;
	  background: #f90;
	  color: #fff;
	  margin: 10px 5px 10px 0px;
	  border-radius: 6px;
	  display: inline-block;
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
				
	<div class="row main">	
		<div class="col-md-12">
			<ul class="nav nav-tabs" style="margin: 10px 0px">
	          <li  ><a href="<?php echo U('User/myhome');?>">我的动态</a></li>
	          <li role="presentation"><a href='<?php echo U('Mood/index');?>'>说说</a></li>
	          <input id='mood_url' type='hidden' value="<?php echo U('Mood/showMoodListById');?>">
	          <li role="presentation"><a href="<?php echo U('Log/index');?>">日志</a></li>
	          <li role="presentation"><a href="<?php echo U('Album/index');?>">相册</a></li>
	          <li role="presentation"><a href="<?php echo U('Message/index');?>">留言板</a></li>
	          <!-- <li  id='userinfo'><a>个人档</a></li>
	          <input id='userinfo_url' type='hidden' value="<?php echo U('User/info');?>"> -->
	          <li role="presentation"><a href="<?php echo U('Resource/index');?>">资料库</a></li>
	        </ul>
		</div>
		<div class="col-md-12">
			<div class="col-md-3">
				<div class="panel panel-default">
				    <div class="panel-heading">欢迎光临我的空间</div>
				    <div class="panel-body">
				    	<ul class="list-group">
					 	    <li class="list-group-item">
					 	        <?php if($flag != 1): ?><a href="<?php echo U('Log/index');?>">我的日志</a>
			        	        <?php else: ?>
					        	<a href="<?php echo U('Log/index');?>">他的日志</a><?php endif; ?>
					        </li>
					        <?php if($flag != 1): ?><li class="list-group-item">
					        	<a href="<?php echo U('Log/seclist');?>">私密日志</a>
					 	    </li><?php endif; ?>
					 	    <li class="list-group-item">
					 	    	<a href="javascript:void(0);" id="record">生活记录</a>
			        	        <input type="hidden" value="<?php echo U('Record/index');?>"/>
					 	    </li>
					 	    <li class="list-group-item">
					 	    	<?php if($flag != 1): ?><a href="javascript:void(0);" id='friend-log'>好友日志</a>
					        	<?php else: ?>
					        	<a href="javascript:void(0);" id='friend-log'>他的好友日志</a><?php endif; ?>
					        	<input type="hidden" value="<?php echo U('Log/friend');?>"/>
					 	    </li>
					 	    <?php if($flag != 1): ?><li class="list-group-item">
					        	<!-- <a href=''>草稿箱</a> -->
					        	<a href="<?php echo U('Log/trash');?>">回收站</a>
					        	
					 	    </li>
					 	    <li class="list-group-item">
					 	    	<a href="javascript:void(0);" id='advice'>建议</a>
			        	        <input type="hidden" value="<?php echo U('Advice/index');?>"/>
					 	    </li><?php endif; ?>
					    </ul>
				    </div>
		        </div>

		        <div class="panel panel-default">
				<div class="panel-heading">日志分类</div>
					<div class="panel-body">
					
			        <ul class="list-group">
			            <li class="list-group-item" id="cate">
			                <h4>日志分类 
					            <?php if($flag != 1): ?><a href="javascript:void(0);" style="float:right">管理</a>
					            <input type='hidden' value="<?php echo U('LogCate/index');?>"/><?php endif; ?>
					        </h4>
			            </li>
			            <?php if(is_array($list)): foreach($list as $key=>$v): ?><li class="list-group-item">
				    		<?php echo ($v["name"]); ?><span style='float:right;'>(<?php echo ($v["total"]); ?>)</span>
				    	</li><?php endforeach; endif; ?>
			    	</ul>
					</div>  
		        </div>
			</div>
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading"><?php echo ($title); ?></div>
						<div class="panel-body" id="content">
						<?php if($flag != 1): ?><a href='javascript:void(0);' id='write-log'>写日志</a>
				    	<input type="hidden" value="<?php echo U('Log/add');?>"/>
				    	<!-- <a href='javascript:void(0);' id='theme-log'>模板日志</a>
				    	<input type="hidden" value="<?php echo U('Log/theme');?>"/> --><?php endif; ?>
				    	<ul class="list-group">
				    	    <?php if(is_array($log)): foreach($log as $key=>$lv): ?><li class="list-group-item" style="position:relative;list-style:none;">
				    	    <a href="javascript:void(0);" class="detail"><?php echo ($lv["title"]); ?></a><input type="hidden" value="<?php echo U('Log/detail', array('id'=>$lv[id]));?>" /><span style='float:right;'><?php echo date('Y-m-d H:i:s', $lv[addtime]);?> (0/<?php echo ($lv["views"]); ?>) <?php if($flag != 1): ?><a href='javascript:void(0)' class="update">编辑</a><input type="hidden" value="<?php echo U('Log/edit', array('id'=>$lv[id]));?>">
				    		    <a class="dropdown" >
			                    <a href="javascript:void(0)" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style='color:'><b>更多</b> <span class="caret"></span></a>
			                    <ul class="dropdown-menu" style="position:absolute; top:30px; left:538px">
					                <?php if($trash == 1): ?><li><a href="javascripd:void(0)" class="delete-log">删除日志</a><input type="hidden" value="<?php echo U('Log/delete', array('id'=>$lv[id],'trash'=>$trash));?>"/></li>
					                <?php else: ?>
					                <li><a href="javascripd:void(0)" class="delete-log">删除日志</a><input type="hidden" value="<?php echo U('Log/delete', array('id'=>$lv[id]));?>"/></li><?php endif; ?>
					                <li><input type='hidden' value="<?php echo U('Log/updAuth', array('id'=>$lv[cid]));?>"/><a href="javascript:void(0)" class='set-auth'>设置权限</a><input type="hidden" value="<?php echo ($lv["auth"]); ?>"/></li>
					                <li><a href="javascript:void(0)" class="set-cate">修改分类</a><input type="hidden" value="<?php echo U('Log/updCate', array('id'=>$lv[id]));?>" /></li>
					                <li><a href="javascript:void(0)" class='secret-log'>转为私密日志</a><input type='hidden' value="<?php echo U('Log/secret', array('id'=>$lv[id]));?>"/></li>
					              </ul>
			                    </a><?php endif; ?></span>
				    	    </li><?php endforeach; endif; ?>
				    	</ul>
						</div>  
					</div>
				</div>
				<div id='cover' style="position:absolute; left:0px; top:0px; width:100%; height: 100%; background:rgba(0,0,0,0.3); z-index: 1; display:none;">
	            </div>
	            <div id='upd-auth' style="position:absolute; left: 350px; top:200px; width: 482px; height:150px; z-index:2; background:red; display:none; border-radius:6px; padding:20px;">
			        <h3 style="margin: 0px; margin-bottom: 10px;">权限设置</h3>
			        <form id='auth-form' action="1.html">
			        <input type="radio" name='auth' value="0"/> 公开
			        <!-- <input type="radio" name='auth' value="1"/> 好友可见
			        <input type="radio" name='auth' value="2"/> 指定好友可见 -->
			        <input type="radio" name='auth' value="3"/> 仅自己可见<br/>
			        <button class="btn-log">确定</button><button class="btn-log" type="reset">取消</button>
			        </form>
			    </div>
			    <div id='upd-cate' style="position:absolute; left: 350px; top:200px; width: 482px; height:150px; z-index:2; background:red; display:none; border-radius:6px; padding:20px;">
			        <h3>修改分类</h3>
			        <form id='cate-form' action="">
			        <select name='cid'>
			            <?php if(is_array($list)): foreach($list as $key=>$v): ?><option value="<?php echo ($v["id"]); ?>"><?php echo ($v["name"]); ?></option><?php endforeach; endif; ?>
			        </select>
			        <button class="btn-log">确定</button><button class="btn-log" type="reset">取消</button>
			        </form>
			    </div>

			</div>
		</div>
		<script type="text/javascript">
		    $(function(){
		    	$('.set-auth').click(function(){
		    		var $value = $(this).next('input')[0].value; // 获取日志当前权限
		    		// var $str = $value.split('/');
		    		// $value = $str[0];
		    		// var $id = $str[1];
		    		$url = $(this).prev('input')[0].value;
		    		$('#auth-form').attr('action', $url) ;
		    		//alert($url);
		    		$length = $(':input[name=auth]').length; 
		    		for(var i = 0; i < $length; i ++) {
		    			$val = $(':input[name=auth]')[i].value; // 获取选取项中的值
		    			if ($value == $val) {
		    				$(':input[name=auth]')[i].checked = true;
		    			}
		    		}
		    		$('#cover').slideDown(1000);
		    		$('#upd-auth').show();
		    		$(':input[type=reset]').click(function(){
		    			$('#upd-auth').hide();
		    			$('#cover').slideUp(1000);
		    		});
		    	});
		    	$('.set-cate').click(function(){
		    		var $url = $(this).next('input')[0].value; // 获取修改日志分类的操作方法
		    		$('#cate-form').attr('action', $url) ;
		    		$('#cover').slideDown(1000);
		    		$('#upd-cate').show();
		    		$(':input[type=reset]').click(function(){
		    			$('#upd-cate').hide();
		    			$('#cover').slideUp(1000);
		    		});
		    	});
		    	// click($('#userinfo')); // 个人档
		    	click($('#cate a')); // 日志分类管理异步加载
		    	click($('#write-log')); // 写日志异步加载
		    	click($('#theme-log')); // 模板日志异步加载
		    	click($('.update')); // 编辑日志
		    	click($('.delete-log')); // 删除日志
		    	click($('.secret-log')); // 转换为私密日志
		    	click($('.detail')); // 日志详情
		    	click($('#friend-log')); // 好友日志
		    	click($('#record')); // 生活记录
		    	click($('#advice')); // 建议列表
		    	function click(click){
		    		click.click(function(){
		    			$url = $(this).next('input')[0].value;
		    		    ajax($url);
		    		});
		    	}
		    	function ajax($url){
		    		$.ajax({
		    			url:$url,
		    			success:function(data){
		    				$('#content').text('');
		    				$('#content').html(data);
		    			}
		    		});
		    	}
		    });
		</script>
	</div>

				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>