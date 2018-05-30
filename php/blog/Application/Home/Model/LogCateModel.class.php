<?php
namespace Home\Model;
use Think\Model;

/**
  * 日志分类模型
  * 作者: apeng
  * 时间: 2015-07-30
*/
class LogCateModel extends Model{
	protected $_auto = array(
		array('flag', 1),
		array('total', 0)
		);

	public function saveLog(){
		echo '调用成功';
	}
}