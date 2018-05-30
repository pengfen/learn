<?php
namespace Admin\Controller;
/**
  * 会员后台控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class UserController extends BaseController{
	/**
	  * 会员列表
	*/
	public function index(){
		$search = I('get.search'); // 拼接搜索条件
		$user = D('User');
		// 调用分页控制器实例分页功能
		$page = new PageController();
		$count = $page -> getCount('username', $search, $user);
		$show = $page -> show($count);
		$list = $page -> page('username', $search, $user);
		// 向模板中分配数据及显示模板
		$this -> assign('title', '会员列表');
		$this -> assign('count', $count);
		$this -> assign('page', $show);
		$this -> assign('info', $list);
		$this -> display();
	}

	/**
	  * 修改界面
	*/
	public function edit(){
		$id = I('get.id');
		$state = I('get.state');
		$name = I('get.name');
		// 向模板中分配数据及显示模板
		$this -> assign('id', $id);
		$this -> assign('state', $state);
		$this -> assign('name', $name);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$id = I('get.id');
		$state = I('get.state');
		$data = array(
			'id' => $id,
			'state' => $state
			);
		$res = D('User') -> save($data);
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('User/index', array('mess'=>'修改成功')));
	}

	/**
	  * 会员详情
	*/
	public function detail(){
		$id = I('get.id');
		$data = D('User') -> where(array('id'=>$id)) -> find();
		$this -> assign('list', $data);
		$this -> display();
	}

	// @ 09-26 添加界面
	public function add(){
		$this -> display();
	}

	// @ 09-26 添加数据
	public function insert(){
		$_POST['username'] = I('post.username');
		$_POST['password'] = md5(I('post.password'));
		$repass = I('post.repassword');
		// 对接收的数据进行校验
		$res = D('User') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// @ 09-26 删除会员
	public function delete(){
		$id = I('get.id');
		$res = D('User') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('User/index', array('mess'=>'删除成功')));
	}
}