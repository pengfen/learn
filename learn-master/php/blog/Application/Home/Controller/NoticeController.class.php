<?php
namespace Home\Controller;

class NoticeController extends HomeController{
	//添加消息
	public function add(){
		$message = D('Notice');
		$message->create();
		$message->add();
		echo "等待验证";
	}

	public function showlist($flag){
		$msg = D('Notice');
		$data = $msg->where(array('flag'=>$flag,'uid'=>$_SESSION['user']['id']))->select();
		return $data;
	}

	//根据条件获取请求信息
	public function getlist($condition){
		$msg = D('Notice');
		$data = $msg->where($condition)->select();
		return $data;
	}
}