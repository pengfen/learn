<?php
namespace Home\Controller;

/**
  * 日志控制器
  * 作者: apeng
  * 时间: 2015-07-30
*/
class LogController extends HomeController{
	/**
	  * 日志首页
	*/
	public function index(){
		// 判断是否是访客
		$uid = $_SESSION['uid'];
		if ($uid) {
			$this -> assign('flag', 1);
		}
		$data = $this -> getLogCate(); // 查询日志分类
		$map = '';
		foreach ($data as $key => $v) {
			$map .= $v['id'].',';
		}
		$map = rtrim($map, ',');
		if ($map) {
			$map = "cid in (".$map.") and flag=0";
		    // SELECT * FROM `blog_log` WHERE (cid in (8,9,10,11,13) )
		    $log = D('Log') -> where($map) -> select(); // 显示日志
		}
		// 向模板中分配数据及显示模板
		$this -> assign('title', '我的日志');
		$this -> assign('log', $log);
		$this -> assign('list', $data);
		$this -> display();
	}

	/**
	  * 私密日志首页
	*/
	public function seclist(){
		$data = $this -> getLogCate(); // 查询日志分类
		$map = '';
		foreach ($data as $key => $v) {
			$map .= $v['id'].',';
		}
		$map = rtrim($map, ',');
		if ($map) {
			$map = "cid in (".$map.") and auth=3" ;
		    // SELECT * FROM `blog_log` WHERE (cid in (8,9,10,11,13) )
		    $log = D('Log') -> where($map) -> select(); // 显示日志
		}
		
		//echo (D('Log') -> getLastSql());
		// 向模板中分配数据及显示模板
		$this ->  assign('title', '私密日志');
		$this -> assign('log', $log);
		$this -> assign('list', $data);
		$this -> display('Log/index');
	}

	/**
	  * 回收站
	*/
	public function trash(){
		$data = $this -> getLogCate(); // 查询日志分类
		$map = '';
		foreach ($data as $key => $v) {
			$map .= $v['id'].',';
		}
		$map = rtrim($map, ',');
		if ($map) {
			$map = "cid in (".$map.") and flag=1" ;
		    // SELECT * FROM `blog_log` WHERE (cid in (8,9,10,11,13) )
		    $log = D('Log') -> where($map) -> select(); // 显示日志
		}
		//echo (D('Log') -> getLastSql());
		// 向模板中分配数据及显示模板
		$this -> assign('title', '回收站');
		$this -> assign('trash', '1');
		$this -> assign('log', $log);
		$this -> assign('list', $data);
		$this -> display('Log/index');
	}

	/**
	  * 获取日志分类
	*/
	public function getLogCate(){
		$map = array();
		$map['uid'] = $_SESSION['user']['id'];
		$data = D('LogCate') -> where($map) -> select(); // 查询日志分类
		return $data;
	}

	/**
	  * 拼接日志分类id
	*/
	public function getLogCateId($data){
		if (!$data) { // 设置默认值
			$data = $this -> getLogCate(); // 查询日志分类
		}
		$map = '';
		foreach ($data as $key => $v) {
			$map .= $v['id'].',';
		}
		$map = rtrim($map, ',');
		return $map;
	}

	/**
	  * 添加界面
	*/
	public function add(){
		// 获取当前用户的日志分类
		// $map = array();
		// $map['uid'] = $_SESSION['user']['id'];
		// $data = D('LogCate') -> where($map) -> select();
		$data = $this -> getLogCate();
		$this -> assign('list', $data);
		$this -> display();
	}

	/**
	  * 修改界面
	*/
	public function edit(){
		$id = I('get.id');
		$info = D('Log') -> where(array('id'=>$id)) -> find();
		$data = $this -> getLogCate();
		$this -> assign('list', $data);
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$id = I('get.id');
		$title = I('get.title');
		$content = htmlspecialchars($_GET['content'], ENT_QUOTES);
		$data = array(
			'id' => $id,
			'title' => $title,
			'content' => $content
			);
		$res = D('Log') -> save($data);
		// echo (D('Log') -> getLastSql());
		if ($res) {
			echo '修改成功';
		} else {
			echo '修改失败';
		}
	}

	/**
	  * 添加数据
	*/
	public function insert(){
		$_GET['title'] = I('get.title');
		$_GET['content'] = htmlspecialchars($_GET['content'], ENT_QUOTES);
		$_GET['addtime'] = time();
		$res = D('Log') -> add($_GET);
		// echo $log->getLastSql();
		if ($res) {
			// 向日志分类表中修改总数
			$id = I('get.cid');
			$total = D('LogCate') -> where(array('id'=>$id)) -> find();
			$total = ($total['total'] + 1);
			$data = array(
				'id' => $id,
				'total' => $total
				);
			D('LogCate') -> save($data);
			$action = D('Record');
			$_GET['uid'] = $_SESSION['user']['id'];
			$_GET['oper'] = '1';
			//$_GET['addtime'] = time();
			$action->add($_GET);
			echo '添加成功';
		} else {
			echo '添加失败';
		}
	}

	/**
	  * 删除
	*/
	public function delete(){
		$id = I('get.id');
		$log = D('Log');
		$sql = "update blog_log set flag=1 where id='{$id}'";
		$res = $log -> execute($sql);
		$trash = I('get.id'); // 回收站过来(执行删除)
		if ($trash) {
			$res = $log -> delete($id); 
		}

		//dump(D('Log') -> getLastSql());
		if ($res) {
			echo '删除成功';
		} else {
			echo '删除失败';
		}
	}

	/**
	  * 转为私密日志
	*/
	public function secret(){
		$id = I('get.id');
		$data = array(
			'id' => $id,
			'auth' => 3
			);
		$res = D('Log') -> save($data);
		if ($res) {
			echo '转为私密日志成功';
		} else {
			echo '转为私密日志失败';
		}
	}

	/**
	  * 修改权限
	*/
	public function updAuth(){
		$id = I('get.id');
		$auth = I('get.auth');
		$cate = D('Log');
		$cate -> create();
		$res = $cate -> save($_GET);
		$this -> message($res, '修改成功', '修改失败');
	}

	/**
	  * 修改所属日志分类
	*/
	public function updCate(){
		$id = I('get.id');
		$cid = I('get.cid');
		$data = array(
			'id' => $id,
			'cid' => $cid
			);
		$res = D('Log') -> save($data);
		$this -> message($res, '修改成功', '修改失败');
	}

	/**
	  * 日志详情
	*/
	public function detail(){
		// 判断是否是访客
		$vid = $_SESSION['uid'];
		if ($vid) {
			$this -> assign('flag', 1);
			$this -> assign('uid', $vid);
		}
		$id = I('get.id');
		$uid = $_SESSION['user']['id'];
		if ($uid) { // 获取到用户名
			$name = D('User') -> where(array('id'=>$uid)) -> getField('username');
			$this -> assign('username', $name);
		}
		$info = D('Log') -> where(array('id'=>$id)) -> find();
		// 将阅读数加一
		$views = $info['views'] + 1;
		$data = array(
			'id' => $id,
			'views' => $views
			);
		D('Log') -> save($data);
		//$content = nl2br($data['content']);
		//$this -> assign('content', $content);
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 好友日志
	*/
	public function friend(){
		// 获取当前用户的所有好友
		$id = $_SESSION['user']['id'];
		$data = D('Friend') -> where(array('uid'=>$id)) -> find();
		$map = ltrim($data['fidlist'], ',');
		$map = "uid in (".$map.")";
		$cate = D('LogCate') -> where($map) -> getField('id', true);
		// 将数据$cate 转为id 组成的字符串
		$cond = implode(',', $cate);
		$map = "cid in (".$cond.")";
		$log = D('Log') -> where($map) -> order('addtime desc') -> select();
		$this -> assign('info', $log);
		$this -> display();
	}

	/**
	  * 主题界面
	*/
	public function theme(){
		$this -> display();
	}

	/**
	  * 提示成功或失败信息
	  * @param $suc 成功信息
	  * @param $err 失败信息
	  * @param $res 连接数据库时返回的结果
	*/
	private function message($res, $suc, $err) {
		if ($res) {
			$this -> success($suc, U('Log/index', array('mess'=>$suc)), 0);
			// $this -> assign('mess', $suc);
			// $this -> display('index');
		} else {
			$this -> error($err);
			// $this -> assign('mess', $err);
			// $this -> display('index');
		}
	}
}