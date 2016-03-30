<?php
namespace Home\Controller;
/**
  * author:lishuo
  * time:2015-8-4
  * 照片类
*/
class PhotoController extends HomeController{
	//展示照片
	public function index(){
	    $id=$_GET['id'];
	    //实例化照片
	    $photo=D('Photo');
	    $data=$photo->where(array('aid'=>$id))->select(); 
	   	//实例化相册
	    $album=D('Album');
	    //相册浏览量+1
	    $m=$album->where(array('id'=>$id))->getField('scan');
	    $album->where(array('id'=>$id))->setField('scan',$m+1);
	    $list=$album->where(array('id'=>$id))->find();
	    
	    //调用本类中方法review
	    $rev=$this->review($id);
	    // dump($rev);
	  	//数据分配至模板
	    $this->assign('data',$data);
	    $this->assign('list',$list); 
	    $this->assign('rid',$id);
	    $this->assign('rev',$rev);	
		$this->display();
	}

	//查询本相册照片的评论
	public function review($id){
		 $review=D('PhotoReview');
		 //三表，评论表、用户表、头像表
	     $sql="select h.head_img_small,u.username,p.content,p.addtime from blog_photo_review as p left join blog_user as u on p.sender=u.id left join blog_head_img as h on u.id=h.uid where p.rid=$id order by p.addtime desc limit 5";
	     $rev=$review->query($sql);
	     
	     return $rev;
	     // dump($rev);
	}
	
	//添加照片
	public function insert(){
		$photo=D('Photo');
		$_POST['addtime']=time();
		$data=$photo->uploads();
		//创建数据
		if(!$photo->create()){
			echo $this->error($photo->getError());
		}

		//执行添加
		if($photo->add()>0){
			echo $this->success('上传成功！');
		}else{
			echo $this->error('上传失败');
		}	
	}

	//执行照片点赞
	public function good(){
		$good=M('PhotoGood');
		$data['user_id']=$user_id=$_SESSION['user']['id'];
		$row=$good->where(array('user_id'=>$user_id))->find();
		// if($row){  //只能点赞一次
		// 	echo 0;
		// }else{
			  $data['photo_id']=$_GET['id'];
			  $data['addtime']=time();
			  $good->create($data);
			  $good->add(); //添加点赞表记录
			  $photo=D('Photo');//修改照片表的点赞数
			  $num=$photo->where(array('id'=>$_GET['id']))->getField('good');
			  $photo->where(array('id'=>$_GET['id']))->setField('good',$num+1);
			  echo $good=$photo->where(array('id'=>$_GET['id']))->getField('good');

		// }
	}

}
