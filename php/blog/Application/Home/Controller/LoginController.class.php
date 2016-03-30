<?php
/**
 *作者：陈
 *时间：7.28
 *功能：用户登录控制器
**/
namespace Home\Controller;
use \Think\Controller;
use Home\Model\UserModel;

class LoginController extends Controller{
	function dologin(){
		$user = M('User');
		$email = I('post.login_email');
		$password = I('post.login_password');

		//有无存在该用户
		$data = $user->where(array('email'=>$email))->find();
		if (!$data) {
			$this->error('该用户不存在！');
			exit;
		}

		//判断密码是否正确
		if ($data['password'] != md5($password)) {
			$this->error('用户密码错误！');
			exit;
		}

		//存储用户信息
		$_SESSION['user'] = $data;

		//成功
		//更改经验值
		$user2 = D('User');
    	$user2->experience(5,$_SESSION['user']['id']);
		$this->redirect('Index/index');

	}

	function logout(){
		unset($_SESSION['user']);
		//跳转
		$this->redirect('Index/index');
	}
}