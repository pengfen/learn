<?php
namespace Admin\Controller;

/**
  * 说说后台控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class MoodController extends BaseController{
	/**
	  * 说说列表
	*/
	public function index(){
		$search = I('get.search'); // 拼接搜索条件
		$uid = I('get.id');
		$mood = D('Mood');
		// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
		$page = new PageController();
		if (!$uid){ // 所有用户的分类列表
			// $info = D('LogCate') -> select();
		    $count = $page -> getCount('name', $search, $mood);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $mood);
		    
		} else { // 具体用户的分类列表
			$count = $page -> getCount('name', $search, $mood, 'uid='.$uid);
		    $show = $page -> show($count);
		    $list = $page -> page('name', $search, $mood, 'uid='.$uid);
		    $name = I('get.name');
		    $this -> assign('name', $name);
		}
		// 向模板中分配数据及显示模板
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
		$res = D('Mood') -> save($data);
		if ($res) {
			// echo '修改成功';
			$this -> success('修改成功', U('Mood/index'));
		} else {
			// echo '修改失败';
			$this -> error('修改失败');
		}
	}
}