<?php
    namespace Admin\Controller;
    use Component\AdminController;

    // 文章控制器
    class ArticleController extends AdminController{

      // 文章列表
      public function showlist(){
      	// 
      	$info = D('Article') -> select();
      	// 处理作者
      	// 处理时间
      	$this -> assign('info', $info);
        $this -> display('list');
      }

      // 添加界面
      public function add(){
      	$info = D('Categorys') -> where('id=328') -> find();
      	$pid = $info['id'];
      	//echo $pid;
      	$cinfo = D('Categorys') -> where("pid=$pid") -> select();
        foreach ($cinfo as $k => $v) {
          $cateinfo[$v['id']] = $v['catename'];
        }
      	//show_bug($cateinfo);
        $this -> assign('cateinfo', $cateinfo);
      	$this -> display();
      }

      // 添加数据
      public function insert(){
        $art = D('Article');
        $_POST['uid'] = 1;
      	$_POST['addtime'] = time();
        //$content = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $_POST['content'] = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $new_id = D('Article') -> add($_POST);
        if(!empty($_FILES)){
          $config = array(
              'rootPath' => './Public/',
              'savePath' => 'Uploads/',
            );
          $upload = new \Think\Upload($config);
          $res = $upload -> uploadOne($_FILES['image']);
          if(!$res){
            show_bug($upload -> getError());
          }
          $image = $res['savepath'].$res['savename'];
        } else {
          $image = '';
        }
        $_POST['img'] = $image;
      	//print_r($_POST); // Array ( [tit] => 测试文件 [content] => 这是一个测试文件 [addtime] => 1434072175 )
        //[title] => [pid] => 329 [content] => [uid] => 1 [addtime] => 1434192227 [img] => sijiosj )
        $sql = "update shop_article set img='{$image}' where id=$new_id";
        $res = $art -> execute($sql);
        //$art -> create();
        //$result = $art -> add($_POST);
        if($res){
            $this -> assign('mess', '添加权限成功');
            $this -> display('list');
        } else {
            $this -> assign('mess', '添加权限失败');
            $this -> display('list');
        }
      }

      // 详细界面
      public function detail($id){
      	$info = D('Article') -> find($id);
      	$this -> assign('info', $info);
      	$this -> display();
      }

      //修改界面
      public function mod($id){
        $info = D('Categorys') -> where('id=328') -> find();
        $pid = $info['id'];
        //echo $pid;
        $cinfo = D('Categorys') -> where("pid=$pid") -> select();
        // foreach ($cinfo as $k => $v) {
        //   $cateinfo[$v['id']] = $v['catename'];
        // }
        //show_bug($cateinfo);
        $this -> assign('cateinfo', $cinfo);
        $info = D('Article') -> find($id);
        $this -> assign('info', $info);
        $this -> display('edit');
      }
      
      // 修改数据
      public function upd(){
        print_r($_POST);
        $info = D('Article');
        $info -> create();
        $res = $info -> save();
        if($res){
            $this -> assign('mess', '添加权限成功');
            $this -> display('list');
        } else {
            $this -> assign('mess', '添加权限失败');
            $this -> display('list');
        }
      }

      // 删除数据
      public function del($id){
        echo $id;
      }

    }