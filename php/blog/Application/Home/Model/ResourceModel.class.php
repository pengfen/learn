<?php
namespace Home\Model;
use \Think\Model;
/**
 * author:lishuo
 * time:2015-7-30
*/
class ResourceModel extends Model{	
	//实例化上传类
	public function uploads(){
		$upload = new\Think\Upload(); 
		$upload->maxSize = 2000000;//设置压缩包文件大小
		$upload->exts = array('zip','rar','tar'); //压缩包上传类型
		$upload->savePath = "Resource"; //上传（子）目录
		$info = $upload->upload(); //上传文件
		//文件的路径
		$_POST['zip_name']=$info['zip']['savepath'].$info['zip']['savename'];
		$_POST['uid']=$_SESSION['user']['id']; //用户id
	}
}
