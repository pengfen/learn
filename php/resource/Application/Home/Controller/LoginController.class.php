<?php
namespace Home\Controller;
use Think\Controller;
/**
* 登录 注册 退出
* 作者: apeng
* 时间: 2015-09-19
*/
class LoginController extends Controller {
	// 登录界面
    public function login(){
        $this -> display();
    }

    // @ 09-26 登录校验
    public function checkLogin(){
		$manager = D('User');
		$name = I('post.username');
		$password = I('post.password');

		//判断$name 是邮箱还是用户名
		preg_match('/^\w+@/', $username, $m);
		if ($m) { // 处理邮箱
			//$data = $manager -> where(array('email'=>$name)) -> getField('id,username,password', false);
			// SELECT `id`,`username`,`password` FROM `resource_manager` WHERE `username` = 'admin' LIMIT 1
			$data = $manager -> field('id,username,password') -> where(array('email'=>$name)) -> find();
		} else { // 处理用户名
			// $data = $manager -> where(array('username'=>$name)) -> getField('id,username,password', false);
			$data = $manager -> field('id,username,password') -> where(array('username'=>$name)) -> find();
		}
		if(!$data){
			$this -> error('该用户不存在');
			exit;
		}
		// //判断密码是否正确
		if($data['password'] !== md5($password)){
			$this -> error('用户密码错误');
			exit;
		}

		//存储用户信息
		$_SESSION['user'] = $data;
		//登录成功 跳转至首页
		$this -> redirect('Index/index');
	}

    // 注册界面
    public function reg(){
    	$this -> display();
    }

    // @ 09-26 验证码
    public function verify(){
		$verify = new \Think\Verify();
		$verify -> imageH = 40;
		$verify -> imageW = 100;
		$verify -> fontSize = 14;
		$verify -> length = 4;
		$verify -> fontttf = '5.ttf';
		$verify -> entry();
	}

	// @ 09-26 校验注册
	public function checkReg(){
		$_POST['email'] = I('post.email');
		$_POST['password'] = md5(I('post.password'));
		$repass = I('post.repassword');
		// 验证验证码
        $verify = new \Think\Verify(); // 
        if(!$verify -> check($_POST['code'], '')){ // 校验验证码
          $this -> assign('errorverify', '验证码错误'); // 向模板中发送数据
          $this -> display('reg'); // 调用对应模板
          exit;
        }
        $res = D('User') -> add($_POST);
		if ($res) {
			$this -> display('login');
		} else {
			$this -> display('reg');
		}
	}

    // @ 09-26 退出
    public function logout(){
    	unset($_SESSION['user']);
    	$this -> display('Login/login');
    }
}