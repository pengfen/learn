<?php
namespace Home\Controller;
use Think\Controller;

/**
  * 日志分类控制器
  * 作者: apeng
  * 时间: 2015-07-30
*/
class LogCateController extends HomeController{
	/**
	  * 日志分类首页
	*/
	public function index(){
		// 查询当前用户日志分类(不包含默认分类)
		$map = array();
		$map['uid'] = $_SESSION['user']['id'];
		$map['flag'] = 0;
		$map['_logic'] = 'and';
		$data = D('LogCate') -> where($map) -> select();
		// 向模板中分配数据及显示模板
		$this -> assign('list', $data);
		$this -> display();
	}

	

	/**
	  * 添加日志分类
	*/
	public function insert(){
		$name = I('get.name');
		$cate = D('LogCate'); // new \Home\Model\LogCateModel;
		$_GET['uid'] = $_SESSION['user']['id'];
		$_GET['flag'] = '0'; // 自定义分类的标志设置为1
		$cate -> create();
		$res = $cate -> add($_GET);
		$this -> message($res, '添加成功', '添加失败');
	}

	/**
	  * 修改日志分类
	*/
	public function update(){
		$id = I('get.id');
		$name = I('get.name');
		$cate = D('LogCate');
		$cate -> create();
		$res = $cate -> save($_GET);
		$this -> message($res, '修改成功', '修改失败');
	}

	/** 
	  * 删除分类
	*/
	public function delete(){
		$id = I('get.id');
		// 查询本分类下的所有日志id
		$lid = D('Log') -> where(array('cid'=>$id)) -> getField('id', true);
		dump($lid);
		// 查询个人日志的id号
		$map = array();
		$map['uid'] = $_SESSION['user']['id'];
		$map['name'] = '个人日志';
		$cid = D('LogCate') -> where($map) -> getField('id');
		// 将日志分类下的所有日志的cid 设置为个人日志
		
		$res = D('LogCate') -> delete($id);
		$this -> message($res, '删除成功', '删除失败');
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