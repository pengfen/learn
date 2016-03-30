<?php
namespace Admin\Controller;
/**
  * 权限控制器
  * 作者: apeng
  * 时间: 2015-07-27
*/
class AuthController extends BaseController{
	/**
	  * 权限列表
	*/
	public function index(){
		$info = $this -> getinfo(true); // 获取所有权限信息
		// 向模板中分配数据及显示模板
		$this -> assign('title', '权限列表');
		//$this -> assign('link', U('Auth/index'));
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 添加界面
	*/
	public function add(){
		$info = $this -> getinfo(); // 获取顶级,次顶级权限
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 添加数据 print_r($_POST); Array ( [name] => 权限列表 [pid] => 2 [controller] => Auth [action] => add )
	*/
	public function insert(){
		// D('Auth') -> $auth = new \Admin\Model\AuthModel;
		$res = D('Auth') -> addAuth($_POST);
		$mess = new MessController();
		$mess -> message($res, '添加成功', '添加失败', U('Auth/index', array('mess'=>'添加成功')));
	}

	/**
	  * 修改界面
	*/
	public function edit(){
		// 根据id 获取要修改的那条记录
		$id = I('get.id');
		$data = D('Auth') -> where(array('id'=>$id)) -> find();
		$info = $this -> getinfo(); // 获取顶级,次顶级权限
		// 向模板中分配数据及显示模板
		$this -> assign('info', $info);
		$this -> assign('v', $data);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$res = D('Auth') -> updAuth($_POST);
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('Auth/index', array('mess'=>'修改成功')));
	}

	/** 
	  * 删除权限
	*/
	public function delete(){
		$id = I('get.id');
		$img = D('Auth') -> where(array('id'=>$id)) -> getField('image');
		$res = D('Auth') -> delete($id);
		if ($res) {
			$recycle = new ImageUploadController();
			$recycle -> recycle($img);
		}
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Auth/index', array('mess'=>'删除成功')));
	}

	// 09-12 修改权限关联图
	public function editImg(){
		$id = I('get.id');
		$info = D('Auth') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 09-12 修改权限关联图数据
	public function updateImg(){
		$id = I('post.id');
		// 获取原有图片
		$img = I('post.img');
		// 判断 $_FILES
		if (!empty($_FILES)) {
			$upload = new ImageUploadController();
			$image = $upload -> imageUploadOne($_FILES);
		} else {
			$image = '';
		}
		$data = array(
			'id' => $id,
			'image' => $image
			);
		$res = D('Auth') -> save($data);
		if ($res) {
			// 回收原有图片
			$recycle = new ImageUploadController();
			$recycle -> recycle($img);
		}
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('Auth/index', array('mess'=>'修改成功')));
	}

	// 09-12 详情列表
	public function detail(){
		$id = I('get.id');
		$info = D('Auth') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 获取权限信息 
	  * @param $flag true 只查询顶级,次顶级权限 false 查询所有权限
	*/
	private function getinfo($flag = false){
		$auth = D('Auth');
		if ($flag == true){
			$map = array();
			$map['level'] = array('lt', 2);
			$info = $auth -> where($map) -> order('path asc') -> select();
		} else {
			$info = $auth -> order('path asc') -> select();
		}
		// 处理缩进关系(根据级别缩进)
		foreach ($info as $k => $v) {
			// echo $k.' : '.$v['level']; 0 : 0 1 : 1 2 : 1 3 : 0 4 : 1
			$info[$k]['name'] = str_repeat("&nbsp;&nbsp;", $v['level']).$info[$k]['name'];
		}
		return $info;
	}
}