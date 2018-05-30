<?php
namespace Admin\Controller;
/**
  * 逻辑后台控制器
  * 作者: apeng
  * 时间: 2015-09-13
*/
class BusinessLogicController extends BaseController{
	// 逻辑列表
	public function index(){
		$info = D('BusinessLogic') -> select();
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
		$_POST['flag'] = I('post.flag');
		// 判断 $_FILES
		if (!empty($_FILES)) {
			$upload = new ImageUploadController();
			$image = $upload -> imageUploadOne($_FILES);
		} else {
			$image = '';
		}
		$_POST['image'] = $image;
		$res = D('BusinessLogic') -> add($_POST);
		$mess = new MessController();
		$mess -> message($res, '添加成功', '添加失败', U('BusinessLogic/index', array('mess'=>'添加成功')));
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('BusinessLogic') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$des = I('post.des');
		$flag = I('post.flag');
		$img = I('post.img');
		$image = I('post.image');
		// var_dump($_POST);
		// exit;
		// 判断 $_FILES 没有用以前的
		if (!empty($_FILES)) {
			$upload = new ImageUploadController();
			$image = $upload -> imageUploadOne($_FILES);
		} 
		$data = array(
			'id' => $id,
			'name' => $name,
			'des' => $des,
			'flag' => $flag,
			'image' => $image
			);
		$res = D('BusinessLogic') -> save($data);
		if (!empty($_FILES) && $res) {
			// 回收原有图片
			$recycle = new ImageUploadController();
			$recycle -> recycle($img);
		}
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('BusinessLogic/index', array('mess'=>'修改成功')));
	}

	// 逻辑详情
	public function detail(){
		$id = I('get.id');
		$info = D('BusinessLogic') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$img = D('Auth') -> where(array('id'=>$id)) -> getField('image');
		$res = D('BusinessLogic') -> delete($id);
		if ($res) {
			$recycle = new ImageUploadController();
			$recycle -> recycle($img);
		}
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('BusinessLogic/index', array('mess'=>'删除成功')));
	}
}