<?php
namespace Home\Controller;

/**
  * author:lishuo
  * time:2015-8-4
  * 相册类
*/
class AlbumController extends HomeController{
	//展示相册首页
	public function index(){
		$album=D('Album');
		$uid = $_SESSION['uid']; 
		//取好友的id ，若为空就取自己的id 
		$uid=empty($uid)?$_SESSION['user']['id']:$uid;

	    //查询数据
		$data=$album->where(array('uid'=>$uid))->select();
		$this->assign('data',$data);
		$this->display();

	}
	//添加相册
	public function insert(){
		 // dump($_POST);
		 // exit;
		 $_POST['create_time']=time();
		 $_POST['uid']=$_SESSION['user']['id'];  //用户id
		 $album=D('Album');		
		 $album->create();
		 $data=$album->add();
		 if($data){
		 	$this->success("添加成功",U('Album/index'));
		 }else{
		 	$this->geterror("添加失败");
		 }
	}

	//修改相册封面
	public function edit(){
		//实例化上传类
		$upload = new \Think\Upload(); 
		$upload->maxSize = 3145728;//设置上传图片大小
		$upload->exts=array('jpg','gif','png','jpeg'); //设置附件上传类型
		$upload->savePath = "First"; //上传（子）目录
		$info = $upload->upload(); //上传文件
		if(!$info){
			$this->error($upload->getError());
		}
		//保存图片名
		$data['first']=$info['first']['savepath'].$info['first']['savename'];
		$data['uid']=$_SESSION['user']['id']; //用户id

		//生产缩略图
		$image = new \Think\Image();
		$bigimage=$info['first']['savepath'].$info['first']['savename'];
		$srcimg=$upload->rootPath.$bigimage;
		$image->open($srcimg);
		$image->thumb(250,180,\Think\Image::IMAGE_THUMB_CENTER);
		$smallimage=$info['first']['savepath'].'thumb_'.$info['first']['savename'];
		$image->save($upload->rootPath.$smallimage);
		$id=$_POST['id'];
		$album=D('Album');
		$album->where(array('id'=>$id))->setField('first',$smallimage);
		$this->redirect('Album/index');
	}


}
