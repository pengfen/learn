<?php
namespace Home\Controller;
/**
* 个人中心
* 作者: apeng
* 时间: 2015-09-26
*/
class UserController extends BaseController {
	// 个人中心首页
	public function index(){
		$id = D('BusinessLogic') -> where(array('name'=>'前台个人中心')) -> getField('id');
		$info = D('Nav') -> where(array('bid'=>$id)) -> select();
		$this -> assign('data', $info);
		$this -> display();
	}

	// 我的课程
	public function lesson(){
		$this -> display();
	}

	// 我的课程评论
	public function lessonComment(){
		$this -> display();
	}

	// 我的计划
	public function play(){
		$this -> display();
	}

	// 我的代码
	public function code(){
		$this -> display();
	}

	// 我的笔记
	public function note(){
		$this -> display();
	}
}