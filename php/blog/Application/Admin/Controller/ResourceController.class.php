<?php
namespace Admin\Controller;
/**
 * author:lishuo
 * time:2015-8-10
 * 后台资源控制器
*/
class ResourceController extends BaseController{
	public function index(){
		$resource=D('Resource');
		$total=$resource->count();
		$per=7;
		$page=new \Component\Page($total,$per);
		if($_GET['search']){
			$search=$_GET['search'];
			$sql="select * from blog_resource where header like '%".$search."%' ".$page->limit;
		}else{
			$sql="select * from blog_resource ".$page->limit;
		}
		
		// $data=$resource->select();
		$data=$resource->query($sql);
		$pagelist=$page->fpage();
		$this->assign('data',$data);
		$this->assign('pagelist',$pagelist);
		$this->display();
	}
	public function delete(){
		$resource=D('Resource');
		$data=$resource->where(array('id'=>$_GET['id']))->delete();
		if($data){
			echo $this->success('删除成功！');
		}else{
			echo $this->error('删除失败!');
		}
	}

}