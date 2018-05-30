<?php
/**
 *作者：陈
 *功能：好友查找，好友请求
 */

namespace Home\Controller;
use Home\Model\UserModel;

class FriendController extends HomeController{

	//获取好友和请求
	public function searchfriend(){
		//获取推荐好友列表（除本身和好友）
		$user  = new UserModel('User');
		$map = array();
		$map['id'] = array('neq',$_SESSION['user']['id']);
		$data = $user->where($map)->select();
		//检查该用户是否设置头像
		foreach ($data as $key => $value) {
			//$img = new IndexController();
			//$ishead = $img->isUploadHead($value['id']);
			$img = D('HeadImg');
			$img = $img->getUserHeadList($value['id']);
			$data[$key]['src'] = $img['head_img_middle'];
	
		}
		//dump($data);

		//获取好友请求
		$msg = new NoticeController();
		$condition = array('flag'=>3,'uid'=>$_SESSION['user']['id']);
		$list = $msg->getlist($condition);

		//遍历请求数组找出对应消息发送者姓名
		foreach ($list as  $key=>$v) {
			//获取发送者信息

			$condition['id'] = $v['sid'];
			$sender  = D('user');
			$sender = $sender->getUserInfo($condition);
			$list[$key]['name'] = $sender['username'];

		}

		//获取好友列表
		$friendlist = $this->getFriendList($_SESSION['user']['id']);
		//dump($friendlist);

		//排除好友
		if(!empty($friendlist)){
			foreach ($friendlist as $k => $v) {
			foreach ($data as $key => $value) {
		
		 if(in_array($v['uid'],$value)) 
		 	{unset($data[$key]);}
			}
		}
		}
		//dump($data);
		$this->assign('msglist',$list);
		$this->assign('friendlist',$friendlist);
		$this->assign('list',$data);
		$this->assign('title','找好友');
		$this->display();
	}
		

	//推荐好友
	public function recommend(){
		//获取用户列表

	}

	//追加访问数据
	public function view(){

	}

	//建立好友关系
	public function makefriend(){
		$friend = D('friend');
		//获取本身好友记录
		$rs = $friend->where(array('uid'=>$_SESSION['user']['id']))->find();
		//更改本用户好友记录
		$_POST['fidlist'] = $rs['fidlist'].','.$_POST['fid'];
		$_POST['id'] = $rs['id'];
		$friend->create();
		$rs=$friend->save();
		
		//更改对方好友记录
		$fid = $_POST['fid'];
		//获取对方好友记录
		$sfriend = D('friend');
		$f=$sfriend->where(array('uid'=>$fid))->find();
		$_POST['fidlist'] = $f['fidlist'].','.$_SESSION['user']['id'];
		$_POST['id'] = $f['id'];
		$_POST['uid'] = $fid;
		$sfriend->save($_POST);
		$_POST['fidlist'].$sfriend->getLastsql();
		//dump($f);
		echo '添加成功';
	
		//更改这条消息的状态为已处理
		//获取该条消息号
		
		$notice = D('Notice');
		$_POST['id'] = $_POST['nid'];
		$_POST['uid'] = $_SESSION['user']['id'];
		$_POST['sid'] = $fid;
		$_POST['state'] = 1;
		$notice->create();
		$notice->save();
		//echo $notice->getLastsql();
	}

	//获取好友列表
	public function getFriendList($uid){
		$friend = D('friend');
		$fidlist = $friend->getUserFriendList($uid);
		//dump($fidlist);
		$userlist = array();
		//判断fidlist是否为空
		if(!empty($fidlist[0])){
			
			foreach ($fidlist as $key => $value) {
				$user = D('user');
				$userli=$user->where(array('id'=>$value))->find();
				$userlist[$key]['username'] = $userli['username'];
				$userlist[$key]['uid'] = $userli['id'];
				$img = D('head_img');
				$imglist = $img->where(array('uid'=>$value))->find();
				$userlist[$key]['head_img'] = $imglist['head_img_middle'];
			}
		}else{
			$userlist = null;
		}
		
		return $userlist;
		}

	//解除好友关系
	public function delFriend(){
		
		//获取好友的好友列表中去除当前用户的id
		$action = D('Friend');
		//获取所要删除的用户id
		$fid=$_POST['uid'];
		$uid=$_SESSION['user']['id'];
		$action->delFriend($uid,$fid);
		//删除对方好友表中的好友字段
		$action->delFriend($fid,$uid);
		echo "解除成功";
		
		
	}

}