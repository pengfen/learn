<?php
namespace Admin\Model;
use \Think\Model;

/**
  * 角色模型
  * 作者: apeng
  * 时间: 2015-07-29
*/
class RoleModel extends Model{
	/**
	  * 分配权限
	  * $auth 分配的所有权限
	  * $id 要分配权限的角色id
	*/
	public function saveAuth($auth, $id) {
		$aids = implode(',', $auth); // 拼到所有权限id
		$info = D('Auth') -> select($aids); // 根据id 查出对应的权限
		$aac = '';
		foreach ($info as $k => $v) {
			if (!empty($v['controller']) && !empty($v['action'])) {
				$aac .= $v['controller'].'-'.$v['action'].',';
			}
		}
		$aac = rtrim($aac, ',');
		//dump($aids.' : '.$aac);
		$res = array(
			'id' => $id,
			'aids' => $aids,
			'aac' => $aac
			);
		return $this -> save($res);
	}
}