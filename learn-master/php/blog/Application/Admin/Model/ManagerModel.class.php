<?php
/**
 * author:lishuo
 * time:2015-7-29
*/
namespace Admin\Model;
use \Think\Model;
class ManagerModel extends Model{
	//自动完成
	protected $_auto = array(
		array('password','md5',3,'function'), //对密码加密
		array('regtime','time',1,'function'),//创建时间
		array('logtime','time',3,'function'),//登录时间
	);
	//自动验证
	protected $_validate = array(
		array('email','','邮箱已注册',0,'unique',1),
		array('email','email','邮箱不正确',0,'regrex'),
		array('password','6,12','密码必须是6到12位',0,'length'),
		array('repassword','password','两次密码不正确',0,'confirm'),
	);
		
}