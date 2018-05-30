<?php
namespace Model;
use Think\Model;
class UserModel extends Model{
	// 校验用户名
	// 通过重写父类属性 _validate 实现表单验证
	protected $_validate = array(
		array('username', 'require', '用户名必须填写'),
		);
}