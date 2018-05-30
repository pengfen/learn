<?php
/**
 *作者：陈
 *时间：7.28
 *功能：用户注册控制器
**/
namespace Home\Controller;
use \Think\Controller;
use Home\Model\UserModel;

class RegisterController extends Controller
{
	public function register(){
		$this->assign('title','快速注册');
		$this->display();
	}

	/**
	 *功能：生成验证码
	 *作者：陈荣荣
	 *时间：7.15
	 **/
	public function verifyImg(){
		$config = array(
			'imageH' => 38,
			'imageW' => 150,
			'fontSize'  => 18, 
			'length'    => 4,
			 
		);
		ob_clean();
		$verify = new \Think\Verify($config);
		$verify ->entry();
	}

	/**
	 *功能：异步验证用户邮箱是否已经注册
	 *作者：陈荣荣
	 *时间：7.15
	 **/
	public function checkemail(){
		$user = new UserModel('user');
		$email = !empty($_GET['email'])?$_GET['email']:'';
		$rs = $user->where(array('email'=>$email))->find();
		if($rs){
			echo '该邮箱已被注册';
		}else{
			echo '该邮箱可用';
		}
	}

	//用户执行注册
	public function doregister(){
		$verify = new \Think\Verify();

		//验证码验证
		if(!$verify->check($_POST['code'])){
			$this->error('验证码错误',U('Register/register'));
		}
		else{
			$user = new UserModel('user');
			if(!$user->create()){
				$this->error($user->getError());
			}

			if($user->add()>0){
				$_SESSION['email'] = I('post.email');
				$email = $_SESSION['email'];
				
				//获取当前用户ID
				$rs = $user->where(array('email'=>$email))->find();
				$id= $rs['id'];
				$_POST['uid'] = $id;
				//为用户创建好友表
				$friend = D('Friend');
				$friend->create();
				$friend->add();
				//初始化日志分类
				$log = D('LogCate');
				$log->create();
				$log->add();
				//初始化头像表
				$head = D('HeadImg');
				$head->create();
				$head->add();
				//初始化相册表
				$album = D('Album');
				$album->create();
				$album->add();


				$this->success('注册成功',U('Register/success_register'));
			}else{
				$this->error('注册失败');
			}
		}
	}

	public function success_register(){
		$this->assign('title','完善资料');
		$this->display();
	}

	public function edit(){
		//获取当前用户ID
		
		$user = new UserModel('user');
		$rs = $user->where(array('email'=>$email))->find();
		$id= $rs['id'];
		$_POST['uid'] = $id;
		//创建默认相册
		$albumcol = new AlbumController;
		$aid = $albumcol->createAlbum();
		$_POST['aid'] = $aid;

		
		//完善其他资料
		
		$email = $_SESSION['email'] ;
		$user = M('user');
		if(!$user->create()){
				$this->error($user->getError());
			}
		if($user->where(array('email'=>$email))->save()){
			$this->success('成功完善',U('Index/index'));
		}
		//echo $user->getLastsql();
	}

}
