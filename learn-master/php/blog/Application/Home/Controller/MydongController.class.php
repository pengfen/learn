<?php
namespace Home\Controller;

/**
  * 动态控制器
  * 作者: apeng
  * 时间: 2015-07-30
*/
class MydongController extends HomeController{
	/**
	  * 我的动态
	*/
	public function index(){
		// 获取当前用户id
		$uid = $_SESSION['uid'];
		if ($uid) {
			$id = $uid; // 如果有uid 说明是访客
		} else {
			$id = $_SESSION['user']['id'];
		}
		
		// 根据当前用户id 查找record 表(前十条记录)
		$data = D('Record') -> where(array('uid'=>$id)) -> order('addtime desc') -> limit(10) -> select();
		if ($data) {
			// 添加用户名和用户头像
			$user = new MoodController();
			$list = $user -> foreachGetUser($data, 'uid'); // 会循环多次
			foreach ($list as $key => $v) {
				$userinfo = array_slice($v, -2, 2);
				// dump(array_slice($v, 4, 2));
				// dump(array_slice($v, -2, 2));
				break;
			}
			$this -> assign('username', $userinfo['username']);
			$this -> assign('headimg', $userinfo['headimg']);
			// 获取limit 条件
			$cond = $this -> getLimitCondition($data);
			$cond = explode(',', $cond);
			$mood = $cond[0];
			if ($mood) { // 处理说说
				$say = D('Mood') -> where(array('uid'=>$id)) -> order('addtime desc') -> limit($mood) -> select();
			}
			$log = $cond[1];
			if ($log) { // 处理日志
				// 查当前用户的所有日志分类id
				$cate = new LogController();
				$map = $cate -> getLogCateId();
			    $map = "cid in (".$map.")";
				$info = D('Log') -> where($map) -> order('addtime desc') -> limit($log) -> select();
			}
			$album = $cond[2];
			if ($album) { // 处理相册
				echo '不调用';
			}
			
			$data = $this -> sort($say, $info); // 执行排序
		} else {
			$data = '';
		}
		// 根据操作和对应的时间查找对应的表
		$this -> assign('list', $data);
		$this -> display();
	}


	/**
	  * 好友的动态
	*/
	public function friend(){
		// 获取当前用户id
		$uid = $_SESSION['uid'];
		if ($uid) {
			$id = $uid; // 如果有uid 说明是访客
		} else {
			$id = $_SESSION['user']['id'];
		}
		// 获取当前用户的所有好友id
		$fid = D('Friend') -> where(array('uid'=>$id)) -> getField('fidlist', true);
		$fid = ltrim($fid[0], ',');
		$map = "uid in (".$fid.")";
		// 根据当前用户id 查找record 表
		$data = D('Record') -> where($map) -> order('addtime desc') -> limit(10) -> select();
		if ($data) {
			// 获取用户的头像和用户名
			$user = new MoodController();
		    $list = $user -> foreachGetUser($data, 'uid'); // 会循环多次
		    foreach ($list as $key => $value) {
		    	$userinfo[$key] = array_slice($value, -2, 2);
		    }
		    // 获取limit 条件
			$cond = $this -> getLimitCondition($data);
			$cond = explode(',', $cond);
			$mood = $cond[0];
			if ($mood) { // 处理说说
		        $say = D('Mood') -> where($map) -> order('addtime desc') -> limit($mood) -> select();
			}
			$log = $cond[1];
			if ($log) { // 处理日志
				$logData = D('LogCate') -> where($map) -> select(); // 查询日志分类
				// 查当前用户的所有好友日志分类id
				$cate = new LogController();
				$map = $cate -> getLogCateId($logData);
				$map = "cid in (".$map.")";
				$info = D('Log') -> where($map) -> order('addtime desc') -> limit($log) -> select();
			}
			$album = $cond[2];
			if ($album) { // 处理相册
				echo '不调用';
			}
			$data = $this -> sort($say, $info);
			$count = count($data);
			foreach ($data as $key => $value) {
				$data[$key] = array_merge($value, $userinfo[$count - $key - 1]);
			}
		}
		$this -> assign('list', $data);
		$this -> display();
	}
	/**
	  * 执行按时间排序
	*/
	private function sort($say, $info){
		$data = array_merge($say, $info);
		if ($data) { // 非空处理
			foreach ($data as $key => $v) {
				$soft[$key] = $v['addtime'];
			}
			array_multisort($soft, $data); // 按时间的排序
			// 再反向排序
			krsort($data);
		} else {
			if ($say) { // 非空处理
			    $data = $say;
			}
			if ($info) { // 非空处理
			    $data = $info;
			}	
		} 
		return $data;
	}

	/**
	  * 获取说说 日志 图片等动态的limit 条件
	*/
	private function getLimitCondition($data){
		$mood = 0;
		$log = 0;
		$album = 0;
		foreach ($data as $key => $v) { // 拼接时间操作
			if ($v['oper'] == 0) { // 说说操作
				// $mood .= $v['addtime'].',';
				$mood += 1;
			}
			if ($v['oper'] == 1) { // 日志操作
				$log += 1;
			}
			if ($v['oper'] == 2) { // 相册操作
				$album += 1;
			}
		}
		return $mood.','.$log.','.$album;
	}
}