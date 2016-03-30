<?php
namespace Admin\Controller;
/**
  * 建议后台控制器
  * 作者: apeng
  * 时间: 2015-08-09
*/
class AdviceController extends BaseController{
	/**
	  * 建议列表
	*/
	public function index(){
		$search = I('get.search'); // 拼接搜索条件
		$uid = I('get.id');
		$advice = D('Advice');
		// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
		$page = new PageController();
		if (!$uid){ // 所有用户的分类列表
			// $info = D('LogCate') -> select();
		    $count = $page -> getCount('name', $search, $advice);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $advice);
		} else { // 具体用户的分类列表
			$count = $page -> getCount('name', $search, $advice, 'uid='.$uid);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $advice, 'uid='.$uid);
		    $name = I('get.name');
		    $this -> assign('name', $name);
		}
		//$data = D('Advice') -> where(array('uid'=>$id)) -> select();
		$this -> assign('count', $count);
		$this -> assign('page', $show);
		$this -> assign('info', $list);
		$this -> display();
	}

	/**
	  * 未读消息列表
	*/
	public function read(){
		$flag = I('get.flag');
		if ($flag == 1) {
			// $data = D('Advice') -> where(array('isread'=>0)) -> select();
			$sql = "select a.username,b.* from blog_user a left join blog_advice b on a.id=b.uid where b.isread=0";
			$data = D() -> query($sql);
			$this -> assign('info', $data); 
		}
		$this -> display('Advice/index');
	}

	/**
	  * 详情信息
	*/
	public function detail(){
		$id = I('get.id');
		$name = I('get.name');
		$info = D('Advice') -> where(array('id'=>$id)) -> find();
		if (!$name) { // 如果名字为空则查数据库
			$name = D('User')  -> where(array('id'=>$info['uid'])) -> getField('username');
		}
		// 将isread 从0 改为1
		$data = array( // 默认就是根据id 来修改数据的
			'id' => $id,
			'isread' => 1
			);
		D('Advice') -> save($data);
		$this -> assign('name', $name);
		$this -> assign('info', $info);
		$this -> display();
	}
}