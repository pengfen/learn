<?php
/**
 *作者：陈
 *用户表model类
 **/
namespace Home\Model;
use \Think\Model;

class MessageModel extends Model{
	protected $_auto = array(
		array('addtime','time',1,'function' ),
		
			);

	public function getMessageById($uid){
		$list = $this->where(array('uid'=>$uid,'pid'=>0))->order('addtime desc')->limit(4)->select();
		return $list;
	}
}