<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 目录关联表控制器
  * 作者: apeng
  * 时间: 2015-08-12
*/
class AssocController extends BaseController{
	// 关联表列表
	public function index(){
		$pid = I('get.pid'); // 从项目记录列表过来
		if ($pid) {
			$info = D('Assoc') -> where(array('pid'=>$pid)) -> select();
		} else {
			$info = D('Assoc') -> select();
		}
		$this -> assign('info', $info);
		$this -> assign('title', '关联表列表');
		$this -> display();
	}

	// 添加界面
	public function add(){
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$assoc = D('Assoc');
		$_POST['struct'] = htmlspecialchars($_POST['struct']);
		//$assoc -> create(); 
		$res = $assoc -> add($_POST);
		// if ($res) {
		// 	echo '添加成功';
		// } else {
		// 	echo '添加失败';
		// }
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Assoc') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$data = array(
			'id' => $_POST['id'],
			'name' => $_POST['name'],
			'struct' => htmlspecialchars($_POST['struct']),
			'note' => $_POST['note']
			);
		$res = D('Assoc') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
		//$mess -> message($res, '修改成功', '修改失败', U('Assoc/index', array('mess'=>'修改成功')));
	}

	// 详情
	public function detail(){
		$id = I('get.id');
		$info = D('Assoc') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('Assoc') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Assoc/index', array('mess'=>'删除成功')));
	}
}