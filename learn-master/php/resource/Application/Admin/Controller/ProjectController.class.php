<?php
namespace Admin\Controller;
//use Think\Controller;
/**
* 后台项目记录控制器
* 作者: apeng
* 时间: 2015-08-11
*/
class ProjectController extends BaseController{
	// 项目记录列表
	public function index(){
		$info = D('Project') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$pro = D('Project');
		$_POST['des'] = htmlspecialchars($_POST['des']);
		$_POST['summary'] = htmlspecialchars($_POST['summary']);
		$pro -> create();
		$res = $pro -> add();
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Project') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$pro = D('Project');
		$_POST['des'] = htmlspecialchars($_POST['des']);
		$_POST['summary'] = htmlspecialchars($_POST['summary']);
		$pro -> create();
		$res = $pro -> save();
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情
	public function detail(){
		$id = I('get.id');
		$info = D('Project') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Project') -> delete($id);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '删除成功', '删除失败');
	}
}