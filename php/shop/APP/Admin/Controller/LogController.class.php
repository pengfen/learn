<?php
    namespace Admin\Controller;
    use Component\AdminController;

    class LogController extends AdminController{
        // 显示日志列表
    	public function showlist(){
            // 获取所有的权限信息 SELECT * FROM `shop_log`
    		$info = D('Log') -> select();
    		$this -> assign('info', $info);
    		$this -> display('list');
    	}

        // 添加界面
        public function add(){
            $this -> display();
        }

        // 添加数据
        public function insert(){
            // print_r($_POST); Array ( [tit] => 测试文件 [text] => [content] => 测试文件 )
            // 在AuthModel 里边通过一个指定方法实现权限添加
            $_POST['addtime'] = time();
            $res = D('Log') -> add($_POST);
            if($res){
                $this -> assign('mess', '添加权限成功');
                $this -> display('list');
            } else {
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
    }