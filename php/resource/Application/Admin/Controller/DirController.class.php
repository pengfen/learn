<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 目录控制器
  * 作者: apeng
  * 时间: 2015-08-02
*/
class DirController extends BaseController{
	/**
	  * 后台目录列表
	*/
	public function index(){
		$pid = I('get.pid'); // 从项目列表进入
		$dir = D('Dir');
		if ($pid) {
			//获取后台目录列表信息
		    $info = $dir -> where(array('flag'=>'0', 'pid'=>$pid)) -> select();
		    $this -> assign('pid', $pid);
		} else {
			$search = I('get.search'); // 拼接搜索条件
			// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
			$page = new PageController();
			$count = $page -> getCount('name', $search, $dir, 'flag=0');
			$show = $page -> show($count);
			$info = $page -> page('name', $search, $dir, 'flag=0');
			$this -> assign('count', $count);
		    $this -> assign('page', $show);   
		}

		// 向模板中分配数据及显示模板
		$this -> assign('title', '后台目录列表');
		$this -> assign('flag', '0');
		$this -> assign('info', $info);
		$this -> display();
	}

	/**
	  * 前台目录列表
	*/
	public function showlist(){
		$search = I('get.search'); // 拼接搜索条件
		$dir = D('Dir');
		// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
		$page = new PageController();
		$count = $page -> getCount('name', $search, $dir, 'flag=1');
		$show = $page -> show($count);
		$list = $page -> page('name', $search, $dir, 'flag=1');
		// // 获取前台目录列表信息
		// $info = D('Dir') -> where(array('flag'=>'1')) -> select();
		// 向模板中分配数据及显示模板
		$this -> assign('title', '前台目录列表');
		$this -> assign('flag', '1');
		$this -> assign('info', $list);
		$this -> assign('count', $count);
		$this -> assign('page', $show);
		$this -> display('Dir/index');
	}

	/**
	  * 添加界面
	*/
	public function add(){
		$flag = I('get.flag'); // 获取前后台标志 0 后台 1 前台
		$pid = I('get.pid'); // 从项目列表进入
		$this -> assign('pid', $pid);
		$this -> assign('flag', $flag);
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		// 获取所对应的表 id,name(id=>name)
		$data = D('Assoc') -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	/**
	  * 添加数据
	*/
	public function insert(){
		// 执行收集数据及添加
		$dir = D('Dir');
		//$data = $dir -> create();
		$_POST['des'] = htmlspecialchars($_POST['des']);
		$res = $dir -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	/**
	  * 修改界面
	*/
	public function edit(){
		$id = I('get.id');
		$info = D('Dir') -> find($id);
		$this -> assign('info', $info);
		// 获取所属项目表的 id,name(id=>name)
		$pro = D('Project') -> getField('id,name', true);
		$this -> assign('pro', $pro);
		// 获取所对应的表 id,name(id=>name)
		$data = D('Assoc') -> getField('id,name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$dir = D('Dir');
		$info = $dir -> create();
		$res = $dir -> save();
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	/**
	  * 目录详细
	*/
	public function detail(){
		// 获取对应的信息
		$id = I('get.id');
		$info = D('Dir') -> find($id);
		// 转换信息(将字符串转成数组)
		$method = explode(',', $info['method']);
		$template = explode(',', $info['template']);
		$metmod = explode(',', $info['metmod']);
		// 根据aid 获取关联表中的信息
		$aid = $info['aid'];
		if ($aid != 0) {
			$assoc = D('Assoc') -> find($aid);
			$this -> assign('assoc', $assoc);
		}
		// 获取项目id 然后获取项目名
		$pid = $info['pid'];
		$name = D('Project') -> where(array('id'=>$pid)) -> getField('name');
		$this -> assign('pid', $pid);
		$this -> assign('name', $name);
		
		// 向模板中分配数据及显示模板
		$this -> assign('info', $info);
		$this -> assign('method', $method);
		$this -> assign('mod', $metmod);
		$this -> assign('template', $template);
		$this -> display();
	}

	/**
	  * 删除目录
	*/
	public function delete(){
		$id = I('get.id');
		$res = D('Dir') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Dir/index', array('mess'=>'删除成功')));
	}

	// 处理联级(根据项目名调用关联对应的表)
	public function ajaxAssoc(){
		$pid = I('get.pid');
		$info = D('Assoc') -> field('id, name') -> where(array('pid'=>$pid)) -> select();//getField('id,name', true);
		//dump($info);
		echo json_encode($info);
	}
}