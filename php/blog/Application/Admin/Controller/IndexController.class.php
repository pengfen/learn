<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 后台首页控制器
  * 作者: apeng
  * 时间: 2015-07-27
*/
class IndexController extends BaseController {
	/**
	  * 后台首页
	*/
    public function index(){
        // 判断用户是否登录
        if (empty($_SESSION['manager'])) {
            $this -> redirect('Login/login');
            exit;
        }
        // 向模板中分配数据及显示模板
        $this -> assign('title', '后台首页');
        $this -> display();
    }

    /**
      * 消息推送
    */
    public function message(){ // 长轮询
    	// set_time_limit(0);
        // $i = 0;
        while (true) {
            $data = D('Advice') -> where(array('isread'=>0)) -> select(); // 查询未读消息
            echo json_encode($data);
            break; // 前端得使用延时加载技术
            // $i ++;
            // if ($i == 29) {
            //     break;
            // }
            sleep(1);
        }
    }

    /**
      * 处理所有面包路径
    */
    public function breadcrumb(){
        $controller = I('get.controller');
        $action = I('get.action');
        // 根据控制器和操作方法查找名字
        $name = D('Auth') -> where(array('controller'=>$controller,'action'=>$action)) -> getField('name');
        echo $name;
        // echo json_encode($data);
    }
}