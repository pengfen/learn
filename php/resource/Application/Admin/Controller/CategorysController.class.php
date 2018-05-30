<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 技术分类后台控制器
  * 作者: apeng
  * 时间: 2015-09-04
*/
class CategorysController extends BaseController{
	// 分类列表
	public function index(){
		$cate = D('Categorys');
		$data = $cate -> select();
		$this -> assign('info', $data);
		$this -> display();
	}

	// 添加分类
	public function add(){
		$id = I('get.id');
		if ($id) {
			// 添加子分类
			$name = I('get.name');
			// 查找分类的相关信息
			$info = D('Categorys') -> find($id);
			$this -> assign('info', $info);
		} else {
			$name = '顶级分类';
		}
		$this -> assign('name', $name);
		// 添加所属方向
		$direct = D('Direct') -> getField('id,name', true);
		$this -> assign('direct', $direct);
		// 添加所属难度
		$difficult = D('difficult') -> getField('id,name', true);
		$this -> assign('difficult', $difficult);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$cate = D('Categorys');
		$pid = I('post.pid'); // 父id
		if ($pid) { // 处理父id 及 父路径
			$_POST['pid'] = $pid;
			$path = I('post.path'); // 全路径
		    if ($path) {
		    	$_POST['path'] = $path.$pid.',';
		    } 
		} else {
	    	$_POST['path'] = '0,';
	    }
		$_POST['catename'] = I('post.name'); // 分类名
		$_POST['addtime'] = time(); // 时间
		$_POST['rid'] = I('post.rid');
		$_POST['did'] = I('post.did');
		$cate -> create();
		$res = $cate -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改分类
	public function edit(){
		$id = I('get.id');
		$info = D('Categorys') -> find($id);
		$this -> assign('info', $info);
		// 添加所属方向
		$direct = D('Direct') -> getField('id,name', true);
		$this -> assign('direct', $direct);
		// 添加所属难度
		$difficult = D('difficult') -> getField('id,name', true);
		$this -> assign('difficult', $difficult);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$rid = I('post.rid');
		$did = I('post.did');
		$data = array(
			'id' => $id,
			'catename' => $name,
			'rid' => $rid,
			'did' => $did
			);
		$res = D('Categorys') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 详情
	public function detail(){
		$id = I('get.id');
		$info = D('Categorys') -> find($id);
		$this -> assign('info', $info);
		// 查找所有子类
		$data = D('Categorys') -> where(array('pid'=>$id)) -> getField('catename', true);
		$this -> assign('data', $data);
		// 查找所属方向
		$direct = D('Direct') -> where(array('id'=>$info['rid'])) -> getField('name');
		$this -> assign('direct', $direct);
		// 查找所属难度
		$difficult = D('Difficult') -> where(array('id'=>$info['did'])) -> getField('name');
		$this -> assign('difficult', $difficult);
		$this -> display(); 
	}

	// 删除分类
	public function delete(){
		$id = I('get.id');
		$res = D('Categorys') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Categorys/index', array('mess'=>'删除成功')));
	}
}
