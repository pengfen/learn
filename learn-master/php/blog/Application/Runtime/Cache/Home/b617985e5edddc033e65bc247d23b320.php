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
				
	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/blog/Public/Home/css/jquery.Jcrop.min.css" media="all">
<link rel="stylesheet" type="text/css" href="/blog/Public/Home/js/uploadify-v3.1/uploadify.css" media="all">
<script type="text/javascript" src="/blog/Public/Home/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/blog/Public/Home/js/uploadify-v3.1/jquery.uploadify-3.1.min.js"></script>
<script type="text/javascript" src="/blog/Public/Home/js/jquery.Jcrop.min.js"></script>
<script type="text/javascript" src="/blog/Public/Home/js/ThinkBox/jquery.ThinkBox.js"></script>
<link rel="stylesheet" type="text/css" href="/blog/Public/Home/js/ThinkBox/css/ThinkBox.css" media="all">
<title>头像上传示例</title>
<style type="text/css">
.main{
	margin: 0 auto;
	padding: 15px;
	width: 750px;
	font-family: "microsoft yahei";
	background-color: #F5F5F5;
}
.cf:before,.cf:after {
	display: table;
	content: "";
	line-height: 0;
}
.cf:after {
	clear: both;
}
.cf {
	*zoom: 1;
}
.upload-area {
	position: relative;
	float: left;
	margin-right: 30px;
	width: 200px;
	height: 200px;
	background-color: #F5F5F5;
    border: 2px solid #E1E1E1;
}
.upload-area .file-tips {
	position: absolute;
	top: 90px;
	left: 0;
    padding: 0 15px;
    width: 170px;
    line-height: 1.4;
    font-size: 12px;
	color: #A8A8A3;
    text-align: center;
}
.userup-icon {
    display: inline-block;
    margin-right: 3px;
    width: 16px;
    height: 16px;
    vertical-align: -2px;
	background: url("/blog/Public/Home/img/userup_icon.png") no-repeat;
}
.uploadify-button {
	line-height: 120px!important;
	text-align: center;
}
.preview-area {
	float: left;
}
.tcrop {
    clear: right;
    font-size: 14px;
    font-weight: bold;
}
.update-pic .crop {
    background: url("/blog/Public/Home/img/mystery.png") no-repeat scroll center center #EEEEEE;
    float: left;
    margin-bottom: 20px;
    margin-top: 10px;
    overflow: hidden;
}
.crop100 {
    height: 100px;
    width: 100px;
}
.crop60 {
    height: 60px;
    margin-left: 20px;
    width: 60px;
}
.update-pic .save-pic {
    clear: left;
    margin-right: 20px;
}
.update-pic .uppic-btn {
    background-color: #348FD4;
    color: #FFFFFF;
    display: block;
    float: left;
    font-size: 16px;
    height: 30px;
    line-height: 30px;
    text-align: center;
    vertical-align: middle;
    width: 89px;
}
.preview {
	position: absolute;
	top: 0;
	left: 0;
	z-index: 11;
	width: 200px;
	height: 200px;
	overflow: hidden;
	background:#fff;
	display: none;
}
</style>


<div class="main" style="margin-top:300px;">
<!-- 修改头像 -->
<form action="<?php echo U('Index/cropImg');?>" method="post" id="pic" class="update-pic cf">
	<div class="upload-area">
		<input type="file" id="user-pic">
		<div class="file-tips">支持JPG,PNG,GIF，图片小于1MB，尺寸不小于100*100,真实高清头像更受欢迎！</div>
		<div class="preview hidden" id="preview-hidden"></div>
	</div>
	<div class="preview-area">
		<input type="hidden" id="x" name="x" />
		<input type="hidden" id="y" name="y" />
		<input type="hidden" id="w" name="w" />
		<input type="hidden" id="h" name="h" />
		<input type="hidden" id='img_src' name='src'/>
		<div class="tcrop">头像预览</div>
		<div class="crop crop100"><img id="crop-preview-100" src="" alt="" width="100%"></div>
		<div class="crop crop60"><img id="crop-preview-60" src="" alt="" width="100%"></div>
		<a class="uppic-btn save-pic" href="javascript:;">保存</a>
		<a class="uppic-btn reupload-img" href="javascript:$('#user-pic').uploadify('cancel','*');">重新上传</a>
	</div>
</form>
<!-- /修改头像 -->

<!-- 展示头像 -->
<div style="margin: 20px 0 10px;">
	<h2>原头像：</h2>
	<div style="margin-bottom: 10px;">
		<span style="vertical-align: top">原始图片：</span>
		<img style="max-width: 850px;" src="/blog/Avatar/<?php echo ($_SESSION['user']['id']); ?>avatar.jpg" alt='你并没有上传头像' title="临时图片"/>
	</div>
	<div>
		<span style="vertical-align: top">裁切图片：</span>
		<img src="/blog/Avatar/<?php echo ($_SESSION['user']['id']); ?>avatar_250.jpg" alt='你并没有上传头像' title="250*250"/>
		<img src="/blog/Avatar/<?php echo ($_SESSION['user']['id']); ?>avatar_150.jpg" alt='你并没有上传头像' title="150*150"/>
		<img src="/blog/Avatar/<?php echo ($_SESSION['user']['id']); ?>avatar_40.jpg" alt='你并没有上传头像' title="40*40"/>
	</div>
</div>
<!-- /展示头像 -->
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
		//上传头像(uploadify插件)
		$("#user-pic").uploadify({
			'queueSizeLimit' : 1,
			'removeTimeout' : 0.5,
			'preventCaching' : true,
			'multi'    : false,
			'swf' 			: '/blog/Public/Home/js/uploadify-v3.1/uploadify.swf',
			'uploader' 		: '<?php echo U("Index/uploadImg");?>',
			'buttonText' 	: '<i class="userup-icon"></i>上传头像',
			'width' 		: '200',
			'height' 		: '200',
			'fileTypeExts'	: '*.jpg; *.png; *.gif;',
			'onUploadSuccess' : function(file, data, response){
				//调试语句
				console.log(data);

				var data = $.parseJSON(data);
				if(data['status'] == 0){
					$.ThinkBox.error(data['info'],{'delayClose':3000});
					return;
				}
				var preview = $('.upload-area').children('#preview-hidden');
				preview.show().removeClass('hidden');
				//两个预览窗口赋值
				$('.crop').children('img').attr('src',data['path']+'?random='+Math.random());
				//隐藏表单赋值
				$('#img_src').val(data['path']);
				//绑定需要裁剪的图片
				var img = $('<img />');
				preview.append(img);
				preview.children('img').attr('src',data['path']+'?random='+Math.random());
				var crop_img = preview.children('img');
				crop_img.attr('id',"cropbox").show();
				var img = new Image();
				img.src = data['path']+'?random='+Math.random();
				//根据图片大小在画布里居中
				img.onload = function(){
					var img_height = 0;
					var img_width = 0;
					var real_height = img.height;
					var real_width = img.width;
					if(real_height > real_width && real_height > 200){
						var persent = real_height / 200;
						real_height = 200;
						real_width = real_width / persent;
					}else if(real_width > real_height && real_width > 200){
						var persent = real_width / 200;
						real_width = 200;
						real_height = real_height / persent;
					}
					if(real_height < 200){
						img_height = (200 - real_height)/2;
					}
					if(real_width < 200){
						img_width = (200 - real_width)/2;
					}
					preview.css({width:(200-img_width)+'px',height:(200-img_height)+'px'});
					preview.css({paddingTop:img_height+'px',paddingLeft:img_width+'px'});
				}
				//裁剪插件
				$('#cropbox').Jcrop({
		            bgColor:'#333',   //选区背景色
		            bgFade:true,      //选区背景渐显
		            fadeTime:1000,    //背景渐显时间
		            allowSelect:false, //是否可以选区，
		            allowResize:true, //是否可以调整选区大小
		            aspectRatio: 1,     //约束比例
		            minSize : [100,100],//可选最小大小
		            boxWidth : 200,		//画布宽度
		            boxHeight : 200,	//画布高度
		            onChange: showPreview,//改变时重置预览图
		            onSelect: showPreview,//选择时重置预览图
		            setSelect:[ 0, 0, 100, 100],//初始化时位置
		            onSelect: function (c){	//选择时动态赋值，该值是最终传给程序的参数！
			            $('#x').val(c.x);//需裁剪的左上角X轴坐标
			            $('#y').val(c.y);//需裁剪的左上角Y轴坐标
			            $('#w').val(c.w);//需裁剪的宽度
			            $('#h').val(c.h);//需裁剪的高度
		          }
		        });
				//提交裁剪好的图片
				$('.save-pic').click(function(){
					if($('#preview-hidden').html() == ''){
						$.ThinkBox.error('请先上传图片！');
					}else{
						//由于GD库裁剪gif图片很慢，所以长时间显示弹出框
						$.ThinkBox.success('图片处理中，请稍候……',{'delayClose':30000});
						$('#pic').submit();
					}
				});
				//重新上传,清空裁剪参数
				var i = 0;
				$('.reupload-img').click(function(){
					$('#preview-hidden').find('*').remove();
					$('#preview-hidden').hide().addClass('hidden').css({'padding-top':0,'padding-left':0});
				});
		     }
		});
		//预览图
		function showPreview(coords){
			var img_width = $('#cropbox').width();
			var img_height = $('#cropbox').height();
			  //根据包裹的容器宽高,设置被除数
			  var rx = 100 / coords.w;
			  var ry = 100 / coords.h;
			  $('#crop-preview-100').css({
			    width: Math.round(rx * img_width) + 'px',
			    height: Math.round(ry * img_height) + 'px',
			    marginLeft: '-' + Math.round(rx * coords.x) + 'px',
			    marginTop: '-' + Math.round(ry * coords.y) + 'px'
			  });
			  rx = 60 / coords.w;
			  ry = 60 / coords.h;
			  $('#crop-preview-60').css({
			    width: Math.round(rx * img_width) + 'px',
			    height: Math.round(ry * img_height) + 'px',
			    marginLeft: '-' + Math.round(rx * coords.x) + 'px',
			    marginTop: '-' + Math.round(ry * coords.y) + 'px'
			  });
		}
	})

</script>

				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>