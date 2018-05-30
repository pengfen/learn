<?php
/*
*功能：留言控制类
*作者：陈
*/
namespace Home\Controller;


class MessageController extends HomeController{

	//访客留言
	public function addMessage(){
		$msg = D('Message');
		//留言者
		$_POST['vid'] = $_SESSION['user']['id'];
		//发送者
		$_POST['sender'] = $_SESSION['user']['id'];
		//留言板主人
		$_POST['uid'] = I('post.uid');
		//留言接收者
		$_POST['receiver'] = I('post.uid');
		$_POST['content'] = I('post.content');
		//所属内容ID
		$_POST['pid'] =  I('post.pid');
		// if(!$msg->create()){
		// 	$this->error($msg->getError());
		// }
		$msg->create();
		$msg->add();
	}


	public function addChildMessage(){
		$msg = D('Message');
		//留言者
		$_POST['vid'] = $_SESSION['user']['id'];
		//发送者
		$_POST['sender'] = $_SESSION['user']['id'];
		//留言板主人
		$_POST['uid'] =$_SESSION['uid'];
		//留言内容
		$_POST['content'] = I('post.content');
		$_POST['pid'] = I('post.pid');
		//留言接收者
		//若是留言板主人自己发言，
		if($_POST['sender']==$_POST['uid']){
			$_POST['receiver'] = I('post.v_id');
		}else{
			$_POST['receiver'] =$_SESSION['uid'];
		}
		
		
		$msg->create();
		//echo json_encode($_POST);
		//dump($_POST);
		$msg->add();



	}

	public function getMessageList(){
		$msg = D('Message');
		//$uid = I('get.id');
		//$uid = empty($uid)?$_SESSION['user']['id']:$uid;
		$uid = $_SESSION['uid'];
		$list = $msg->getMessageById($uid);
		//dump($list);
		return $list;
	}

	public function getChildMsg($pid){
		$msg = D('Message');
		$list = $msg->where(array('pid'=>$pid))->select();
		return $list;
	}

	public function index(){
		//获取所有顶级留言
		$list = $this->getMessageList();
		$clistAll = array();
		foreach ($list as $key => $value) {
			$user = D('HeadImg');
			$imglist = $user -> getUserHeadList($value['vid']);
			$user = D('User');
			$userinfo = $user ->getUserInfoById($value['vid']);
			$list[$key]['headimg'] = $imglist['head_img_small'];
			$list[$key]['username'] = $userinfo['username'];
			$clist = $this->getChildMsg($value['id']);
			foreach ($clist as $k => $v) {
				$user = D('HeadImg');
				$img = $user -> getUserHeadList($v['vid']);
				$clist[$k]['headimg'] = $img['head_img_small'];
				$user2 = D('User');
				$userinfo2 = $user2 ->getUserInfoById($v['vid']);
			
				$clist[$k]['username'] = $userinfo2['username'];
			}
			//$clistAll[$key] = $clist;
			$list[$key]['clist'] = $clist;

		}
		
		//dump($list[2]['clist']);
		//dump($list);
		//获取子留言

		$this->assign('msglist',$list);
		$this->display();

	}


}

