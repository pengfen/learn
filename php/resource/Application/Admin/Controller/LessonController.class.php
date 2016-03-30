<?php
namespace Admin\Controller;
//use Think\Controller;
/**
  * 课程后台控制器
  * 作者: apeng
  * 时间: 2015-09-04
*/
class LessonController extends BaseController{
	// 课程列表
	public function index(){
		$info = D('Lesson') -> select();
		$this -> assign('info', $info);
		$this -> display();
	}

	// 添加界面
	public function add(){
		$info = D('Categorys') -> getField('id,catename', true);
		$this -> assign('data', $info);
		$this -> display();
	}

	// 添加数据
	public function insert(){
		$_POST['name'] = I('post.name');
		$_POST['target'] = I('post.target');
		$_POST['content'] = I('post.content');
		$_POST['program'] = I('post.program');
		$_POST['homework'] = I('post.homework');
		$_POST['answer'] = I('post.answer');
		$res = D('Lesson') -> add($_POST);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '添加成功', '添加失败');
	}

	// 修改界面
	public function edit(){
		$id = I('get.id');
		$info = D('Lesson') -> find($id);
		$this -> assign('info', $info);
		$data = D('Categorys') -> getField('id,catename', true);
		$this -> assign('data', $data);
		$this -> display();
	}

	// 修改数据
	public function update(){
		$id = I('post.id');
		$name = I('post.name');
		$target = I('post.target');
		$content = I('post.content');
		$program = I('post.program');
		$homework = I('post.homework');
		$answer = I('post.answer');
		$data = array(
			'id' => $id,
			'name' => $name,
			'target' => $target,
			'content' => $content,
			'program' => $program,
			'homework' => $homework,
			'answer' => $answer
			);
		$res = D('Lesson') -> save($data);
		$mess = new MessController();
		$mess -> ajaxMessage($res, '修改成功', '修改失败');
	}

	// 修改课程视频界面
	public function video(){
		$this -> display();
	}

	// 修改课程视频数据
	public function updateVideo(){
		//
	}

	// 修改课程相关资料界面
	public function data(){
		$this -> display();
	}

	// 修改课程相关资料数据
	public function updateData(){
		//
	}

	// 修改流程图界面
	public function img(){
		$this -> display();
	}

	// 修改流程图数据
	public function updateImg(){
		//
	}
	
	// 删除课程
	public function delete(){
		$id = I('get.id');
		$res = D('Lesson') -> delete($id);
		$mess = new MessController();
		$mess -> message($res, '删除成功', '删除失败', U('Lesson/index', array('mess'=>'删除成功')));
	}

	// 课程详情
	public function detail(){
		$id = I('get.id');
		$info = D('Lesson') -> find($id);
		$this -> assign('info', $info);
		$this -> display();
	}
}