<?php

/**
 *作者：陈；
 *功能：前台控制基类
 *时间：7.28
 **/
namespace Home\Controller;
use Think\Controller;

class HomeController extends Controller {
    
    public function _initialize(){
    	if(empty($_SESSION['user'])){
    		$this->redirect('Register/register');
    	}
    }
    
    public function _empty(){
        $this->display('Layout/404');
    }
}