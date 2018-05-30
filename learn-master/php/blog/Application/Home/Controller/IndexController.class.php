<?php
namespace Home\Controller;
use Think\Upload;
use Vendor\ThinkImage\ThinkImage;
// 首页控制器
class IndexController extends HomeController {
    public function index(){
    	unset($_SESSION['uid']);
    	//获取用户头像
    	$uid = $_SESSION['user']['id'];
    	$headimg = $this->isUploadHead($uid);
    	if(!$headimg){
    		$head = "default.jpg";
    	}else{
    		$head = $headimg['head_img_middle'];
    	}
    	//获取访客列表
    	$v = D('Visitor');
    	$vlist = $v->visitorListByUid($uid);
    	foreach ($vlist as $key => $value){
    		//获取用户头像和用户名
    		$headimg = D('HeadImg');
    		$headimg = $headimg->getUserHeadList($value['visitor']);
    		if(!$headimg){
				$vlist[$key]['head'] = 'default.jpg';
    		}else{
    			$vlist[$key]['head'] = $headimg['head_img_small'];
    		}
    		
    		$user = D('User');
    		$user = $user->getUserInfoById($value['visitor']);
    		$vlist[$key]['username'] = $user['username'];

    	}
    	//获取用户基本信息
    	$user = D('User');
    	$user = $user->getUserInfoById($uid);
    	//获取公共新闻
    	$news = D('News');
    	$newslist = $news->order('addtime desc')->limit(6)->select();
		$this->assign('src',$head);
    	$this->assign('user',$user);
    	$this->assign('vlist',$vlist);
    	$this->assign('newslist',$newslist);
    	$this->assign('title','个人中心');
		$this->display();
    }

    //判断某用户有无头像
    public function isUploadHead($uid){

    	$img = D('head_img');
    	$headimg = $img->where(array('uid'=>$uid))->find();
    	if($headimg){
    		return $headimg;
    	}else{
    		return false;
    	}
    }
    //初始化页面
    public function headupload(){
    	$this->display();
    }

	//上传头像
	public function uploadImg(){
		$upload = new Upload(C('UPLOAD_CONFIG'));	// 实例化上传类
		//头像目录地址
		$path = './Avatar/';
		if(!$upload->upload()) {						// 上传错误提示错误信息
			$this->ajaxReturn(array('status'=>0,'info'=>$upload->getErrorMsg()));
		}else{											// 上传成功 获取上传文件信息
			$temp_size = getimagesize($path.'temp.jpg');
			if($temp_size[0] < 150 || $temp_size[1] < 150){//判断宽和高是否符合头像要求
				$this->ajaxReturn(array('status'=>0,'info'=>'图片宽或高不得小于100px！'));
			}
			$this->ajaxReturn(array('status'=>1,'path'=>__ROOT__.'/Avatar/'.'temp.jpg'));
		}
	}

	//裁剪并保存用户头像
	public function cropImg(){
		//图片裁剪数据
		$params = I('post.');						//裁剪参数
		if(!isset($params) && empty($params)){
			$this->error('参数错误！');
		}

		//头像目录地址
		$path = './Avatar/';
		//要保存的图片
		$real_path = $path.$_SESSION['user']['id'].'avatar.jpg';
		//临时图片地址
		$pic_path = $path.'temp.jpg';
		//实例化裁剪类
		$Think_img = new ThinkImage(THINKIMAGE_GD);
		//裁剪原图得到选中区域
		$Think_img->open($pic_path)->crop($params['w'],$params['h'],$params['x'],$params['y'])->save($real_path);
		//生成缩略图
		$Think_img->open($real_path)->thumb(250,250, 1)->save($path.$_SESSION['user']['id'].'avatar_250.jpg');
		$Think_img->open($real_path)->thumb(150,150, 1)->save($path.$_SESSION['user']['id'].'avatar_150.jpg');
		$Think_img->open($real_path)->thumb(40,40, 1)->save($path.$_SESSION['user']['id'].'avatar_40.jpg');

		//把头像传入数据表
		//判断有无头像
		$_POST['uid'] = $_SESSION['user']['id'];
		$_POST['head_img_middle'] = $_SESSION['user']['id'].'avatar_150.jpg';
		$_POST['head_img_small'] = $_SESSION['user']['id'].'avatar_40.jpg';
		$_POST['head_img_big'] = $_SESSION['user']['id'].'avatar_250.jpg';
		
		$headimg = $this->isUploadHead($_SESSION['user']['id']);
    	if(!$headimg){
    		$headimg = D('head_img');
			$headimg->create();
			$headimg->add();
			$this->success('上传头像成功');
		}
    	else{
    		$_POST['id'] = $headimg['id'];
    		$headimg = D('head_img');
			$headimg->create();
			$headimg->save();
			$this->success('修改头像成功');
    	}

		
		
	}

	//实现动态显示
	public function news(){
		//获取本用户的好友列表
		$flist = D('Friend');
		$uid = $_SESSION['user']['id'];
		$flist = $flist->getUserFriendList($uid);
		//获取好友动态
		

	}
}