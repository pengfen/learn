<?php
    namespace Model;
    use Think\Model;
    class RoleModel extends Model{
    	// 权限分配
    	// $auth 是一维数组信息 给当前角色分配的权限id 信息
    	public function saveAuth($auth, $id){
    		// 把权限id 信息变为数组 中间用逗号的分隔的字符串信息
    		$auth_ids = implode(',', $auth); // string '1,7'
    		// show_bug($auth_ids);
    		// 根据 ids 权限id 信息查询具体操作方法信息
    		// $info = $this -> select($auth_ids);
    		$info = D('Auth') -> select($auth_ids);
    		//show_bug($info);
    		$auth_ac = ''; // 拼接ac
    		foreach ($info as $k => $v) {
    			if(!empty($v['cont']) && !empty($v['action'])){
    				$auth_ac .= $v['cont'].'-'.$v['action'].',';
    			}
    		}
    		$auth_ac = rtrim($auth_ac, ','); // 删除最右边的逗号
    		//show_bug($auth_ac);
    		$dt = array(
    			'id' => $id,
    			'auth_ids' => $auth_ids,
    			'auth_ac' => $auth_ac
    			);
    		return $this -> save($dt);
    	}
    }