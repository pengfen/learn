<?php
/**
 *作者：陈
 *用户表model类
 **/
	namespace Home\Model;
	use \Think\Model;

	class UserModel extends Model{
		protected $_auto = array(
			array('password','md5',3,'function' ),
			array('addtime','time',1,'function' ),
			);

		protected $_validate = array(
			array('email','email','邮箱不正确！',0,'regex'), // 当值不为空的时候判断是否在一个范围内
			array('password','6,12','密码必须是六到12位',0,'length'), // 验证确认密码是否和密码一致
			array('repassword','password','两次密码不一致',0,'confirm'), // 自定义函数验证密码格式
		);
	
		/**
		 *按照条件获取用户信息
		 *返回匹配数组
		 */
		
		public function getUserListByCondition($condition){
			$rs = $this->where($condition)->select();
			return $rs;
		}

		//根据条件获取一名用户信息
		public function getUserInfo($condition){
			$userlist=$this->where($condition)->find();
			return $userlist;
	}

		//根据条件获取一名用户信息
		public function getUserInfoById($uid){
			$userlist=$this->where(array('id'=>$uid))->find();
			return $userlist;
	}

		//修改用户信息
		public function edit($uid,$data){
			$this->where(array('id'=>$uid))->setField($data);
		}

			//经验值累计
		public function experience($num,$uid){
			$rs = $this->where(array('id'=>$uid))->find();
			$ex = $rs['experience']+$num;
			$this->where(array('id'=>$uid))->setField('experience',$ex);

		}

	}