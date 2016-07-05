<?php
header('Content-type:text/html;charset=utf-8');

//开启session
session_start();
///执行退出登陆
unset($_SESSION['username']);

//跳转到首页
header('Location:index.php');