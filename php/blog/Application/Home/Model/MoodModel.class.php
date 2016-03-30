<?php
/**
 *作者：陈
 *用户表model类
 **/
	namespace Home\Model;
	use \Think\Model;

	class MoodModel extends Model{
		protected $_auto = array(
			
			array('addtime','time',1,'function' ),
			);

		public function getMoodListById($uid){
			$list=$this->where(array('uid'=>$uid))->order('addtime desc')->select();
			if($list){
				return $list;
			}else{
				return false;
			}
			
		}


		

	}