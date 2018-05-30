<?php
/**
 *作者：陈
 *说说控制器
 **/
namespace Home\Controller;
use Model\MoodModel;

class MoodController extends HomeController{
	public function index(){
		$mood= D('Mood');
		$uid = $_SESSION['uid'];
		if(empty($uid)){
			$uid = $_SESSION['user']['id'];
		}
		$list = $mood->getMoodListById($uid);
		
		$list = $this->foreachGetAll($list);
		//dump($list);
		$this->assign('list',$list);
		$this->display();
	}
	public function addMood(){

		$mood = D('Mood');
		if(!$mood->create()){
			$this->error($mood->getError());
		}
		if($mood->add()>0){
			echo '发布成功！';
			//添加操作表
			$action = D('Record');
			$_POST['uid'] = $_SESSION['user']['id'];
			$_POST['addtime'] = time();
 			$action->create();
			$action->add();
		}
	}

	public function showMoodListById(){
		$mood = D('Mood');
		$uid = I('post.uid');
		$list=$mood->getMoodListById($uid);
		//var_dump($list);
		$this->assign('moodlist',$list);
		$this->display();

	}

	public function foreachGetAll($list){
		$newlist = $this->foreachGetUser($list,'uid');

    	foreach ($newlist as $key => $value) {
    		
    		$review = D('Review');
    		$review = $review->getReview(0,$value['id'],'0');
    		$review = $this->foreachGetUser($review,'sender');
    		foreach ($review as $k => $v) {
    			$r = D('Review');
    			$nr = $r->getReview2(0,$v['id'],'0');
    			$nr = $this->foreachGetUser($nr,'sender');

    			foreach ($nr as $kk => $vv) {
    				$user3 = D('User');
    				$user3 = $user3->getUserInfoById($vv['receiver']);
    				$nr[$kk]['name'] = $user3['username'];
    			}
    			//dump($nr);
    			$review[$k]['nr'] = $nr;
    		}

    		
    		$newlist[$key]['review'] = $review;
    	}
    	return $newlist;
    }


    public function foreachGetUser($list,$v){
		foreach ($list as $key => $value) {
			$user = D('User');
			$user = $user->getUserInfoById($value[$v]);
			$list[$key]['username'] = $user['username'];
			$head = D('HeadImg');
			$head = $head->getUserHeadList($value[$v]);
			$list[$key]['headimg'] = $head['head_img_small'];
		}
		return $list;
    }


}