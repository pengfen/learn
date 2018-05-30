<?php
namespace Admin\Controller;
/**
  * 模块后台控制器
  * 作者: apeng
  * 时间: 2015-09-13
*/
class ModuleController extends BaseController{
	// 模块列表
	public function index(){
		$info = D('Module') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['des'] = I('post.des');
		$res = D('Module') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Module') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$des = I('post.des');
		$data = array(
			'id' => $id,
			'name' => $name,
			'des' => $des
			);
		$res = D('Module') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改流程图界面
	public function editImg(){
		$this -> display();
	}

	// 修改流程图数据
	public function updateImg(){
		//
	}

	// 修改代码压缩包界面
	public function editCode(){
		$this -> display();
	}

	// 修改压缩包数据
	public function updateCode(){
		//
	}

	// 详情
	public function detail(){
		$id = I('get.id');
		$info = D('Module') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除模块
	public function delete(){
		$id = I('get.id');
		$res = D('Module') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Module/index', array('mess'=>'删除成功')));
	}
}