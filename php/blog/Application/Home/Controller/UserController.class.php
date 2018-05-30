<?php
/**
 *作者：陈
 *时间：7.28
 *功能：用户控制器
**/
namespace Home\Controller;

use Think\Upload;
use Vendor\ThinkImage\ThinkImage;


class UserController extends HomeController
{	
	//显示用户的主页
	public function myhome(){
		$user = D('User');
		$uid = I('get.id');
		//判断当前访问谁的主页
		$uid = empty($uid)?$_SESSION['user']['id']:$uid;
		//判断是别人来访则修改访问表
		if($uid != $_SESSION['user']['id']){
			$vis = new VisitorController();
			$vid = $_SESSION['user']['id'];
			$vis->visitor($uid,$vid);
		}
		$_SESSION['uid'] = $uid; 
		$user = $user->getUserInfoById($uid);
		//获取该用户的头像
		$u_head = D('HeadImg');
		$head_img = $u_head->getUserHeadList($uid);
		if(!$head_img){
			$head_img['head_img_big'] = 'default.jpg';
		}
		$title = $user['username'].'的主页';

		//获取留言板内容
		$msg =  new MessageController();
		$msglist = $msg->getMessageList();
		foreach ($msglist as $key => $value) {
			$uc = D('User');
			$user2 = $uc->getUserInfoById($value['uid']);
			$msglist[$key]['uname'] = $user2['username'];
			$user2 = $uc->getUserInfoById($value['vid']);
			$msglist[$key]['vname'] = $user2['username'];
		}
		//dump($user);
		$this->assign('user',$user);
		$this->assign('msglist',$msglist);
		$this->assign('head_img',$head_img['head_img_big']);
		$this->assign('title',$title);
		$this->display();
	}

	//修改用户信息
	public function editInfo(){
		$user = D('User');
		$user = $user->getUserInfoById($_SESSION['user']['id']);
		$this->assign('user',$user);
		$this->assign('title','资料编辑');
		$this->display();

	}

	//执行修改
	public function doedit(){
		$action = D('User');
		$data = array();
		$data['username'] = I('post.username');
		$data['department'] = I('post.department');
		$data['vocation'] = I('post.vocation');
		$data['telphone'] = I('post.telphone');
		$data['sex'] = I('post.sex');
		$data['birthday'] = I('post.birthday');
		$uid = $_SESSION['user']['id'];
		$edit = D('User');
		$edit->edit($uid,$data);
		echo "修改成功！";
		//echo json_encode($data);
	}

	
	

	//搜索好友
	public function search(){
		//存放检索条件
		$condition = array();
		$condition['username'] = I('post.username');
		$condition['department'] = I('post.department');
		$condition['vocation'] = I('post.vocation');
		$user = D('User');
		$list = $user->getUserListByCondition($condition);

		if(!$list){
			echo "[{'username':'对不起，根据您的搜索条件没有找到'}]";
		}else{
				$head = D('HeadImg');
				$head_img = $head->getUserHead($list[0]['id']);
				if(!$head_img){
					$list[0]['head_img'] = 'default.jpg';
				}else{
					$list[0]['head_img'] = $head_img;
				}
					echo json_encode($list);
			}

	}

	//显示用户基本信息
	public function info(){
		$user = D('User');
		$user = $user->getUserInfoById($_POST['uid']);
		$this->assign('user',$user);
		$this->display();
		//echo json_encode($user);

	}

	
	
	
}


