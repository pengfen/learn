<?php
namespace Admin\Controller;
/**
  * 公告后台控制器
  * 作者: apeng
  * 时间: 2015-08-06
*/
class NewsController extends BaseController{
	/**
	  * 公告列表
	*/
	public function index(){
		$search = I('get.search'); // 拼接搜索条件
		$news = D('News');
		// 调用分页控制器实例分页功能
		$page = new PageController();
		$count = $page -> getCount('title', $search, $news);
		$show = $page -> show($count);
		$list = $page -> page('title', $search, $news);
		// 向模板中分配数据及显示模板
		$this -> assign('title', '新闻列表');
		$this -> assign('count', $count);
		$this -> assign('page', $show);
		$this -> assign('info', $list);
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
		$_POST['title'] = I('post.title');
		$_POST['content'] = I('post.content');
		$_POST['addtime'] = time();
		$res = D('News') -> add($_POST);
		$mess = new MessController();
		$mess -> message($res, '添加成功', '添加失败', U('News/index', array('mess'=>'添加成功')));
	}

	/**
	  * 修改界面
	*/
	public function edit(){
		$id = I('get.id');
		$data =  D('News') -> where(array('id'=>$id)) -> find();
		$this -> assign('v', $data);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$id = I('get.id');
		$title = I('get.title');
		$content = I('get.content');
		$data = array(
			'id' => $id,
			'title' => $title,
			'content' => $content
			);
		$res = D('News') -> save($data);
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('News/index', array('mess'=>'修改成功')));
	}

	/**
	  * 删除
	*/
	public function delete(){
		$id = I('get.id');
		$res = D('News') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('News/index', array('mess'=>'删除成功')));
	}
}