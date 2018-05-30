<?php
namespace Admin\Controller;
/**
  * 功能实现记录后台控制器
  * 作者: apeng
  * 时间: 2015-09-20
*/
class BugController extends BaseController{
	// 功能实现记录列表
	public function index(){
		// 修改 根据当前用户加载当前用户相关的bug
		$info = D('Bug') -> select();
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
		$_POST['content'] = I('post.content');
		$_POST['mid'] = $_SESSION['manager']['id'];
		// 判断 $_FILES 获取上传图片
		if (!empty($_FILES)) {
			$config = array(
				'rootPath' => './Public/',
				'savePath' => 'Uploads/',
				);
			$upload = new \Think\Upload($config);
			$res = $upload -> uploadOne($_FILES['image']);
			if (!$res) {
				// 输出错误信息
			}
			$image = $res['savepath'].$res['savename'];
		} else {
			$image = '';
		}
		$_POST['image'] = $image;
		$res = D('Bug') -> add($_POST);
		$mess = new MessController();
		$mess -> message($res, '添加成功', '添加失败', U('Bug/index', array('mess'=>'添加成功')));
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Bug') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$content = I('post.content');
		$data = array(
			'id' => $id,
			'name' => $name,
			'content' => $content
			);
		$res = D('Bug') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 修改bug 后的界面
	public function img(){
		$id = I('get.id');
		$info = D('Bug') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 修改bug 的数据
	public function updateImg(){
		$id = I('post.id');
		$did = $_SESSION['manager']['id'];
		// 判断 $_FILES 获取上传图片
		if (!empty($_FILES)) {
			$config = array(
				'rootPath' => './Public/',
				'savePath' => 'Uploads/',
				);
			$upload = new \Think\Upload($config);
			$res = $upload -> uploadOne($_FILES['image']);
			if (!$res) {
				// 输出错误信息
			}
			$image = $res['savepath'].$res['savename'];
		} else {
			$image = '';
		}
		$data = array(
			'id' => $id,
			'did' => $did,
			'img' => $image
			);
		$res = D('Bug') -> save($data);
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('Bug/index', array('mess'=>'修改成功')));
	}

	// 详情页
	public function detail(){
		$id = I('get.id');
		$info = D('Bug') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Bug') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Bug/index', array('mess'=>'删除成功')));
	}
}