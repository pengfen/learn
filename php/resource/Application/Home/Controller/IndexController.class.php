<?php
namespace Home\Controller;
use Think\Controller;
/**
* 前台首页
* 作者: apeng
* 时间: 2015-09-19
*/
class IndexController extends Controller {
	// 首页
    public function index(){
    	// 加载第一张图片
    	$info = D('BusinessLogic') -> find(array('id'=>'1'));
    	$this -> assign('info', $info);
        $this -> display();
    }

    // 二级分类页
    public function showlist(){
        // 查找所有方向
        $direct = D('Direct') -> select();
        $this -> assign('direct', $direct);
        // 查找课程下的所有二级分类
        $cate = D('Categorys') -> where(array('pid'=>'1')) -> select();
        $this -> assign('cate', $cate);
        // 查找所有难度级别
        $difficult = D('Difficult') -> select();
        $this -> assign('difficult', $difficult);

        // 过滤条件
        // 查找所有二级分类下的三级分类
        $id = '';
        foreach ($cate as $key => $v) {
            $id .= $v['id'].',';
        }
        $id = rtrim($id, ',');
        if ($id) {
            $id = "pid in (".$id.")";
            $three = D('Categorys') -> where($id) -> select();
        }
        $this -> assign('three', $three);
    	$this -> display();
    }

    
}