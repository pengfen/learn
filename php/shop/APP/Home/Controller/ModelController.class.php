<?php
// 本类由系统自动生成，仅供测试用途
namespace Home\Controller;
use Think\Controller;
class ModelController extends Controller {
    public function index(){
        echo $id;
    	$cinfo = D('Categorys') -> where("cate=3") -> select();
    	$this -> assign("cinfo", $cinfo);
	    $this -> display("index");
    }

    public function showlist($name){
    	// 根据子分类的id 查找相关的内容
    	$ainfo = D('Article') -> where("title='{$name}'") -> select();
    	$this -> assign("ainfo", $ainfo);
    	// $this -> display("index");
    	$this -> index($id);
    }

    public function detail($id){
    	//
    	$ainfo = D('Article') -> find($id);
        //show_bug($ainfo);
        $content = nl2br($ainfo['content']);
    	$this -> assign('ainfo', $ainfo);
        $this -> assign('content', $content);
    	$this -> display();
    }
}