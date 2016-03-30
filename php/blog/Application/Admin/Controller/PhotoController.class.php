<?php
namespace Admin\Controller;
/**
 * author:lishuo
 * time:2015-8-10
 * 照片类
*/
class PhotoController extends BaseController{
	public function index(){
		$photo=D('Photo');
		$data=$photo->where(array('aid'=>$_GET['aid']))->select();
		$this->assign('data',$data);
		$this->display();
	}
	public function delete(){
		$photo=D('Photo');
		$data=$photo->where(array('id'=>$_GET['id']))->delete();
		if($data){
			echo $this->success('删除成功！');
		}else{
			echo $this->error('删除失败！');
		}
	}
}