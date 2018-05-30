<?php
namespace Home\Controller;
/**
  * 建议控制器
  * 作者: apeng
  * 时间: 2015-08-03
*/
class AdviceController extends HomeController{
	/**
	  * 建议首页
	*/
	public function index(){
		$id = $_SESSION['user']['id'];
		$data = D('Advice') -> where(array('uid'=>$id)) -> select();
		$this -> assign('info', $data);
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
		$_GET['title'] = I('title');
		$_GET['content'] = I('content');
		$_GET['uid'] = $_SESSION['user']['id'];
		$_GET['addtime'] = time();
		$res = D('Advice') -> add($_GET);
		if ($res) {
			echo '添加成功';
		} else {
			echo '添加失败';
		}
	}

	/**
	  * 详情页面
	*/
	public function detail(){
		$id = I('get.id');
		// 根据id 查找当前记录
		$info = D('Advice') -> where(array('id'=>$id)) -> find();
		$this -> assign('info', $info);
		// 根据uid 查找建议用户
		$uid = $info['uid'];
		$name = D('User') -> where(array('uid'=>$uid)) -> getField('username');
		$this -> assign('name', $name);
		// 根据id(cid) 查找所有的回复记录
		$sql = "select a.username,b.* from blog_manager a left join blog_advice_reviews b on a.id=b.mid where b.flag=0 and b.cid='{$id}' limit 1";
		$minfo = D() -> query($sql);
		$this -> assign('minfo', $minfo[0]);
		$sql = "select a.username,b.* from blog_user a left join blog_advice_reviews b on a.id=b.mid where b.flag=1";
		$uinfo = D() -> query($sql);
		// 阅读数加一
		$views = $info['views'] + 1;
		$data = array(
			'id' => $id,
			'views' => $views
			);
		D('Advice') -> save($data);
		$this -> assign('uinfo', $uinfo);
		$this -> display();
	}
}