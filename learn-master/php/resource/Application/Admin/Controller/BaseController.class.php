<?php
namespace Admin\Controller;
use Think\Controller;
/**
  * 控制器基类 
  * 功能: 拦截权限
  * 作者: apeng
  * 时间: 2015-07-31
*/
class BaseController extends Controller{
	function __construct(){
		parent::__construct();

		// 获取当前的请求 如\Manager\index --- CONTROLLER_NAME ---> Manager ACTION_NAME ---> index
		$now_ac = CONTROLLER_NAME.'-'.ACTION_NAME;
		//dump($now_ac);
		// 获取当前角色所拥有的所有权限
		$id = $_SESSION['manager']['id'];
		if ($id) {
			$sql = "select aac from resource_manager a left join resource_role b on a.rid = b.id where a.id='{$id}'";
			$aac = D() -> query($sql);
			$allow_ac = array('Index-index');
			if (!in_array($now_ac, $allow_ac) && $_SESSION['manager']['id'] != 1 && strpos($aac, $now_ac) === false) {
				$this -> error('你没有权限访问', U('Login/login'));
			}
		} else {
			//$this -> error('你没有权限访问', U('Login/login'));
			$this -> redirect('Login/login');
		}
	}

	
}