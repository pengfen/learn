<?php
namespace Home\Controller;
/**
* 个人中心设置控制器
* 作者: apeng
* 时间: 2015-09-26
*/
class UserSettingController extends BaseController {
	// 个人中心设置首页
	public function index(){
		$id = D('BusinessLogic') -> where(array('name'=>'前台个人设置')) -> getField('id');
		$info = D('Nav') -> where(array('bid'=>$id)) -> select();
		$this -> assign('data', $info);
		$this -> display();
	}

	// 个人设置
	public function info(){
		$this -> display();
	}

	// 头像设置
	public function headImg(){
		$this -> display();
	}

	// 修改密码
	public function updatePass(){
		$this -> display();
	}
}