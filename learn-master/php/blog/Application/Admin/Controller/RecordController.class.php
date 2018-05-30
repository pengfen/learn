<?php
namespace Admin\Controller;
/**
  * 生活记录后台控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class RecordController extends BaseController{
	/**
	  * 生活记录列表
	*/
	public function index(){
		$id = I('get.id');
		$name = I('get.name');
		$data = D('Record') -> where(array('uid'=>$id)) -> select();
		$this -> assign('info', $data);
		$this -> assign('name', $name);
		$this -> display();
	}
}