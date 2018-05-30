<?php
   namespace Admin\Controller;
   // use Think\Controller;
   use Component\AdminController;
   // 角色控制器
   class RoleController extends AdminController{
        //显示角色列表
   	  public function showlist(){
   	      $info = D() -> table('shop_role') -> select();
   	      $this -> assign('info', $info);
   	      $this -> display('list');
   	   }

         // 显示添加界面
         public function add(){
            $this -> display();
         }

         // 处理添加的数据
         public function insert(){
            // print_r($_POST); Array ( [name] => 董事长 )
            // SHOW COLUMNS FROM `shop_role` INSERT INTO `shop_role` (`name`) VALUES ('董事长')\\\\\\\\\\
            $res = D('Role') -> add($_POST);
            if($res){
               $this -> assign('mess', '添加角色成功');
               $this -> display('list');
            } else {
               $this -> assign('mess', '添加角色失败');
               $this -> display('list');
            }
         }

   	    // 分配权限
   	    public function distribute($id){
   	    	if(!empty($_POST)){
   	    		// print_r($_POST); // Array ( [authname] => Array ( [0] => 1 [1] => 7 [2] => 8 ) )
   	    		// 收集数据
   	    		// 利用RoleModel 模型里边的一个专门方法实现权限分配
   	    		$role = new \Model\RoleModel();
   	    		// saveAuth 接收到一维数组信息
   	    		$z = $role -> saveAuth($_POST['authname'], $id);
   	    		if($z){
   	    	        $this -> success('分配权限成功', U('list'));
   	    		} else {
   	    			$this -> error('分配权限失败', U('list'));
   	    		}
   	    	} else {
   	    		// 根据 id 查询对应的角色名字
	   	    	//$rinfo = D('Role') -> getByRole_id($id);
               $rinfo = D('Role') -> where("id=$id") -> find();
	   	    	$this -> assign('name', $rinfo['name']);
	   	    	// 查询全部的权限信息 放入模板显示并进行权限分配
	   	    	// SELECT * FROM `yhd_auth` WHERE ( level=0 )
	   	    	$pinfo = D('Auth') -> where("level=0") -> select(); // 父级权限
	   	    	$sinfo = D('Auth') -> where("level=1") -> select(); // 次父级权限
               $tinfo = D('Auth') -> where("level=2") -> select(); // 次次父级权限


	   	    	// 把当前角色对应的权限信息给查询出来
	   	    	//$authinfo = D('Role') -> getByRole_id($id);
               $authinfo = D('Role') -> where("id=$id") -> find();
	   	    	// $auth_ids = $authinfo['auth_ids'];
	   	    	// $auth_ids_arr = explode(',', $auth_ids);
	   	    	// 合并二个语句 将1,6,7,8 转换数组
	   	    	$auth_ids_arr = explode(',', $authinfo['auth_ids']);
	   	    	//show_bug($auth_ids_arr);

	   	    	$this -> assign('auth_ids_arr', $auth_ids_arr);
	   	    	$this -> assign('pinfo', $pinfo);
	   	    	$this -> assign('sinfo', $sinfo);
               $this -> assign('tinfo', $tinfo);
	   	    	$this -> display();
   	    	}
   	    	
   	    }
   }