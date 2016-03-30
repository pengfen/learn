<?php
namespace Admin\Controller;
/**
  * 模块关联页后台控制器
  * 作者: apeng
  * 时间: 2015-09-13
*/
class AssocPageController extends BaseController{
	// 关联页列表
	public function index(){
		$info = D('AssocPage') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 加载涉及的表(pid 为0 时表示所属为模块相关联的表)
		$info = D('Assoc') -> where(array('pid'=>'0')) -> getField('id,name', true);
		$this -> assign('assoc', $info);
		// 加载所有分类(模块)
		$data = D('Categorys') -> where(array('pid'=>'8')) -> getField('id,catename', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['des'] = I('post.des');
		$_POST['assoc'] = I('post.assoc');
		$_POST['techn'] = I('post.techn');
		$_POST['pid'] = I('post.pid');
		$res = D('AssocPage') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		// 查询要修改的记录
		$id = I('get.id');
		$info = D('AssocPage') -> find($id);
		$this -> assign('info', $info);
		// 加载涉及的表(pid 为0 时表示所属为模块相关联的表)
		$assoc = D('Assoc') -> where(array('pid'=>'0')) -> getField('id,name', true);
		$this -> assign('assoc', $assoc);
		// 加载所有分类(模块)
		$data = D('Categorys') -> where(array('pid'=>'8')) -> getField('id,catename', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$des = I('post.des');
		$assoc = I('post.assoc');
		$techn = I('post.techn');
		$pid = I('post.pid');
		$data = array(
			'id' => $id,
			'name' => $name,
			'des' => $des,
			'assoc' => $assoc,
			'techn' => $techn,
			'pid' => $pid
			);
		$res = D('AssocPage') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情页
	public function detail(){
		$id = I('get.id');
		$info = D('AssocPage') -> find($id);
		$this -> assign('info', $info);
		// 获取所涉及的表
		
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('AssocPage') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('AssocPage/index', array('mess'=>'删除成功')));
	}
}