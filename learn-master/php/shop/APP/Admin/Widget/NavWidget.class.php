<?php
namespace Admin\Widget;
use Think\Controller;

/**
  * 
*/
class NavWidget extends Controller{
	/**
	*/
	public function menu(){
		// 查找一级权限
    	$map = array();
    	$map['level'] = array('eq', 0);
    	$pdata = $data -> where($map) -> select();
    	// dump($data);
    	// 查找二级权限
    	$map = array();
    	$map['level'] = array('eq', 1);
    	$cdata = $data -> where($map) -> select();
    	// dump($cdata);
    	$this->assign('plist', $pdata);
    	$this->assign('clist', $cdata);
		$this->display('Index/menu');
	}
}