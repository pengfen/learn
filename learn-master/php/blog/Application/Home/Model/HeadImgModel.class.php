<?php
/**
 *作者：陈
 *用户头像表model类
 **/
	namespace Home\Model;
	use \Think\Model;

	class HeadImgModel extends Model{
		protected $_auto = array(
			
			array('addtime','time',1,'function' ),
			);
		//按照用户名查找头像
		public function getUserHead($uid){
			$head = $this->where(array('uid'=>$uid))->find();
			$mid_head = $head['head_img_middle'];
			return $mid_head;
		}

		//根据用户ID查找用户所有尺寸的头像
		public function getUserHeadList($uid){
			$headlist = $this->where(array('uid'=>$uid))->find();
			return $headlist;
		}
	}