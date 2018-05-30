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
      body{
        background: #fff;
      }
      .font_style{
        color: #fff;
      }
      #user_head{
        height:180px;
       
      }
      #shuoshuo{
        margin-top: 10px;
        border: 0px solid #ccc;
        height: 128px;
        padding:5px;
      }
      .myactive{
        background: #9c3;
      }
    </style>
    <link rel="stylesheet" type="text/css" href="/blog/Public/Home/Css/featured_slider.css"  /> 
    <script type='text/javascript' src='/blog/Public/Home/Js/jquery.min.js'></script> 
        <script type="text/javascript"> 
    $(window).load(function() {
        $('#slider').nivoSlider({

        controlNav:false,
            effect:'random', //Specify sets like: 'fold,fade,sliceDown'
            animSpeed:500, //Slide transition speed
        captionOpacity:0.9,
            directionNav:true, //Next &amp; Prev
        controlNav:true, // 1,2,3... navigation
        pauseTime: 3000, // How long each slide will show
        directionNavHide: true,
            pauseOnHover:true //Stop animation while hovering
        });
    });
    </script> 
    <script type='text/javascript' src="/blog/Public/Home/Js/jquery.nivo.slider.js"></script> 


 
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

	
    <div class="" style="margin-top:20px;">
      <div class="featured_slider"> 
      <div id="featured_slider_bg" class="featured_slider_pattern"> 
      <div id="slider-wrapper"> 
        <div id="slider" class="nivoSlider"> 
                <a href="#" title="Featured Slide" target="_blank"><img src="/blog/Public/Home/Images/1.jpg" alt=""  title="来畅享玩冒险"  /> </a> 
                    <a href="#" title="Slide With Caption" target="_blank"><img src="/blog/Public/Home/Images/2.jpg" alt=""  title="来畅享看奇闻 "  /> </a> 
                    <a href="#" title="Aenean sagittis aliquam leo ut aliquet" target="_blank"><img src="/blog/Public/Home/Images/3.jpg" alt=""  title="来畅享品美食"  /> </a> 
                    <a href="#" title="Lorem Ipsum" target="_blank"><img src="/blog/Public/Home/Images/4.jpg" alt=""  title="来畅享看美女"  /> </a>
                  </div> 
                  <div class="slider_border"></div> 
        </div> 
      </div> 
    </div>
 </div> 

 
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<!--main-->
				
<!--banner-->
 
  <!--end banner-->
<style type="text/css">
  #user_head{
       
        width:150px;
        height:150px;
        position:relative;
      }
      #cp{
        border:1px solid #ccc;
        width:150px;
        height:150px;
        background:#fc0;
        position:absolute;
        display:none;
        text-decoration: middle;
        text-align: center;
        padding: 50px 0;
      }
      #head_img{
        position:absolute;
      }

</style>

<script>
    $(function(){
    $('#user_head').mouseenter(function(){
       $('#cp').slideDown().css('z-index',1).css('opacity','0.5');;
    })

     $('#user_head').mouseleave(function(){
       $('#cp').slideUp().css('z-index',1).css('opacity','0.5');;
    })

    })
    
    </script>

      <!--内容 main-->
  <div class="container">
    <div class="row">
      <div class="col-md-2" id='con_left'>
        <div class="row " >
          <div class="col-md-12" id='user_head'>

          <div id="cp"><a href="<?php echo U('Index/headupload');?>" style="color:#000"><b>编辑头像</b></a></div>
          <img src="/blog/Avatar/<?php echo ($src); ?>" alt="..." class="img-circle" id='head_img' width=150/>
          
          </div>
          <div class="col-md-12" style='margin-top:5px;'>
<div class="panel panel-default">
  <div class="panel-heading">经验成长值</div>
  <div class="panel-body">
    <?php echo ($user['experience']); ?>
  </div>
</div>
      </div>
          <style type="text/css">
          .list-group a{
              cursor: pointer;
              text-decoration: none;

          }
          </style>
           <div class="col-md-12" id=''>
              <ul class="list-group">
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-ok-circle"></span>
                 <a href="<?php echo U('User/editInfo');?>">资料编辑</a>
                </li>
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-user"></span>
                  好友动态
                </li>
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-eye-open"></span>
                  与我相关
                </li>
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-thumbs-up"></span>
                 我的收藏
                </li>
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-th-large"></span>
                 应用中心
                </li>
                <li class="list-group-item">
                  <span class="glyphicon glyphicon-heart"></span>
                  特别关心
                </li>
                
              </ul>
           </div>
        </div>
       
      </div>
      <div class="col-md-7">
        <div class="row">
          <div class="col-md-12">
            <ul class="nav nav-tabs">
              <li role="presentation" class="active"><a href="#">新鲜事</a></li>
              <li role="presentation"><a href="<?php echo U('Mood/index');?>">说说</a></li>
              <li role="presentation"><a href="<?php echo U('Log/index');?>">日志</a></li>
              <li role="presentation"><a href="<?php echo U('Album/index');?>">相册</a></li>
              <li role="presentation"><a href="<?php echo U('Message/index');?>">留言板</a></li>
            
              <li role="presentation"><a href="<?php echo U('Resource/index');?>">资料库</a></li>
            </ul>
          </div>
          <div class="col-md-12">
            <div  class="panel panel-default">
            <div class="panel-body">
              <textarea class="form-control" rows="3" id='mood_content'>说点什么吧</textarea>
              <script type="text/javascript">
                  $(function(){
                    $('#btn_shuo').click(function(){
                     
                      $.ajax({
                        url:$('#addmood').val(),
                        data:{content:$('#mood_content').val(),uid:<?php echo ($_SESSION['user']['id']); ?>},
                        type:'post',
                        success:function(data){
                               alert(data);
                        }
                       
                      })
                    })
                  })
              </script></div>
              <div class="panel-footer"> <button type="button" class="btn btn-default btn-sm" id='btn_shuo' >发表</button></div>
             
              <input type="hidden" id='addmood' value='<?php echo U('Mood/addMood');?>'>
            </div>
          </div>

          <div class="col-md-12">
           <div class="panel panel-default" id="friend-dong">
            

          </div>
          </div>

        </div>
        <script type="text/javascript">
            $url = "<?php echo U('Mydong/friend');?>";
            $.ajax({
              url:$url,
              success:function(data){
                $('#friend-dong').html(data);
              }
            });
            
        </script>

        
      </div>
      <div class="col-md-3">
      <div class="row">
        <div class="col-md-12" >
          <div>
            <div class="panel panel-default">
              <div class="panel-heading">最近来访&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 

              <a href="#" class="navbar-link"></a>
              </div>
              <div class="panel-body">
                      <style type="text/css">
                      #visitor {
                        margin-left: -20px;
                      }
                       #visitor li{
                        list-style: none;
                        margin: 0px;
                        float: left;
                        padding: 10px;
                       }
                     </style>
        <ul id='visitor'> 
        <?php if(is_array($vlist)): $i = 0; $__LIST__ = $vlist;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li>
             
              <img src='/blog/Avatar/<?php echo ($vo["head"]); ?>' width="40" /><br>
              <a href='/blog/index.php/Home/User/myhome/id/<?php echo ($vo["visitor"]); ?>'><?php echo ($vo["username"]); ?></a>
          </li><?php endforeach; endif; else: echo "" ;endif; ?>
      </ul>
      </div>
    </div>
          </div>
         
       
        </div>
        <div class="col-md-12" >
          <div class="panel panel-default">
            <div class="panel-heading">站点公告</div>
            <div class="panel-body">
              <ul class="list-group" >
              <?php if(is_array($newslist)): $i = 0; $__LIST__ = $newslist;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li class="list-group-item">
                  <a href="/blog/index.php/Home/News/index/newsid/<?php echo ($vo["id"]); ?>.html"><?php echo ($vo["title"]); ?></a>
                </li><?php endforeach; endif; else: echo "" ;endif; ?>
              </ul>
            </div>
          </div>

        </div>
        </div>

      </div>

    </div>
    
    <nav class="navbar navbar-default navbar-fixed-bottom">
  <div class="container">
    <ul>
      
    </ul>
  </div>
</nav>
  </div>   
  
				<!--end main-->
			</div>
		</div>
	</div>
  
   
  </body>
</html>