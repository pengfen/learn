<?php
    namespace Admin\Controller;
    // use Think\Controller;
    use Component\AdminController;

    class AuthController extends AdminController{
        // 显示权限列表
    	public function showlist(){
            // 获取所有的权限信息
    		$info = $this -> getinfo();
    		$this -> assign('info', $info);
    		$this -> display('list');
    	}

        // 添加界面
        public function add(){
            // 获取顶级,次顶级权限信息(不获取次次顶级)
            $info = $this -> getinfo(true);
            // 把$info里name 信息转换为数组 arrary(1 => '权限管理', 2 => '权限列表') 以方便在smarty 模板中使用{html_options}
            $authinfo = array();
            foreach ($info as $k => $v) {
                $authinfo[$v['id']] = $v['name'];
            }
            $this -> assign('authinfo', $authinfo);
            $this -> display();
        }

        // 添加数据
        public function insert(){
            // print_r($_POST); Array ( [name] => 角色列表 [pid] => 1 [cont] => Role [action] => showlist )
            // 在AuthModel 里边通过一个指定方法实现权限添加
            $auth = new \Model\AuthModel();
            $res = $auth -> addAuth($_POST);
            if($res){
                // echo 'success';
                // $this -> success('添加权限成功', U('list'));
                $this -> assign('mess', '添加权限成功');
                $this -> display('list');
            } else {
                // echo 'fail';
                // $this -> error('添加权限失败', U('list'));
                $this -> assign('mess', '添加权限失败');
                $this -> display('list');
            }
        }

    	public function add1(){ // 将add 拆分为二个 add显示添加界面 insert 负责添加数据
    		if(!empty($_POST)){
    			// print_r($_POST);
    			// 在AuthModel 里边通过一个指定方法实现权限添加
    			$auth = new \Model\AuthModel();
    			$res = $auth -> addAuth($_POST);
    			if($res){
    				// echo 'success';
                    $this -> success('添加权限成功', U('list'));
    			} else {
    				// echo 'fail';
                    $this -> error('添加权限失败', U('list'));
    			}
    		} else {
    			// 获取父类权限信息(不获取三级分类)
	    		$info = $this -> getinfo(true);
	    		// show_bug($info); // array(1 => '商品管理', 2 => '')
	    		// 从$info 里边获得信息 
	    		// 以方便在smarty 模板中使用{html_options}
	    		$authinfo = array();
	    		foreach ($info as $k => $v) {
	    			$authinfo[$v['id']] = $v['name'];
	    		}
	    		//show_bug($authinfo);
	    		$this -> assign('authinfo', $authinfo);
	    		$this -> display();
    		}
    	}

        // 获取权限信息
    	function getinfo($flag = false){
    		// 添加标志
    		// 如果$flag 标志为false 查询全部的权限信息
    		// 如果$flag 标志为true 只查询level= 0/1 的权限信息
    		$auth = D('Auth');
    		if($flag == true){
    			$info = D('Auth') -> where('level<2') -> order('path asc') -> select();
    		} else {
    			$info = D('Auth') -> order('path asc') -> select();
    		}
    		// $info = D('Auth') -> select();
    		// 使用order by 来排序
    		// $info = D('Auth') -> order('path asc') -> select();
    		// 处理缩进关系
    		foreach ($info as $k => $v) {
    			$info[$k]['name'] = str_repeat("&nbsp;&nbsp;", $v['level']).$info[$k]['name'];
    		}
    		return $info;
    	}
    }