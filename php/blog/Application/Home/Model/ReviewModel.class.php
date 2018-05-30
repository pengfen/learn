<?php
/**
 *作者：陈
 *评论表model类
 **/
namespace Home\Model;
use \Think\Model;

class ReviewModel extends Model{
	protected $_auto = array(
			array('addtime','time',1,'function' ),
			

	);

	//根据cateid和id查询
	public function getReview($cateid,$pid,$path){
		$list = $this->where(array('cateid'=>$cateid,'pid'=>$pid,'path'=>$path))->select();
		//dump($list);
		return $list;
	}

	public function getUserReview($cateid,$owner,$path){
		$list = $this->where(array('cateid'=>$cateid,'owner'=>$owner,'path'=>$path))->select();
		//dump($list);
		return $list;
	}


	public function getReview2($cateid,$pid,$path){
		$map = array();
		$map['cateid'] = array('eq',$cateid);
		$map['pid'] = array('eq',$pid);
		$map['path'] = array('neq',$path);
		$list = $this->where($map)->select();
		//dump($list);
		return $list;
	}

}
