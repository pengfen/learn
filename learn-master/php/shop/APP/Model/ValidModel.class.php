<?php
namespace Model;
use Think\Model;
class ValidModel extends Model{
	
	// 校验用户名长度
	public function valid_user_len($username){
		if (preg_match('/^[a-zA-Z0-9-_]{5,20}$/', $username) < 1){
			return true;
		} else {
			return false;
		}
	}

	// 校验密码长度
	public function valid_pass_len($password){
		if (preg_match('/^[a-zA-Z0-9-_]{6,20}$/', $password) < 1){
			return true;
		} else {
			return false;
		}
	}

}