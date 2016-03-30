<?php
namespace Admin\Controller;
/**
  * 技术资料分类后台控制器
  * 作者: apeng
  * 时间: 2016-03-05
*/
class TechnController extends BaseController{
    // 文章列表
    public function index(){
        $info = D('Techn') -> select();
        // 处理作者
        $this -> assign('info', $info);
        $this -> display();
    }

    // 添加界面
    public function add(){
        //$info = D('TechnCate') -> where('id=328') -> find();
        //$pid = $info['id'];
        //$cinfo = D('TechnCate') -> where("pid=$pid") -> select();
        // 359 云计算分类
        // 338 linux 分类
        $cinfo = D('TechnCate') -> where(array('flag' => '1', 'pid' => 359)) -> select();
        foreach ($cinfo as $k => $v) {
          $cateinfo[$v['id']] = $v['catename'];
        }
        $this -> assign('cateinfo', $cateinfo);
        $this -> display();
    }

    // 添加数据
    public function insert(){
        $art = D('Techn');
        $_POST['uid'] = 1;
        $_POST['addtime'] = time();
        //$content = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $_POST['content'] = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $new_id = D('Techn') -> add($_POST);

        $image = '';
        if(!empty($_FILES)){
            $config = array(
              'rootPath' => './Public/',
              'savePath' => 'Uploads/',
            );
            $upload = new \Think\Upload($config);
            $res = $upload -> uploadOne($_FILES['image']);
            if(!$res){
            }
            $image = $res['savepath'].$res['savename'];
        } 
        // $_POST['img'] = $image;
        //print_r($_POST); // Array ( [tit] => 测试文件 [content] => 这是一个测试文件 [addtime] => 1434072175 )
        //[title] => [pid] => 329 [content] => [uid] => 1 [addtime] => 1434192227 [img] => sijiosj )
        if ($image) {
            $sql = "update resource_techn set img='{$image}' where id=$new_id";
            $res = $art -> execute($sql);
        //$art -> create();
        //$result = $art -> add($_POST);
            $mess = new MessController();
            $mess -> message($res, '添加成功', '添加失败', U('Techn/index', array('mess'=>'添加成功')));
        } else {
            $mess = new MessController();
            $mess -> message($new_id, '添加成功', '添加失败', U('Techn/index', array('mess'=>'添加成功')));
        }
        
    }

    // 详细界面
    public function detail($id){
        $info = D('Techn') -> find($id);
        $this -> assign('info', $info);
        $this -> display();
    }

    //修改界面
    public function edit(){
        $id = I('get.id');
        $data = D('Techn') -> find($id);
        $cinfo = D('TechnCate') -> where(array('flag' => '1')) -> select();
        //$pid = $info['id'];
        //$cinfo = D('TechnCate') -> where("pid=$pid") -> select();
        foreach ($cinfo as $k => $v) {
          $cateinfo[$v['id']] = $v['catename'];
        }
        $this -> assign('cateinfo', $cateinfo);
        
        $this -> assign('v', $data);
        $this -> display();
    }
      
    // 修改数据
    public function upd(){
        $id = I('post.id');
        $art = D('Techn');
        $_POST['uid'] = 1;
        $_POST['addtime'] = time();
        //$content = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $_POST['content'] = htmlspecialchars($_POST['content'], ENT_QUOTES);
        $info = $art -> create();
        $art -> save();

        // if(!empty($_FILES)){
        //     // $config = array(
        //     //   'rootPath' => './Public/',
        //     //   'savePath' => 'Uploads/',
        //     // );
        //     // $upload = new \Think\Upload($config);
        //     // $res = $upload -> uploadOne($_FILES['image']);
        //     // if(!$res){
        //     // }
        //     // $image = $res['savepath'].$res['savename'];
        // } else {
        //     $image = '';
        // }
        // $_POST['img'] = $image;
        // //print_r($_POST); // Array ( [tit] => 测试文件 [content] => 这是一个测试文件 [addtime] => 1434072175 )
        // //[title] => [pid] => 329 [content] => [uid] => 1 [addtime] => 1434192227 [img] => sijiosj )
        // if ($image) {
        //     $sql = "update resource_techn set img='{$image}' where id=$id";
        //     $res = $art -> execute($sql);
        // }
        
        //$art -> create();
        //$result = $art -> add($_POST);
        $mess = new MessController();
        $mess -> message($res, '添加成功', '添加失败', U('Techn/index', array('mess'=>'添加成功')));
    }

    // 删除
    public function del(){
        echo '该功能还未实现';
    }
}