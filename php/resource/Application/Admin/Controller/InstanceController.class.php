<?php
namespace Admin\Controller;
/**
  * 实例后台控制器
  * 作者: apeng
  * 时间: 2015-09-13
*/
class InstanceController extends BaseController{
	// 实例列表
	public function index(){
		$info = D('Instance') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 获取实例分类下所有的分类
		$data = D('Categorys') -> where(array('pid'=>'10')) -> getField('id,catename', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['quest'] = I('post.quest');
		$_POST['plan'] = I('post.plan');
		$_POST['discuss'] = I('post.discuss');
		$_POST['suggestion'] = I('post.suggestion');
		$_POST['pid'] = I('post.pid');
		$res = D('Instance') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		// 根据id 获取当前记录
		$id = I('get.id');
		$info = D('Instance') -> find($id);
		$this -> assign('info', $info);
		// 获取实例分类下所有的分类
		$data = D('Categorys') -> where(array('pid'=>'10')) -> getField('id,catename', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$quest = I('post.quest');
		$plan = I('post.plan');
		$discuss = I('post.discuss');
		$suggestion = I('post.suggestion');
		$pid = I('post.pid');
		$data = array(
			'id' => $id,
			'name' => $name,
			'quest' => $quest,
			'plan' => $plan,
			'discuss' => $discuss,
			'suggestion' => $suggestion,
			'pid' => $pid
			);
		$res = D('Instance') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情
	public function detail(){
		$id = I('get.id');
		$info = D('Instance') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除实例
	public function delete(){
		$id = I('get.id');
		$res = D('Instance') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Instance/index', array('mess'=>'删除成功')));
	}
}