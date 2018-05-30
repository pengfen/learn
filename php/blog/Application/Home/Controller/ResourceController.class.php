<?php
namespace Home\Controller;
/**
 * author:lishuo
 * time:2015-7-30
 * 资源上传类
*/
class ResourceController extends HomeController{
	//展示资源页
	public function index(){
		//缓存配置
		// S(array(
		// 	'type'=>'memcache',
		// 	'host'=>'192.168.80.19',
		// 	'port'=>'11211',
		// 	'prefix'=>'home',
		// 	'expire'=>3600)
		// );
		//读取缓存
		// $data=S('data');
		// dump($data);
		// if(!$data){
			$resource=D('Resource');
			$sql="select r.id,r.type,r.header,r.main,r.score,r.download,r.addtime,u.username from blog_resource r left join blog_user u on r.uid=u.id order by r.download desc limit 5";
			$data=$resource->query($sql);
			//设置缓存
			S('data',$data);
		// }
		$this->assign('data',$data);
		$this->display();
	}
	//异步加载文学
	public function literature(){
	// 	S(array(
	// 		'type'=>'memcache',
	// 		'host'=>'192.168.80.19',
	// 		'prifix'=>'home',
	// 		'expire'=>3600)
	// 	);
		//获取缓存
		// $datas=S('datas');
		// dump($datas);
		// if(!$datas){
			$resource=D('Resource');
			$sql="select r.id,r.type,r.header,r.main,r.score,r.download,r.addtime,u.username from blog_resource r left join blog_user u on r.uid=u.id where r.type='文学' order by r.addtime desc";
			$datas=$resource->query($sql);

			//设置缓存
			S('datas',$datas);
		// }
		
		$this->assign('datas',$datas);
		$this->display();
	}
	//异步加载技术
	public function technology(){
		$resource=D('Resource');	
		$sql="select r.id,r.type,r.header,r.main,r.score,r.download,r.addtime,u.username from blog_resource r left join blog_user u on r.uid=u.id where r.type='技术' order by r.addtime desc";
		$data=$resource->query($sql);
		$this->assign('data',$data);
		$this->display();
	}
	//异步加载教育
	public function education(){
		$resource=D('Resource');
		$sql="select r.id,r.type,r.header,r.main,r.score,r.download,r.addtime,u.username from blog_resource r left join blog_user u on r.uid=u.id where r.type='教育' order by r.addtime desc";
		$data=$resource->query($sql);
		$this->assign('data',$data);
		$this->display();
	}
	//发表资源
	public function add(){
		$this->display();
	}
	//添加资源
	public function insert(){
		$resource=D('Resource');
		$_POST['addtime']=time();
		$list=$resource->uploads(); //调用模型里的方法
		//创建数据
		if(!$resource->create()){
			$this->error($resource->getError());
		}
		//执行添加
		if($resource->add()>0){
			$this->success('发表成功！');
		}else{
			$this->error('发表失败');
		}	
	}

	//执行下载
	public function download(){
		$id=$_GET['id'];
		$resource=D('Resource');
		//list=$resource->field('zip_name')->where(array('id'=>$id))->find();
		$list=$resource->where(array('id'=>$id))->find();	
		//获取当前下载资源的积分值
	   	$score = $list['score'];
		//获取当前用户id
		 $uid =$_SESSION['user']['id'];
		//获取当前用户表中的积分值
		 $user=D('User');
		 $data=$user->field('score')->where(array('id'=>$uid))->find();
		 $uscore = $data['score']-$score;
		 //增加当前资源的下载次数
		 $num=$list['download']+1; 
		 //获取用户表中发表者的积分值
		 $aid=$list['uid'];
		 $row=$user->field('score')->where(array('id'=>$aid))->find();
		 $ascore=$row['score']+$score;
		 //判断积分够不够下载
		 if($uscore>=0) {
		 	 echo $list['zip_name'];
		 	 $this->downScore($uid,$uscore);//调用本类减少用户积分方法
		 	 $this->addLoad($id,$num); //调用本类增加下载次数
		 	 $this->upScore($aid,$ascore);//调用本类增加用户积分的方法	
		 }else{
		 	echo false;
		 }	
	}

	//执行下载时减少用户积分
	private function downScore($id,$score){
		$action = D('User');
		$action->where(array('id'=>$id))->setField('score',$score);
	}
	//执行下载时增加资源表的下载次数
	private function addLoad($id,$num){
		$res=D('Resource');
		$res->where(array('id'=>$id))->setField('download',$num);
	}
	//执行下载时增加发表者的积分
	private function upScore($id,$score){
		$action = D('User');
		$action->where(array('id'=>$id))->setField('score',$score);
	}

	//搜索
	public function selects(){
		$resource=D('Resource');

	}

}