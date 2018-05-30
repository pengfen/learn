<?php if (!defined('THINK_PATH')) exit();?><!--author:lishuo time:2015-7-29-->
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link rel="icon" href="">
    <script src="/Public/Bootstrap/js/jquery-2.1.4.min.js"></script>
    <link href="/Public/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="/Public/Bootstrap/js/bootstrap.min.js"></script>
    <script src="/Public/ie-emulation-modes-warning.js"></script> 
    <style>
        .container{
            margin-top:100px;
            float:left;
            position:absolute;
            top:10px;
            left:100px;
        }
        .formbg{
            background:#999;
            padding:38px;
            border:8px solid #eee;
        }
        #bgimg{
            width:1170px;
            height:800px;
            margin:auto auto;
            opacity: 0.6;
        }
    </style>
    <title>后台登陆页</title>
  </head>
  <body>
    <img src="/Public/Admin/Images/bg3.jpg" id='bgimg'>
    <div class="container">
      <div class='row'>
        <div class='col-md-3'></div>
        <div class='col-md-5 formbg'>
          <form class="form-signin" action="<?php echo U('Login/doLogin');?>" method='post'>
                 
            <label for="inputEmail" class="sr-only">用户名/Email</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="请输入邮箱" required="" autofocus="" name="email">
            <label for="inputPassword" class="sr-only">密码</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="请输入密码" required="" name="password">
            <div class="checkbox">
              <label>
                <input type="checkbox" value="remember-me">记住我
              </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">登 &nbsp;录</button>
          </form>
          </div>
          <div class='col-md-4'></div>
      </div>
    </div> <!-- /container -->
</body></html>