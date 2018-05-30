<?php
    namespace Admin\Controller;
    // use Think\Controller;
    use Component\AdminController;

    // 公共信息处理action
    class ManagerController extends AdminController{

    	// 加载登录界面
    	public function login(){
    		// 对应于View/Manager/login.html
    		// $this -> display();
    		// get_defined_constants(true) 获取系统常量信息
    		// true 参数会把常量进行自动分组显示
    		// get_defined_constants()['user'] 获取用户相关的常量
    		// var_dump(get_defined_constants(true)['user']);
    		$this -> display('login');
    	}

    	// tp 框架对验证码支持使用
    	// ThinkPHP/Library/Think/Verity.class.php(15 行)
    	// $verify = new namespace/verify(); // 创建一个验证码对象
    	// $verify -> entry(); 生成一个验证码
    	// 一个单独的方法生成验证码(制作专门方法实现验证码生成)
    	public function verify(){
    		// 以下类Verify 在之前并没有include 引入
    		// 走自支加载 Think.clas.php
    		// $config = array(
    		// 	'imageH'   => 40,      // 验证码图片高度
    		// 	'imageW'   => 100,      // 验证码图片宽度
    		// 	'fontSize' => 14,      // 验证码字体大小
    		// 	'length'   => 4,       // 验证码长度(4个字符)
    		// 	'fontttf'  => '4.ttf', // 验证码字体 不设置随机获取
    		// 	);
    		// $verify = new \Think\Verify($config);
    		// $verify -> entry();
    		// 第二种获取
    		$verify = new \Think\Verify();
    		// http://localhost/shop/index.php/Admin/Manager/verify
    		//show_bug($verify); 
    		//object(Think\Verify)[6]
  // protected 'config' => 
  //   array (size=12)
  //     'seKey' => string 'ThinkPHP.CN' (length=11)
  //     'expire' => int 1800
  //     'useZh' => boolean false
  //     'useImgBg' => boolean false
  //     'fontSize' => int 25
  //     'useCurve' => boolean true
  //     'useNoise' => boolean true
  //     'imageH' => int 0
  //     'imageW' => int 0
  //     'length' => int 5
  //     'fontttf' => string '' (length=0)
  //     'bg' => 
  //       array (size=3)
  //         0 => int 243
  //         1 => int 251
  //         2 => int 254
  // private '_codeSet' => string '2345678abcdefhijkmnpqrstuvwxyzABCDEFGHJKLMNPQRTUVWXY' (length=52)
  // private '_image' => null
  // private '_color' => null

    		$verify -> imageH = 40;
    		$verify -> imageW = 100;
    		$verify -> fontSize = 14;
    		$verify -> length = 4;
    		$verify -> fontttf = '5.ttf';
    		$verify -> entry();
    	}

      // 
      public function valid(){
        
      }

      // 执行登录验证方法
    	public function checklogin(){
        // print_r($_POST); // Array ( [username] => admin [password] => 123456 [code] => mp7f )
        $valid = new \Model\ValidModel();
        //校验用户名长度
        $res = $valid -> valid_user_len($_POST['username']);
        if($res){
          $this -> assign('erroruser', '用户名长度不够');
          $this -> display('login');
          exit;
        } 
        // 校验密码长度
        $res = $valid -> valid_pass_len($_POST['password']);
        if($res){
          $this -> assign('errorpass', '你的密码长度不够');
          $this -> display('login');
          exit;
        }
        // $user = new \Model\UserModel();
        // if(!empty($_POST)){
        //   $valid = $user -> create();
        //   if(!$valid){
        //     // show_bug($user->getError());
        //     $this -> assign('erroruser', $user->getError());
        //     $this -> display('login');
        //     exit;
        //   }
        // }

        //select * from shop_mg where username='admin'
        $sql = "select id,username,password from shop_mg where username='{$_POST['username']}'";
        $minfo = D() -> query($sql);
        // show_bug($minfo); // 测试对应数据
        if($minfo){
          $pass = $minfo[0]['password']; // 获取密码
          if($pass != md5($_POST['password'])){ // 判定密码
            $this -> assign('errorpass', '密码错误'); // 向模板中发送数据
            $this -> display('login'); // 调用对应模板
            exit;
          }
        }

        // 验证验证码
        $verify = new \Think\Verify(); // 
        if(!$verify -> check($_POST['code'], '')){ // 校验验证码
          $this -> assign('errorverify', '验证码错误'); // 向模板中发送数据
          $this -> display('login'); // 调用对应模板
          exit;
        }

        // 登录信息持久化 $_SESSION
        session('mg_name', $minfo[0]['username']); // 向session 中保存用户名
        session('mg_id', $minfo[0]['id']); // 向session 中保存用户id
        var_dump($_SESSION);

        $this -> redirect('Index/index'); // 重定向到后台首页
      }

      // 执行退出操作方法 
      // display() 默认找方法对应的模板 logout --- logout.html
      // display('login') 会找login.html 模板
      public function logout(){
        unset($_SESSION['mg_username']); // 去除session 中的用户名
        unset($_SESSION['mg_id']); // 去除session 中的id
        $this -> display('login'); // 调用登录模板
      }

      public function showlist(){
        $info = D('Mg') -> select();
        // 转换时间
        foreach ($info as $v) {
          $reg[$v['id']] = date("Y-m-d H:i:s", $v['regtime']);
        }
        // 获取角色信息
        $rinfo = $this -> getRoleInfo();
        $this -> assign('reg', $reg);
        $this -> assign('rinfo', $rinfo);
        $this -> assign('info', $info);
        $this -> display('list');
      }

      // 添加界面
      public function add(){
        $this -> display();
      }

      // 添加数据
      public function insert(){
        $_POST['regtime'] = time();
        // print_r($_POST); // Array ( [username] => apeng3 [password] => 123456 [repass] => 123456 [regtime] => 1433642925 )
        $res = D('mg') -> add($_POST);
        if($res){
          $this -> assign('mess', '添加管理成功');
          $this -> display('list');
        } else {
          $this -> assign('mess', '添加管理失败');
          $this -> display('list');
        }
      }

      public function mod($id){
        // 获取被修改管理员的信息
        $info = D('Mg') -> find($id);
        // 获取角色信息
        $rinfo = $this -> getRoleInfo();
        $this -> assign('rinfo', $rinfo); // 角色id => 角色名
        $this -> assign('info', $info);
        $this -> display('edit');
      }

      public function upd($id){
        //print_r($_POST); //Array ( [id] => [username] => apeng20 [oldpass] => [pass] => [repass] => )
        // Array ( [id] => 2 [username] => apeng11 [oldpass] => 123456 [pass] => 123456 [repass] => 123456 )
        $manager = D('Mg');
        $manager -> create();
        $z = $manager -> save();
        if($z){
          $this -> success('修改管理员成功', U('list'));
        } else {
          $this -> error('修改管理失败', U('list'));
        }
      }

      public function upd1($id){ // 分拆为二个 mod 界面 upd 修改
        if(!empty($_POST)){
          $manager = D('Mg');
          $manager -> create();
          $z = $manager -> save();
          if($z){
            $this -> success('修改管理员成功', U('list'));
          } else {
            $this -> error('修改管理失败', U('list'));
          }
        } else {
          // 获取被修改管理员的信息
        $info = D('Mg') -> find($id);
        // 获取角色信息
        $rinfo = $this -> getRoleInfo();
        $this -> assign('rinfo', $rinfo); // 角色id => 角色名
        $this -> assign('info', $info);
        $this -> display();
        }

        
      }

      // 获取角色信息
      function getRoleInfo(){
        // 查询全部角色的信息
        // array(1 => '经理', 2 => '主管', 3 => '总监')
        $rinfo = D('Role') -> select(); // 二维数组信息
        $info = array();
        foreach ($rinfo as $k => $v) {
          $infor[$v['id']] = $v['name'];
        }
        return $info;
      }

    }