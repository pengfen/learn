<?php
    namespace Model;
    use Think\Model;
    class AuthModel extends Model{
    	// 添加权限方法
    	function addAuth($auth){
    		// $auth 里边存4个信息 还缺少两个关键信息 path, level
    		// insert 生成一个新记录
    		// update 更新 path, level
    		$new_id = $this -> add($auth); // 返回新记录的主键id 值

    		// path 的值分为两种情况
    		// 全路径 父级全路径与本身id 的连接信息
    		// 当前权限是顶级权限 path=$new_id
    		// 当前权限是非顶级权限 path=父级全路径+$new_id
    		if($auth['pid'] == 0){
    			$path = $new_id;
    		} else {
    			// 查询指定父级的全路径 条件 $auth['pid']
    			// 查询父级的记录信息
                //INSERT INTO `shop_auth` (`name`,`pid`,`cont`,`action`) VALUES ('角色列表',1,'Role','showlist') 
//SELECT * FROM `shop_auth` WHERE ( `id` = 1 ) LIMIT 1 
//UPDATE `shop_auth` SET `path`='1-7',`level`=1 WHERE ( `id` = 7 )
    			$pinfo = $this -> find($auth['pid']);
    			$p_path = $pinfo['path']; // 父级全路径
    			$path = $p_path.'-'.$new_id;
    		}

    		// auth_level 数目 全路径里边中划线的个数
    		// 把全部变为数组 计算数组的个数和减去1 就是level 的信息
    		$level = count(explode('-', $path)) - 1;
    		$res = array(
    			'id' => $new_id,
    			'path' => $path,
    			'level' => $level
    			);
    		return $this -> save($res);
    	}
    }