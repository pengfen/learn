<?php
    // 普通控制器的父类(过滤当前请求的控制器和方法)
    namespace Component;
    use Think\Controller;
    class AdminController extends Controller{
    	function __construct(){
    		// 先执行父类的构造方法 否则系统会报错
    		// 因为原先的构造方法 默认是被执行的
    		parent::__construct();

    		// CONTROLLER_NAME ---> Goods
    		// ACTION_NAME ---> showlist
    		// ........\Goods\showlist 当前请求操作
    		$now_ac = CONTROLLER_NAME.'-'.ACTION_NAME;
    		// show_bug($now_ac); string 'Goods-showlist' (length=14)

    		// 过滤控制器和方法 避免用户非法请求
    		// 通过角色获取用户可以访问的控制器和方法信息
    		$sql = "select auth_ac from shop_mg a join shop_role b on a.rid=b.id where a.id=".$_SESSION['mg_id'];
    		//echo $sql;
    		$auth_ac = D() -> query($sql);
    		// show_bug($auth_ac); auth_ac' => string 'Power-list,Power-add,Power-loglist,Power-addlog' (length=47)
    		// 判断 $now_ac 是否在$auth_ac 字符串里边有出现过
    		// strpos 函数如果返回false 是没有出现返回 0 1 2 3 表示有出现过
    		// 管理员不限制
    		// 默认页面 没有权限限制
    		// Index/left Index/right Index/head Index/index Manager/login
    		// Manager-verify 不放行无法生成
    		$allow_ac = array('Index-left', 'Index-right', 'Index-head', 'Index-index', 'Manager-login', 'Manager-verify', 'Manager-checklogin');
    		if(!in_array($now_ac, $allow_ac) && $_SESSION['mg_id'] != 1 && strpos($auth_ac, $now_ac) === false){
    			$this -> error('你没有权限访问', U('Manager/login'));
    		}
    	} 

        // parent::effected 会直接报错 提示think/Controller 没有此方法
        // protected function effected($res, $success = '操作成功', $error = '操作失败'){
        //     if($res){
        //         $this -> assign('mess', $success);
        //         $this -> showlist();
        //     } else {
        //         $this -> assign('mess', $error);
        //         $this -> showlist();
        //     }
        // } 
    }