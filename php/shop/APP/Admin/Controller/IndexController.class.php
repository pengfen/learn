<?php
namespace Admin\Controller;
//use Think\Controller;
use Component\AdminController;
class IndexController extends AdminController {

	// 后台主页(使用分帧)
    public function index(){
        $this -> auth();
        $this -> display();
    }

    // 主页头部
    public function head(){
    	$this -> auth();
        $this ->  display();
    }

    // 主页左部导航
    public function left(){
        $this -> auth();
        // 获取权限(一级二级权限)
        // 1 使用原来sql 语句
        // $sql = "select * from shop_auth where level=0";
        // $pinfo = D() -> query($sql);
        // 2 使用select()
         $pinfo = D('Auth') -> where('level=0') -> select();
         $sinfo = D('Auth') -> where('level=1') -> select();
        // 3 使用find()
        // $pinfo = D('Auth') -> where('level=0') -> find();
        // 4 使用getFiled
        //$pinfo = D('Auth') -> where('level=0') -> getField('id, name', true);
        // 获取次顶级权限
        //$sinfo = D('Auth') -> where('level=1') -> getField('pid, name, cont, action');
        // show_bug($pinfo);
        // show_bug($sinfo);

        $this -> assign('pinfo', $pinfo);
        $this -> assign('sinfo', $sinfo);
    	$this -> display();
    }

    // 主页右部主体
    public function right(){
    	$this -> auth();
        $this -> display();
    }

    // 主页尾部
    public function foot(){
    	$this -> auth();
        $this -> display();
    }

    // 防止非法url 地址
    public function auth(){
        // 判断session 中是否有用户名
        if(empty($_SESSION['mg_name'])){
            $this -> redirect('Manager/login');
            exit;
        }
        // if(!empty($_SESSION['mg_name'])){
        //     //show_bug(get_defined_constants(true)['user']);
        //     $this -> display($view);
        // } else { // 用户没有登录就去登录界面
        //     //$this -> assign('mess', '你还没有登录');
        //     //$this -> display('Manager/login');
        //     $this -> redirect('Manager/login');
        // }
        //var_dump($_SESSION);
        //$this -> display();
    }
}