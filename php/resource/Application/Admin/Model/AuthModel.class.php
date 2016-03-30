<?php
namespace Admin\Model;
use \Think\Model;

/**
  * 权限模型
  * 作者: apeng
  * 时间: 2015-07-28
*/
class AuthModel extends Model{
	
	/**
	  * 添加权限方法
	  * $auth 包括字段 name pid controller action 手动添加 path level
	*/
	function addAuth($auth){
		// insert 生成一个新记录 update 更新 path, level
		$this -> create();
		$new_id = $this -> add($auth);

		$path = $this -> getPath($auth['pid'], $new_id);
		// level 全路径里边中划线的个数
		$level = count(explode('-', $path)) - 1;
		// 判断 $_FILES
		if (!empty($_FILES)) {
			$config = array(
				'rootPath' => './Public/',
				'savePath' => 'Uploads/',
				);
			$upload = new \Think\Upload($config);
			$res = $upload -> uploadOne($_FILES['image']);
			if (!$res) {
				// 输出错误信息
			}
			$image = $res['savepath'].$res['savename'];
		} else {
			$image = '';
		}
		$res = array(
			'id' => $new_id,
			'image' => $image,
			'path' => $path,
			'level' => $level
			);
		return $this -> save($res);
	}

	/**
	  * 修改权限的方法
	  * $auth 包括字段 id name pid controller action 手动添加 path level
	*/
	function updAuth($auth){
		$this -> create();
		$path = $this -> getPath($auth['pid'], $auth['id']);
		$level = count(explode('-', $path)) - 1;
		$res = array(
			'id' => $auth['id'],
			'name' => $auth['name'],
			'pid' => $auth['pid'],
			'controller' => $auth['controller'],
			'action' => $auth['action'],
			'path' => $path,
			'level' => $level
			);
		return $this -> save($res);
	}

	/**
	  * 获取全路径
	  * $pid 权限父id
	  * $id 记录id 
	*/
	private function getPath($pid, $id){
		// path 父级全路径与本身id 的连接信息 如 1-3 (顶级权限则为id本身)
		if ($pid == 0) {
			$path = $id; // 顶级权限
		} else { // 1-3 ...
			$pinfo = $this -> find($pid);
			$p_path = $pinfo['path'];
			$path = $p_path.'-'.$id;
		}
		return $path;
	}
}
