<?php
namespace Admin\Controller;
/**
  * 跳转信息控制器
  * 作者: apeng
  * 时间: 2015-08-06
*/
class MessController extends BaseController{
	/**
	  * 提示成功或失败信息
	  * @param $suc 成功信息
	  * @param $err 失败信息
	  * @param $res 连接数据库时返回的结果
	*/
	public function message($res, $suc, $err, $url) {
		if ($res) {
			$this -> success($suc, $url);
		} else {
			$this -> error($err);
		}
	}
}