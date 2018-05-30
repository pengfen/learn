<?php 
/**
 *作者：陈
 *好友表模型
 *时间:7.30
 */
namespace Home\Model;
use \Think\Model;

class FriendModel extends Model{

	/*
	*功能：获取指定用户好友表
	*返回值：返回该用户好友字段【数组】
	*/
	public function getUserFriendList($uid){
		$rs = $this->field('fidlist')->where(array('uid'=>$uid))->find();
		$list = $rs['fidlist'];
		//分割为数组
		$list = explode(',',trim($rs['fidlist'],','));
		return $list;
	}
	
	//删除指定用户好友表中的某个用户
	public function delFriend($uid,$fid){
		//获取到该用户的好友表
		$list = $this->getUserFriendList($uid);
		//在上步数据中剔除ID为fid的数据
		foreach ($list as $key => $value) {
			if($value == $fid){
				unset($list[$key]);
			}
		}
		//转换为字符串存入数据库
		$fidlist = implode(',', $list);
		$this->where(array('uid'=>$uid))->setField('fidlist',$fidlist);

	}
	
}