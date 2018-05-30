<?php
namespace Admin\Controller;
/**
  * 后台日志控制器
  * 作者: apeng
  * 时间: 2015-08-01
*/
class LogController extends BaseController{
	/**
	  * 要查询的用户日志列表
	*/
	public function index(){
		$id = I('get.id'); // 所属分类id
		$name = I('get.name');
		$cate = I('get.cate');
		$info = D('Log') -> where(array('cid'=>$id, 'flag'=>0)) -> select();
		// 向模板中分配数据及显示模板
		$this -> assign('cate', $cate);
		$this -> assign('name', $name);
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 查看详情 
	*/
	public function detail(){
		$id = I('get.id');
		$cate = I('get.cate');
		$name = I('get.name');
		$info = D('Log') -> find($id);
		// 向模板中分配数据及显示模板
		$this -> assign('cate', $cate);
		$this -> assign('name', $name);
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 删除日志
	*/
	public function delete(){
		$id = I('get.id');
		$cate = I('get.cate');
		$name = I('get.name');
		$data = array(
			'id' => $id,
			'flag' => 1
			);
		$res = D('Log') -> save($data); // UPDATE `blog_log` SET `flag`='1' WHERE `id` = 5
		if ($res) {
			$this -> success('删除成功', U('Log/index', array('id'=>$id, 'name'=>$name, 'cate'=>$cate)));
		} else {
			$this -> error('删除失败');
		}
	}
}