<?php
namespace Home\Model;
use \Think\Model;
/**
 * author:lishuo
 * time:2015-8-5
 * 照片操作类
*/
class PhotoModel extends Model{	
	//实例化上传类
	public function uploads(){
		$upload = new\Think\Upload(); 
		$upload->maxSize = 3145728;//设置上传图片大小
		$upload->exts=array('jpg','gif','png','jpeg'); //设置附件上传类型
		$upload->savePath = "Photo"; //上传（子）目录
		$info = $upload->upload(); //上传文件
		if(!$info){
			$this->error($upload->getError());
		}
		//保存图片名
		$_POST['photo_name']=$info['photo_name']['savepath'].$info['photo_name']['savename'];
		$_POST['uid']=$_SESSION['user']['id']; //用户id

		//生成缩略图
		$image = new \Think\Image();
		$bigimage=$info['photo_name']['savepath'].$info['photo_name']['savename'];
		$srcimg=$upload->rootPath.$bigimage;
		$image->open($srcimg);
		$image->thumb(250,150,\Think\Image::IMAGE_THUMB_CENTER);
		$smallimage=$info['photo_name']['savepath'].'thumb_'.$info['photo_name']['savename'];
		$image->save($upload->rootPath.$smallimage);
		$_POST['photo_name_thumb']=$smallimage;

	}
}
