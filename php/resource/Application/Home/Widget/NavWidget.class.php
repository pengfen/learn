<?php
namespace Home\Widget;
use Think\Controller;
/**
* 前台首页
* 作者: apeng
* 时间: 2015-09-19
*/
class NavWidget extends Controller{
	// 导航页面
	public function menu(){
		// 加载一级分类
		$info = D('Categorys') -> where(array('pid'=>'0')) -> select();
		$this -> assign('info', $info);
		$this -> display('Index/menu');
	}
}