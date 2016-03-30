<?php
    header('Content-type:text/html;charset=utf-8');
    // 制作一个输出调试函数
    // $msg 要打印的内容
    function show_bug($msg){
    	echo "<pre style='color:red'>";
    	var_dump($msg);
    	echo "</pre>";
    }

    // 把当前tp 模式从生成模式(false) 转为开发模式(true 也称为调试模式)
    define('APP_DEBUG', true);
    // 定义应用所有路径(把系统自动在shop 目录下生成的Common Home Runtime目录复制到App 目录下 在App 目录下创建一个Admin目录)
    define('APP_PATH', './APP/');
    // 添加框架核心文件
    include './ThinkPHP/ThinkPHP.php';
    // 添加跳转到首页文件
    //header('location:./Home/index.php');