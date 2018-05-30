<?php
namespace Admin\Controller;
/**
  * 技术资料分类后台控制器
  * 作者: apeng
  * 时间: 2016-03-05
*/
class TechnCateController extends BaseController{

	/**
	  *  技术资料分类列表
	*/
	public function index(){
        $info = D('TechnCate') -> where(array('flag' => '1')) -> select();
        $this -> assign('info', $info);
        $this -> display();
    }

    // 添加分类
    public function add(){
    	$id = I('get.id')?I('get.id'):0;
        if($id == 0){
            $this -> assign('catename', '顶级分类');
            $this -> assign('pid', '0');
            $this -> assign('path', '0,');
        } else {
            $info = D('TechnCate') -> find($id);
            $this -> assign('catename', $info['catename']);
            $this -> assign('pid', $info['id']);
            $this -> assign('path', $info['path'].$info['id'].',');
        }
    	$this -> display();
    }

    // 添加数据
    public function insert(){
        $_POST['addtime'] = time();
        $res = D('TechnCate') -> add($_POST);
        $mess = new MessController();
	    $mess -> message($res, '添加成功', '添加失败', U('TechnCate/index', array('mess'=>'添加成功')));
    }

        /**
	  * 修改界面
	*/
	public function edit(){
		$id = I('get.id');
        // 获取所有分类
        $data = D('TechnCate') -> where(array('flag' => '1')) -> select();
        $this -> assign('data', $data);
        // 获取当前分类
		$info = D('TechnCate') -> find($id);
		$this -> assign('v', $info);
		$this -> display();
	}

	/**
	  * 修改数据
	*/
	public function update(){
		$dir = D('TechnCate');
		$info = $dir -> create();
		$res = $dir -> save();
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('TechnCate/index', array('mess'=>'修改成功')));
	}

    // 删除数据
    public function del(){
    	$id = I('get.id');
		$res = D('TechnCate') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('TechnCate/index', array('mess'=>'删除成功')));
        // $id = I('get.id');
        // // 先执行查行再进行修改
        // $info = D('Categorys') -> where(array('pid' => $id)) -> select();
        // if ($info) {
        //     $id .= ',';
        //     foreach ($info as $key => $val) {
        //         $id .= $val['id'].',';
        //     }
        //     $id = rtrim($id, ',');
        // }
        // $sql = "update shop_categorys set flag = 0 where id in (".$id.")";
        // $data = D() -> query($sql);
        // // $res = D('Categorys') -> delete($id);
        // $this->display('list');
    }
}