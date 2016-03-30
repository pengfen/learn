-- 后台管理员表
-- id 主键 username 用户名 password 密码 email 邮箱 regtime 注册时间 logtime 登录时间 rid 角色id 号
create table yhd_mg(
	id int unsigned not null primary key auto_increment,
	username varchar(30) not null,
	password varchar(32) not null,
	regtime int unsigned,
	logtime int unsigned,
	rid tinyint(3) unsigned not null default '0' comment '角色id'
)engine=innodb default charset=utf8;
insert into yhd_mg values
	(1, 'admin', md5('123456'), unix_timestamp(), '', 0),
	(2, 'apeng1', md5('123456'), unix_timestamp(), '', 1),
	(3, 'apeng2', md5('123456'), unix_timestamp(), '', 2);


-- 权限表 
-- id 主键 name 权限名 pid 父id(相当于分类) cont 控制器 action 方法(如login) 
-- path 全路径(用户信息排序使用) 如果是顶级权限 全路径等于记录主键值 如果不是顶级权限 全路径等于 父级全路径-本记录主键值 
-- level 基本 0 顶级权限 1 次顶级权限 2 次次顶级权限 (呈现缩进关系使用)
create table yhd_auth(
	id smallint(6) unsigned not null primary key auto_increment,
	name varchar(20) not null comment '名称',
	pid smallint(6) unsigned not null comment '父id',
	cont varchar(32) not null default '' comment '控制器',
	action varchar(32) not null default '' comment '操作方法',
	path varchar(32) not null comment '全路径',
	level tinyint(4) not null default '0' comment '级别'
)engine=innodb default charset=utf8;
-- 模拟数据
insert into yhd_auth values
	(1, '权限管理', 0, '', '', 1, 0),
	(2, '会员管理', 0, '', '', 2, 0),
	(3, '商品管理', 0, '', '', 3, 0),
	(4, '订单管理', 0, '', '', 4, 0),
	(5, '广告管理', 0, '', '', 5, 0),
	(6, '友情链接管理', 0, '', '', 6, 0),
	(7, '权限列表', 1, 'Auth', 'showlist', '1-7', 1),
	(8, '添加管理员', 1, 'Auth', 'add', '1-8', 1),
	(9, '日志列表', 1, 'Auth', 'loglist', '1-9', 1),
	(10, '添加日志', 1, 'Auth', 'addlog', '1-10', 1),
	(11, '会员列表', 2, 'User', 'showlist', '2-11', 1),
	(12, '添加会员', 2, 'User', 'add', '2-12', 1),
	(13, '用户评论', 2, 'User', 'comment', '2-13', 1),
	(14, '用户留言', 2, 'User', 'message', '2-14', 1),
	(15, '商品列表', 3, 'Goods', 'showlist', '3-15', 1);

insert into yhd_auth values
	(16, '系统管理', 0, '', '', '16', 0),
	(17, '角色管理', 16, 'Role', 'showlist', '16-17', 1);

-- 角色表
-- role_auth_ids 4,5,6 关联权限的主键值用逗号连接的信息
-- role_auth_ac 关联权限的控制器 方法连接的信息
create table yhd_role(
	id smallint(6) unsigned not null primary key auto_increment,
	name varchar(20) not null comment '角色名称',
	auth_ids varchar(128) not null default '' comment '权限ids 1,2,...',
	auth_ac text comment '模块-操作'
)engine=innodb default charset=utf8;
insert into yhd_role values(1, '经理', '1,7,8,9,10', 'Power-list,Power-add,Power-loglist,Power-addlog'),
	(2, '主管', '2,11,12,13,14', 'User-list,User-add,User-add,User-comment,User-message');


-- ================= shop 项目重新开始 =====================
-- 数据库使用 shop
-- 权限表 
-- id 主键 name 权限名 pid 父id(相当于分类) cont 控制器 action 方法(如login) 
-- path 全路径(用户信息排序使用) 如果是顶级权限 全路径等于记录主键值 如果不是顶级权限 全路径等于 父级全路径-本记录主键值 
-- level 基本 0 顶级权限 1 次顶级权限 2 次次顶级权限 (呈现缩进关系使用)
create table shop_auth(
	id smallint(6) unsigned not null primary key auto_increment,
	name varchar(20) not null comment '名称',
	pid smallint(6) unsigned not null comment '父id',
	cont varchar(32) not null default '' comment '控制器',
	action varchar(32) not null default '' comment '操作方法',
	path varchar(32) not null comment '全路径',
	level tinyint(4) not null default '0' comment '级别'
)engine=innodb default charset=utf8;

-- 只模拟二条数据(其它数据使用添加功能来添加)
insert into shop_auth values
	(1, '权限管理', 0, '', '', 1, 0),
	(2, '权限列表', 1, 'Auth', 'showlist', '1-2', 1);

-- 角色表
-- auth_ids 4,5,6 关联权限的主键值用逗号连接的信息
-- auth_ac 关联权限的控制器 方法连接的信息
create table shop_role(
	id smallint(6) unsigned not null primary key auto_increment,
	name varchar(20) not null comment '角色名称',
	auth_ids varchar(128) not null default '' comment '权限ids 1,2,...',
	auth_ac text comment '模块-操作'
)engine=innodb default charset=utf8;
insert into shop_role values
	(1, '经理', '1,7,8,9,10', 'Power-list,Power-add,Power-loglist,Power-addlog'),
	(2, '主管', '2,11,12,13,14', 'User-list,User-add,User-add,User-comment,User-message');

-- 后台管理员表
-- id 主键 username 用户名 password 密码 email 邮箱 regtime 注册时间 logtime 登录时间 rid 角色id 号
create table shop_mg(
	id int unsigned not null primary key auto_increment,
	username varchar(30) not null,
	password varchar(32) not null,
	regtime int unsigned,
	logtime int unsigned,
	rid tinyint(3) unsigned not null default '0' comment '角色id'
)engine=innodb default charset=utf8;
insert into shop_mg values
	(1, 'admin', md5('123456'), unix_timestamp(), '', 0),
	(2, 'apeng1', md5('123456'), unix_timestamp(), '', 1),
	(3, 'apeng2', md5('123456'), unix_timestamp(), '', 2);

-- 日志表
-- id 主键 authid 作者id author 作者 title 标题 content 内容 addtime 添加时间 problem 提问人
create table shop_log(
	id int unsigned not null primary key auto_increment,
	authid int not null,
	author varchar(30) not null,
	title varchar(30) not null,
	content text not null,
	addtime int not null,
	problem varchar(30)
)engine=innodb default charset=utf8;

-- 文章表
-- id 主键 uid 用户编号 title 标题 content 内容 summary 摘要 addtime 添加时间 comefrom 文章来源 pid 类别编号 allow 评论开关 views 访问量 image 知识导图
create table shop_article(
	id int unsigned not null primary key auto_increment,
	uid int not null,
	title varchar(30) not null,
	summary varchar(200),
	img varchar(100) not null,
	content text not null,
	addtime int not null,
	pid int not null,
	recommend int not null default '0',
	allow tinyint(1) default '0',
	views int default '0'
)engine=innodb default charset=utf8;

-- 商品分类表 flag 1 没有删除 2 删除
-- id 主键 catename 分类名 pid 父id path 全路径 addtime 添加时间 flag 删除标志 cate 类别(1 商品 2 软件技术如html css ...)
create table shop_categorys(
	id int unsigned not null primary key auto_increment,
	catename varchar(100) not null,
	pid int not null default 0,
	path varchar(255) not null default '0,',
	addtime int unsigned,
	flag tinyint(1) not null default '1',
	cate tinyint(1) default '1'
)engine=innodb default charset=utf8;

-- 商品表 购买方式layby 1 自营 2 团购 3闪购
-- id 主键 proname 商品名 cateid 所属分类的id price 价格 discount 折扣 proimg 商品图片 smallimg 商品小图 bigimg 商品大图 store 库存 clicknum 点击量 buynum 销售量 des 描述 state 状态(1 新添加 2 在售 3 已下架) addtime 添加时间
create table shop_goods(
	id int unsigned not null primary key auto_increment,
	proname varchar(255) not null,
	cateid int not null,
	price float(8,2) not null,
	discount float(3,2),
	proimg varchar(255) not null,
	smallimg varchar(255),
	bigimg varchar(255),
	store int default 0,
	clicknum int default 0,
	buynum int not null default 0,
	des text not null,
	state tinyint(1) not null default 1,
	addtime int not null
)engine=innodb default charset=utf8;