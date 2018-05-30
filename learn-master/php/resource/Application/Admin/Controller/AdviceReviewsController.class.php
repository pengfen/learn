<?php
namespace Admin\Controller;
/**
  * 建议后台控制器
  * 作者: apeng
  * 时间: 2015-08-10
*/
class AdviceReviewsController extends BaseController{
	/**
	  * 首页
	*/
	public function index(){
		// 查询所有管理员的回复
		$sql = "select a.username,b.content,b.addtime from blog_advice_reviews b left join blog_manager a on a.id=b.mid where flag=0";
		$minfo = D() -> query($sql);
		// 查询所有用户的回复
		$sql = "select a.username,b.content,b.addtime from blog_advice_reviews b left join blog_user a on a.id=b.mid where flag=1";
		$uinfo = D() -> query($sql);
		// 按时间对数据进行排序
		$data = array_merge($minfo, $uinfo);
		foreach ($data as $k => $v) {
			$soft[$k] = $v['addtime'];
		}
		array_multisort($soft, $data);
		$this -> assign('info', $data);
		$this -> display();
	}

	/**
	  * 添加回复
	*/
	public function add(){
		$id = I('get.id');
		$this -> assign('id', $id);
		$this -> display();
	}

	/**
	  * 添加数据
	*/
	public function insert(){
		$_POST['mid'] = $_SESSION['manager']['id'];
		$_POST['addtime'] = time();
		$res = D('AdviceReviews') -> add($_POST);
		// 回复数加一
		$reviews = D('Advice') -> where(array('id'=>$_POST['cid'])) -> getField('reviews');
		$reviews = $reviews + 1;
		$data = array(
			'id' =>  $_POST['cid'],
			'reviews' => $reviews
			);
		D('Advice') -> save($data);
		$mess = new MessController();
		$mess -> message($res, '回复成功', '回复失败', U('AdviceReviews/index', array('mess'=>'回复成功')));
	} 
}