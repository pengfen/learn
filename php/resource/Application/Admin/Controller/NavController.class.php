<?php
namespace Admin\Controller;
/**
  * 导航后台控制器
  * 作者: apeng
  * 时间: 2015-09-13
*/
class NavController extends BaseController{
	// 导航列表
	public function index(){
		$info = D('Nav') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 获取导航所属页面
		$data = D('BusinessLogic') -> where(array('flag'=>1)) -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// @ 09-26 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['bid'] = I('post.bid');
		$_POST['href'] = I('post.href');
		$res = D('Nav') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// @ 09-26 修改界面
	public function edit(){
		// 查询要修改的记录
		$id = I('get.id');
		$info = D('Nav') -> find($id);
		$this -> assign('info', $info);
		// 获取导航所属页面
		$data = D('BusinessLogic') -> where(array('flag'=>1)) -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// @ 09-26 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$bid = I('post.bid');
		$href = I('post.href');
		$data = array(
			'id' => $id,
			'name' => $name,
			'bid' => $bid,
			'href' => $href
			);
		$res = D('Nav') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// @ 09-26 详情页
	public function detail(){
		$id = I('get.id');
		$info = D('Nav') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// @ 09-26 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Nav') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Nav/index', array('mess'=>'删除成功')));
	}
}