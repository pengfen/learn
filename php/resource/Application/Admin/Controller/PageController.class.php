<?php
namespace Admin\Controller;
use Think\Controller;
/**
  * 搜索分页控制器
  * 作者: apeng
  * 时间: 2015-08-06
*/
class PageController extends Controller{
	/**
	  * 获取总记录数
	*/
	public function getCount($name, $search, $class, $str = ''){
		$where = $this -> condition($name, $search, $str);
		$count = $class -> where($where) -> count(); // 获取总记录数
		return $count;
	}

	/**
	  * 获取显示页
	*/
	public function show($count){
		// 查询满足要求的总记录数
		$page = new \Think\Page($count, 8); // 每页八条记录
		$page -> setConfig('header', '个会员');
		$page -> setConfig('prev', '上一页');
		$page -> setConfig('next', '下一页');
		$show = $page -> show();
		return $show;
	}

	/**
	  * 分页信息
	*/
	public function page($name, $search, $class, $str = ''){
		$page = new \Think\Page($count, 8); // 每页八条记录
		$where = $this -> condition($name, $search, $str);
		//dump($where);
		$list = $class -> where($where) -> limit($page->firstRow.','.$page->listRows) -> select();
		return $list;
	}

	/**
	  * 拼接条件
	*/
	public function condition($name, $search, $str = ''){
		$where = array();
		if ($str) {
			$str = explode('=', $str);
			$where[$str[0]] = array('eq', $str[1]);
		}
		if ($search) { //" username like %".$search.'%';
			$where[$name] = array('like', "%{$search}%"); 
		}
		return $where;
	}
}