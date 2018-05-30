<?php
namespace Admin\Controller;
/**
  * 技术方向后台控制器
  * 作者: apeng
  * 时间: 2015-09-19
*/
class DifficultController extends BaseController{
	// 技术方向列表
	public function index(){
		$info = D('Difficult') -> select();
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
		$res = D('Difficult') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		// 查询要修改的记录
		$id = I('get.id');
		$info = D('Difficult') -> find($id);
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
		$res = D('Difficult') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情页
	public function detail(){
		$id = I('get.id');
		$info = D('Difficult') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Difficult') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Difficult/index', array('mess'=>'删除成功')));
	}
}