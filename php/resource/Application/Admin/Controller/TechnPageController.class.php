<?php
namespace Admin\Controller;
/**
  * 技术资料分类后台控制器
  * 作者: apeng
  * 时间: 2016-03-05
*/
class TechnPageController extends BaseController{
 
	/**
	  *  技术资料分类列表
	*/
	public function index(){
        $info = D('TechnCate') -> where(array('flag' => '1', 'pid' => '0')) -> select();
        $this -> assign('info', $info);
        $this -> display();
    }

    /**
      * 显示一级分类
    */
    public function show(){
    	$id = I('get.id');
        if ($id) {
            $info = D('TechnCate') -> where(array('flag' => '1', 'pid' => $id)) -> select();
            if (!$info) { // 显示最后级分类下的文章
                $info = D('Techn') -> where(array('pid' => $id)) -> select();
                $this -> assign('flag', '1');
            } 
            $this -> assign('info', $info); 
            $this -> display();
        }
    }

    /**
      * 显示文章详情
    */
    public function techn(){
        $id = I('get.id');
        if ($id) {
            $info = D('Techn') -> where(array('id' => $id)) -> find();
            $this -> assign('info', $info); 
            $this -> display();
        }
    }

}