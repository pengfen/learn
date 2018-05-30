<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 功能后台控制器
  * 作者: apeng
  * 时间: 2015-09-12
*/
class FunctionController extends BaseController{
	// 功能列表
	public function index(){
		$info = D('Function') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 添加功能相关分类
		$cate = D('Categorys') -> where(array('pid'=>'6')) -> getField('id,catename', true);
		$this -> assign('cate', $cate);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['code'] = I('post.code');
		$_POST['pid'] = I('post.pid');
		$_POST['note'] = I('post.note');
		$res = D('Function') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Function') -> find($id);
		$this -> assign('info', $info);
		// 添加功能相关分类
		$cate = D('Categorys') -> where(array('pid'=>'6')) -> getField('id,catename', true);
		$this -> assign('cate', $cate);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$code = I('post.code');
		$pid = I('post.pid');
		$note = I('post.note');
		$data = array(
			'id' => $id,
			'name' => $name,
			'code' => $code,
			'pid' => $pid,
			'note' => $note
			);
		$res = D('Function') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 删除功能
	public function delete(){
		$id = I('get.id');
		$res = D('Function') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Function/index', array('mess'=>'删除成功')));
	}

	// 功能详情
	public function detail(){
		$id = I('id');
		$info = D('Function') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}
}