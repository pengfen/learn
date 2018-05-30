<?php
namespace Admin\Controller;
/**
 * author:lishuo
 * time:2015-8-10
 * 相册类
*/
class AlbumController extends BaseController{
	public function index(){
		$album=D('Album');
		$total=$album->count();
		$per=7;
		$page=new \Component\Page($total,$per);
		if($_GET['search']){
			$search=$_GET['search'];
			$sql="select * from blog_album where album_name like '%".$search."%' ".$page->limit;
		}else{
			$sql="select * from blog_album ".$page->limit;
		}
		// $data=$album->select();
		$pagelist=$page->fpage();
		$data=$album->query($sql);
		$this->assign('data',$data);
		$this->assign('pagelist',$pagelist);
		$this->display();
	}
	public function edit(){
		$album=D('Album');
		$data=$album->where(array('id'=>$_GET['id']))->setField('first','1.png');
		if($data){
			echo $this->success('修改成功');
		}else{
			echo $this->error('修改失败');
		}

	}

}