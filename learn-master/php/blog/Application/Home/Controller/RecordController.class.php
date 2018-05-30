<?php
namespace Home\Controller;
/**
  * 生活记录控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class RecordController extends HomeController{
	/**
	  * 生活记录列表
	*/
	public function index() {
		$id = $_SESSION['user']['id'];
		$data = D('Record') -> where(array('uid'=>$id)) -> select();
		$this -> assign('title', '生活记录');
		$this -> assign('info', $data);
		$this -> assign('name', $_SESSION['user']['username']);
		$this -> display();
	}
}