<?php
namespace Home\Controller;

class NewsController extends HomeController {
	public function index(){
		$news = D('News');
		$news2 = $news->where(array('id'=>$_GET['newsid']))->find();
		$hot = $news2['hot']+1;
		$news->where(array('id'=>$_GET['newsid']))->setField('hot',$hot);
		$newslist = $news->order('hot desc')->limit(6)->select();
		$this->assign('news',$news2);
		$this->assign('newslist',$newslist);
		$this->display();

	}
}
