<?php
namespace Admin\Controller;
/**
  * 好友后台控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class FriendController extends BaseController{
	/**
	  * 好友列表
	*/
	public function index(){
		$id = I('get.id');
		$name = I('get.name');
		$data  = D('Friend') -> where(array('uid'=>$id)) -> getField('fidlist');
		if ($data) {
			$map = ltrim($data, ',');
			$map = "id in (".$map.")";
			$info = D('User') -> where($map) -> getField('username', true);
			$this -> assign('info', $info);
		}
		$this -> assign('name', $name);
		$this -> display();
	}
}