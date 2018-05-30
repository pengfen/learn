<?php
namespace Home\Controller;
class PhotoReviewController extends HomeController{
	//添加评论
	public function add(){
		//当前用户，发表评论者

		$_POST['sender'] = $_SESSION['user']['id']; 
		if(empty($_SESSION['uid'])){
			$_POST['owner'] = $_SESSION['user']['id'];
		}else{
			$_POST['owner'] = $_SESSION['uid'];
		}
		$_POST['addtime'] = time();

		$review = D('PhotoReview');
		$review->create();
		$review->add();

		//查评论数据，返回给AJAX
		// $review=D('Review');
		// echo $rev=$review->review();


	}

}