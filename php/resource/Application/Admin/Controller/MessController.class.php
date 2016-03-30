<?php
namespace Admin\Controller;
use Think\Controller;
/**
  * 跳转信息控制器
  * 作者: apeng
  * 时间: 2015-08-06
*/
class MessController extends Controller{
	/**
	  * 提示成功或失败信息
	  * @param $suc 成功信息
	  * @param $err 失败信息
	  * @param $res 连接数据库时返回的结果
	  * @param $url 成功或失败后跳转路径
	*/
	public function message($res, $suc, $err, $url) {
		if ($res) {
			$this -> success($suc, $url);
		} else {
			$this -> error($err);
		}
	}

	/**
	  * 提示成功或失败信息(用于ajax回调)
	  * @param $suc 成功信息
	  * @param $err 失败信息
	  * @param $res 连接数据库时返回的结果
	*/
	public function ajaxMessage($res, $suc, $err) {
		if ($res) {
			echo $suc;
		} else {
			echo $err;
		}
	}
}