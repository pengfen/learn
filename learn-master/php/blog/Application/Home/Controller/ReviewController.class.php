<?php
/**
 *作者：陈
 *时间：8.4
 *功能：评论控制器
**/
namespace Home\Controller;

class ReviewController extends HomeController{
	public function index(){
		$list =  $this->showReview(0,'0');
		//dump($list);
		$this->assign('list',$list);
		$this->display();
	}

	public function showReview($cateid,$path){
		$uid = $_SESSION['uid'];
		$list = $this->getAllReview($uid,$cateid,$path);
		return $list;
	}

	//添加评论
	public function addReview(){
		
		$_POST['sender'] = $_SESSION['user']['id'];
		$_POST['owner'] = $_SESSION['uid'];
		if(empty($_POST['rid'])){
			$_POST['receiver'] = $_POST['owner'];
		}else{
			$_POST['receiver'] = I('post.rid');
		}
		if(empty($_POST['path'])){
			$_POST['path'] = '0';
		}else{
			$_POST['path'] = I('post.path');
		}
		
		
		$_POST['content'] = I('post.content');

		$review = D('Review');
		$review->create();
		$review->add();

	}

	//获取一级评论
	public function getCateReview($uid,$cateid,$path){
		$Review = D('Review');
		$review = $Review->getUserReview($cateid,$uid,$path);
		$review = $this->foreachGetUser($review,'sender','username','headimg');
		return $review;
	}

	//获取二级评论
	public function getSecondReview($cateid,$pid,$path){
		$Review = D('Review');
		$review = $Review->getReview2($cateid,$pid,$path);
		$review = $this->foreachGetUser($review,'sender','username','headimg');
		$review = $this->foreachGetUser($review,'receiver','receivername','reheadimg');
		return $review;
	}

	
	//遍历获取所有评论
	public function getAllReview($uid,$cateid,$path){
		$review = $this->getCateReview($uid,$cateid,$path);
		foreach ($review as $key => $value) {
			$review[$key]['sreview'] = $this->getSecondReview($cateid,$value['id'],$path);
		}
		return $review;
		
	}

	public function foreachGetUser($list,$v,$name,$headimg){
		foreach ($list as $key => $value) {
    		$user = D('User');
    		$user = $user->getUserInfoById($value[$v]);
    		$list[$key][$name] = $user['username'];
    		$head = D('HeadImg');
    		$head = $head->getUserHeadList($value[$v]);
    		$list[$key][$headimg] = $head['head_img_small'];
    	}
		return $list;
    }

}