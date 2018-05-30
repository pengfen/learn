<?php
namespace Admin\Controller;
/**
  * 功能实现记录后台控制器
  * 作者: apeng
  * 时间: 2015-09-20
*/
class RealizeController extends BaseController{
	// 功能实现记录列表
	public function index(){
		$info = D('Realize') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 查找开发人员
		$data = D('Develop') -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['content'] = I('post.content');
		$_POST['url'] = I('post.url');
		$_POST['did'] = I('post.did');
		$_POST['addtime'] = time();
		$res = D('Realize') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		// 查询要修改的记录
		$id = I('get.id');
		$info = D('Realize') -> find($id);
		$this -> assign('info', $info);
		// 查找开发人员
		$data = D('Develop') -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$content = I('post.content');
		$url = I('post.url');
		$did = I('post.did');
		$data = array(
			'id' => $id,
			'name' => $name,
			'content' => $content,
			'url' => $url,
			'did' => $did
			);
		$res = D('Realize') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情页
	public function detail(){
		$id = I('get.id');
		$info = D('Realize') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Realize') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Realize/index', array('mess'=>'删除成功')));
	}
}