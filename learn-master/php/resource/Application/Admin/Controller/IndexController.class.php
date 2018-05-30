<?php
namespace Admin\Controller;
use Think\Controller;
/**
* 后台首页控制器
* 作者: apeng
* 时间: 2015-08-11
*/
class IndexController extends BaseController {
	// 后台首页
    public function index(){
    	$info = D('BusinessLogic') -> find(array('id'=>'1'));
    	$this -> assign('info', $info);
        $this -> display();
    }
}