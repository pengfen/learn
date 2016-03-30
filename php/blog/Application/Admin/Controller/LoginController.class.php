<?php
namespace Admin\Controller;
use Think\Controller;
/**
 *  后台登陆页
 *  author:lishuo
 *  time:2015-07-27
 */
class LoginController extends Controller{
	public function login(){
//echo "eghfdg";
		$this->display();
	}
	//执行登录
	public function doLogin(){
		$manager=M('Manager');
		$email=I('post.email');
		$password=I('post.password');
		echo $email;

		//判断有无
		$data = $manager->where(array('email'=>$email))->find();
		$manager->getlastsql();
		if(!$data){
			$this->error('该用户不存在');
			exit;
		}
		//判断密码是否正确
		if($data['password']!==md5($password)){
			$this->error('用户密码错误');
			exit;
		}
		//存储用户信息
		$_SESSION['manager']=$data;
		//登录成功 跳转至首页
		$this->redirect('Index/index');
	}

	//退出登录
	public function logout(){
		unset($_SESSION['manager']);
		$this->redirect('Login/login');
	}

}
