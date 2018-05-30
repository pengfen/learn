<?php
namespace Admin\Controller;
/**
  * 管理员后台控制器
  * 功能: 管理员的增 删 改 查
  * 作者: apeng
  * 时间: 2015-08-17
*/	
class ManagerController extends BaseController{
	// 管理员列表
	public function index(){
		$manager = D('Manager');
		$search = I('get.search'); // 拼接搜索条件
		// 调用分页控制器实例分页功能(注意写入的字段和数据库中的字段必须一致)
		$page = new PageController();
		$count = $page -> getCount('username', $search, $manager);
		$show = $page -> show($count);
		$info = $page -> page('username', $search, $manager);
		$this -> assign('count', $count);
	    $this -> assign('page', $show);  
	    
	    // 获取管理员中的角色id
	    $rids = '';
	    foreach ($info as $k => $v) {
	    	$rids .= $v['rid'].',';
	    }
	    $rids = rtrim($rids, ',');
	    if ($rids) {
	    	$map = "id in ({$rids})";
	    	// 查询角色表
	        $data = D('Role') -> where($map) -> getField('id,name', true);
	        // 处理职位(一利用连接查询 二使用双循环)
		    foreach ($info as $k => $v) {
		    	foreach ($data as $key => $value) {
		    		if ($v['rid'] == $key) {
		    			$info[$k]['rid'] = $value;
		    			break;
		    		}
		    	}
		    }
	    }
	    $this -> assign('info', $info);
		$this -> assign('title','管理员列表');
		$this -> display();
	}

	// 添加界面
	public function add(){
		$manager = D('Role');
		$info = $manager -> getField('id,name', true);
		$this -> assign('data', $info);
		$this -> display();
	}

	//添加时验证邮箱
	public function checkEmail(){
		//$model = D('Manager');
		//接收jequery.post传过来的数据
		$email = I('get.data');
		//echo $email;
		$res = D('Manager') -> where(array('email'=>$email)) -> find();
		if (!$res) {
			echo '邮箱可以注册';
		} else {
			echo '邮箱已经注册';
		}
		// $email=$_POST['email'];
		// $list['email']=$email;
		// $res=$model->where($list)->find();
		// if($res){
		// 	echo 1;
		// }else{
		// 	echo 2;
		// }
	}

	// 添加数据
	public function insert(){
		$manager = D('Manager');
		$manager -> create();
		//收集数据
		if(!$manager -> create()){
			$this -> error($manager -> getError());
		}
		//执行添加
		if($manager -> add() > 0){
			$this -> success('添加成功！',U('Manager/index'));
		}else{
			$this -> error('添加失败！');
		}	
	}

	// 修改界面
	public function edit(){
		$manager = D('Manager');
		$id = I('get.id');
		$info = $manager -> where(array('id'=>$id)) -> find();	
		$this -> assign('info', $info);
		// 获取职位
		$data = D('Role') -> getField('id, name', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$manager = D('Manager');
		$manager -> create();
		$res = $manager -> where(array('id'=>$_POST['id'])) -> save();
		$mess = new MessController();
		$mess -> message($res, '修改成功', '修改失败', U('Manager/index', array('mess'=>'修改成功')));
	}

	// 删除管理员
	public function delete(){
		$manager = D('Manager');
		$id = I('get.id');
		$res = $manager -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Manager/index', array('mess'=>'删除成功')));
	}
}
