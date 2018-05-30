<?php
// 本类由系统自动生成，仅供测试用途
namespace Home\Controller;
use Think\Controller;
class CodeController extends Controller {
    public function index(){
        if($_POST){
            $_POST['code'];
            $this -> display('index');
        } else {
            $this -> display("index");
        }
    }

    public function showlist($id){
    	// 根据子分类的id 查找相关的内容
    	$ainfo = D('Article') -> where("pid=$id") -> select();
    	$this -> assign("ainfo", $ainfo);
    	// $this -> display("index");
    	$this -> index(328);
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