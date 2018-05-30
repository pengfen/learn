-- blog_admin 管理员表
create table blog_manager(
	id int unsigned not null primary key auto_increment,
	username varchar(30) not null default '' comment '管理名称',
	password char(32) not null default '' comment '管理密码',
	email varchar(30),
	regtime int unsigned comment '注册时间',
	logtime int unsigned comment '登录时间',
	rid tinyint(3) unsigned not null default 0 '角色id'
)engine=innodb default charset=utf8;

-- 工具生成的sql
CREATE TABLE `blog_namager` (
`id`  int UNSIGNED NOT NULL AUTO_INCREMENT ,
`username`  varchar(30) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '管理名称' ,
`password`  char(32) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '管理密码' ,
 email varchar(30),
`regtime`  int UNSIGNED NULL COMMENT '注册时间' ,
`logtime`  int UNSIGNED NULL COMMENT '登录时间' ,
`rid`  tinyint(3) UNSIGNED NOT NULL DEFAULT 0 COMMENT '角色id' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
;

-- 角色表
create table blog_role(
	id tinyint(3) unsigned not null primary key auto_increment,
	name varchar(20) not null default '' comment '角色名',
	aids varchar(128) not null default '' comment '权限ids 1,2,...',
	aac text comment '控制器-操作'
)engine=innodb default charset=utf8;

CREATE TABLE `blog_role` (
`id`  tinyint(3) UNSIGNED NOT NULL AUTO_INCREMENT ,
`name`  varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '角色名' ,
`aids`  varchar(128) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '权限ids' ,
`aac`  text CHARACTER SET utf8 NULL COMMENT '控制器-操作方法' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
;

-- 权限表 level 0 顶级权限 1 次顶级权限 2 次次顶级权限
create table blog_auth(
	id smallint(6) unsigned not null primary key auto_increment,
	name varchar(20) not null default '' comment '权限名',
	pid smallint(6) not null default 0 comment '父id',
	controller varchar(32) not null default '' comment '控制器',
	action varchar(32) not null default '' comment '操作方法',
	path varchar(32) not null default '' comment '全路径',
	level tinyint(4) not null default 0 comment '权限级别'
)engine=innodb default charset=utf8;

CREATE TABLE `blog_auth` (
`id`  smallint(6) UNSIGNED NOT NULL AUTO_INCREMENT ,
`name`  varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '权限名' ,
`pid`  smallint(6) UNSIGNED NOT NULL DEFAULT 0 COMMENT '父id' ,
`controller`  varchar(32) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '控制器' ,
`action`  varchar(32) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '操作方法' ,
`path`  varchar(32) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '全路径' ,
`level`  tinyint(4) UNSIGNED NOT NULL DEFAULT 0 COMMENT '权限级别' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
;

insert into blog_auth values
	(1, '权限管理', 0, '', '', 1, 0),
	(2, '权限列表', 1, 'Auth', 'index', '1-2', 1),
	(3, '管理员列表', 1, 'Manager', 'index', '1-3', 1),
	(4, '会员管理', 0, '', '', 4, 0),
	(5, '会员列表', 4, 'User', 'index', '4-5', 1);

-- 日志分类表 flag 标志 0 默认分类 1 自定义分类
create table blog_log_cate(
	id int unsigned not null primary key auto_increment,
	name varchar(32) not null default '个人日记' comment '日志分类名',
	uid int unsigned not null comment '用户id',
	total smallint(6) not null default '0' comment '日志总数',
	flag tinyint(1) not null default '0' comment '标志'
)engine=innodb default charset=utf8;
insert into blog_log_cate(uid) values(19);

-- 日志表 auth 权限 0 公开 1 好友可见 2 指定好友可见 3 仅自己可见 flag 0 不删除 1 删除
create table blog_log(
	id int unsigned not null primary key auto_increment,
	title varchar(50) not null default '' comment '日志标题',
	content text comment '日志内容',
	issuetime int unsigned comment '发布时间',
	uid int unsigned comment '用户id',
	cid int unsigned comment '所属分类',
	auth tinyint(1) not null default '0' unsigned comment '权限',
	pids varchar(128) comment '图片ids'
)engine=innodb default charset=utf8;
ALTER TABLE `blog_log`
ADD COLUMN `views`  int UNSIGNED NULL COMMENT '阅读量' AFTER `pids`;

-- 目录结构
create table blog_dir(
	id int unsigned not null primary key auto_increment,
	name varchar(20) not null default '' comment '表名',
	controller varchar(50) not null default '' comment '控制器',
	model varchar(50) comment '模型名',
	method text comment '方法 ...',
	template text comment '模板 ...',
)engine=innodb default charset=utf8;
CREATE TABLE `NewTable` (
`id`  int UNSIGNED NOT NULL AUTO_INCREMENT ,
`name`  varchar(20) CHARACTER SET utf8 NOT NULL DEFAULT '' COMMENT '表名' ,
`controller`  varchar(50) CHARACTER SET utf8 NULL COMMENT '控制器名' ,
`method`  text CHARACTER SET utf8 NULL COMMENT '所有方法' ,
`model`  varchar(50) CHARACTER SET utf8 NULL COMMENT '模型名' ,
`template`  text CHARACTER SET utf8 NULL COMMENT '模板' ,
`modmet`  text CHARACTER SET utf8 NULL COMMENT '模型-方法' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8
;

-- 生活记录表 oper 1 发布说说操作 2 发布日志操作 3 发布照片操作
create table blog_record(
	id int unsigned not null primary key auto_increment,
	uid int comment '用户id',
	oper tinyint(1) default 1 comment '用户操作',
	addtime int
)engine=innodb default charset=utf8;
CREATE TABLE `NewTable` (
`id`  int UNSIGNED NOT NULL AUTO_INCREMENT ,
`uid`  int UNSIGNED NULL ,
`oper`  tinyint(1) UNSIGNED NOT NULL DEFAULT 1 ,
`addtime`  int NULL ,
PRIMARY KEY (`id`)
)
;

-- 建议表
create table blog_advice(
	id int unsigned not null primary key auto_increment,
	uid int comment '用户id',
	title varchar(30) not null default '' comment '标题',
	content text comment '内容',
	views int not null default 0 comment '阅读量',
	reviews int not null default 0 comment '回复量',
	addtime int comment '添加时间'
)engine=innodb default charset=utf8;

-- 建议回复表
create table blog_advice_reviews(
	id int unsigned not null primary key auto_increment,
	uid int comment '用户id',
	mid int comment '管理员id',
	content text comment '回复内容',
	addtime int comment '回复时间'
)engine=innodb default charset=utf8;

-- 公告表
create table blog_announc(
)engine=innodb default charset=utf8;