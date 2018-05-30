<?php
/**
* author:lishuo
* time:2015-7-29
* 后台管理员控制器
*/
	namespace Admin\Controller;
	class ManagerController extends BaseController{
		/*展示页*/
		public function index(){
			$manager=M('Manager');
			//1.获得当前记录总条数
			$total=$manager->count();
			$per=7;
			//2.实例化分页类对象
			$page=new \Component\Page($total,$per); //autoload
			//3.拼装sql语句获得每页信息
			if($_GET['search']){
				$search=$_GET['search'];
				$sql="select * from blog_manager where username like '%".$search."%' ".$page->limit;
			}else{
				$sql="select * from blog_manager ".$page->limit;
			}
		
			$data=$manager->query($sql);
			//4.获得页码列表
			$pagelist=$page->fpage();
			// $data=$manager->select();
			$this->assign('title','管理员列表');
			$this->assign('pagelist',$pagelist);
			$this->assign('data',$data);
			$this->display();
		}

		/*添加用户页*/
		public function add(){
			$manager=D('Manager');
			$sql="select m.rid,r.name from blog_manager as m inner join blog_role as r on m.rid=r.id";
			$list=$manager->query($sql);
			
			$this->assign('list',$list);
			$this->display();
		}

		//添加时验证邮箱
		public function checkEmail(){
			//echo '调用成功';
			//$model = D('Manager');
			//接收jequery.post传过来的数据
			$email = I('get.data');
			//echo $email;
			$res = D('Manager') -> where(array('email'=>$email)) ->find();
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

		/*添加操作*/
		public function insert(){
			$manager= new \Admin\Model\ManagerModel;
			$manager->create();
			//创建数据
			if(!$manager->create()){
				$this->error($manager->getError());
			}
			//执行添加
			if($manager->add()>0){
				$this->success('添加成功！',U('Manager/index'));
			}else{
				$this->error('添加失败！');
			}	
		}

		/*修改页面加载*/
		public function edit(){
			$manager = D('Manager');
			$list=$manager->where(array(id=>$_GET['id']))->find();	
			$this->assign('list',$list);
			$this->display();
		}

		/*修改数据*/
		public function update(){
			//dump($_POST);
			$manager=D('Manager');
			$manager->create();
			$row=$manager->where(array('id'=>$_POST['id']))->save();
			if($row>0){
				$this->success('编辑成功！',U('Manager/index'));
			}else{
				$this->error('编辑失败！');
			}
		}

		/*删除数据*/
		public function delete(){
			$manager=M('Manager');
			$row=$manager->where(array('id'=>$_GET['id']))->delete();
			$this->redirect('Manager/index');	
		}
	}
