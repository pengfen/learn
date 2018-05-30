<?php
namespace Admin\Controller;
use Think\Controller;
/**
  * 图片控制器
  * 作者: apeng
  * 时间: 2015-09-25
*/
class ImageUploadController extends Controller{
	// 单个图片上传
	public function imageUploadOne($img) {
		$config = array(
			'rootPath' => './Public/',
			'savePath' => 'Uploads/',
			);
		$upload = new \Think\Upload($config);
		$res = $upload -> uploadOne($img['image']);
		if (!$res) {
			// 输出错误信息
		}
		$image = $res['savepath'].$res['savename'];
		return $image;
	}

	// 回收图片
	public function recycle($img = ''){
		// 回收原有图片
		if ($img) {
			$_POST['uid'] = $_SESSION['manager']['id'];
			$_POST['image'] = $img;
			$res = D('ImageRecycle') -> add($_POST);
			return $res;
		}
	}
}