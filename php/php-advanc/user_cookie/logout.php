<?php
header('Content-type:text/html;charset=utf-8');

///执行退出登陆
//把cookie 中的username 设置为过期
setcookie('username', '', time()-1, '/');

//跳转到首页
header('Location:index.php');