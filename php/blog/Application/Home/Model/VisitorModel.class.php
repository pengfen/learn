<?php
/**
 *作者：陈
 *访客表model类
 **/
namespace Home\Model;
use \Think\Model;

class VisitorModel extends Model{
	protected $_auto = array(
				
				array('addtime','time',1,'function' ),
	);

	//获取用户最近来访表
	public function visitorListByUid($uid){
		$list = $this->where(array('uid'=>$uid))->order('addtime desc')->limit('9')->group('visitor')->select();
		return $list;
	}
}