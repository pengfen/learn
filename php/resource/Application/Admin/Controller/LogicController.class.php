<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 方法逻辑控制器
  * 作者: apeng
  * 时间: 2015-08-12
*/
class LogicController extends BaseController{
	// 方法逻辑列表
	public function index(){
		$info = D('Logic') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		$ac = I('get.ac');
		if ($ac) {
			$this -> assign('ac', $ac);
			$pid = I('get.pid');
			$this -> assign('pid', $pid);
		}
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		// 获取ac 如果没有就拼接ac
		$ac = I('post.ac');
		if (!$ac) {
			$controller = rtrim($_POST['controller'], 'Controller');
			$action = I('post.method');
			$_POST['ac'] = $controller.'-'.$action;
		}
		
		$_POST['note'] = htmlspecialchars($_POST['note']);
		$res = D('Logic') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Logic') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$ac = I('post.ac');
		$note = htmlspecialchars($_POST['note']);
		$data = array(
			'id' => $_POST['id'],
			'ac' => $ac,
			'note' => $note
			);
		
		$res = D('Logic') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}	

	// 删除数据
	public function delete(){
		$id = I('get.id');
		$res = D('Logic') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Logic/index', array('mess'=>'删除成功')));

	}

	// 详情
	public function detail(){
		$id = I('get.id');
		if (!$ac) { // 从目录详情页面跳转
			$controller = I('get.controller');
			$action = I('get.action');
			/*w+ d 0-9 [a-zA-Z]*/
			preg_match('/^\+?\w+/', $action, $m);
			$ac = rtrim($controller, 'Controller').'-'.ltrim($m[0], '+');
			$pid = I('get.pid');
			$name = I('get.name');
			// 根据ac 来找逻辑方法对应的内容
		    $info = D('Logic') -> where(array('ac'=>$ac, 'pid'=>$pid)) -> find();
		} else {
			$info = D('Logic') -> where(array('id'=>$id)) -> find();
		}
		if ($info) { // 
			$this -> assign('info', $info);
		} else { // 添加控制器-操作方法
			$this -> assign('ac', $ac);
			$this -> assign('pid', $pid);
		}
		$this -> assign('name', $name);
		$this -> display();
	}
}