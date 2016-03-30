<?php
namespace Home\Controller;
use Think\Controller;
/**
  * 控制器基类 
  * 功能: 拦截权限
  * 作者: apeng
  * 时间: 2015-09-26
*/
class BaseController extends Controller{
	function __construct(){
		parent::__construct();

		// 获取当前session 是否有用户
		$id = $_SESSION['user']['id'];
		if (empty($id)) {
			// 没有权限则跳回登录页面
			$this -> display('Login/login');
		}
	}

}