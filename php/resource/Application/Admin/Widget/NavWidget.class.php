<?php
namespace Admin\Widget;
use Think\Controller;

/**
* 导航组件
* 作者: apeng
* 时间: 2015-07-29
*/
class NavWidget extends Controller{
    /**
      * 导航菜单
    */
    public function menu(){
        $data = M('Auth');
        $rid = $_SESSION['manager']['rid']; // 获取当前用户的rid
        $aids = '';
        if ($rid != 0) { // 获取当前用户的所有权限id
            $aids = D('Role') -> where(array('id'=>$rid)) -> getField('aids', true);
        }
        // 查找一级权限
        if ($aids) {
            $where = "id in (".$aids[0].") and level = 0";
            $pdata = $data -> where($where) -> select();
        } else {
            $map = array();
            $map['level'] = array('eq', 0);
            $pdata = $data -> where($map) -> select();
        }
        
        // 查找二级权限
        if ($aids) {
            $where = "id in (".$aids[0].") and level = 1";
            $cdata = $data -> where($where) -> select();
        } else {
            $map = array();
            $map['level'] = array('eq', 1);
            $cdata = $data -> where($map) -> select();
        }
        $this->assign('plist', $pdata);
        $this->assign('clist', $cdata);
        $this->display('Index/menu');
    }

    /**
      * 
    */
    public function message(){
        $this -> display('Index/message');
    }
}