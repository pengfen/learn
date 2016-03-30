<?php
namespace Admin\Controller;
use Think\Controller;
/**
  * 非空控制器
  * 作者: apeng
  * 时间: 2015-08-07
*/
class EmptyController extends Controller{
	/**
	  * 非空控制器处理
	*/
	public function index(){
		$this -> display('Layout/404');
	}

	/**
	  * 非空操作处理
	*/
	public function _empty(){
        $this->display('Layout/404');
    }
}