<?php
namespace Admin\Controller;
/**
  * 图片回收后台控制器
  * 作者: apeng
  * 时间: 2015-09-20
*/
class ImageRecycleController extends BaseController{
	// 图片回收列表
	public function index(){
		$info = D('ImageRecycle') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 图片详情
	public function detail(){
		$id = I('get.id');
		$info = D('ImageRecycle') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}

	// 删除
	public function delete(){
		$id = I('get.id');
		$res = D('ImageRecycle') -> delete($id);
		if ($res) {
			// IO 流删除文件夹中的真实的图片
		}
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('ImageRecycle/index', array('mess'=>'删除成功')));
	}
}