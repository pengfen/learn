<?php
/**
*作者：陈
*访客控制器
**/
namespace Home\Controller;
use Home\Model\VisitorModel;

class VisitorController extends HomeController
{
	public function addVisitor(){
		$uid = $_POST['visitor'];
		$visitor = $_POST['uid'];
		$v = D('Visitor');
		$v->create();
		$v->add();
	}

	public function visitor($uid,$vid){
		$_POST['visitor']=$vid;
	    $_POST['uid']=$uid;
		$v = D('Visitor');
		$v->create();
		$v->add();
	}
}