<?php if (!defined('THINK_PATH')) exit();?> <!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title><?php echo ($title); ?></title>
    <link rel="stylesheet" type="text/css" href="/Public/Home/Css/featured_slider.css"  /> 
	



    <style>
      #reg_form{
      	border: 1px solid #ccc;
      	padding: 20px;
      }
		.error_span{
			font-size:12px;
			color: red;
			padding-left: 20px;
		}
    </style>

    <!-- Bootstrap -->
    <link href="/Public/Bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/Public/Bootstrap/js/jquery-2.1.4.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/Public/Bootstrap/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">

	function formcheck(){
		if($("input[name=email]").val() == ''){
				
				$('#email_error').html ('邮箱不得为空');
				return false;
			}else if(!$("input[name=email]").val().match(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/)) 
			{
				$('#email_error').html ('邮箱格式错误');
				return false;
			}
			else{
				$('#email_error').html ('');
				
			}

			if($("input[name=password]").val() == ''){
				$('#password_error').html ('密码不得为空');
				return false;
			}else if($("input[name=password]").val().length<6||$("input[name=password]").val().length>20){
				$('#password_error').html ('密码长度应介于6-20位');
				return false;
			}else{
				$('#password_error').html ('');
				
			}

			if($("input[name=repassword]").val() != $("input[name=password]").val()){
				$('#repassword_error').html ('两次密码不一致');
				return false;
			}else{
				$('#repassword_error').html ('');
				
			}

			if($("input[name=code]").val()==''){
				$('#code_error').html ('验证码不为空');
				return false;
			}else{
				$('#code_error').html ('');
				
			}
			return true;

	}

	$(function(){
			$("form input[name=email]").blur(function(){

			
			
			if($("input[name=email]").val() == ''){
				
				$('#email_error').html ('邮箱不得为空');
				return false;
			}else if(!$("input[name=email]").val().match(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/)) 
			{
				$('#email_error').html ('邮箱格式错误');
				return false;
			}
			else{
				$('#email_error').html ('');
			}
			
			$.ajax({
				url:$("input[name=h_url]").val(),
				data:{email:$("input[name=email]").val()},
				type:'get',
				success:function(data){
					$('#email_error').html (data);
				},
				
			})

			
		})
		$("form input[name=password]").blur(function(){
		if($("input[name=password]").val() == ''){
				$('#password_error').html ('密码不得为空');
				return false;
			}else if($("input[name=password]").val().length<6||$("input[name=password]").val().length>20){
				$('#password_error').html ('密码长度应介于6-20位');
				return false;
			}else{
				$('#password_error').html ('');
			}

		})

		$("form input[name=repassword]").blur(function(){
		if($("input[name=repassword]").val() != $("input[name=password]").val()){
				$('#repassword_error').html ('两次密码不一致');
				return false;
			}else{
				$('#password_error').html ('');
			}

		})
	}
		)
		

		
	</script>

  </head>

  <body style="padding-top:132px;background:#F1F5F6">
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h2 class="modal-title" id="myModalLabel">用户登录</h2>
      </div>
     
      <div class="modal-body">
       <div class="row">
       		<div class="col-md-2"><span class='error_span' id='login_error'></span></div>
       		<div class="col-md-8">
 <script type="text/javascript">
      		$("#form2:input[name=login_email]").blur(function(){
		alert('邮箱格式错误');

		})
		//登录验证
		function logincheck(){
			login_error.html('qqqqqqqq');
			//if(!$("#form2 input[name=login_email]").val().(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/)){
				//alert('邮箱格式错误');
				return false;
			//}
		}
      </script>
       			<form id='form2' class="form-horizontal" method="post" action="<?php echo U('Login/dologin');?>" onsubmit="return logincheck()">
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
			    <div class="col-sm-10">
			      <input type="email" name='login_email' class="form-control" id="inputEmail3" placeholder="Email">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="inputPassword3"  class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-10">
			      <input type="password" name='login_password' class="form-control" id="inputPassword3" placeholder="Password">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox"> 记住密码
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary" style='background:#f90'>登录</button>
			      <button type="reset" class="btn btn-primary" style='background:#f90;margin-left:20px' >重置</button>
			    </div>
			  </div>
			</form>
       		</div>
       		<div class="col-md-2">
       			

       		</div>
       	
       </div>
        	
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
       
      </div>
    </div>
  </div>
</div>
			</div>
		</div>
	
	</div>


    <nav class=" navbar-fixed-top" style="background:url(/Public/Home/Images/header.jpg);">
	  <div class="container">
	    <img src="/Public/Home/Images/logo.jpg" alt="">
	   
	    <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal" style='background:#fc0;float:right;margin-top:45px;border:0'>
 立即登录
</button> <span style='float:right;margin-top:50px;color:#fff;padding-right:10px;'><b>已有账号 </b></span>
		
	  </div>
	</nav>

	<div class="container" >

		<div class="row">
			<div class="col-md-1"></div>		
			<div class="col-md-2" style="border-left:3px solid #f90;height:650px;"></div>		
			<div class="col-md-6">
			
				<form action=<?php echo U('Register/doregister');?> method="post" id='reg_form' onsubmit="return formcheck()">
					<div class="panel panel-default">
					  <div class="panel-body">
					    <center><h2 style="font-family:'microsoft yahei">注册新帐号 游畅享世界</h2></center>
					  </div>
					</div>
				  <div class="form-group">
				    <label for="exampleInputEmail1"><span class='.glyphicon glyphicon-envelope' style='color:#ccc'></span> 	邮箱<span class='error_span' id='email_error'></span></label>
				    <input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="邮箱地址" >
				    <input type="hidden" value="<?php echo U('Register/checkemail');?>" name='h_url'>
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1"><span class='glyphicon glyphicon-asterisk' style='color:#ccc'></span>新密码<span class='error_span' id='password_error'></span></label>
				    <input type="password" name='password' class="form-control" id="exampleInputPassword1" placeholder="设置密码长度介于6-20位">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputPassword1"><span class='glyphicon glyphicon-asterisk' style='color:#ccc'></span>确认密码<span class='error_span' id='repassword_error'></span></label>
				    <input type="password" name='repassword' class="form-control" id="exampleInputPassword1" placeholder="确认密码">
				  </div>
				  <div class="row">
				  	<div class="col-md-4">
				  		<div class="form-group">
				    <label for="exampleInputPassword1"><span class='glyphicon glyphicon-asterisk' style='color:#ccc'></span>验证码<span class='error_span' id='code_error'></span></label>
				    <input type="text" name='code'  class="form-control" id="exampleInputPassword1" placeholder="">
				  </div>
				  	</div>
				  	<div class="col-md-4" style="padding:20px 0px;"><img src='/index.php/Home/Register/verifyImg' id='img'/>
				  	</div>
				  	<div class="col-md-4" style="padding:30px 0px;">
				  		<a href="javascript:void(0);" onclick="document.getElementById('img').src='/index.php/Home/Register/verifyImg'" ><i>看不清</i></a>
				  	</div>
				  </div>
				  
				  <div class="checkbox">
				    <label>
				      <input type="checkbox" checked> <small style='color:#666'>已阅读畅享协议</small>
				    </label>
				  </div>
				  <button type="submit" class="btn btn-success">立即注册</button>
				</form>
				
			</div>
			<div class="col-md-3">
				<!-- Button trigger modal -->




	<nav class="navbar navbar-default navbar-fixed-bottom" style='background:#f90'>
	  <div class="container">
	    <ul class="list-inline" style="float:right;margin-top:15px; ">
	  	<li><a href="" style="color:#fff">首页</a></li>
	  	<li><a href="" style="color:#fff">资料库</a></li>
	  	<li><a href="" style="color:#fff">公共关注</a></li>
	  	<li><a href="" style="color:#fff">帮助中心</a></li>
	  	
		</ul>
		  </div>
		</nav>


  </body>
</html>