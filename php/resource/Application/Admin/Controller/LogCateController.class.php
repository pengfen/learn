<?php
namespace Admin\Controller;
/**
  * 日志分类后台控制器
  * 作者: apeng
  * 时间: 2015-08-01
*/
class LogCateController extends BaseController{
	/**
	  * 日志分类后台列表
	*/
	public function index(){
		$search = I('get.search'); // 拼接搜索条件
		$uid = I('get.id');
		$cate = D('LogCate');
		// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
		$page = new PageController();
		if (!$uid){ // 所有用户的分类列表
			// $info = D('LogCate') -> select();
		    $count = $page -> getCount('name', $search, $cate);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $cate);
		} else { // 具体用户的分类列表
			$count = $page -> getCount('name', $search, $cate, 'uid='.$uid);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $cate, 'uid='.$uid);
		    $name = I('get.name');
		    $this -> assign('name', $name);
			// $info = D('LogCate') -> where(array('uid'=>$uid)) -> select();
		}
		// 向模板中分配数据及显示模板
		$this -> assign('count', $count);
		$this -> assign('page', $show);
		$this -> assign('info', $list);
		$this -> display();
	}
}