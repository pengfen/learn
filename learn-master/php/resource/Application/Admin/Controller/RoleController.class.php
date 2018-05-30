<?php
namespace Admin\Controller;

/**
  * 角色控制器
  * 角色的 增 删 改 查
  * 作者: apeng
  * 时间: 2015-07-29
*/
class RoleController extends BaseController{
	/**
	  * 角色列表
	*/
	public function index(){
		$data = D('Role') -> select();
		// 向模板中分配数据及显示模板
		$this -> assign('title', '角色列表');
		$this -> assign('info', $data);
		$this -> display();
	}

	/**
	  * 添加界面
	*/
	public function add(){
		$this -> display();
	}

	/**
	  * 添加数据
	*/
	public function insert(){
		$data = M('Role');
		$data -> create();
		$res = $data -> add();
		$mess = new MessController();
		$mess -> message($res, '添加成功', '添加失败', U('Role/index', array('mess'=>'添加成功')));
	}

	/**
	  * 分配权限界面
	*/
	public function distribute(){
		// 根据id 获取角色名 及所有的权限ids
		$id = I('get.id'); // I() 默认是htmlspecialchars I('get.') 过滤所有的$_GET[] 数组
		$rinfo = D('Role') -> find($id);
		$this -> assign('id', $id);
		$this -> assign('name', $rinfo['name']);
		$auth_ids = explode(',', $rinfo['aids']);
		$this -> assign('aids', $auth_ids);
		// $name = D('Role') -> where(array('id'=>$id)) -> getField('name');
		// $this -> assign('name', $name);

		// 获取所有的权限信息
		$pinfo = D('Auth') -> where(array('level'=>'0')) -> select();
		$this -> assign('pinfo', $pinfo);
		$sinfo = D('Auth') -> where(array('level'=>'1')) -> select();
		$this -> assign('sinfo', $sinfo);
		$tinfo = D('Auth') -> where(array('level'=>'2')) -> select();
		$this -> assign('tinfo', $tinfo);
		$this -> display();
	}

	/**
	  * 修改权限数据
	*/
	public function updDist(){
		$id = I('post.id');
		$res = D('Role') -> saveAuth($_POST['authname'], $id);
		$mess = new MessController();
		$mess -> message($res, '分配权限成功', '分配权限失败', U('Role/index', array('mess'=>'分配权限成功')));
	}

	/** 
	  * 删除
	*/
	public function delete(){
		$id = I('get.id');
		$res = D('Role') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Role/index', array('mess'=>'删除成功')));
	}

	// 09-20 查看当前角色的权限
	public function detail(){
		// 根据id 获取角色名 及所有的权限ids
		$id = I('get.id'); // I() 默认是htmlspecialchars I('get.') 
		$info = D('Role') -> find($id);
		$id = "id in (".$info['aids'].")";
		$names = D('Auth') -> where($id) -> getField('name', true);
		$this -> assign('names', $names);
		$this -> assign('name', $info['name']);
		$this -> display();
	}
}
