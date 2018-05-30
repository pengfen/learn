/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : resource

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2016-03-06 19:34:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resource_assoc
-- ----------------------------
DROP TABLE IF EXISTS `resource_assoc`;
CREATE TABLE `resource_assoc` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '表名',
  `struct` text COMMENT '表结构',
  `note` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `pid` tinyint(1) unsigned DEFAULT '0' COMMENT '项目标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_assoc
-- ----------------------------
INSERT INTO `resource_assoc` VALUES ('2', '留言信息表', 'create table if not EXISTS info(\r\n  id int not null auto_increment primary key,\r\n  name varchar(16) not null comment \'访客名字\',\r\n  content text not null comment \'发布内容\',\r\n  content_time varchar(14) not null comment \'发布时间\'\r\n)engine=MyISAM default charset=utf8;', '所属留言模块', '0');
INSERT INTO `resource_assoc` VALUES ('3', '留言回复表', 'create table if not EXISTS reply(\r\n  id int not null primary key auto_increment,\r\n  info_id varchar(11) not null comment \'留言id\',\r\n  reply text not null comment \'回复内容\',\r\n  reply_time varchar(14) not null comment \'回复时间\'\r\n)engine=MyISAM default charset=utf8;', '所属留言模块', '0');
INSERT INTO `resource_assoc` VALUES ('5', '逻辑表', 'create table resource_logic(\r\n	id int unsigned not null primary key auto_increment,\r\n	ac varchar(100) not null default \'\' comment \'控制器-操作方法\',\r\n	content text comment \'逻辑内容\',\r\n	note varchar(255) not null default \'\' comment \'逻辑备注\'\r\n)engine=innodb default charset=utf8;', '存储方法中的逻辑分析', '0');
INSERT INTO `resource_assoc` VALUES ('6', '', '', '', '0');
INSERT INTO `resource_assoc` VALUES ('7', '逻辑表', 'ddd\r\ndd', 'dd', '1');
INSERT INTO `resource_assoc` VALUES ('8', '', '', '', '0');
INSERT INTO `resource_assoc` VALUES ('9', '', '', '', '0');
INSERT INTO `resource_assoc` VALUES ('10', '', '', '', '0');
INSERT INTO `resource_assoc` VALUES ('11', '', '', '', '0');
INSERT INTO `resource_assoc` VALUES ('12', '权限表', 'create table blog_auth(\r\n	id smallint(6) unsigned not null primary key auto_increment,\r\n	name varchar(20) not null default \'\' comment \'权限名\',\r\n	pid smallint(6) not null default 0 comment \'父id\',\r\n	controller varchar(32) not null default \'\' comment \'控制器\',\r\n	action varchar(32) not null default \'\' comment \'操作方法\',\r\n	path varchar(32) not null default \'\' comment \'全路径\',\r\n	level tinyint(4) not null default 0 comment \'权限级别\'\r\n)engine=innodb default charset=utf8;', 'level 0 顶级权限 1 次顶级权限 2 次次顶级权限', '1');

-- ----------------------------
-- Table structure for resource_assoc_page
-- ----------------------------
DROP TABLE IF EXISTS `resource_assoc_page`;
CREATE TABLE `resource_assoc_page` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '页面名',
  `des` text COMMENT '功能描述',
  `techn` text COMMENT '涉及技术',
  `pid` int(10) unsigned DEFAULT NULL COMMENT '所属分类',
  `assoc` varchar(255) DEFAULT NULL COMMENT '涉及表ids',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_assoc_page
-- ----------------------------
INSERT INTO `resource_assoc_page` VALUES ('1', '留言浏览页 (index.php)', '按照留言先后顺序 分页显示留言信息', 'PHP', '9', '2');
INSERT INTO `resource_assoc_page` VALUES ('2', '', null, null, null, null);

-- ----------------------------
-- Table structure for resource_auth
-- ----------------------------
DROP TABLE IF EXISTS `resource_auth`;
CREATE TABLE `resource_auth` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '权限名',
  `pid` smallint(6) NOT NULL DEFAULT '0' COMMENT '父id',
  `controller` varchar(32) NOT NULL DEFAULT '' COMMENT '控制器',
  `action` varchar(32) NOT NULL DEFAULT '' COMMENT '操作方法',
  `path` varchar(32) NOT NULL DEFAULT '' COMMENT '全路径',
  `level` tinyint(4) NOT NULL DEFAULT '0' COMMENT '权限级别',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '权限关联图',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_auth
-- ----------------------------
INSERT INTO `resource_auth` VALUES ('1', '权限管理', '0', '', '', '1', '0', 'Uploads/2015-09-20/55fea199dc54b.png');
INSERT INTO `resource_auth` VALUES ('2', '权限列表', '1', 'Auth', 'index', '1-2', '1', 'Uploads/2015-09-20/55fe7e2c1485f.png');
INSERT INTO `resource_auth` VALUES ('3', '管理员列表', '1', 'Manager', 'index', '1-3', '1', 'Uploads/2015-09-12/55f3e4df5f257.png');
INSERT INTO `resource_auth` VALUES ('4', '会员管理', '0', '', '', '4', '0', 'Uploads/2015-10-13/561cfe2187ff2.png');
INSERT INTO `resource_auth` VALUES ('5', '会员列表', '4', 'User', 'index', '4-5', '1', '');
INSERT INTO `resource_auth` VALUES ('6', '目录管理', '0', '', '', '5', '0', 'Uploads/2015-09-12/55f4245783d4e.png');
INSERT INTO `resource_auth` VALUES ('7', '后台目录列表', '6', 'Dir', 'index', '5-7', '1', 'Uploads/2015-09-12/55f424dd34473.png');
INSERT INTO `resource_auth` VALUES ('10', '目录关联列表', '6', 'Assoc', 'index', '5-10', '1', 'Uploads/2015-09-12/55f4249b4acf4.png');
INSERT INTO `resource_auth` VALUES ('11', '方法逻辑列表', '6', 'Logic', 'index', '5-11', '1', 'Uploads/2015-09-12/55f424afb57dc.png');
INSERT INTO `resource_auth` VALUES ('12', '项目记录列表', '6', 'Project', 'index', '5-12', '1', 'Uploads/2015-09-12/55f424ca1470d.png');
INSERT INTO `resource_auth` VALUES ('13', '角色列表', '1', 'Role', 'index', '1-13', '1', 'Uploads/2015-09-12/55f3e4995016d.png');
INSERT INTO `resource_auth` VALUES ('14', '资料管理', '0', '', '', '14', '0', 'Uploads/2016-03-05/56dae0f050807.png');
INSERT INTO `resource_auth` VALUES ('15', '技术分类', '24', 'Categorys', 'index', '24-15', '1', 'Uploads/2015-09-13/55f51abddbcec.png');
INSERT INTO `resource_auth` VALUES ('16', '课程列表', '34', 'Lesson', 'index', '34-16', '1', 'Uploads/2015-09-13/55f51ad91d546.png');
INSERT INTO `resource_auth` VALUES ('17', '功能列表', '14', 'Function', 'index', '14-17', '1', 'Uploads/2015-09-13/55f51aefefda6.png');
INSERT INTO `resource_auth` VALUES ('18', '关联页', '14', 'AssocPage', 'index', '14-18', '1', 'Uploads/2015-09-13/55f4bd42aef12.png');
INSERT INTO `resource_auth` VALUES ('19', '模块列表', '14', 'Module', 'index', '14-19', '1', 'Uploads/2015-09-13/55f51b0dddb17.png');
INSERT INTO `resource_auth` VALUES ('20', '实例列表', '14', 'Instance', 'index', '14-20', '1', 'Uploads/2015-09-13/55f51b2075bcc.png');
INSERT INTO `resource_auth` VALUES ('21', '页面管理', '0', '', '', '21', '0', 'Uploads/2015-09-27/560741556e5fd.png');
INSERT INTO `resource_auth` VALUES ('22', '逻辑列表', '21', 'BusinessLogic', 'index', '21-22', '1', 'Uploads/2015-09-25/56054957d4b2d.png');
INSERT INTO `resource_auth` VALUES ('23', '导航列表', '21', 'Nav', 'index', '21-23', '1', '');
INSERT INTO `resource_auth` VALUES ('24', '分类管理', '0', '', '', '24', '0', 'Uploads/2015-09-20/55fe08fe3ae2a.png');
INSERT INTO `resource_auth` VALUES ('25', '技术方向列表', '24', 'Direct', 'index', '24-25', '1', '');
INSERT INTO `resource_auth` VALUES ('26', '难度列表', '24', 'Difficult', 'index', '24-26', '1', '');
INSERT INTO `resource_auth` VALUES ('27', '实现及bug管理', '0', '', '', '27', '0', '');
INSERT INTO `resource_auth` VALUES ('28', '功能实现列表', '27', 'Realize', 'index', '27-28', '1', '');
INSERT INTO `resource_auth` VALUES ('29', '开发团队列表', '27', 'Develop', 'index', '27-29', '1', '');
INSERT INTO `resource_auth` VALUES ('30', 'bug 列表', '27', 'Bug', 'index', '27-30', '1', '');
INSERT INTO `resource_auth` VALUES ('31', '回收站管理', '0', '', '', '31', '0', '');
INSERT INTO `resource_auth` VALUES ('32', '图片回收列表', '31', 'ImageRecycle', 'index', '31-32', '1', '');
INSERT INTO `resource_auth` VALUES ('34', '课程管理', '0', '', '', '34', '0', 'Uploads/2015-09-21/55fffd6d53b09.png');
INSERT INTO `resource_auth` VALUES ('35', '用户关联课程列表', '34', 'UserLesson', 'index', '34-35', '1', '');
INSERT INTO `resource_auth` VALUES ('36', '课程评论列表', '34', 'LessonComment', 'index', '34-36', '1', '');
INSERT INTO `resource_auth` VALUES ('37', '课程笔记列表', '34', 'LessonNote', 'index', '34-37', '1', '');
INSERT INTO `resource_auth` VALUES ('38', '技术文章分类', '14', 'TechnCate', 'index', '14-38', '1', 'Uploads/2016-03-05/56dae5e727e5e.png');
INSERT INTO `resource_auth` VALUES ('39', '技术文章', '14', 'Techn', 'index', '14-39', '1', 'Uploads/2016-03-05/56dae6553db2f.png');
INSERT INTO `resource_auth` VALUES ('40', '技术文章分类显示', '21', 'TechnPage', 'index', '21-40', '1', '');

-- ----------------------------
-- Table structure for resource_bug
-- ----------------------------
DROP TABLE IF EXISTS `resource_bug`;
CREATE TABLE `resource_bug` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '报告者id',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT 'bug 名',
  `content` varchar(255) NOT NULL DEFAULT '' COMMENT 'bug 描述',
  `did` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '修改者id',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT 'bug图',
  `img` varchar(255) NOT NULL DEFAULT '' COMMENT '修改好的截图',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_bug
-- ----------------------------
INSERT INTO `resource_bug` VALUES ('1', '0', '权限关联图', '在模板文件中 进行非空处理', '1', 'Uploads/2015-09-20/55fe4f11247d2.png', 'Uploads/2015-09-20/55fe56df0e996.png');

-- ----------------------------
-- Table structure for resource_business_logic
-- ----------------------------
DROP TABLE IF EXISTS `resource_business_logic`;
CREATE TABLE `resource_business_logic` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '逻辑名',
  `image` varchar(50) NOT NULL DEFAULT '' COMMENT '逻辑图',
  `flag` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '导航标志 0 无导航 1 有导航',
  `des` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_business_logic
-- ----------------------------
INSERT INTO `resource_business_logic` VALUES ('2', '后台首页', 'Uploads/2015-09-26/560648beb39b1.png', '1', '进入后台首页时 立即显示');
INSERT INTO `resource_business_logic` VALUES ('3', '前台个人设置', '', '1', '个人中心设置页 导航');
INSERT INTO `resource_business_logic` VALUES ('4', '前台个人中心', '', '1', '前台个人中心 包括会员所有信息的入口');

-- ----------------------------
-- Table structure for resource_categorys
-- ----------------------------
DROP TABLE IF EXISTS `resource_categorys`;
CREATE TABLE `resource_categorys` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `catename` varchar(100) NOT NULL COMMENT '分类名',
  `pid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '父id',
  `rid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '所属方向',
  `did` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '所属难度',
  `path` varchar(255) NOT NULL DEFAULT '0,' COMMENT '全路径',
  `image` varchar(255) NOT NULL COMMENT '分类总结图',
  `addtime` int(10) unsigned DEFAULT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_categorys
-- ----------------------------
INSERT INTO `resource_categorys` VALUES ('1', '课程', '0', '0', '0', '0,', '', '1442640181');
INSERT INTO `resource_categorys` VALUES ('2', 'php', '1', '0', '0', '0,1,', '', '1442640225');
INSERT INTO `resource_categorys` VALUES ('3', 'php 基础', '2', '3', '1', '0,1,2,', '', '1442640256');

-- ----------------------------
-- Table structure for resource_develop
-- ----------------------------
DROP TABLE IF EXISTS `resource_develop`;
CREATE TABLE `resource_develop` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '开发人员名',
  `flag` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '开发人员职位',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_develop
-- ----------------------------
INSERT INTO `resource_develop` VALUES ('2', 'admin', '0');
INSERT INTO `resource_develop` VALUES ('3', 'apeng1', '1');

-- ----------------------------
-- Table structure for resource_difficult
-- ----------------------------
DROP TABLE IF EXISTS `resource_difficult`;
CREATE TABLE `resource_difficult` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '技术难度',
  `des` text COMMENT '难度描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_difficult
-- ----------------------------
INSERT INTO `resource_difficult` VALUES ('1', '初级', '');
INSERT INTO `resource_difficult` VALUES ('2', '中级', '');
INSERT INTO `resource_difficult` VALUES ('3', '高级', '');

-- ----------------------------
-- Table structure for resource_dir
-- ----------------------------
DROP TABLE IF EXISTS `resource_dir`;
CREATE TABLE `resource_dir` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '名称',
  `aid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '关联表id',
  `controller` varchar(50) NOT NULL DEFAULT '' COMMENT '控制器',
  `method` text COMMENT '控制器中方法',
  `model` varchar(50) DEFAULT NULL COMMENT '模型名',
  `metmod` text COMMENT '模型中方法',
  `template` text COMMENT '模板',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '结构图',
  `flag` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '前后台标志',
  `des` text COMMENT '描述',
  `pid` tinyint(1) unsigned DEFAULT '0' COMMENT '项目编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_dir
-- ----------------------------
INSERT INTO `resource_dir` VALUES ('1', '后台首页', '0', 'IndexController', 'index 首页(判断用户是否登录)', '', '', 'index.html 首页(所有列表的父模板), menu.html 导航菜单(Nav/menu 调用此模板)', '', '0', '左边导航使用{:W(\'Nav/menu\')}', '0');
INSERT INTO `resource_dir` VALUES ('2', '导航组件', '0', 'NavWidget', 'menu 导航菜单(加载顶级 次顶级权限)', '', null, 'menu.html 导航菜单', '', '0', '', '0');
INSERT INTO `resource_dir` VALUES ('3', '权限控制', '2', 'AuthController', 'index 权限列表(所有权限)\r\n, add 添加界面(项级 次顶级权限)\r\n, insert 添加数据(调用模型中addAuth方法)\r\n, edit 修改界面(顶级 次顶级权限)\r\n, update 修改数据(调用模型中updAuth方法)\r\n, delete 删除权限\r\n, getInfo 获取权限信息', 'AuthModel', 'index.html 权限列表\r\n, add.html 添加界面(父模板)\r\n, edit.html 修改界面(继承add.html模板)', 'index.html 权限列表\r\n, add.html 添加界面(父模板)\r\n, edit.html 修改界面(继承add.html模板)', '', '0', '', '0');
INSERT INTO `resource_dir` VALUES ('4', '角色', '0', 'RoleController', 'index 角色列表', '', null, '', '', '0', '', '0');
INSERT INTO `resource_dir` VALUES ('6', '', '0', '', null, null, null, null, '', '0', '', '0');
INSERT INTO `resource_dir` VALUES ('7', '拦截权限(基类)', '0', 'BaseController', '__construct 构造方法(拦截权限), _empty() 非空操作方法处理', '', '', '', '', '0', '', '1');
INSERT INTO `resource_dir` VALUES ('8', '后台首页', '0', 'IndexController', 'index 后台首页, message 消息推送, breadcrumb 面包路径', '', '', 'index.html 首页模板, message.html 消息模板, menu.html 导航模板', '', '0', '', '1');
INSERT INTO `resource_dir` VALUES ('9', '后台基类', '0', 'BaseController', 'controller构造方法, empty 非空处理', '', '', '', '', '0', '负责拦截权限', '2');

-- ----------------------------
-- Table structure for resource_direct
-- ----------------------------
DROP TABLE IF EXISTS `resource_direct`;
CREATE TABLE `resource_direct` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '技术方向名',
  `des` text COMMENT '技术方向描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_direct
-- ----------------------------
INSERT INTO `resource_direct` VALUES ('1', '前端开发', '包括前端技术 但不包括移动端');
INSERT INTO `resource_direct` VALUES ('3', '后端开发', '');
INSERT INTO `resource_direct` VALUES ('4', '移动开发', '');
INSERT INTO `resource_direct` VALUES ('5', '数据处理', '');
INSERT INTO `resource_direct` VALUES ('6', '图像处理', '');

-- ----------------------------
-- Table structure for resource_function
-- ----------------------------
DROP TABLE IF EXISTS `resource_function`;
CREATE TABLE `resource_function` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pid` int(10) unsigned DEFAULT NULL COMMENT '所属分类',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '功能名',
  `code` text COMMENT '功能代码',
  `note` text COMMENT '功能描述',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_function
-- ----------------------------
INSERT INTO `resource_function` VALUES ('1', '0', 'php 添加 sql 语句', '// 使用php 连接mysql 服务器\r\n$link = mysql_connect(\'localhost\', \'root\', \'\');\r\n// 判断mysql 服务器连接是否成功\r\nif (!$link) {\r\n    echo \'mysql 连接失败&lt;br/&gt; 错误号: \'.mysql_errno().\'错误信息: \'.mysql_error();\r\n} else {\r\n    echo \'连接成功\';\r\n}\r\n// 选择数据库\r\nmysql_select_db(DBNAME, $link);\r\n// 设置字符集编码\r\nmysql_set_charset(\'utf8\', $link);\r\n// 定义sql 语句\r\n$sql = &quot;insert into student(name,age,sex,grade,des,addtime) values(\'小明\', 18, \'w\', \'s24\', \'小明是个好同志\',&quot;.time().&quot;)&quot;;\r\n// 发送sql 语句\r\n$result = mysql_query($sql, $link);\r\n// 处理结果\r\nif ($result) {\r\n    echo &quot;添加成功&lt;br/&gt; 共添加了&quot;.mysql_afftected_rows($link).&quot;行&lt;br/&gt; 获取上一次添加的自增id&quot;.mysql_insert_id($link);\r\n} else {\r\n    echo \'添加失败&lt;br/&gt;\'.mysql_errno.\' : \'.mysql_error();\r\n}\r\n// 关闭连接资源\r\nmysql_close($link);', '');
INSERT INTO `resource_function` VALUES ('3', '7', 'TP 添加 sql 语句', 'public function insert(){\r\n		$_POST[\'name\'] = I(\'post.name\');\r\n		$_POST[\'code\'] = I(\'post.code\');\r\n		$_POST[\'pid\'] = I(\'post.pid\');\r\n		$_POST[\'note\'] = I(\'post.note\');\r\n		$res = D(\'Function\') -&gt; add($_POST);\r\n		$mess = new MessController();\r\n		$mess -&gt; ajaxMessage($res, \'添加成功\', \'添加失败\');\r\n	}', '异步添加');
INSERT INTO `resource_function` VALUES ('4', '7', 'iwebshop 添加 sql 语句', 'public function add(){\r\n// 获取参数并验证\r\n$id = IFilter::act(IReq::get(\'id\'), \'int\');\r\n// 实例化表\r\n$table = IModel(\'student\');\r\n// 添加数据\r\n$data = array(\'id\'=&gt;$id...);\r\n$table-&gt;setData($data);\r\n// 添加\r\n$table-&gt;add();\r\n// 跳转页面\r\n$this-&gt;redirect(\'index\');\r\n}', '');

-- ----------------------------
-- Table structure for resource_image_recycle
-- ----------------------------
DROP TABLE IF EXISTS `resource_image_recycle`;
CREATE TABLE `resource_image_recycle` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '操作者id',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '删除的图片',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_image_recycle
-- ----------------------------
INSERT INTO `resource_image_recycle` VALUES ('2', '1', 'Uploads/2015-09-20/55fea199dc54b.png');
INSERT INTO `resource_image_recycle` VALUES ('21', '1', 'Uploads/2015-09-25/560546e4d4223.png');
INSERT INTO `resource_image_recycle` VALUES ('14', '1', 'Uploads/2015-09-13/55f51aa09ab1b.png');
INSERT INTO `resource_image_recycle` VALUES ('38', '1', 'Uploads/2016-03-05/56dac65022a2f.png');

-- ----------------------------
-- Table structure for resource_instance
-- ----------------------------
DROP TABLE IF EXISTS `resource_instance`;
CREATE TABLE `resource_instance` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '实例名',
  `quest` varchar(255) NOT NULL DEFAULT '' COMMENT '问题',
  `plan` text COMMENT '方案',
  `discuss` text COMMENT '讨论',
  `suggestion` varchar(255) DEFAULT NULL COMMENT '参考',
  `pid` int(10) unsigned DEFAULT NULL COMMENT '所属分类',
  `uid` int(10) unsigned DEFAULT NULL COMMENT '所属用户',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_instance
-- ----------------------------
INSERT INTO `resource_instance` VALUES ('1', '访问子字符串', '你想知道一个字符串是否包含一个特殊的子字符串 例如 你想找出包含@的电子邮件地址', '', '', '', '11', null);

-- ----------------------------
-- Table structure for resource_lesson
-- ----------------------------
DROP TABLE IF EXISTS `resource_lesson`;
CREATE TABLE `resource_lesson` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '所属分类',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '课程名',
  `target` varchar(255) NOT NULL DEFAULT '' COMMENT '课程目标',
  `video` varchar(255) NOT NULL DEFAULT '' COMMENT '课程视频',
  `content` text COMMENT '课程内容',
  `program` text COMMENT '程序内容',
  `data` varchar(255) NOT NULL DEFAULT '' COMMENT '课程相关资料',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '流程图',
  `homework` varchar(255) DEFAULT NULL COMMENT '课后作业',
  `answer` text COMMENT '作业答案',
  `learn` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '学习人数',
  `views` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '浏览人数',
  `comments` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '评论人数',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_lesson
-- ----------------------------
INSERT INTO `resource_lesson` VALUES ('1', '3', 'php 介绍', '知道PHP 是做网页的 并学会第一个 welcome to here 程序', '', 'PHP 是什么\r\n能干什么\r\n第一个程序', 'echo welcome to here', '', '', '如何安装PHP 开发环境', '', '0', '0', '0');

-- ----------------------------
-- Table structure for resource_logic
-- ----------------------------
DROP TABLE IF EXISTS `resource_logic`;
CREATE TABLE `resource_logic` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ac` varchar(100) NOT NULL DEFAULT '' COMMENT '控制器-操作方法',
  `content` text COMMENT '逻辑内容',
  `note` varchar(255) NOT NULL DEFAULT '' COMMENT '逻辑备注',
  `pid` tinyint(1) unsigned DEFAULT '0' COMMENT '项目标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_logic
-- ----------------------------
INSERT INTO `resource_logic` VALUES ('6', 'Index-index', '判断用户是否登录\r\n显示对应的模板', '判断session 是否为空', '0');
INSERT INTO `resource_logic` VALUES ('7', 'Auth-index', '获取所有权限信息\r\n向模板中分配数据及显示模板', 'getinfo(true) 获取所有权限信息', '0');
INSERT INTO `resource_logic` VALUES ('8', 'Auth-add', '从index.html 模板中异步请求(Auth/add)\r\n获取顶级,次顶级权限\r\n向模板中分配数据及显示模板', 'getinfo() 获取顶级,次顶级权限', '0');
INSERT INTO `resource_logic` VALUES ('9', 'Auth-insert', '实例化D(\'Auth\') -> new \\Admin\\Model\\addAuth($_POST);\r\naddAuth($auth)添加权限方法\r\ninsert 生成一个新记录添加 name pid controller action\r\ngetPath 获取 path\r\nlevel 全路径里边中划线的个数\r\nupdate 更新 path level', 'getPath 获取全路径\r\n父id 等于 0 全路径等于id\r\n父id 不等于 0 全路径为父级全路径与本身id的连接信息', '0');
INSERT INTO `resource_logic` VALUES ('10', 'Auth-edit', '根据id 获取要修改的那条记录\r\n获取顶级,次顶级权限\r\n// 向模板中分配数据及显示模板', '', '0');
INSERT INTO `resource_logic` VALUES ('11', 'Bas-_empty', '直接显示对应的错误页面', '', '1');
INSERT INTO `resource_logic` VALUES ('12', 'Bas-__construct', '调用父控制器中构造方法\r\n拼接当前的请求(控制器-操作方法)\r\n获取当前角色的id\r\n如果id存在 获取当前角色所拥有的所有权限 如果不存在 返回到登录页面\r\n如果当前角色访问的请求在他所拥有的权限中 显示请求页面 否则 提示无权访问', '', '1');
INSERT INTO `resource_logic` VALUES ('13', 'Index-index', '判断用户是否登录\r\n显示对应的模板', '判断session 中是否为空', '1');
INSERT INTO `resource_logic` VALUES ('14', 'Index-message', '长轮询 while(true){ ...}\r\n查询是否有消息\r\n有消息封装为json数据返回并退出长轮询\r\n睡眠一秒(每一秒轮询一次)', '', '1');
INSERT INTO `resource_logic` VALUES ('15', 'Index-breadcrumb', '获取控制器和操作方法\r\n根据控制器和操作方法获取名字\r\n返回名字', '', '1');

-- ----------------------------
-- Table structure for resource_manager
-- ----------------------------
DROP TABLE IF EXISTS `resource_manager`;
CREATE TABLE `resource_manager` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL DEFAULT '' COMMENT '管理名称',
  `password` char(32) NOT NULL DEFAULT '' COMMENT '管理密码',
  `regtime` int(10) unsigned DEFAULT NULL COMMENT '注册时间',
  `logtime` int(10) unsigned DEFAULT NULL COMMENT '登录时间',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `rid` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_manager
-- ----------------------------
INSERT INTO `resource_manager` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '1439805718', '1439805718', 'caopeng8787@163.com', '0');
INSERT INTO `resource_manager` VALUES ('3', 'apeng', 'e10adc3949ba59abbe56e057f20f883e', '1439817214', '1439817214', 'apeng@qq.com', '1');

-- ----------------------------
-- Table structure for resource_member
-- ----------------------------
DROP TABLE IF EXISTS `resource_member`;
CREATE TABLE `resource_member` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(10) unsigned DEFAULT NULL COMMENT '用户id',
  `sex` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '用户性别',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '用户状态',
  `address` varchar(255) NOT NULL DEFAULT '' COMMENT '用户地址',
  `birthday` char(10) NOT NULL DEFAULT '' COMMENT '用户生日',
  `online` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '在线时间',
  `regtime` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '注册时间',
  `logtime` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '上次登录时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_member
-- ----------------------------

-- ----------------------------
-- Table structure for resource_module
-- ----------------------------
DROP TABLE IF EXISTS `resource_module`;
CREATE TABLE `resource_module` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '模块名',
  `des` text COMMENT '功能描述',
  `image` varchar(32) NOT NULL DEFAULT '' COMMENT '流程描述',
  `code` varchar(32) NOT NULL DEFAULT '' COMMENT '代码压缩包',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_module
-- ----------------------------
INSERT INTO `resource_module` VALUES ('1', '留言板模块', '留言提交: 访客提交留言', '', '');

-- ----------------------------
-- Table structure for resource_nav
-- ----------------------------
DROP TABLE IF EXISTS `resource_nav`;
CREATE TABLE `resource_nav` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '导航名',
  `bid` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '所属页面id',
  `href` varchar(255) NOT NULL DEFAULT '' COMMENT '导航路径',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_nav
-- ----------------------------
INSERT INTO `resource_nav` VALUES ('1', '个人资料', '3', 'UserSetting/info');
INSERT INTO `resource_nav` VALUES ('2', '头像设置', '3', 'UserSetting/headImg');
INSERT INTO `resource_nav` VALUES ('3', '修改密码', '3', 'UserSetting/updatePass');
INSERT INTO `resource_nav` VALUES ('4', '我的课程', '4', 'User/lesson');
INSERT INTO `resource_nav` VALUES ('5', '我的课程评论', '4', 'User/lessonComment');
INSERT INTO `resource_nav` VALUES ('6', '我的计划', '4', 'User/plan');
INSERT INTO `resource_nav` VALUES ('7', '我的代码', '4', 'User/code');
INSERT INTO `resource_nav` VALUES ('8', '我的笔记', '4', 'User/note');

-- ----------------------------
-- Table structure for resource_project
-- ----------------------------
DROP TABLE IF EXISTS `resource_project`;
CREATE TABLE `resource_project` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '项目名',
  `des` varchar(255) NOT NULL DEFAULT '' COMMENT '项目描述',
  `starttime` int(10) unsigned NOT NULL COMMENT '开始时间',
  `endtime` int(10) unsigned NOT NULL COMMENT '结束时间',
  `techn` text COMMENT '技术描述',
  `summary` text COMMENT '项目心得',
  `env` varchar(255) NOT NULL DEFAULT '' COMMENT '开发环境介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_project
-- ----------------------------
INSERT INTO `resource_project` VALUES ('1', '畅享世界', '本系统为博客型交友系统,前台有动态、个人中心、说说、日志、相册、留言板、资料库、好友等。后台有权限管理、会员管理、资源管理、公告管理。', '0', '0', '使用SVN 控制版本\r\n使用ThinkPHP 框架搭建\r\n前后台页面使用Bootstrap 框架\r\n通过后台添加及修改等使用Ajax 异步请求更深刻的体会Ajax 在后台的运用。\r\n通过在主模板封装JS 函数及搜索分页控制器等，更深刻的体会代码的重用性。\r\n通过使用反向Ajax 更好的熟练使用消息推送(Ajax 长轮询)。\r\n后台使用基于角色的访问权限管理（RBAC Role-Based Access Control）。\r\nOOP思想、MVC 模式等', 'ThinkPHP  作为框架，项目过程更理解OOP 思想，深刻体会MVC 模式的便捷性(代码的重用等)。对\r\nJavaScript、Ajax、jQuery 的运用更加熟练。\r\n', 'windows 系统 sublime 编辑器');
INSERT INTO `resource_project` VALUES ('2', '资料系统', '整理所学资料', '0', '0', 'yk\r\nhk\r\nj', 'dd\r\njkl', 'windows');

-- ----------------------------
-- Table structure for resource_realize
-- ----------------------------
DROP TABLE IF EXISTS `resource_realize`;
CREATE TABLE `resource_realize` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `did` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '开发者',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '实现名',
  `content` text COMMENT '实现描述',
  `addtime` int(10) unsigned DEFAULT NULL COMMENT '实现时间',
  `url` varchar(255) NOT NULL DEFAULT '' COMMENT '参考地址',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_realize
-- ----------------------------
INSERT INTO `resource_realize` VALUES ('1', '3', '分类管理关联权限图', '参考 权限列表中的分类管理', '1442709525', 'http://localhost/resource/index.php/Admin/Auth/index');
INSERT INTO `resource_realize` VALUES ('3', '3', '权限关联图回收', '修改关联图 删除操作时 回收关联图', '1442710863', 'http://localhost/resource/index.php/Admin/ImageRecycle/index');

-- ----------------------------
-- Table structure for resource_role
-- ----------------------------
DROP TABLE IF EXISTS `resource_role`;
CREATE TABLE `resource_role` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '角色名',
  `aids` varchar(128) NOT NULL DEFAULT '' COMMENT '权限ids',
  `aac` text COMMENT '控制器-操作方法',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_role
-- ----------------------------
INSERT INTO `resource_role` VALUES ('1', '董事长', '', null);
INSERT INTO `resource_role` VALUES ('2', '经理', '', null);
INSERT INTO `resource_role` VALUES ('3', '主管', '1,2,3,13', 'Auth-index,Manager-index,Role-index');
INSERT INTO `resource_role` VALUES ('4', '会员专员', '', null);

-- ----------------------------
-- Table structure for resource_techn
-- ----------------------------
DROP TABLE IF EXISTS `resource_techn`;
CREATE TABLE `resource_techn` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `summary` varchar(200) DEFAULT NULL,
  `img` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `addtime` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `recommend` int(11) NOT NULL DEFAULT '0',
  `allow` tinyint(1) DEFAULT '0',
  `views` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_techn
-- ----------------------------
INSERT INTO `resource_techn` VALUES ('1', '1', '面向对象1', null, 'Uploads/2015-06-16/55801e2ceb688.png', '1. 面向对象的介绍\r\n  1.1 面向对象的两个方向： 思想 语法\r\n  1.2 对象: 一切皆对象 \r\n  1.3 面向对象 ： 用对象思想去编程 \r\n  1.4 面向过程 ： 强调步骤 函数 \r\n 缺点： 程序灵活性低 \r\n 1.5 面向对象的优点 重用性 灵活性 可扩展性 \r\n 1.6 面向对象编程的特点 ： 封装性 继承性 多态性 \r\n  1.7 PHP中的面向对象 : \r\n  PHP4 开始有对象\r\n  PHP5 完全面向对象\r\n 1.8 注意：\r\n 面向对象无法提高 程序的运行效率\r\n 面向对象提高的开发效率\r\n  \r\n  2. 类和对象的关系\r\n  1.1 类和对象的关系\r\n 类是对象的抽象 对象是类的实例\r\n 一个类可以有多个实例\r\n 1.2 对象 \r\n  组成： 成员属性\r\n  成员方法\r\n  1.3 类\r\n 具有相同特性和行为的对象的抽象就是类\r\n  组成： 成员属性 成员方法', '1457189672', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('2', '1', '抽象一个类', null, 'Uploads/2015-06-16/5580202b3f943.png', '1. 类的定义\r\n      class 类名\r\n      {\r\n        code.........\r\n      }\r\n     \r\n    2. 成员属性(变量)\r\n     格式：  修饰符 $属性名 = 值;\r\n            修饰符 $属性名;\r\n     修饰符：  public     private      protected      static     var\r\n     说明：\r\n       ① var修饰符 等同于public php4的语法，不建议使用\r\n        ② 对象中的成员属性 不同重复定义\r\n       ③ 给属性赋值，只能直接给值， 不能进行表达式运算（调用函数，运算符）\r\n       ④ 类中可以读取常量\r\n      \r\n    3. 成员方法（函数）\r\n     格式：   [修饰符] function 方法名([参数列表])\r\n            {\r\n             code...\r\n           }\r\n     修饰符： public   private    protected    static     abstract    final   \r\n     说明： \r\n            ①方法可以省略修饰符  省略修饰符相当于public\r\n            ② 方法名不同 重复', '1434460203', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('3', '1', '对象的操作', null, 'Uploads/2015-06-16/558022d693188.png', '1. 实例化一个对象\r\n     new className();\r\n      new className;\r\n    \r\n    2. 对象成员的访问  \r\n      ->\r\n      \r\n    3. 对象在内存中的存贮\r\n      对象的变量名存在 栈\r\n      对象的内容存在 堆里\r\n      \r\n    4. $this \r\n       \r\n    5. 构造方法和析构方法\r\n      5.1 构造方法\r\n        格式：\r\n         public function __construct()\r\n         {\r\n         }\r\n       特点：\r\n         ① 自动调用， 当类被实例化的时候，被自动调用\r\n         ② 实例化对象 类名后面的括号可以省略（该类没有构造方法或者构造方法没有参数）\r\n         ③ PHP4的时候 构造方法 是 与类名同名的方法\r\n         ④ 如果 两个构造方法 都在， __construct()优先级高， 不建议写两个\r\n       作用：\r\n         ① 用于给属性赋初始值\r\n         ② 打开资源\r\n      5.2 析构方法\r\n        格式：\r\n         public function __destruct()\r\n          {\r\n         }\r\n       提点：\r\n         ① 当对象被销毁的时候，析构方法会自动执行\r\n       作用：\r\n         ① 销毁资源', '1434460886', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('4', '1', '实例一 worker', null, '', '属性（）：工作种类，职务\r\n方法：\r\n1.构造方法：给类中属性赋值。\r\n2.工作方法：要求有本类所有属性输出\r\n\r\nclass Worker\r\n{\r\n private $cate;\r\n  private $work;\r\n  public function __construct($cate, $work)\r\n {\r\n   $this->cate = $cate;\r\n    $this->work = $work;\r\n  }\r\n\r\n public function work()\r\n  {\r\n   echo \'你的工作部门是 \'.$this->cate;\r\n    echo \'<br/>\';\r\n   echo \'你的职位是 \'.$this->work;\r\n  }\r\n}\r\n\r\n$work = new Worker(\'事业部\', \'经理\');\r\n$work ->work();', '1434461184', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('5', '1', '实例二 Url', null, '', '属性：url名称\r\n方法：构造方法，给url属性赋初始化值\r\n1.  方法一：返回url的文件名：如a.php  index.html\r\n2.  方法二：返回url的协议名   如http  ftp\r\n3.  方法三：返回url的主机名：\r\n4.  方法四：返回url的文件后缀名：\r\n\r\n\r\nclass Url\r\n{\r\n  private $url;\r\n\r\n public function __construct($url)\r\n {\r\n   $this->url = $url;\r\n  }\r\n\r\n public function filename()\r\n  {\r\n   $url = $this->url;\r\n    $str = explode(\'/\', $url);\r\n    $len = count($str) - 1;\r\n   if($str[$len]){\r\n     echo \"本地址的文件是 \".$str[$len];\r\n     echo \'<br/>\';\r\n   }\r\n }\r\n\r\n public function proto()\r\n {\r\n   $url = $this->url;\r\n    preg_match(\'/^\\w+:/\', $url, $m);\r\n   $proto = rtrim($m[0], \':\');\r\n   echo \'本地址的协议是 \'.$proto;\r\n   echo \'<br/>\';\r\n }\r\n\r\n public function host()\r\n  {\r\n   $url = $this ->url;\r\n   $str = explode(\'/\', $url);\r\n    echo \'本地址的主机是 \'.$str[2];\r\n    echo \'<br/>\';\r\n }\r\n\r\n public function extension()\r\n {\r\n   $url = $this->url;\r\n    //$str = strripos($url, \'.\');\r\n   $str = strrchr($url, \'.\');\r\n    if($str){\r\n     echo \'本地址的文件后缀名是 \'.ltrim($str, \'.\');\r\n    }\r\n }\r\n}\r\n\r\n$url = new Url(\'http://www.qq.com/index.php\');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho \"<hr/>\";\r\n\r\n$url = new Url(\'http://www.qq.com/a/b/index.html\');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho \"<hr/>\";\r\n\r\n$url = new Url(\'ftp://www.apeng.com/index.jsp\');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho \"<hr/>\";', '1434461400', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('6', '1', '实例三 数据库连接', null, '', '属性（受保护）： 数据库连接资源属性、表名、主键名属性。\r\n方法：\r\n  构造方法语句给上面的私有属性赋值。\r\n 方法一：数据查询信息select( ) ,以数组方式返回结果。\r\n方法二：数据删除方法del($id)，根据指定的主键值，删除对应的信息\r\n方法三：数据单条信息获取方法find($id), 根据指定的主键值，\r\n       获取对应的详情信息（添加自动获取主键名的方法）\r\n方法四： 析构方法（关闭数据库连接）。\r\n\r\n\r\nclass Model\r\n{\r\n private $host = &#039;localhost&#039;;\r\n  private $user = &#039;root&#039;;\r\n private $pass = &#039;&#039;;\r\n private $db = &#039;shop&#039;;\r\n private $table;\r\n /**\r\n  * 连接数据库\r\n  */\r\n  public function __construct($table)\r\n {\r\n   mysql_connect($this-&gt;host,$this-&gt;user,$this-&gt;pass) or die(&#039;数据库连接失败&#039;);\r\n    mysql_select_db($this-&gt;db);\r\n    mysql_set_charset(&#039;utf8&#039;);\r\n    $this-&gt;table = $table;\r\n }\r\n\r\n /**\r\n  * select()\r\n  * @param $sql 根据sql 来查询\r\n  */\r\n  public function select(){\r\n   $sql = &quot;select * from &quot;.$this-&gt;table;\r\n    $list = &#039;&#039;;\r\n   $res = mysql_query($sql);\r\n   if($res &amp;&amp; mysql_num_rows($res) &gt; 0){\r\n      while ($rows = mysql_fetch_assoc($res)) {\r\n       $list[] = $rows;\r\n      }\r\n     mysql_free_result($res);\r\n    }\r\n   return $list;\r\n }\r\n\r\n /**\r\n  * @param $id 根据id 来删除记录\r\n  */\r\n  public function del($id){\r\n   $sql = &quot;delete from &quot;.$this-&gt;table.&quot; where id={$id}&quot;;\r\n    $res = mysql_query($sql);\r\n   if($res){\r\n     echo &#039;删除成功&#039;;\r\n    }\r\n }\r\n\r\n /**\r\n  * @param $id 根据id 来删除记录\r\n  */\r\n  public function find($id){\r\n    $sql = &quot;select * from &quot;.$this-&gt;table.&quot; where id={$id} limit 1&quot;;\r\n    $list = &#039;&#039;;\r\n   $res = mysql_query($sql);\r\n   if($res &amp;&amp; mysql_num_rows($res) &gt; 0){\r\n      while ($rows = mysql_fetch_assoc($res)) {\r\n       $list = $rows;\r\n      }\r\n     mysql_free_result($res);\r\n    }\r\n   return $list;\r\n }\r\n\r\n public function __destruct()\r\n  {\r\n   mysql_close();\r\n  }\r\n\r\n}\r\n\r\n$model = new Model(&#039;shop_mg&#039;);\r\n$res = $model -&gt;select();\r\nif($res){\r\n foreach ($res as $key =&gt; $value) {\r\n   echo &#039;主键为 &#039;.$key.&#039; 的用户名 &#039;.$value[&#039;username&#039;];\r\n   echo &#039;&lt;br/&gt;&#039;;\r\n }\r\n}\r\n\r\n$model-&gt;del(3);\r\n$res = $model-&gt;find(2);\r\nvar_dump($res);', '1434461858', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('7', '1', '什么是HTML', null, 'Uploads/2015-06-16/5580280cafbc3.png', '1. HTML的概念\r\n   超文本标记语言，标准通用标记语言下的一个应用。\r\n   “超文本”就是指页面内可以包含图片、链接，甚至音乐、程序等非文字元素。\r\n   \r\n  2. HTML的发展历程\r\n    HTML 1.0——在1993年6月作为互联网工程工作小组（IETF）工作草案发布（并非标准）\r\n   HTML 2.0——1995年11月作为RFC 1866发布，在RFC 2854于2000年6月发布之后被宣布已经过时\r\n   HTML 3.2——1997年1月14日，W3C推荐标准\r\n    HTML 4.0——1997年12月18日，W3C推荐标准\r\n   HTML 4.01（微小改进）——1999年12月24日，W3C推荐标准   xhtml  \r\n    HTML 5——2014年10月28日，W3C推荐标准\r\n 3. 关于HTML5\r\n    2014年10月29日，万维网联盟宣布，经过接近8年的艰苦努力，该标准规范终于制定完成\r\n   浏览器兼容性\r\n    IE9+  chrome  firefox   opera   Safari', '1434462220', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('8', '1', 'HTML的语法', null, 'Uploads/2015-06-16/5580283ca8593.png', '1. HTML的文档声明和注释\r\n    1.1 注释\r\n      &lt;!-- 注释内容  --&gt;\r\n      用于对代码的提示和解释 ， 给程序开发者 使用\r\n   1.2 文档声明  \r\n      声明文档执行的标准\r\n     &lt;!doctype html&gt;\r\n 2. HTML标签\r\n   ① HTML标签是HTMl基本组成部分\r\n   ② 通常两个尖括号 括起来 &lt;&gt;\r\n    ③ 标签都是闭合的， 分为双标签和单标签\r\n    ④ 标签不区分大小写 推荐小写\r\n 3. HTML标签属性\r\n   ① 属性一般出现在标签中，是html标签的一部分\r\n    ② 标签可以有属性，包含额外的信息，属性的值可以在引号中\r\n    ③ 标签可以有多个属性\r\n   ④ 属性名和值成对出现\r\n   ⑤ 格式  &lt;标签 属性1=&#039;值&#039; 属性2=&#039;值&#039; &gt;\r\n 4. HTML中颜色设置\r\n    ① 英文单词 red  green yello .....\r\n   ② 16进制   #121212\r\n  5. HTML代码格式\r\n   ① 任何回车和空格在html中都是不起作用的，可以使用空格进行排版\r\n   ② tab键进行缩进', '1434462268', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('9', '1', 'HTML文件的主体结构', null, 'Uploads/2015-06-16/558028637792e.png', '① 文档声明   位于HTML标签之前 该标签告知浏览器文档所使用的HTML规范\r\n html5 使用&lt;!doctype html&gt;\r\n ② html       告知浏览器 这是html文档\r\n ③ head       定义文档的头部信息， 不会像用户显示这些信息\r\n ④ title      定义文档标题， 一般写在head 里面\r\n  ⑤ body       定义文档主题， 文本、图片....\r\n  主体结构\r\n  &lt;!doctype html&gt;\r\n &lt;html&gt;\r\n      &lt;head&gt;\r\n          &lt;title&gt;&lt;/title&gt;\r\n     &lt;/head&gt;\r\n     &lt;body&gt;&lt;/body&gt;\r\n &lt;/html&gt;', '1434462307', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('10', '1', 'HEAD 头部内标签语法', null, 'Uploads/2015-06-16/558029e396d11.png', '1. meta 标签  \r\n   1.1 定义页面相关的描述信息，写在head内部\r\n    1.2 常用属性\r\n      ① charset   设置字符集编码  常用的值： utf-8  gbk  gb2312\r\n     ② content   为name和http-equiv  定义关联信息\r\n      ③ http-equiv 把content属性关联到http头部，必须跟conent成对出现\r\n              常用的值：\r\n              content-type   定义编码格式     &lt;meta http-equiv=&quot;content-type&quot; content=&quot;text/html;charset=utf-8&quot;&gt;\r\n              refresh         刷新页面和跳转   &lt;meta http-equiv=&#039;refresh&#039; content=&#039;3&#039;&gt;  &lt;meta http-equiv=&#039;refresh&#039; content=&#039;3; url=http://www.baidu.com&#039;\r\n     ④ name        把conent关联到一个名称\r\n              常用的值\r\n              author      定义文档作者\r\n              keywords    定义网页的关键字  多个关键字用逗号隔开\r\n              description 定义网页描述信息\r\n    1.3 实例\r\n      &lt;meta charset=&#039;utf-8&#039;&gt;\r\n      &lt;meta http-equiv=&quot;content-type&quot; content=&quot;text/html;charset=utf-8&quot;&gt;\r\n      &lt;meta http-equiv=&quot;refresh&quot; content=&#039;2&#039;&gt;\r\n     &lt;meta http-equiv=&quot;refresh&quot; content=&#039;2;url=http://www.lampbrother.net&#039;&gt;\r\n      &lt;meta name=&quot;keywords&quot; content=&quot;关键词1,关键字2&quot;&gt;\r\n      &lt;meta name=&quot;description&quot; content=&quot;描述信息....&quot;&gt;\r\n      &lt;meta name=&quot;author&quot; content=&quot;作者&quot;&gt;\r\n 2. link标签\r\n   2.1 定义连个连接文档的关系， 导入一个文档\r\n   2.2 属性\r\n      rel  定义两个文档的关系\r\n      type 定义导入文档的类型\r\n      href 导入文档的地址\r\n    2.3 实例\r\n      &lt;link type=&quot;text/css&quot; rel=&quot;stylesheet&quot; href=&quot;url地址&quot;&gt;\r\n  3. script标签\r\n   3.1 定义一段脚本\r\n    3.2 属性\r\n      type  定义脚本类型\r\n      src   脚本地址\r\n    3.3 实例\r\n      &lt;script&gt;code...&lt;/script&gt;\r\n      &lt;script src=&quot;url地址&quot; type=&quot;text/javascript&quot;&gt;&lt;/script&gt;\r\n  4. style标签\r\n    4.1 定义css\r\n   4.2 属性\r\n      type   定义类型\r\n 5. title标签\r\n    定义文档的标题', '1434462691', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('11', '1', 'HTML文本与文本格式标签', null, 'Uploads/2015-06-16/5580318cdf9d5.png', '1. HTML文本标签\r\n   1.1 p     定义段落\r\n    1.2 b     定义粗体文字  \r\n    1.3 strong  表示强调， 通常显示为粗体\r\n   1.4 hn      h1 h2 h3 h4 h5 h6  定义不同等级的标题   显示为又大又粗的字体  一个文档中一般只有一个h1\r\n    1.5 em      表示强调，  通常显示为斜体\r\n    1.6 i       呈现为斜体\r\n   1.7 cite    表示引用， 通常显示为斜体\r\n   1.8 sub     下标文字\r\n    1.9 sup     上标文字\r\n  2. HTML文本格式标签\r\n   2.1 bdo     定义文字方向 属性dir  值： ltr(默认)  rtl\r\n   2.2 q       定义短的引用， 添加双引号  \r\n   2.3 abbr  定义缩写    属性title  指定全写\r\n   2.4 del   定义删除文本\r\n    2.5 time    定义时间   属性datetime    HTML5新增标签\r\n    2.6 summary 配合details使用\r\n   2.7 details 定义元素细节  属性open  值 true false  \r\n    2.8 dialog  定义一段对话  配合 dt(指定说话者)  dd(指定说话内容)\r\n  3. HTML字符实体\r\n   &amp;quot; &quot;\r\n   &amp;amp;  &amp;\r\n    &amp;lt;   &lt;\r\n   &amp;gt;   &gt;\r\n   &amp;nbsp; 空格\r\n   &amp;copy; ©\r\n    &amp;sect; §\r\n    &amp;curren; ¤\r\n    &amp;times; ×', '1434464652', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('12', '1', '列表标签', null, 'Uploads/2015-06-16/5580323717993.png', '1. ul  定义无序列表\r\n  2. li  定义无序或有序列表的列表项\r\n  3. ol  定义有序列表\r\n 4. dl  定义定义列表\r\n 5. dt  定义定义列表项或定义对话的角色\r\n  6. dd  对列表项进行描述或定义对话的内容\r\n 7. pre 格式化输出\r\n  8. br  换行 ', '1434464823', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('13', '1', '链接标签', null, 'Uploads/2015-06-16/558033945bb54.png', '1. a  \r\n   1.1 定义超连接 从一个页面跳转到另一个页面\r\n   1.2 属性\r\n      href     指定要跳转的地址\r\n     target   指定新网页打开位置    _blank新窗口  _self本窗口\r\n     name     定义锚点名\r\n      \r\n  2. 锚点  跳转到页面的指定位置  a表前name属性添加锚点名   其他标签id属性\r\n  3. mailto:: 打开发送邮件的程序\r\n 4. 绝对地址与相对地址', '1434465172', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('14', '1', '多媒体相关标签', null, 'Uploads/2015-06-16/558033b235cb7.png', '1. img \r\n 2. map\r\n  3. area\r\n 4. audio\r\n  5. video\r\n  6. source\r\n 7. canvas\r\n 8. embed', '1434465202', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('17', '1', '登录', null, 'Uploads/2015-06-17/5580ca9f6d261.png', 'if (!empty($_POST[&#039;username&#039;])){ // 判断是否有表单数据(没有直接跳转到登录界面)\r\n        $username = $_POST[&#039;username&#039;]; // 获取用户名\r\n        $password = $_POST[&#039;password&#039;]; // 获取密码\r\n        $code = $_POST[&#039;code&#039;]; // 获取验证码\r\n\r\n        require &#039;../common/valid.php&#039;; // 调用 valid.php 来验证 用户名 密码 验证码\r\n        valid_user_len($username, &#039;./login.php&#039;); // 验证用户名长度\r\n        valid_pass_len($password, &#039;./login.php&#039;); // 验证密码长度\r\n        \r\n        require &#039;../common/mysql_conn.php&#039;; // 加载连接函数\r\n        // 定义查询语句 select * from shop_mg where username = &#039;caopeng8&#039;\r\n        // $sql = &quot;select * from &quot;.PREFIX.&quot;mg where username = &#039;{$username}&#039; &quot;; \r\n        $sql = &quot;select id, password, username, email, status from &quot;.PREFIX.&quot;mg where username = &#039;{$username}&#039; limit 1&quot;;\r\n        $userinfo = query($sql); // 获取查询结果\r\n        if ($userinfo){ // $result 是一个数组(id, username ... )\r\n            valid_pass(md5($password), $userinfo[0][&#039;password&#039;], &#039;./login.php&#039;); //比较密码\r\n        } else {\r\n            header(&#039;location: ./login.php?errno=6&#039;); // 用户名错误\r\n            exit;\r\n        }\r\n\r\n        // 处理验证码\r\n        session_start(); // 开启session\r\n        valid_verify($code, $_SESSION[&#039;code&#039;], &#039;./login.php&#039;); // 比较验证码\r\n        unset($_SESSION[&#039;code&#039;]); // 去除session验证码\r\n       \r\n        $_SESSION[&#039;userinfo&#039;] = $userinfo[0]; // 向session 中保存用户信息\r\n        //unset($_SESSION[&#039;userinfo&#039;][&#039;email&#039;]); // 却去除session 中的邮箱\r\n        unset($_SESSION[&#039;userinfo&#039;][&#039;password&#039;]); // 去除session 中的密码\r\n        // session 中的值\r\n        // array (size=4)\r\n        // &#039;id&#039; =&gt; string &#039;13&#039; (length=2)\r\n        // &#039;username&#039; =&gt; string &#039;caopeng13&#039; (length=9)\r\n        // &#039;email&#039; =&gt; string &#039;caopeng13@163.com&#039; (length=17)\r\n        // &#039;status&#039; =&gt; string &#039;2&#039; (length=1)\r\n        header(&#039;Location:./index.php&#039;); // 跳转到首页\r\n    } else {\r\n        header(&#039;Location:./login.php&#039;); // 跳转到登录界面\r\n    }', '1434503839', '341', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('18', '1', '登录', null, 'Uploads/2015-06-17/5580d1f42535e.png', '// 执行登录验证方法\r\n      public function checklogin(){\r\n        // print_r($_POST); // Array ( [username] =&gt; admin [password] =&gt; 123456 [code] =&gt; mp7f )\r\n        $valid = new \\Model\\ValidModel();\r\n        //校验用户名长度\r\n        $res = $valid -&gt; valid_user_len($_POST[&#039;username&#039;]);\r\n        if($res){\r\n          $this -&gt; assign(&#039;erroruser&#039;, &#039;用户名长度不够&#039;);\r\n          $this -&gt; display(&#039;login&#039;);\r\n          exit;\r\n        } \r\n        // 校验密码长度\r\n        $res = $valid -&gt; valid_pass_len($_POST[&#039;password&#039;]);\r\n        if($res){\r\n          $this -&gt; assign(&#039;errorpass&#039;, &#039;你的密码长度不够&#039;);\r\n          $this -&gt; display(&#039;login&#039;);\r\n          exit;\r\n        }\r\n        // $user = new \\Model\\UserModel();\r\n        // if(!empty($_POST)){\r\n        //   $valid = $user -&gt; create();\r\n        //   if(!$valid){\r\n        //     // show_bug($user-&gt;getError());\r\n        //     $this -&gt; assign(&#039;erroruser&#039;, $user-&gt;getError());\r\n        //     $this -&gt; display(&#039;login&#039;);\r\n        //     exit;\r\n        //   }\r\n        // }\r\n\r\n        //select * from shop_mg where username=&#039;admin&#039;\r\n        $sql = &quot;select id,username,password from shop_mg where username=&#039;{$_POST[&#039;username&#039;]}&#039;&quot;;\r\n        $minfo = D() -&gt; query($sql);\r\n        // show_bug($minfo); // 测试对应数据\r\n        if($minfo){\r\n          $pass = $minfo[0][&#039;password&#039;]; // 获取密码\r\n          if($pass != md5($_POST[&#039;password&#039;])){ // 判定密码\r\n            $this -&gt; assign(&#039;errorpass&#039;, &#039;密码错误&#039;); // 向模板中发送数据\r\n            $this -&gt; display(&#039;login&#039;); // 调用对应模板\r\n            exit;\r\n          }\r\n        }\r\n\r\n        // 验证验证码\r\n        $verify = new \\Think\\Verify(); // \r\n        if(!$verify -&gt; check($_POST[&#039;code&#039;], &#039;&#039;)){ // 校验验证码\r\n          $this -&gt; assign(&#039;errorverify&#039;, &#039;验证码错误&#039;); // 向模板中发送数据\r\n          $this -&gt; display(&#039;login&#039;); // 调用对应模板\r\n          exit;\r\n        }\r\n\r\n        // 登录信息持久化 $_SESSION\r\n        session(&#039;mg_name&#039;, $minfo[0][&#039;username&#039;]); // 向session 中保存用户名\r\n        session(&#039;mg_id&#039;, $minfo[0][&#039;id&#039;]); // 向session 中保存用户id\r\n        var_dump($_SESSION);\r\n\r\n        $this -&gt; redirect(&#039;Index/index&#039;); // 重定向到后台首页\r\n      }', '1434505716', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('19', '1', '总结', null, 'Uploads/2015-06-17/5580dbf67954c.png', '', '1434508278', '329', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('20', '1', '安装虗拟机', null, '', '创建新的虚拟机\r\n自字义\r\n修改虚拟机名为CentOs 默认为ubuntu\r\n选择稍后安装操作系统(安装完虚拟再安装操作系统)\r\n下一步...\r\n选择linux(安装linux系统)\r\n创建新虚拟磁盘\r\n将虚拟磁盘存储为单个文件\r\n完成', '1434509053', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('21', '1', '安装linux 系统', null, '', '启动Vm...\r\n单击CD/DVD 自动检测\r\n浏览(选择第一个镜像文件)\r\n开启此虚拟机\r\n不再显示此提示\r\n选择 install or upgrade an existing system 安装或升级现在的系统\r\n使用Tab 选择skip\r\n单击下一步\r\n选择中文简体\r\n选择存储设备\r\n主机名\r\n时区\r\n密码(学习时使用最简单的密码)\r\n无论如何都使用\r\n创建自定义布局\r\n挂载点 /boot 200M\r\n文件系统类型 swap 512M\r\n挂载点 / 使用全部可用空间\r\n在/dev/sda 中安装引导装载程序\r\n软件包程序 选择Basic Server\r\n安装引导程序\r\n登录 login:root\r\npassword:\r\nexit 退出\r\n选择CentOs\r\n启动客户机', '1434509544', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('22', '1', 'linux 安装后的准备工作', null, '', '启动虚拟机\r\nvim /etc/sysconfig/network-scripts/ifcfg-eth0\r\n修改 ONBOOT=&#039;yes&#039;(按i将改为yes)\r\n按esc键(进入命令模式)\r\n输入:wq\r\n重启 service network restart\r\n使用ifconfig 查看当前ip(如果是桥接 使用setup 来设置ip)\r\n开启 vmnen8(网络 -&gt; 适配器, 不开启会出现network error:connection timed out)\r\n启动putty.exe远程工具来连接\r\n输入主机名称 192.168.113.128(第一次创建为128)\r\n单击转换选择 utf8\r\n单击会话 选择默认设置 然后单击保存\r\n单击打开\r\n\r\nlinux(三大核心技术)\r\n防火墙配置 内核裁剪 邮箱服务器配置\r\n\r\n关闭防火墙\r\nsetup\r\n按Tab 选择运行工具\r\n按空格取消*\r\n按Tab  选择确定\r\n按Tab 选择是\r\n按Tab 选择退出\r\n\r\n修改密码\r\nvim /etc/ssh/sshd_config\r\n/UseDNS no(将yes 改为no)\r\n/GSSAPIA no(将yes 改为no)\r\n:wq\r\nservice sshd restart\r\n\r\nselinux 增强linux安全组件\r\nvim /etc/selinux/config\r\n修改SELINUX=disabled\r\n按esc键\r\n:wq\r\n\r\n桥接修改IP\r\nsetup\r\n网络配置\r\n设备配置\r\neth0\r\n使用DHCP 按空格取消*\r\n静态IP 192.168.80.18\r\n子网掩码 255.255.255.0\r\n默认网关IP 192.168.80.1\r\n按save 一步一步退出', '1434512494', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('23', '1', 'linux 一级目录', null, '', 'ls -a / 查看linux 一级目录\r\n/ 根目录\r\n/bin 命令保存目录(普通用户可以读取的命令)\r\n/boot 启动目录 启动相关文件\r\n/dev 设备文件保存目录(可将设备挂载到具体文件之上)\r\n/etc 配置文件保存目录\r\n/home 普通用户的家目录\r\n/lib 系统库保存目录\r\n/mnt 挂载及目录\r\n/root 超级用户的家目录\r\n/tmp 临时目录(重启后会清空)\r\n/sbin 命令保存目录(超级用户才能使用的目录)\r\n/proc 记录服务器内存cup 情况的动态文件系统\r\n/sys 同上\r\n/usr 系统软件资源目录(unix system resource) echo $PATH 可打印此目录\r\n/usr/bin/ 系统命令(普通用户)\r\n/usr/sbin/ 系统命令(超级用户)\r\n/usr/local/ 常用安装软件目录\r\n/var 系统相关文档内容\r\n/var/log/ 系统日志位置\r\n/var/spool/mail/ 系统默认邮箱位置\r\n/var/lib/mysql 默认安装的mysql 的库文件目录', '1434513036', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('24', '1', '封装性 ', null, 'Uploads/2015-06-17/5581796265514.png', '1.1 定义\r\n       把 成员（成员属性 成员方法） 设置成非公有   就是封装\r\n       实现访问控制\r\n      1.2 成员方法封装\r\n        定义：\r\n         把 方法 设置为非公有（private protected） 封装\r\n       特点：\r\n         ① 在 类的外部 不同使用\r\n         ② 可以在类的内部通过 $this 使用\r\n        作用：\r\n         ① 提高代码重用性 \r\n            方法中出现 代码重用的部分，可以把重用的代码 封装成一个方法 再调用\r\n            可以把 代码 多 的方法 拆分成 一个一个小的\r\n         ② 提高代码可读性\r\n         \r\n      1.3 成员属性 的封装\r\n        定义：\r\n         把 属性 设置为非公有\r\n       特点：\r\n         ① 在类的外部不能使用\r\n         ② 只能在 类的内部方法中使用$this\r\n        作用：\r\n         ① 实现访问控制', '1434548578', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('25', '1', '访问私有成员属性', null, 'Uploads/2015-06-17/55817ecd53933.png', '2.访问私有成员属性\r\n     2.1 设置共有方法\r\n        给每个属性设置共有方法 get/set\r\n     2.2 使用魔术方法来访问\r\n       ① __get()\r\n         格式：\r\n           public function __get($param)\r\n           {\r\n             return $this-&gt;$param;\r\n            }\r\n         特点：\r\n           当在类的外部 输出 一个非公有属性或不存在的属性的时候会自动触发\r\n            并把 要访问的属性名作为第一个参数传入\r\n         \r\n        ② __set()\r\n         格式：\r\n           public function __set($param, $value)\r\n           {\r\n             $this-&gt;$param = $value;\r\n            }\r\n         特点：\r\n           当 在类的外部 给非公有属性或不存在属性赋值的时候 自动触发\r\n            把 属性名和要赋给的值 作为第一，第二个参数 传入\r\n           \r\n        ③ __isset()\r\n         格式：\r\n           public function __isset($param)\r\n           {\r\n             return isset($this-&gt;$param);\r\n           }\r\n         特点：\r\n           ① 使用 isset或empty 函数 判断 非公有属性或不存在属性 是否存在的时候，自动触发\r\n           ② 把属性名作为第一次参数 传入\r\n            ③ empty 也可以触发， 提高准确性，配合__get()使用\r\n            \r\n        ④ __unset()\r\n         格式：\r\n           public function __unset($param)\r\n           {\r\n             unset($this-&gt;$param);\r\n            }\r\n         特点：\r\n           ① 当使用unset销毁 不存在或非公有 属性 的时候 自动触发\r\n            ② 把 属性名 作为参数 传入\r\n           ', '1434549965', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('26', '1', 'ls', null, '', 'ls(list directory contents 可通过man ls 来查看) 显示目录下内容\r\n/bin/ls --color=auto alias ls=&#039;ls --color=auto&#039;\r\nls -a 显示所有文件(包含隐藏文件)\r\nls -al 多个参数可合并简写\r\nls -h 文件大小显示为常见大小单位 B KB MB\r\nls -d 显示目录本身,而不是里面的子文件\r\nls -l 长格式显示(详细信息显示)\r\ndr_xr_xr_x. 2 root root 4098 6月5 05:18 bin\r\n权限位 引用数 所有者 所属组 大小 最后一次修改时间 文件或目录名\r\n\r\n权限位 \r\n0位 文件类型(-普通文件 d目录文件 l软连接文件 b设备文件)\r\n1-3位 u user owner 文件所有者\r\n4-6位 g group 文件所属组\r\n7-9位 o others 其他人\r\n10 selinux 相关\r\n-无权限 r只读(read) w只写(write) x执行(execute)\r\n\r\nlinux 不以后缀名来区分文件 而以颜色来区别\r\n查看颜色文件\r\ncd /etc/ 进入etc 目录\r\nls 查看etc 目录的文件\r\nvim /etc/DIR_COLORS.256color 查看颜色规则\r\n30=black 31=red 32=green\r\n\r\n文件颜色及类型\r\n默认色代表普通文件 install.log\r\n绿色代表可执行文件 setup.sh centos.sh\r\n红色代表tar 包文件 vim-7.1.tar.bz2\r\n蓝色代表目录文件 etc\r\n洋红色代表图像文件 1.jpg\r\n青色代表链接文件 rc4.d\r\n黄色代表设备文件 /dev/sr0\r\n背景红色代表损坏的链接文件 ', '1434552344', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('27', '1', '命令提示符', null, '', '[root@localhost]#\r\n[当前登录用户@主机名 当前所有目录]#\r\n# 超级用户 $普通用户\r\n当前所在目录 ~ 用户家目录\r\n管理员 /root\r\n普通用户 /home/用户名\r\n\r\n可使用su 切换到另一用户\r\nsu(run a shell with substitute user and groupIDs)\r\n普通用户切换到超级用户(需要输入超级用户的密码)\r\nsu - root\r\n超级用户切换到普通用户\r\nsu - apeng\r\n- 包括用户环境一起切换', '1434552701', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('28', '1', 'cd', null, '', 'cd(change directory) 切换所在目录 建议使用绝对路径\r\nshell 内置命令\r\ncd ~ 进入当前用户的家目录 /home/apeng(普通用户) /root(超级用户)\r\ncd   进入当前用户的家目录 /home/apeng           /root\r\ncd - 进入上次目录         /home/apeng           /root\r\ncd ..进入上一级目录       /home                 /\r\ncd . 进入当前目录         /home                 /\r\n\r\n相对路径\r\n参照当前所有目录 进行查找 一定要先确定当前所在目录\r\n绝对路径\r\n从根目录开始指定 逐级递归查找 在任何目录下 都能进入指定位置', '1434553109', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('29', '1', 'pwd', null, '', 'pwd(print working directory) 显示当前所在目录\r\n(print name of current/working directory) nam pwd\r\n/bin/pwd', '1434587876', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('30', '1', 'mkdir rmdir rm', null, '', 'mkdir(make directories) 创建目录\r\n-p 递归创建 可以连续创建目录\r\nmkdir -p aa/bb/cc\r\n/bin/mkdir\r\n\r\nrmdir(remove empty directories) 删除空目录\r\n/bin/rmdir\r\n\r\nrm(remove files or directories) 删除文件或目录\r\n-rf 删除文件和目录\r\n-r 递归删除目录\r\n-f 强制 取消询问模式\r\nrm -rf /aa/bb/cc\r\n', '1434588174', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('31', '1', 'linux 命令', null, 'Uploads/2015-06-18/55828e99c3424.png', '', '1434619545', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('32', '1', '面向对象的继承性', null, 'Uploads/2015-06-18/5582b7d946fbd.png', '1 类继承的应用\r\n   定义：  子类继承父类， 子类就具有了父类的方法和属性\r\n   格式： \r\n      class 子类 extends 父类\r\n     {\r\n       code...\r\n     }\r\n   特点：\r\n     ① php中 不支持多继承 一个类只能有一个父类 但可以有多个子类\r\n   作用\r\n      ① 提高代码 重用性\r\n      ② 为第三方类 扩展功能 可以继承类 添加方法、属性\r\n      ③ 方便升级\r\n    \r\n    \r\n  2 访问控制 三种访问级别\r\n                     public            protected             private\r\n   在类外部访问          y           n                     n\r\n   在类的内部访问       y           y                     y\r\n   在类的子类中访问      y           y                     n\r\n             \r\n  3.子类中重写父类的方法\r\n    ① 子类方法名 与 父类方法名(属性)相同， 子类中会覆盖父类的方法（属性）（方法重写）\r\n    ② 子类重写父类 方法或属性的时候 访问级别（p） 只能变得更加开放\r\n    ③ 子类中可以调用父类的方法，（哪怕是重写的时候）   \r\n      parent::方法名()', '1434630105', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('33', '1', 'vi 编辑器', null, 'Uploads/2015-06-18/5582c42edfb83.png', '', '1434633262', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('34', '1', '数据库应用', null, 'Uploads/2015-06-18/5582d2a9defe7.png', '1.1 数据库的定义 \r\n       数据库是计算机应用系统中的一种专门管理数据资源的系统。数据库就是一组经过计算机整理后的数据，\r\n    存储在一个或者多个文件中，数据库就是存储数据的仓库\r\n 1.2 数据的存储方式\r\n       人类经历了三种数据存储的阶段：\r\n     ① 人工管理阶段\r\n      ② 文件系统阶段\r\n      ③ 数据库系统阶段\r\n 1.3 数据库在Web开发中的重要作用\r\n      动态网站都是对数据进行操作，我们平时浏览网页时，会发现网页的内容会经常变化，而页面的主体结构框架没变，\r\n       Web系统的开发基本上都离不开数据库，因为任何东西都要存放在数据库中。所谓的动态网站就是基于数据库开发的系统，\r\n       最重要的就是数据管理，或者说我们在开发时都是在围绕数据库在写程序。\r\n  1.4 数据库的相关概念  ！！！！！！！！\r\n       ① 数据库系统          DBS           data  base system\r\n      ② 数据库                DB             data  base   \r\n       ③ 数据库管理系统       DBMS       data base manage system\r\n           ④ 数据库管理员          DBA         data base administrator   \r\n           DBS 主要由 DB、DBMS和DBA 等组成。\r\n    1.5 常见的数据库系统 \r\n         甲骨文 Oracle\r\n      IBM DB2\r\n       微软的Access和SQL Server（MSSQL）\r\n       开源PostgreSQL\r\n      开源MySQL\r\n       SQLlite\r\n       开源 redis\r\n      mongoDB', '1434636969', '337', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('35', '1', 'mysql 基础', null, 'Uploads/2015-06-18/5582d93abe8eb.png', '2.1 mysql的特点\r\n   ① 开放源代码      \r\n   ② 跨平台性     \r\n   ③ 价格优势    \r\n    ④ 功能强大且使用方便   \r\n  2.2 PHP为什么会选择MySQL作为自己的好基友\r\n    ① PHP几乎可以使用现有的所有的数据库系统\r\n    ② MySQL与其他的大型数据库例如Oracle，DB2，SQL Server等相比，自有它的不足之处，如规模小，功能有限，但是丝毫没有影响它受欢迎的程度。\r\n    ③ 对于一般的个人使用者和中小型企业来说，MySQL提供的功能已经绰绰有余\r\n   ④ 而且由于MySQL是开放源码软件，因此可以大大降低总体拥有成本。LAMP和LNMP中的其他三个软件也都是免费的，\r\n        所以我们可以不花一分钱就可以建立起一个稳定，免费的网站系统。\r\n  2.3 PHP 与 MySQL的合作方式\r\n    ① 在同一个MySQL数据库服务器中可以创建多个数据库，如果把每个数据库看成是一个“仓库”，\r\n      则网站中的内容数据就存储在这个仓库中，而对数据库中数据的存取及维护等，\r\n     都是通过数据库系统软件管理的。同一个数据库管理系统可以为不同的网站分别建立数据库，\r\n     但为了使网站中的数据便于维护，备份及移植，最好为一个网站创建一个数据库。\r\n    ② MySQL数据库管理系统是一种“客户机/服务器”体系结构的管理软件，所以必须同时使用\r\n    数据库服务器和客户机两个程序才能使用MySQL。服务器程序用于监听客户机的请求，\r\n    并根据这些请求访问数据库，以便向客户机提供它们所要求的数据。而客户机程序则必须\r\n   通过网络连接到数据库服务器，才能向服务器提交数据操作请求。PHP脚本程序作为\r\n    MySQL服务器的客户机程序，是通过PHP中的MySQL扩展函数，对MySQL服务器中存储的数据进行获取，\r\n   插入，更新及删除等操作。\r\n  2.4 关系型数据库和非关系数据库\r\n   ① 关系型数据库\r\n      MySQL服务器  --&gt; 数据库  --&gt;数据表 ---&gt; 行（记录）----&gt;字段\r\n   ② 非关系型 数据库  no-sql', '1434638650', '337', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('36', '1', '结构化查询语言', null, 'Uploads/2015-06-18/5582daef4fb5c.png', '3.1 数据定义语言（DDL）\r\n     用于定义和管理数据对象，包括数据库，数据表等。例如：CREATE，DROP，ALTER等。\r\n 3.2 数据操作语言（DML）\r\n       用于操作数据库对象中所包含的数据。例如：INSERT，UPDATE，DELETE语句。\r\n 3.3 数据查询语言（DQL）\r\n       用于查询数据库对象中所包含的数据，能够进行单表查询，连接查询，嵌套查询，以及集合查询等各种复杂程度不同的数据库查询，\r\n      并将数据返回客户机中显示。例如：SELETE\r\n  3.4 数据控制语言（DCL）\r\n       是用来管理数据库的语言，包括管理权限及数据更改。例如：GRANT，REVOKE，COMMIT，ROLLBACK等。', '1434639087', '337', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('37', '1', 'mysql基本操作', null, 'Uploads/2015-06-19/558373342456b.png', '', '1434678068', '337', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('39', '1', 'mysql 数据类型', null, 'Uploads/2015-06-19/558394b60443d.png', '', '1434686645', '337', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('40', '1', 'lnmp 环境搭建', null, '', '恢复到快照\r\n\r\n设置 -&gt; 调整连接方式(改为桥接)\r\n\r\n设置网卡\r\nvim /etc/sysconfig/network-scripts/ifcfg-eth0\r\nONBOOT=&#039;no&#039;(no改为yes)\r\n:wq\r\nsetup\r\n网络设置 -&gt; 设备 -&gt; eth0\r\n取消 *\r\n静态IP 192.168.80.19\r\n子网掩码 255.255.255.0\r\n默认网关 192.168.80.1\r\n服务器代理 211.136.112.50\r\n备用服务器 210.22.84.3\r\n(如果不写服务器代理 则写一个配置文件)\r\nvim /etc/resolv.conf\r\nnameserver 211.136.112.50\r\n(否则不解析域名而只能解析IP)\r\n\r\n关闭防火墙\r\nsetup \r\n按Tab -&gt; 运行工具 -&gt; 按空格取消* -&gt; 按Tab 确定 -&gt; 按Tab -&gt; 是\r\n-&gt; 按Tab 退出\r\n\r\nselinux 安全组件\r\nvim /etc/selinux/config\r\nSELINUX=disabled\r\n:wq\r\nsentenforce\r\n\r\nyum -y install screen\r\nscreen 主要防止掉线\r\nscreen -S lnmp 创建screen 会话\r\n如果掉线可以使用 screen -r lnmp 查看 lnmp 安装进程\r\n\r\nwget -c http://soft.vpser.net/lnmp/lnmp1.1-full.tar.gz &amp;&amp; tar zxf lnmp1.1-full.tar.gz &amp;&amp; cd lnmp1.1-full &amp;&amp; ./centos.sh\r\n在线安装lnmp\r\n\r\n', '1434765350', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('41', '1', 'php 环境搭建', null, '', '在d:\\file 下创建目录phptool\r\n把mysql apache php 压缩包复制到phptool 目录下\r\n解压mysql apache php 压缩包\r\n\r\n进入php5.5.25目录\r\n复制php.ini-production 复制一份，并重命名为php.ini(后面在apache中配置)\r\n在环境变量中配置php目录\r\n计算机 -&gt; 属性 -&gt; 高级系统设置 -&gt; 环境变量 -&gt; path\r\nD:\\files\\phptool\\php-5.5.25;D:\\files\\phptool\\php-5.5.25\\ext\r\n\r\napache 配置\r\n打开D:\\files\\phptool\\Apache24\\conf\\httpd.conf 文件配置apache\r\n在37行左右 修改ServerRoot 安装目录 ServerRoot &quot;d:/files/phptool/Apache24&quot;\r\n在219行左右去掉# ServerName www.example.com:80\r\n在243行左右修改DocumentRoot 指向的目录 DocumentRoot &quot;d:/files/phptool/Apache24/htdocs&quot;\r\n在244行修改 &lt;Directory &quot;d:/files/phptool/Apache24/htdocs&quot;&gt;\r\n在278行修改 DirectoryIndex index.html index.php index.htm 后面index.php index.htm 是新添加的\r\n在361行修改 ScriptAlias /cgi-gin/ &quot;d:/files/phptool/Apache24/cgi-bin&quot;\r\n有378行修改 &lt;Directory &quot;d:/files/phptool/Apache24/cgi-bin&quot;&gt;\r\n在文件最后添加如下三行\r\nLoadModule php5_module &quot;d:/files/phptool/php5.5.25/php5apache2_4.dll&quot;\r\nAddType application/x-httpd-php .php .html .htm\r\nPHPIniDir &quot;d:/files/phptool/php5.5.25&quot;\r\n保存退出\r\n安装apache 服务\r\ncmd命令下 进入d:\r\nd:\\&gt;D:\\files\\phptool\\Apache24\\bin\\httpd -k install\r\n\r\n开启php扩展(去掉;注释)\r\n718行左右; extension_dir = &quot;ext&quot;(去掉;注释)修改为 extension_dir = &quot;ext&quot;\r\n870行左右 extension=php_mbstring.dll\r\n872行左右 extension=php_mysql.dll\r\n873行左右 extension=php_mysqli.dll\r\n\r\nmysql 配置\r\n环境变量中配置mysql安装目录D:\\files\\phptool\\mysql5.6.24\\bin\r\n打开D:\\files\\phptool\\mysql5.6.24\\my-default.ini文件\r\n修改 18行19行\r\nbasedir = D:\\files\\phptool\\mysql5.6.24\r\n datadir = D:\\files\\phptool\\mysql5.6.24\\data\r\n保存退出\r\n进入cmd模式 \r\nmysqld -install\r\nnet start mysql\r\n如果报错(错误号为2)\r\nmysqld -remove\r\nd:\r\nd:\\&gt;D:\\files\\phptool\\mysql5.6.24\\bin\r\nmysql -install\r\nnet start mysql\r\nmysql -uroot -p\r\n\r\n启动apache 服务\r\n计算机 -&gt; 管理 -&gt; 服务 -&gt; apache24 -&gt; 启动\r\nhttp://localhost\r\n测试php文件\r\n进入D:\\files\\phptool\\Apache24\\htdocs 目录\r\n新建一个test.php\r\n&lt;?php\r\necho &#039;welcome to php world&#039;;\r\nhttp://localhost/test.php\r\n\r\n', '1434781188', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('42', '1', 'linux 中安装laravel', null, '', 'laravel.phar方式安装\r\n\r\n1、下载 laravel.phar 或 composer.phar curl http://laravel.com/laravel.phar\r\n\r\n2、移动文件到/usr/bin，命名去掉.phar mv laravel.phar /usr/bin/laravel\r\n\r\n3、创建blog应用 laravel new blog\r\n\r\n4、授权存储session等 chmod -R 757 blog/app/storage\r\n\r\ncomposer.phar方式安装(测试通过)\r\n进入/www 目录(与虚拟主机相对应)\r\nvim /usr/local/php/etc/php.ini\r\n修改 extension=php_openssl.php\r\n\r\n1、下载composer.phar curl -sS https://getcomposer.org/installer | /usr/local/php/bin/php\r\n\r\n2、移动文件到/usr/bin，命名去掉.phar mv composer.phar /usr/bin/composer\r\n\r\n3、创建test应用 composer create-project laravel/laravel test --prefer-dist\r\n\r\n4、授权存储session等 chmod -R 757 blog/app/storage\r\n\r\nls ls /www/test/', '1434794395', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('43', '1', '关键字', null, 'Uploads/2015-06-20/558558420341b.png', '', '1434802241', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('44', '1', '用户及用户组', null, 'Uploads/2015-06-21/55861b5fc9a5f.png', '', '1434852191', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('45', '1', 'lnmp 配置虚拟主机', null, '', 'win 中进入 C:\\Windows\\System32\\drivers\\etc\\hosts 添加\r\n192.168.80.18 www.tshop.com\r\n在浏览器中输入 www.tshop.com\r\n\r\n进入linux 中\r\nls /usr/local/nginx/conf\r\n可以查看niginx 的配置文件\r\n/usr/local/nginx/conf/nginx.conf\r\n/usr/local/nginx/conf/nginx.conf.default\r\n\r\nmkdir /www/tshop\r\nvim /www/tshop/index.html\r\nwelcome to tp\r\n./vhost.sh\r\nwww.tshop.com\r\n/www/tshop\r\nn 不重写\r\ny 记录日志\r\nvim /usr/local/nginx/conf/vhost/www.tshop.com.conf\r\n再次在浏览器中访问\r\nwww.tshop.com\r\nwelcome to tp\r\n\r\nwww.shop.com www.lshop.com 配置同上', '1434855647', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('46', '1', 'samba', null, 'Uploads/2015-06-21/558672f407669.xmind', '', '1434874611', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('47', '1', 'samba', null, 'Uploads/2015-06-21/5586731c26f79.png', '', '1434874651', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('48', '1', '多态', null, 'Uploads/2015-06-24/558a0d6418ec4.png', '', '1435110756', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('49', '1', '魔术方法总结', null, 'Uploads/2015-06-24/558a0ee22ce81.xmind', '', '1435111138', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('50', '1', '魔术方法', null, 'Uploads/2015-06-24/558a0f4df2b38.png', '', '1435111245', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('51', '1', '类总结', null, 'Uploads/2015-06-24/558a1bbf7d519.png', '', '1435114431', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('52', '1', '异常', null, 'Uploads/2015-06-24/558aadaf2ac32.png', '', '1435151790', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('53', '1', '目录结构', null, 'Uploads/2015-06-25/558b76f246efa.png', '', '1435203314', '341', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('54', '1', '目录结构', null, 'Uploads/2015-06-25/558b77172c5a0.png', '', '1435203351', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('55', '1', '后台首页', null, 'Uploads/2015-06-25/558b7766c7073.png', '', '1435203430', '341', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('56', '1', '后台首页', null, 'Uploads/2015-06-25/558b77806a9cc.png', '', '1435203456', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('57', '1', '权限', null, 'Uploads/2015-06-25/558b78154794e.png', '', '1435203605', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('58', '1', '角色', null, 'Uploads/2015-06-25/558b785434edd.png', '', '1435203668', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('59', '1', '管理员', null, 'Uploads/2015-06-25/558b789a9ee4a.png', '', '1435203738', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('60', '1', '注入', null, 'Uploads/2015-06-25/558bdccc2dbe3.png', '', '1435229388', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('61', '1', 'mysql 连接', null, 'Uploads/2015-06-25/558bff35e8ba5.png', '', '1435238197', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('62', '1', '文件操作', null, 'Uploads/2015-06-26/558cb637586bf.png', '', '1435285047', '336', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('63', '1', 'koala 的使用', null, '', '打开koala \r\n\r\n将要写的项目拖到koala 中\r\n\r\n在项目中创建index.less index.html index.css\r\n\r\n使用编辑器编辑index.less 文件\r\n@color:red; // 定义变量\r\n\r\n.demo{\r\n width:100px;\r\n  height:100px;\r\n background-color:@color;\r\n}\r\n\r\n在koala 点compile\r\n\r\n在浏览器中测试', '1435386063', '330', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('64', '1', '命名空间', null, 'Uploads/2015-06-27/558e563e18194.png', '', '1435391549', '339', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('65', '1', '形状的实现', null, 'Uploads/2015-06-29/559091073b3bf.png', '', '1435537671', '332', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('66', '1', 'js 基础', null, 'Uploads/2015-06-30/5591ec11c4e00.png', '', '1435626513', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('67', '1', '互联网', null, 'Uploads/2015-06-30/5591ee1587794.png', '', '1435627029', '344', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('68', '1', 'js 对象', null, 'Uploads/2015-06-30/559290b4618c9.png', '', '1435668659', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('69', '1', '函数', null, 'Uploads/2015-07-01/559344b87c20b.png', '', '1435714744', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('70', '1', '内置对象', null, 'Uploads/2015-07-01/5593f6ece1876.png', '', '1435760364', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('71', '1', 'php 基础', null, 'Uploads/2015-07-02/5594a5afb7293.png', '', '1435805103', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('72', '1', '事件', null, 'Uploads/2015-07-03/5595ddf3853e3.png', '', '1435885043', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('73', '1', 'apache 配置', null, 'Uploads/2015-07-03/5595f86029443.png', '', '1435891808', '338', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('74', '1', '移动特效', null, '', '.admin-error{\r\n  width:300px;\r\n  margin:0px auto; \r\n text-align:center;\r\n  position: relative;\r\n font-size: 20px;\r\n  text-shadow: 0 0 20px #ccc;\r\n left: 0;\r\n  top: -100px;\r\n  color: #fff;\r\n  -webkit-animation:posit 2s ease-out;\r\n  animation:posit 2s ease-out;\r\n}\r\n@-webkit-keyframes posit{\r\n  0%{opacity:0; left: 0; top:-100px;}\r\n 30%{opacity:0.3; left: 0; top:-80px;}\r\n 50%{opacity:0.7; left: 0; top:-50px;}\r\n 70%{opacity:0.7; left: 0; top:-20px;}\r\n 100%{opacity:1; left: 0; top:-0px;}\r\n}\r\n.error-text{\r\n  height: 20px;\r\n font-weight: bold;\r\n  color: #f00;\r\n  margin-left: 10px;\r\n  overflow: hidden;\r\n -webkit-animation:margin 2s ease-out;\r\n animation:margin 2s ease-out;\r\n}\r\n@-webkit-keyframes margin{\r\n  0%{opacity:0; margin-left: 40px; }\r\n  30%{opacity:0.3; margin-left: 30px; }\r\n 70%{opacity:0.7; margin-left: 20px; }\r\n 100%{opacity:1; margin-left: 10px; }\r\n}', '1435991710', '332', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('75', '1', '事件二', null, 'Uploads/2015-07-04/559787f7ed88c.png', '', '1435994103', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('76', '1', '特效', null, 'Uploads/2015-07-05/55989d6da84c8.png', '', '1436065133', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('77', '1', '特效二', null, 'Uploads/2015-07-05/55989d80a1290.png', '', '1436065152', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('78', '1', 'php', null, 'Uploads/2015-07-06/5599f7bde77a9.png', '', '1436153789', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('79', '1', 'BOM', null, 'Uploads/2015-07-06/559a7ac183ba8.png', '', '1436187329', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('80', '1', '正则', null, 'Uploads/2015-07-08/559c704bdaef6.png', '', '1436315723', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('81', '1', 'php 时间', null, 'Uploads/2015-07-08/559c707d21518.png', '', '1436315772', '334', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('82', '1', 'DOM', null, 'Uploads/2015-07-08/559c70e4035e0.png', '', '1436315875', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('83', '1', 'gd', null, 'Uploads/2015-07-08/559c9ca9074c0.png', '', '1436327080', '335', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('84', '1', 'php 文件', null, 'Uploads/2015-07-10/559f134f14ed0.png', '', '1436488526', '336', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('85', '1', '文件上传', null, 'Uploads/2015-07-10/559f141d0e223.png', '', '1436488732', '336', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('86', '1', '节点', null, 'Uploads/2015-07-10/559f15e4b638c.png', '', '1436489188', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('87', '1', 'ajax', null, 'Uploads/2015-07-10/559f1655c21c9.png', '', '1436489301', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('88', '1', 'jquery', null, 'Uploads/2015-07-13/55a30a5254a2e.png', '', '1436748370', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('89', '1', 'jquery', null, 'Uploads/2015-07-14/55a45f7bac733.png', '', '1436835706', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('90', '1', 'jquery', null, 'Uploads/2015-07-14/55a480d314908.png', '', '1436844242', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('91', '1', 'js总结', null, 'Uploads/2015-07-15/55a5b9545dcef.png', '', '1436924244', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('92', '1', 'js总结', null, 'Uploads/2015-07-15/55a5bacb567fe.png', '', '1436924619', '343', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('93', '1', 'smarty', null, 'Uploads/2015-07-16/55a70b9613b8f.png', '', '1437010837', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('94', '1', 'smarty', null, 'Uploads/2015-07-17/55a86f7220b77.png', '', '1437101937', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('95', '1', 'memcache', null, 'Uploads/2015-07-20/55ac5a64501e4.png', '', '1437358690', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('96', '1', 'session', null, 'Uploads/2015-07-20/55acff2e98570.png', '', '1437400878', '333', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('97', '1', 'css预定样式', null, '', '/* 初始化样式 */\r\nbody,ul,li,p,h1,h2,h3,h4{\r\n  padding: 0;\r\n margin: 0\r\n}\r\nbody{\r\n font-size: 12px;\r\n}\r\nul,li{\r\n list-style: none;\r\n}\r\na{\r\n  text-decoration: none;\r\n}\r\nimg,input{\r\n border: none;\r\n outline: none;\r\n}\r\n\r\n/* 预定义样式 */\r\n.fl{\r\n  float: left;\r\n}\r\n.fr{\r\n float: right;\r\n}\r\n.clear{\r\n clear: both;\r\n}\r\n.w{\r\n  margin: 0 auto;\r\n width: 1200px;\r\n}\r\n.mt10{\r\n margin-top: 10px;\r\n}\r\n.mt20{\r\n  margin-top: 20px;\r\n}\r\n/* 没有数据时显示样式 */\r\n.no-data{\r\n  padding:8px;\r\n  color: red;\r\n font-size: 16px;\r\n  font-weight: bold;\r\n  display: inline-block;\r\n}\r\n/* 分布显示样式 */\r\n.page{\r\n height: 39px;\r\n line-height: 39px;\r\n  margin-right: 12px;\r\n color: #f00;\r\n  font-size: 16px;\r\n  font-weight: bold;\r\n}\r\n.page em{\r\n  font-style: normal;\r\n margin: 0 5px;\r\n  color: #f90;\r\n}\r\n.admin-success{\r\n  width:300px;\r\n  margin:0px auto; \r\n text-align:center;\r\n  position: relative;\r\n font-size: 20px;\r\n  text-shadow: 0 0 20px #f00;\r\n left: 0;\r\n  top: -50px;\r\n color: #f90;\r\n  -webkit-animation:posit 2s ease-out;\r\n  animation:posit 2s ease-out;\r\n}\r\n@-webkit-keyframes posit{\r\n  0%{opacity:0; left: 0; top:-100px;}\r\n 30%{opacity:0.3; left: 0; top:-80px;}\r\n 50%{opacity:0.7; left: 0; top:-50px;}\r\n 70%{opacity:0.7; left: 0; top:-20px;}\r\n 100%{opacity:1; left: 0; top:-0px;}\r\n}', '1437790438', '330', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('98', '1', '判断selected', null, '', '&lt;select name=&#039;cid&#039; id=&#039;log-cid&#039;&gt;\r\n    &lt;foreach name=&#039;list&#039; item=&#039;v&#039;&gt;\r\n    &lt;option value=&quot;{$v.id}&quot; &lt;if condition=&quot;$info[cid] eq $v[id]&quot;&gt;selected&lt;/if&gt;&gt;{$v.name}&lt;/option&gt;\r\n    &lt;/foreach&gt;\r\n&lt;/select&gt;\r\n&lt;select name=&#039;auth&#039; id=&#039;log-auth&#039;&gt;\r\n    &lt;option value=&quot;0&quot; &lt;if condition=&quot;$info[auth] eq 0&quot;&gt;selected&lt;/if&gt;&gt;公开&lt;/option&gt;\r\n    &lt;option value=&quot;1&quot; &lt;if condition=&quot;$info[auth] eq 1&quot;&gt;selected&lt;/if&gt;&gt;好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;2&quot; &lt;if condition=&quot;$info[auth] eq 2&quot;&gt;selected&lt;/if&gt;&gt;指定好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;3&quot; &lt;if condition=&quot;$info[auth] eq 3&quot;&gt;selected&lt;/if&gt;&gt;仅自己可见&lt;/option&gt;\r\n&lt;/select&gt;&lt;select name=&#039;cid&#039; id=&#039;log-cid&#039;&gt;\r\n    &lt;foreach name=&#039;list&#039; item=&#039;v&#039;&gt;\r\n    &lt;option value=&quot;{$v.id}&quot; &lt;if condition=&quot;$info[cid] eq $v[id]&quot;&gt;selected&lt;/if&gt;&gt;{$v.name}&lt;/option&gt;\r\n    &lt;/foreach&gt;\r\n&lt;/select&gt;\r\n&lt;select name=&#039;auth&#039; id=&#039;log-auth&#039;&gt;\r\n    &lt;option value=&quot;0&quot; &lt;if condition=&quot;$info[auth] eq 0&quot;&gt;selected&lt;/if&gt;&gt;公开&lt;/option&gt;\r\n    &lt;option value=&quot;1&quot; &lt;if condition=&quot;$info[auth] eq 1&quot;&gt;selected&lt;/if&gt;&gt;好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;2&quot; &lt;if condition=&quot;$info[auth] eq 2&quot;&gt;selected&lt;/if&gt;&gt;指定好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;3&quot; &lt;if condition=&quot;$info[auth] eq 3&quot;&gt;selected&lt;/if&gt;&gt;仅自己可见&lt;/option&gt;\r\n&lt;/select&gt;', '1438591925', '342', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('99', '1', 'hadoop 介绍', null, 'Uploads/2016-03-06/56db970061e2b.png', 'Hadoop 的介绍\r\n\r\nHadoop 是 Google 的集群系统的开源实现\r\nGoogle 集群系统 GFS(Google File System) MapReduce BigTable (Hbase)\r\nHadoop 主要由 HDFS(Hadoop Distributed File System Hadoop 分布式文件系统) MapReduce 和 HBase 组成\r\n\r\nHadoop 的初衷是为解决 Nutch 的海量数据爬取和存储的需要\r\nHadoop 于 2005 年秋天作为 Lucene 的子项目 Nutch 的一部分正式引入 Apache 基金会\r\n名称起源: Doug Cutting 儿子的黄色大象玩具的名字 \r\n\r\nHadoop 大数据平台架构与实战\r\n\r\n    大数据技术的相关概念\r\n    Hadoop 的架构和运行机制\r\n    实战 Hadoop 的安装和配置\r\n    实战 Hadoop 开发\r\n\r\n    目标\r\n    掌握大数据存储与处理技术的原理 (理论知识)\r\n    掌握 Hadoop 的使用和开发能力 (实践能力)\r\n\r\n    建议\r\n    结合书本 知识点更加系统全面\r\n    实战经验很重要 边听课边\r\n\r\n    谷歌\r\n    革命性的变化1 成本降低 能用 PC 机 就不用大型机和高端存储\r\n    革命性的变化2 软件容错硬件故障视为常态 通过软件保证可靠性\r\n    革命性的变化3 简化并行分布式计算 无须控制节点同步和数据交换台\r\n\r\n    google 只是写了一些技术论文 而并没有开源其源代码\r\n    一个模仿 google 大数据技术的开源实现 hadoop\r\n\r\n    Hadoop 的功能和优势\r\n    http://hadoop.apache.org\r\n\r\n    Hadoop 可以用来做什么\r\n    搭建大型数据仓库 PB级数据的存储 处理 分析 统计等业务\r\n    搜索引擎 日志分析 商业智能 数据挖掘\r\n\r\n    Hadoop 的优势\r\n    高扩展 低成本\r\n\r\n    Hadoop 人才的需求越来越大\r\n    开发 和运维\r\n\r\n    Hadoop 相关开源工具\r\n    HIVE 将 SQL 语句 转换为 Hadoop 任务\r\n    降低使用 Hadoop 的门槛\r\n\r\n    HBASE 分布式数据库\r\n    与传统数据库不同的是 hbase 放弃事务特性 追求更高的扩展\r\n    与 HDFS 不同的是 hbase 提供数据的随机读写和实时访问 实现对表数据的读写功能\r\n\r\n    zookeeper\r\n\r\n\r\n    Hadoop 的组成\r\n    包括两个核心组成\r\n    HDFS 分布式文件系统 存储海量的数据\r\n    MapReduce 并行处理框架 实现任务分解和调度\r\n\r\n    Map 任务的分解\r\n    Reduce 结果的汇总\r\n\r\n    HDFS NameNode DataNode client', '1457232114', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('105', '1', '大数据介绍', null, 'Uploads/2016-03-06/56db9d940faef.png', '', '1457233299', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('106', '1', '云计算介绍', null, '', '', '1457233325', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('107', '1', 'hadoop 与传统数据库比较', null, 'Uploads/2016-03-06/56db9fab37239.png', '传统数据库单个服务器配置特别高\r\n\r\n而hadoop 对服务器配置要求不太高', '1457233835', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('108', '1', 'Hadoop 子项目', null, '', 'hadoop 家族\r\n\r\nCore 一套分布式文件系统以及支持 Map-Reduce 的计算框架\r\n\r\nHDFS Hadoop 分布式文件系统\r\n\r\nMap/Reduce 是一个使用简易的软件框架 基于它写出来的应用程序能够运行在由上千个商用机器组成的大型集群上 并以一种可靠容错的方式并行处理上 T 级别的数据集\r\n\r\nZookeeper 是高可用的和可靠的分布式协同系统\r\n\r\nPig 建立于 Hadoop Core 之上为并行计算环境提供了一套数据工作流语言和执行框架\r\n\r\nHive 是为提供简单的数据操作而设计的下一代分布式数据仓库 它提供了简单的类似 SQL 的语法的 HiveQL 语言进行数据查询\r\n\r\nHBase 建立于 Hadoop Core 之上提供一个可扩展的数据库系统\r\n\r\n\r\nhadoop 非家庭\r\n\r\nAvro 定义了一种用于支持大数据应用的数据格式 并为这种格式提供了不同的编程语言的支持\r\n\r\nFlume 一个分布式 可靠 和高可用的海量日志聚合的系统 支持在系统中定制各类数据发送方 用于收集数据\r\n\r\nMahout 是一套具有可扩充能力的机器学习类库\r\n\r\nSqoop 是 Apache 下用于 RDBMS 和 HDFS 互相导数据的', '1457234498', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('109', '1', 'hadoop 官网', null, '', 'hadoop.apache.org\r\n\r\n1.2.x current stable version 1.2 release\r\n2.6.x latest stable 2.x version\r\n2.7.x lasest 2.x version\r\n0.23.x similar to 2.x.x but missing NN HA\r\n\r\nTo verify Hadoop releases using GPG:\r\n1. Download the release hadoop-X.Y.Z-src.tar.gz from a mirror site.\r\n2. Download the signature file hadoop-X.Y.Z-src.tar.gz.asc from Apache.\r\n\r\n点击 mirror site 进入下面网址\r\nhttp://www.apache.org/dyn/closer.cgi/hadoop/common\r\n\r\n再选择下面网址 (可以看到所有版本)\r\nhttp://apache.fayea.com/hadoop/common/\r\n\r\n点击 hadoop-1.2.1\r\nhttp://apache.fayea.com/hadoop/common/hadoop-1.2.1/\r\n\r\n选择对应的版本', '1457237418', '360', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('112', '1', 'HDFS 介绍', null, '', '    hdfs 设计架构\r\n\r\n    基本概念\r\n    块(Block)\r\n    NameNode\r\n    DataNode\r\n\r\n    HDFS 的文件被分成块进行存储\r\n    HDFS 块的默认大小 64MB\r\n    块是文件存储处理的逻辑单元\r\n\r\n    HDFS 中有两类节点 NameNode 和 DataNode\r\n\r\n    NameNode 是管理节点 存放文件元数据\r\n    文件与数据块的映射表\r\n    数据块与数据节点的映射表\r\n\r\n    DataNode 是 HDFS 的工作节点 存入数据块\r\n    每个数据块三个副本 分布在两个机架内的三个节点\r\n\r\n    心跳检测\r\n    DataNode 定期向 NameNode 发送心跳消息\r\n    二级 NameNode 定期同步元数据映像文件和修改日志 NameNode 发生故障时 备胎转正\r\n\r\n    HDFS 的特点\r\n    数据冗余 硬件容错\r\n    流式的数据访问\r\n    存储大文件\r\n\r\n    适用性和局限性\r\n    适合数据指读写 吞吐量高\r\n    不适合交互式应用 低延迟很难满足\r\n\r\n    适合一次写入多次读取 顺序读写\r\n    不支持多用户并发写相同文件\r\n\r\nHDFS 为了做到可靠性 (reliability) 创建了多份数据块 (data blocks) 的复制 (replicas) 并将它们放置在服务器群的计算节点中 (compute nodes) MapReduce 就是可以在它们所有的节点上处理这些数据\r\n\r\n	HDFS 结构\r\n	NameNode 存储元数据 元数据保存在内存中 保存文件 block datanode 之间的映射关系\r\n	DataNode 存储文件内容 文件内容保存在磁盘 维护了 block id 到 datanode 本地文件的映射关系\r\n\r\n	HDFS 优点\r\n	高容错性 数据自动保存多个副本 副本丢失后,自动恢复\r\n	适合批处理 移动计算而非数据 数据位置暴露给计算框架\r\n	适合大数据处理 GB,TB,甚至PB级数据 百万规模以上的文件数量 10K+节点\r\n	可构建在廉价机器上 通过多副本提高可靠性 提供了容错和恢复机制\r\n\r\n	HDFS 缺点\r\n	低延迟数据访问 比如毫秒级 低延迟与高吞吐率\r\n	小文件存取 占用 NameNode 大量内存 寻道时间超过读取时间\r\n	并发写入 文随机修改 一个文件只能有一个写者 仅支持 append\r\n\r\n	HDFS 数据存储单元 (block)\r\n	文件被切分成固定大小的数据块 默认数据块大小为 64MB 可配置 若文件大小不到 64MB 则单独存一个block\r\n	一个文件存储方式 按大小被切分成若干个 block 存储到不同节点上 默认情况下每个 block 都有三个副本\r\n	Block 大小和副本数通过 Client端上传文件时设置 文件上传成功后副本数可以变更 Block Size 不可变更\r\n\r\n\r\n	HDFS 运行机制\r\n	一个名字节点和多个数据节点\r\n	数据复制 (冗余机制) --- 存储的位置 (机架感知策略)\r\n	故障检测 --- 数据节点 心跳包 (检测是否宕机) 块报告 (安全模式下检测) 数据完整性检测 (校验和比较)\r\n	--- 名字节点 (日志文件 镜像文件)\r\n	空间回收机制\r\n\r\n	NameNode (NN)\r\n	NameNode 主要功能 接受客户端的读写服务\r\n	NameNode 保存 metadate信息包括 文件 owership 和 permissions 文件包含哪能些块 Block 保存在哪个 DataNode(由DataNode 启动时上报)\r\n\r\n	NameNode 的 metadate 信息在启动后会加载到内存  metadata 存储到磁盘文件名为 fsimage Block的位置信息不会保存到 fsimage edits记录对metadata的操作日志\r\n\r\n	SecondaryNameNode (SNN)\r\n	它不是 NN 的备份 (但可以做备份) 它的主要工作是帮助 NN 合并 edits log 减少 NN 启动时间\r\n	SNN 执行合并时机 根据配置文件设置的时间间隔 fs.checkpoint.period 默认 3600 秒  根据配置文件设置 edits log 大小 fs.checkpoint.size 规定 edits 文件的最大默认是 64MB\r\n\r\n	DataNode (DN)\r\n	存储数据 (Block)  启动DN线程的时候会向 NN 汇报 block 信息  通过向 NN 发送心跳保持与其联系 (3秒一次) 如果NN 10分钟没有收到DN 的心跳 则认为其已经 lost 并 copy 其上的 block 到其它DN\r\n\r\n	Block 的副本放置策略\r\n	第一个副本 放置在上传文件的DN 如果是集群外提交 则随机挑选一台磁盘不太满 CPU 不太忙的节点\r\n	第二个副本 放置在于第一个副本不同的机架的节点上\r\n	第三个副本 与第二个副本相同机架的节点\r\n	更多副本 随机节点\r\n\r\n	HDFS 文件权限\r\n	与 Linux 文件权限类似\r\n	r:read w:write x:execute 权限x 对于文件忽略 对于文件夹表示是否允许访问其内容\r\n	如果 linux 系统用户 zhangsan 使用 hadoop 命令创建一个文件 那么这个文件在 HDFS 中 owner 就是 zhangsan\r\n	HDFS 的权限目的 阻止好人做错事 而不是阻止坏人做坏事 HDFS 相信 你告诉我你是谁 我就认为你是谁\r\n\r\n	安全模式\r\n	namenode 启动的时候 首先将映像文件fsimage 载入内存 并执行编辑日志edits 中的各项操作\r\n	一旦在内存中成功建立文件系统元数据的映射 则创建一个新的 fsimage 文件 (这个操作不需要 SecondaryNameNode) 和一个空的编辑日志\r\n	此刻 namenode 运行在安全模式 即 namenode 的文件系统对于客户端来说是只读的 (显示目录 显示文件内容等 写 删除 重命令都会失败)\r\n	在此阶段 Namenode 收集各个 datanode 的报告 当数据块达到最小副本数以上时 会被认为是安全的 在一定比例(可设置)的数据块被确定为安全后 再过若干时间 安全模式结束\r\n	当检测到副本数不足的数据块时 该块会被复制直到达到最小副本数 系统中数据块的位置并不是由namenode 维护的 而是以块列表存储在 datanode中\r\n\r\n	HDFS 安装\r\n	伪分布式安装\r\n	完全分布式安装\r\n	下载 --- 解压 --- 检查java 和 ssh 的免密码登陆 --- 修改 core-site.xml --- 修改 hdfs-site.xml --- 修改 masters 文件和 slaves 文件 --- 格式化 namenode --- start-hdfs.sh 启动\r\n\r\n	Shell 命令\r\n	ls lsr\r\n	mkdir rm cp\r\n	chmod chown\r\n	cat mv put get tail\r\n\r\n    HDFS 命令行操作\r\n    hadoop namenode -format\r\n    hadoop fs -ls /\r\n    hadoop fs -ls /hadoop\r\n    hadoop fs -put ./hadoop-env.sh /user/test\r\n    hadoop fs -ls /\r\n    hadoop fs -ls /user\r\n\r\n    hadoop fs -mkdir input #创建一个目录\r\n    hadoop fs -ls /user/root #查看创建的目录\r\n    /user/root/input\r\n    hadoop fs -put hadoop-env.sh input/ #将文件上传到目录中\r\n    hadoop fs -ls /user/root/input #查看上传文件\r\n    hadoop fs -cat /user/root/input/hadoop-env.sh #查看上传文件\r\n    hadoop fs -get input/hadoop-env.sh hadoop-env2.sh #下载文件到本地\r\n    ls\r\n    rm -rf hadoop-env2.sh\r\n    ls\r\n    hadoop fs -rm hadoop-env.sh\r\n    hadoop fs -rm -rmr input #删除input 目录\r\n    hadoop dfsadmin -report', '1457251243', '361', '0', '0', '0');
INSERT INTO `resource_techn` VALUES ('113', '1', 'HDFS 的安装', null, '', '    准备 linux 环境\r\n    安装 JDK\r\n    配置 Hadoop\r\n\r\n    安装 JDK (初始化阿里云服务器)\r\n    [root@iZ94f2imuwkZ ~]# ls\r\n    [root@iZ94f2imuwkZ ~]# pwd\r\n    /root\r\n\r\n    在 www.oracle.com 上下载 jdk ( CentOS 6.5 64位 解压版本 jdk-8u73-linux-x64.gz )\r\n\r\n    [root@iZ94f2imuwkZ ~]# mkdir jdk\r\n    [root@iZ94f2imuwkZ ~]# cd jdk\r\n    [root@iZ94f2imuwkZ jdk]# pwd\r\n    /root/jdk\r\n\r\n    使用 ssh 上传 jdk-8u73-linux-x64.rpm 至 /root/jdk/ 目录中\r\n    [root@iZ94f2imuwkZ jdk]# ls\r\n    jdk-8u73-linux-x64.rpm\r\n    [root@iZ94f2imuwkZ jdk]# rpm -ivh jdk-8u73-linux-x64.rpm\r\n    Preparing...                ########################################### [100%]\r\n       1:jdk1.8.0_73            ########################################### [100%]\r\n    Unpacking JAR files...\r\n            tools.jar...\r\n            plugin.jar...\r\n            javaws.jar...\r\n            deploy.jar...\r\n            rt.jar...\r\n            jsse.jar...\r\n            charsets.jar...\r\n            localedata.jar...\r\n            jfxrt.jar...\r\n    [root@iZ94f2imuwkZ jdk]# java\r\n    [root@iZ94f2imuwkZ jdk]# java -version\r\n    java version &quot;1.8.0_73&quot;\r\n    Java(TM) SE Runtime Environment (build 1.8.0_73-b02)\r\n    Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)\r\n    [root@iZ94f2imuwkZ jdk]#\r\n    [root@iZ94f2imuwkZ jdk]# mkdir test\r\n    [root@iZ94f2imuwkZ jdk]# cd test\r\n    [root@iZ94f2imuwkZ test]# vim Wel.java\r\n\r\n    public class Wel{\r\n        public static void main(String[] args){\r\n            System.out.println(&quot;wel to java world&quot;);\r\n        }\r\n    }\r\n    \r\n    [root@iZ94f2imuwkZ test]# javac Wel.java\r\n    [root@iZ94f2imuwkZ test]# java Wel\r\n    wel to java world\r\n    [root@iZ94f2imuwkZ test]# vim /etc/rc.local\r\n    touch /var/lock/subsys/local\r\n    export JAVA_HOME=/usr/java/jdk1.8.0_73\r\n    export JRE_HOME=$JAVA_HOME/jre\r\n    export CLASSPATH=$JAVA_HOME/lib:$JRE_HOME/lib:$CLASSPATH\r\n    export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$PATH\r\n\r\n    [root@iZ94f2imuwkZ test]# source /etc/rc.local\r\n    [root@iZ94f2imuwkZ test]# echo $JAVA_HOME\r\n    /usr/java/jdk1.8.0_73\r\n    [root@iZ94f2imuwkZ test]# echo $JRE_HOME\r\n    /usr/java/jdk1.8.0_73/jre\r\n    [root@iZ94f2imuwkZ test]# echo $PATH\r\n    /usr/java/jdk1.8.0_73/bin:/usr/java/jdk1.8.0_73/jre/bin:/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin:/root/bin\r\n\r\n    安装 Hadoop\r\n    参考官方文档 http://hadoop.apache.org/\r\n    Documentation --- Release 1.2.1 --- Getting Started --- Single Node Setup (单节点安装) --- Pseduo-Distributed Operation (伪分式安装)\r\n    wget http://apache.fayea.com/hadoop/common/hadoop-1.2.1/hadoop-1.2.1.tar.gz\r\n    wget http://mirror.bit.edu.cn/apache/hadoop/common/hadoop-1.2.1/hadoop-1.2.1.tar.gz\r\n\r\n    [root@iZ94f2imuwkZ ~]# mkdir hadoop\r\n    [root@iZ94f2imuwkZ ~]# cd hadoop/\r\n    [root@iZ94f2imuwkZ hadoop]# pwd\r\n    /root/hadoop\r\n    使用 ssh 上传 hadoop-1.2.1.tar.gz  至 /root/hadoop/ 目录中\r\n\r\n    [root@iZ94f2imuwkZ hadoop]# ls\r\n    hadoop-1.2.1.tar.gz\r\n    [root@iZ94f2imuwkZ hadoop]# tar -zvxf hadoop-1.2.1.tar.gz\r\n    [root@iZ94f2imuwkZ hadoop]# ls\r\n    hadoop-1.2.1  hadoop-1.2.1.tar.gz\r\n    [root@iZ94f2imuwkZ hadoop]# cd hadoop-1.2.1\r\n    [root@iZ94f2imuwkZ hadoop-1.2.1]# ls\r\n    bin          hadoop-ant-1.2.1.jar          ivy          sbin\r\n    build.xml    hadoop-client-1.2.1.jar       ivy.xml      share\r\n    c++          hadoop-core-1.2.1.jar         lib          src\r\n    CHANGES.txt  hadoop-examples-1.2.1.jar     libexec      webapps\r\n    conf         hadoop-minicluster-1.2.1.jar  LICENSE.txt\r\n    contrib      hadoop-test-1.2.1.jar         NOTICE.txt\r\n    docs         hadoop-tools-1.2.1.jar        README.txt\r\n\r\n    [root@iZ94f2imuwkZ hadoop-1.2.1]# ln -sf /root/hadoop/hadoop-1.2.1 /home/hadoop-1.2\r\n    [root@iZ94f2imuwkZ hadoop-1.2.1]# cd /home/\r\n    [root@iZ94f2imuwkZ home]# ls\r\n    hadoop-1.2\r\n    [root@iZ94f2imuwkZ home]# ll\r\n    total 0\r\n    lrwxrwxrwx 1 root root 25 Mar  6 17:47 hadoop-1.2 -&gt; /root/hadoop/hadoop-1.2.1\r\n\r\n    [root@iZ94f2imuwkZ home]# cd hadoop-1.2/\r\n    [root@iZ94f2imuwkZ hadoop-1.2]# ls\r\n    bin          hadoop-ant-1.2.1.jar          ivy          sbin\r\n    build.xml    hadoop-client-1.2.1.jar       ivy.xml      share\r\n    c++          hadoop-core-1.2.1.jar         lib          src\r\n    CHANGES.txt  hadoop-examples-1.2.1.jar     libexec      webapps\r\n    conf         hadoop-minicluster-1.2.1.jar  LICENSE.txt\r\n    contrib      hadoop-test-1.2.1.jar         NOTICE.txt\r\n    docs         hadoop-tools-1.2.1.jar        README.txt\r\n    [root@iZ94f2imuwkZ hadoop-1.2]# cd conf\r\n    [root@iZ94f2imuwkZ conf]# ls\r\n    capacity-scheduler.xml      hadoop-policy.xml      slaves\r\n    configuration.xsl           hdfs-site.xml          ssl-client.xml.example\r\n    core-site.xml               log4j.properties       ssl-server.xml.example\r\n    fair-scheduler.xml          mapred-queue-acls.xml  taskcontroller.cfg\r\n    hadoop-env.sh               mapred-site.xml        task-log4j.properties\r\n    hadoop-metrics2.properties  masters\r\n\r\n    [root@iZ94f2imuwkZ conf]# vim core-site.xml\r\n    http://hadoop.apache.org/docs/r1.2.1/single_node_setup.html #从官网中复制内容至 core-site.xml\r\n    &lt;configuration&gt;\r\n         \r\n        &lt;property&gt;\r\n             &lt;name&gt;fs.default.name&lt;/name&gt;\r\n             &lt;value&gt;hdfs://120.24.36.66:9000&lt;/value&gt;\r\n        &lt;/property&gt;\r\n        &lt;property&gt;\r\n             &lt;name&gt;hadoop.tmp.dir&lt;/name&gt;\r\n             &lt;value&gt;/opt/hadoop-1.2&lt;/value&gt;\r\n        &lt;/property&gt;\r\n\r\n    &lt;/configuration&gt;\r\n\r\n    解压 hadoop-1.2.1.gz 包\r\n    F:\\云计算\\hadoop-1.2.1\\docs \r\n    查看 core-default.html 文件\r\n    name    value   description\r\n    hadoop.tmp.dir  /tmp/hadoop-${user.name}\r\n    查看 hdfs-default.html\r\n    dfs.name.dir    ${hadoop.tmp.dir}/dfs/name\r\n\r\n\r\n    [root@iZ94f2imuwkZ conf]# vim hdfs-site.xml\r\n    &lt;property&gt;\r\n        &lt;name&gt;dfs.replication&lt;/name&gt;\r\n        &lt;value&gt;1&lt;/value&gt;\r\n        &lt;!-- 配置节点数 --&gt;\r\n    &lt;/property&gt;\r\n\r\n    #如果主从 配置二个节点或更多\r\n    [root@iZ94f2imuwkZ conf]# vi slaves #配置从节点的IP 或主机名\r\n    [root@iZ94f2imuwkZ conf]# vi masters #配置 secondaryNameNode\r\n    [root@iZ94f2imuwkZ conf]# more core-site.xml\r\n    fs.default.name #配置是的 NameNode\r\n    [root@iZ94f2imuwkZ conf]# ssh apeng\r\n    root@apeng&#039;s password: #需要密码登录\r\n    ssh 配置无密码登录\r\n    [root@iZ94f2imuwkZ conf]# start-all.sh #启动其它所\r\n\r\n    #配置本地无密码登录\r\n    [root@iZ94f2imuwkZ conf]# ssh-keygen -t dsa -P &#039;&#039; -f ~/.ssh/id_dsa\r\n    Generating public/private dsa key pair.\r\n    Your identification has been saved in /root/.ssh/id_dsa.\r\n    Your public key has been saved in /root/.ssh/id_dsa.pub.\r\n    The key fingerprint is:\r\n    1b:77:d9:2b:c4:49:81:f7:84:c3:8d:47:03:35:b3:d9 root@iZ94f2imuwkZ\r\n    The key&#039;s randomart image is:\r\n    +--[ DSA 1024]----+\r\n    |           ooB*  |\r\n    |          . *.+B |\r\n    |           ..=o E|\r\n    |           o +.  |\r\n    |        S . * .  |\r\n    |         + o   . |\r\n    |        .   . .  |\r\n    |             .   |\r\n    |                 |\r\n    +-----------------+\r\n    [root@iZ94f2imuwkZ conf]# cd\r\n    [root@iZ94f2imuwkZ ~]# cd ./.ssh/\r\n    [root@iZ94f2imuwkZ .ssh]# ls\r\n    id_dsa  id_dsa.pub  known_hosts\r\n    [root@iZ94f2imuwkZ .ssh]# cat ~/.ssh/id_dsa.pub &gt;&gt; ~/.ssh/authorized_keys\r\n    [root@iZ94f2imuwkZ .ssh]# ssh 120.24.36.66\r\n    Last login: Sun Mar  6 16:40:16 2016 from 180.156.207.167\r\n\r\n    Welcome to aliyun Elastic Compute Service!\r\n\r\n    [root@iZ94f2imuwkZ ~]# exit\r\n    logout\r\n    Connection to 120.24.36.66 closed.\r\n    [root@iZ94f2imuwkZ .ssh]#\r\n\r\n\r\n    #配置无密码登录 node1 登录 node2\r\n    node1 上生成公私钥\r\n    [root@iZ94f2imuwkZ .ssh]# scp id_dsa.pub root@node2:~\r\n\r\n    #进入 node2 服务器\r\n    cd\r\n    ls\r\n    cat id_dsa.pub &gt;&gt; ~/.ssh/authorized_keys\r\n    cd .ssh/\r\n    more authorized_keys\r\n\r\n    #进入 node1 服务器\r\n    [root@iZ94f2imuwkZ .ssh]# ssh node2\r\n    [root@iZ94f2imuwkZ .ssh]# scp -r ~/hadoop-1.2.1.tar.gz root@node:~/\r\n    #进入 node2 服务器 安装 hadoop 环境\r\n    #进入 node1 服务器\r\n    [root@iZ94f2imuwkZ conf]# scp ./* root@node2:/home/hadoop-1.2/conf/\r\n\r\n\r\n    [root@iZ94f2imuwkZ conf]# vim hadoop-env.sh\r\n    export JAVA_HOME=/usr/java/jdk1.8.0_73\r\n    # The maximum amount of heap to use, in MB. Default is 1000.\r\n    export HADOOP_HEAPSIZE=64\r\n    [root@iZ94f2imuwkZ hadoop-1.2.1]# cd bin\r\n    [root@iZ94f2imuwkZ bin]# ./hadoop namenode -format\r\n\r\n    [root@iZ94f2imuwkZ bin]# ls\r\n    hadoop             start-all.sh               stop-balancer.sh\r\n    hadoop-config.sh   start-balancer.sh          stop-dfs.sh\r\n    hadoop-daemon.sh   start-dfs.sh               stop-jobhistoryserver.sh\r\n    hadoop-daemons.sh  start-jobhistoryserver.sh  stop-mapred.sh\r\n    rcc                start-mapred.sh            task-controller\r\n    slaves.sh          stop-all.sh\r\n    [root@iZ94f2imuwkZ bin]# ./start-dfs.sh #停止使用 ./stop-dfs.sh\r\n    starting namenode, logging to /root/hadoop/hadoop-1.2.1/libexec/../logs/hadoop-root-namenode-iZ94f2imuwkZ.out\r\n    The authenticity of host &#039;localhost (127.0.0.1)&#039; can&#039;t be established.\r\n    RSA key fingerprint is ee:4c:3d:0e:7c:54:9a:0f:2b:5d:54:71:4b:54:ae:cd.\r\n    Are you sure you want to continue connecting (yes/no)? yes\r\n    localhost: Warning: Permanently added &#039;localhost&#039; (RSA) to the list of known hosts.\r\n    localhost: starting datanode, logging to /root/hadoop/hadoop-1.2.1/libexec/../logs/hadoop-root-datanode-iZ94f2imuwkZ.out\r\n    localhost: starting secondarynamenode, logging to /root/hadoop/hadoop-1.2.1/libexec/../logs/hadoop-root-secondarynamenode-iZ94f2imuwkZ.out\r\n    [root@iZ94f2imuwkZ bin]# jps\r\n    24112 NameNode\r\n    24357 SecondaryNameNode\r\n    24246 DataNode # 如果没有 DataNode 可以使用 service iptables stop\r\n    24424 Jps\r\n    [root@iZ94f2imuwkZ bin]#\r\n    页面访问 http协议访问是 50070\r\n    http://120.24.36.66:50070/dfshealth.jsp\r\n\r\n\r\n    修改三个xml 配置文件\r\n    vi core-site.xml\r\n    hadoop 的工作目录\r\n    hadoop 所有元数据的目录\r\n    hadoop 访问路径\r\n    &lt;property&gt;\r\n    &lt;name&gt;hadoop.tmp.dir&lt;/name&gt;\r\n    &lt;value&gt;/hadoop&lt;/value&gt;\r\n    &lt;/property&gt;\r\n    &lt;property&gt;\r\n    &lt;name&gt;dfs.name.dir&lt;/name&gt;\r\n    &lt;value&gt;/hadoop/name&lt;/value&gt;\r\n    &lt;/property&gt;\r\n    &lt;property&gt;\r\n    &lt;name&gt;fs.default.name&lt;/name&gt;\r\n    &lt;value&gt;hdfs://iZ94f2imuwkZ:9000&lt;/value&gt;\r\n    &lt;/property&gt;\r\n    vim ./hdfs-site.xml 文件块的目录\r\n    &lt;property&gt;\r\n    &lt;name&gt;dfs.data.dir&lt;/name&gt;\r\n    &lt;value&gt;/hadoop/data&lt;/value&gt;\r\n    &lt;/property&gt;\r\n    vim ./mapred-site.xml 配置任务调度器 注意本机域名是 iZ94f2imuwkZ\r\n    &lt;property&gt;\r\n    &lt;name&gt;mapred.job.tracker&lt;/name&gt;\r\n    &lt;value&gt;iZ94f2imuwkZ:9001&lt;/value&gt;\r\n    &lt;/property&gt;\r\n    vi /etc/rc.local\r\n    export HADOOP_HOME=/root/hadoop/hadoop-1.2.1\r\n    export PATH=$JAVA_HOME/bin:$JRE_HOME/bin:$HADOOP_HOME/bin:$PATH\r\n    hadoop\r\n    hadoop: command not found\r\n    source /etc/rc.local\r\n    hadoop\r\n    hadoop namenode -format #对namenode 进行格式化操作\r\n    cd ../\r\n    ls\r\n    cd ./bin\r\n    ls\r\n    ./start-all.sh\r\n    输入主机的登录密码\r\n    jps #查看 hadoop 是否正常运行\r\n    JobTracker\r\n    JPS\r\n    DataNode\r\n    TaskTracker\r\n    NameNode\r\n    hodoop fs -ls / #查看 hadoop 下的文件', '1457264005', '361', '0', '0', '0');

-- ----------------------------
-- Table structure for resource_techn_cate
-- ----------------------------
DROP TABLE IF EXISTS `resource_techn_cate`;
CREATE TABLE `resource_techn_cate` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `catename` varchar(100) NOT NULL,
  `pid` int(11) NOT NULL DEFAULT '0',
  `path` varchar(255) NOT NULL DEFAULT '0,',
  `addtime` int(10) unsigned DEFAULT NULL,
  `flag` tinyint(1) NOT NULL DEFAULT '1',
  `cate` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=363 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_techn_cate
-- ----------------------------
INSERT INTO `resource_techn_cate` VALUES ('1', '进口商品', '339', '0,', '1431922211', '2', '1');
INSERT INTO `resource_techn_cate` VALUES ('4', '饮料', '0', '0,', '1431922307', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('5', '酒', '0', '0,', '1431922316', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('6', '母婴', '0', '0,', '1431922322', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('7', '玩具', '0', '0,', '1431922328', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('8', '童装', '0', '0,', '1431922333', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('9', '家居', '0', '0,', '1431922361', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('10', '家庭清洗', '0', '0,', '1431922373', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('11', '纸品', '0', '0,', '1431922384', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('12', '美妆', '0', '0,', '1431922397', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('13', '个人护理', '0', '0,', '1431922405', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('14', '洗护', '0', '0,', '1431922414', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('15', '女装', '0', '0,', '1431922421', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('16', '内衣', '0', '0,', '1431922426', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('17', '上衣', '0', '0,', '1431922445', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('18', '鞋靴', '0', '0,', '1431922469', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('19', '箱包', '0', '0,', '1431922475', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('20', '腕表健身', '0', '0,', '1431922485', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('21', '男装', '0', '0,', '1431922491', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('22', '运动', '0', '0,', '1431922495', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('23', '户外健身', '0', '0,', '1431922530', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('24', '手机', '0', '0,', '1431922535', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('25', '数码', '0', '0,', '1431922539', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('26', '电脑办公', '0', '0,', '1431922546', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('27', '汽车', '0', '0,', '1431922566', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('28', '医药', '0', '0,', '1431922592', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('29', '小家电', '0', '0,', '1431922553', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('30', '大家电', '0', '0,', '1431922558', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('31', '礼品', '0', '0,', '1431922606', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('32', '保键滋补', '0', '0,', '1431922586', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('33', '成人', '0', '0,', '1431922598', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('34', '卡', '0', '0,', '1431922610', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('35', '旅游', '0', '0,', '1431922615', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('36', '充值', '0', '0,', '1431922620', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('37', '进口牛奶', '1', '0,1,', '1431929667', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('38', '进口酒', '1', '0,1,', '1431929796', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('39', '进口饮料', '1', '0,1,', '1431929880', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('40', '进口冲饮', '1', '0,1,', '1431929908', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('41', '进口水', '1', '0,1,', '1431929917', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('42', '进口饼干', '1', '0,1,', '1431929936', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('43', '进口零食', '1', '0,1,', '1431929948', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('44', '进口果干坚果', '1', '0,1,', '1431993837', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('45', '进口咖啡茶叶', '1', '0,1,', '1431993850', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('46', '进口食用油', '1', '0,1,', '1431993870', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('47', '进口大米面食', '1', '0,1,', '1431993887', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('48', '进口方便速食', '1', '0,1,', '1431993897', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('49', '进口厨房调料', '1', '0,1,', '1431993916', '2', '1');
INSERT INTO `resource_techn_cate` VALUES ('50', '新鲜水果', '2', '0,2,', '1431994105', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('51', '新鲜蔬菜', '2', '0,2,', '1431994124', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('52', '海鲜', '2', '0,2,', '1431994166', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('53', '新鲜蛋糕', '2', '0,2,', '1431994176', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('54', '冰激淋', '2', '0,2,', '1431994188', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('55', '汤圆', '2', '0,2,', '1431994266', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('56', '水饺', '2', '0,2,', '1431994277', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('57', '牛肉', '2', '0,2,', '1431994282', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('58', '猪肉', '2', '0,2,', '1431994286', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('59', '羊肉', '2', '0,2,', '1431994291', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('60', '鸡', '2', '0,2,', '1431994296', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('61', '鸭', '2', '0,2,', '1431994304', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('62', '鸽', '2', '0,2,', '1431994326', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('63', '坚果', '3', '0,3,', '1431994514', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('64', '蜜饯', '3', '0,3,', '1431994519', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('65', '饼干', '3', '0,3,', '1431994527', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('66', '月饼', '3', '0,3,', '1431994530', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('67', '干货', '3', '0,3,', '1431994540', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('68', '杂粮', '3', '0,3,', '1431994544', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('69', '挂面', '3', '0,3,', '1431994549', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('70', '面粉', '3', '0,3,', '1431994554', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('71', '粽子', '3', '0,3,', '1431994558', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('72', '罐头', '3', '0,3,', '1431994570', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('73', '糖果', '3', '0,3,', '1431994575', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('74', '巧克力', '3', '0,3,', '1431994613', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('75', '火腿汤', '3', '0,3,', '1431994643', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('76', '脉动', '4', '0,4,', '1431994870', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('77', '光明', '4', '0,4,', '1431994873', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('78', '娃哈哈', '4', '0,4,', '1431994991', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('79', '农夫山泉', '4', '0,4,', '1431994903', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('80', '蒙牛', '4', '0,4,', '1431994924', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('81', '伊利', '4', '0,4,', '1431994929', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('82', '加多宝', '4', '0,4,', '1431994934', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('83', '王老吉', '4', '0,4,', '1431994942', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('84', '雀巢', '4', '0,4,', '1431994959', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('85', '红牛', '4', '0,4,', '1431994963', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('86', '百事可乐', '4', '0,4,', '1431994968', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('87', '汇源', '4', '0,4,', '1431994974', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('88', '统一', '4', '0,4,', '1431994976', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('89', '五粮液', '5', '0,5,', '1431994979', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('90', '茅台', '5', '0,5,', '1431994985', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('91', '泸州老窖', '5', '0,5,', '1431994987', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('92', '剑南春', '5', '0,5,', '1431994989', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('93', '汾酒', '5', '0,5,', '1431994999', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('94', '洋河', '5', '0,5,', '1431995005', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('95', '牛栏山', '5', '0,5,', '1431995015', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('96', '青岛', '5', '0,5,', '1431995025', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('97', '四特', '5', '0,5,', '1431995035', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('98', '白云边', '5', '0,5,', '1431995045', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('99', '老白干', '5', '0,5,', '1431995055', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('100', '雪花', '5', '0,5,', '1431995065', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('101', '燕京', '5', '0,5,', '1431995075', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('103', '哺乳枕', '6', '0,6,', '1431995809', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('104', '托腹带', '6', '0,6,', '1431995830', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('105', '母乳袋', '6', '0,6,', '1431995853', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('106', '牛补乳', '6', '0,6,', '1431995870', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('107', '益生菌', '6', '0,6,', '1431995879', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('108', '奶嘴', '6', '0,6,', '1431995884', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('109', '学步车', '6', '0,6,', '1431995888', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('110', '爽身', '6', '0,6,', '1431995893', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('111', '积木', '6', '0,6,', '1431995896', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('112', '模型', '6', '0,6,', '1431995899', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('113', '魔方', '6', '0,6,', '1431995902', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('114', '婴儿枕', '6', '0,6,', '1431995926', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('115', '尿垫', '6', '0,6,', '1431995954', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('116', '乐高', '7', '0,7,', '1431996144', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('117', '芭比', '7', '0,7,', '1431996148', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('118', '好孩子', '7', '0,7,', '1431996192', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('119', '友邦', '7', '0,7,', '1431996195', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('120', '勾勾手', '7', '0,7,', '1431996203', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('121', '奇点', '7', '0,7,', '1431996211', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('122', '小盆友', '7', '0,7,', '1431996219', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('123', '开丽', '7', '0,7,', '1431996221', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('124', '大圣', '7', '0,7,', '1431996229', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('125', '开心宝贝', '7', '0,7,', '1431996236', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('126', '简家', '7', '0,7,', '1431996242', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('127', '闪闪', '7', '0,7,', '1431996246', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('128', '爱松', '7', '0,7,', '1431996272', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('129', '巴拉巴拉', '8', '0,8,', '1431996454', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('130', '巴布豆', '8', '0,8,', '1431996464', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('131', '迪士尼', '8', '0,8,', '1431996479', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('132', '南极人', '8', '0,8,', '1431996489', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('133', '英格里奥', '8', '0,8,', '1431996509', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('134', '笛莎', '8', '0,8,', '1431996516', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('135', 'uovo', '8', '0,8,', '1431996528', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('136', '大涩会', '8', '0,8,', '1431996535', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('137', '哈比熊', '8', '0,8,', '1431996542', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('138', '迷蒙兔', '8', '0,8,', '1431996549', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('139', '季季乐', '8', '0,8,', '1431996557', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('140', '爱乐贝兜', '8', '0,8,', '1431996563', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('141', '三枪', '8', '0,8,', '1431996599', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('142', '被子', '9', '0,9,', '1431997053', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('143', '枕头', '9', '0,9,', '1431997060', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('144', '凉席', '9', '0,9,', '1431997063', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('145', '蚊帐', '9', '0,9,', '1431997073', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('146', '毛巾', '9', '0,9,', '1431997093', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('147', '居家拖鞋', '9', '0,9,', '1431997102', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('148', '靠垫坐垫', '9', '0,9,', '1431997110', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('149', '地毯地垫', '9', '0,9,', '1431997121', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('150', '沙发垫', '9', '0,9,', '1431997129', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('151', '十刺绣', '9', '0,9,', '1431997151', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('152', '装饰画', '9', '0,9,', '1431997180', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('153', '花瓶', '9', '0,9,', '1431997187', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('154', '墙纸', '9', '0,9,', '1431997206', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('155', '消毒液', '10', '0,10,', '1431997408', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('156', '洗洁精', '10', '0,10,', '1431997416', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('157', '油污净', '10', '0,10,', '1431997422', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('158', '洁厕剂', '10', '0,10,', '1431997427', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('159', '浴室清洁', '10', '0,10,', '1431997433', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('160', '管道疏通', '10', '0,10,', '1431997439', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('161', '玻璃清洁剂', '10', '0,10,', '1431997449', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('162', '家电清洁剂', '10', '0,10,', '1431997461', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('163', '多用途清洁剂', '10', '0,10,', '1431997473', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('164', '进口清洁剂', '10', '0,10,', '1431997478', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('165', '水垢清洁剂', '10', '0,10,', '1431997505', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('166', '家私清洁护理', '10', '0,10,', '1431997512', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('167', '地板清洁护理', '10', '0,10,', '1431997519', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('168', '软包抽纸', '11', '0,11,', '1432290364', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('169', '卷筒纸', '11', '0,11,', '1432290393', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('170', '手帕纸', '11', '0,11,', '1432290409', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('171', '平板卫生纸', '11', '0,11,', '1432290430', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('172', '厨房用纸', '11', '0,11,', '1432290439', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('173', '湿巾纸', '11', '0,11,', '1432290450', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('174', '商务卫生纸', '11', '0,11,', '1432291235', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('175', '印花连衣裙', '15', '0,15,', '1432291328', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('176', '雪纺衫', '15', '0,15,', '1432291340', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('177', '棉T恤', '15', '0,15,', '1432291353', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('178', '外套', '15', '0,15,', '1432291359', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('179', '九分裤', '15', '0,15,', '1432291365', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('180', '半裙', '15', '0,15,', '1432291438', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('181', '女装馆精品全集', '15', '0,15,', '1432291454', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('182', '睡衣套装', '16', '0,16,', '1432291475', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('183', '全棉睡衣', '16', '0,16,', '1432291662', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('184', '情侣睡衣', '16', '0,16,', '1432291667', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('185', '连裤袜', '16', '0,16,', '1432291682', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('186', '短袜', '16', '0,16,', '1432291688', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('187', '棉裤', '16', '0,16,', '1432291696', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('188', '背心', '16', '0,16,', '1432291700', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('189', '丝巾', '16', '0,16,', '1432291714', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('190', '粉底', '12', '0,12,', '1432292232', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('191', '睫毛膏', '12', '0,12,', '1432292245', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('192', '美甲', '12', '0,12,', '1432292252', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('193', '美容工具', '12', '0,12,', '1432292262', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('194', '男香水', '12', '0,12,', '1432292267', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('195', '女士香水', '12', '0,12,', '1432292284', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('196', '面膜', '13', '0,13,', '1432292315', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('197', '洁面', '13', '0,13,', '1432292317', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('198', '美白', '13', '0,13,', '1432292322', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('199', '面霜', '13', '0,13,', '1432292326', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('200', '护垫', '13', '0,13,', '1432292340', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('201', '日用', '13', '0,13,', '1432292344', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('202', '沐浴露', '14', '0,14,', '1432292373', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('203', '沐浴套装', '14', '0,14,', '1432292380', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('204', '香皂', '14', '0,14,', '1432292389', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('205', '花露水', '14', '0,14,', '1432292398', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('206', '牙刷', '14', '0,14,', '1432292406', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('207', '牙线', '14', '0,14,', '1432292410', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('208', '衬衫', '17', '0,17,', '1432292509', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('209', '外套', '17', '0,17,', '1432292515', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('210', '小西装', '17', '0,17,', '1432292519', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('211', '情侣T恤', '17', '0,17,', '1432292538', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('212', '运动服', '17', '0,17,', '1432292547', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('213', '针织开衫', '17', '0,17,', '1432292552', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('214', '板鞋', '18', '0,18,', '1432292597', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('215', '帆布鞋', '18', '0,18,', '1432292612', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('216', '凉鞋', '18', '0,18,', '1432292621', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('217', '人字拖', '18', '0,18,', '1432292626', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('218', '懒人鞋', '18', '0,18,', '1432292638', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('219', '皮鞋', '18', '0,18,', '1432292655', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('220', '单肩包', '19', '0,19,', '1432292714', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('221', '公文包', '19', '0,19,', '1432292719', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('222', '帆布男包', '19', '0,19,', '1432292728', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('223', '手拿包', '19', '0,19,', '1432292736', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('224', '腰包', '19', '0,19,', '1432292744', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('225', '斜挎包', '19', '0,19,', '1432292767', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('227', '男表', '20', '0,20,', '1432294641', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('228', '女表', '20', '0,20,', '1432294647', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('229', '情侣表', '20', '0,20,', '1432294652', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('230', '儿童表', '20', '0,20,', '1432294657', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('231', '瑞士表', '20', '0,20,', '1432294663', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('232', '机械表', '20', '0,20,', '1432294668', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('233', '石英表', '20', '0,20,', '1432294674', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('234', '短袖', '21', '0,21,', '1432294701', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('235', '背心', '21', '0,21,', '1432294707', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('236', '格子衬衫', '21', '0,21,', '1432294715', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('237', '商务衬衫', '21', '0,21,', '1432294721', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('238', '休闲裤', '21', '0,21,', '1432294730', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('239', '牛仔裤', '21', '0,21,', '1432294735', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('240', '跑步鞋', '22', '0,22,', '1432294766', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('241', '运动裤', '22', '0,22,', '1432294775', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('242', '运动套装', '22', '0,22,', '1432294780', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('243', '护具', '22', '0,22,', '1432294784', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('244', '运动包', '22', '0,22,', '1432294788', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('245', '运动T恤', '22', '0,22,', '1432294804', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('246', '军迷用品', '23', '0,23,', '1432294969', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('247', '烧烤', '23', '0,23,', '1432294972', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('248', '帐篷', '23', '0,23,', '1432294979', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('249', '户外背包', '23', '0,23,', '1432294985', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('250', '徙步鞋', '23', '0,23,', '1432294994', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('251', '户外休闲鞋', '23', '0,23,', '1432295004', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('252', '小米', '24', '0,24,', '1432295064', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('253', '苹果', '24', '0,24,', '1432295069', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('254', '三星', '24', '0,24,', '1432295073', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('255', '华为', '24', '0,24,', '1432295079', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('256', '联想', '24', '0,24,', '1432295086', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('257', '魅族', '24', '0,24,', '1432295096', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('258', '单反', '25', '0,25,', '1432295138', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('259', '智能穿戴', '25', '0,25,', '1432295146', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('260', '智能家居', '25', '0,25,', '1432295153', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('261', '智能播放器', '25', '0,25,', '1432295159', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('262', '镜头', '25', '0,25,', '1432295163', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('263', '微单', '25', '0,25,', '1432295171', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('264', '笔记本', '26', '0,26,', '1432295211', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('265', '平板', '26', '0,26,', '1432295213', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('266', '台式机', '26', '0,26,', '1432295218', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('267', '一体机', '26', '0,26,', '1432295221', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('268', '文具', '26', '0,26,', '1432295224', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('269', '扫描', '26', '0,26,', '1432295227', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('270', '行车记录仪', '27', '0,27,', '1432295304', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('271', '加油卡', '27', '0,27,', '1432295307', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('272', '净化器', '27', '0,27,', '1432295312', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('273', '内饰', '27', '0,27,', '1432295329', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('274', '配饰', '27', '0,27,', '1432295337', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('275', '轮胎', '27', '0,27,', '1432295341', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('276', '补血', '28', '0,28,', '1432295382', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('277', '维生素', '28', '0,28,', '1432295387', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('278', '便秘', '28', '0,28,', '1432295390', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('279', '减肥瘦身', '28', '0,28,', '1432295400', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('280', '咽炎', '28', '0,28,', '1432295405', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('281', '补肾', '28', '0,28,', '1432295406', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('282', '豆浆机', '29', '0,29,', '1432295452', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('283', '电钣煲', '29', '0,29,', '1432295472', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('284', '电火锅', '29', '0,29,', '1432295477', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('285', '电水壶', '29', '0,29,', '1432295482', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('286', '养生壶', '29', '0,29,', '1432295491', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('287', '电磁炉', '29', '0,29,', '1432295504', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('288', '平板电视', '30', '0,30,', '1432295567', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('289', '洗衣机', '30', '0,30,', '1432295573', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('290', '冰箱', '30', '0,30,', '1432295577', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('291', '空调', '30', '0,30,', '1432295580', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('292', '酒柜', '30', '0,30,', '1432295586', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('293', '冷柜', '30', '0,30,', '1432295589', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('294', '摆挂件', '31', '0,31,', '1432295616', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('295', '孩子', '31', '0,31,', '1432295621', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('296', '长辈', '31', '0,31,', '1432295626', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('297', '玩具', '31', '0,31,', '1432295630', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('298', '女士', '31', '0,31,', '1432295634', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('299', '男士', '31', '0,31,', '1432295637', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('300', '阿胶', '32', '0,32,', '1432295679', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('301', '燕窝', '32', '0,32,', '1432295702', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('302', '参类', '32', '0,32,', '1432295709', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('303', '灵芝', '32', '0,32,', '1432295717', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('304', '冬虫夏草', '32', '0,32,', '1432295733', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('305', '鹿茸', '32', '0,32,', '1432295742', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('306', '男用', '33', '0,33,', '1432295768', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('307', '女用', '33', '0,33,', '1432295772', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('308', '内衣', '33', '0,33,', '1432295776', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('309', '经典礼品卡', '34', '0,34,', '1432295820', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('310', '电子礼品卡', '34', '0,34,', '1432295828', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('311', '端午礼品卡', '34', '0,34,', '1432295854', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('312', '生日礼品卡', '34', '0,34,', '1432295860', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('313', '感谢礼品卡', '34', '0,34,', '1432295867', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('314', '浓情礼品卡', '34', '0,34,', '1432295880', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('315', '中秋礼品卡', '34', '0,34,', '1432295890', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('316', '上海旅游', '35', '0,35,', '1432295949', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('317', '浙江旅游', '35', '0,35,', '1432295963', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('318', '江苏旅游', '35', '0,35,', '1432295970', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('319', '安徽旅游', '35', '0,35,', '1432295977', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('320', '北京旅游', '35', '0,35,', '1432295983', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('321', '云南游泳', '35', '0,35,', '1432295988', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('322', '海南旅游', '35', '0,35,', '1432295995', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('323', '手机充值', '36', '0,36,', '1432296026', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('324', '购物券', '36', '0,36,', '1432296036', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('325', '生鲜券', '36', '0,36,', '1432296045', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('326', '面包甜品券', '36', '0,36,', '1432296053', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('327', '体验卡', '36', '0,36,', '1432296057', '0', '1');
INSERT INTO `resource_techn_cate` VALUES ('328', '软件技术', '0', '0,', '1433680120', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('329', 'html', '357', '0,328,', '1434078714', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('330', 'css', '357', '0,328,', '1434078781', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('331', 'div+css', '357', '0,328,', '1434078950', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('332', 'css3', '357', '0,328,', '1434079025', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('333', 'php基础', '355', '0,328,', '1434079431', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('334', 'php错误与时间', '355', '0,328,', '1434079459', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('335', 'gd库', '355', '0,328,', '1434079483', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('336', 'file', '355', '0,328,', '1434079506', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('337', 'mysql', '356', '0,328,', '1434079532', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('338', 'linux', '328', '0,328,', '1434458434', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('339', 'php面向对象', '355', '0,328,', '1434459053', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('340', '登录', '358', '0,328,', '1434466684', '1', '3');
INSERT INTO `resource_techn_cate` VALUES ('341', '无框架', '355', '0,328,', '1434501435', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('342', 'TP框架', '354', '0,328,', '1434501451', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('343', 'js', '357', '0,328,', '1435626351', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('344', '互联网', '358', '0,328,', '1435626934', '1', '2');
INSERT INTO `resource_techn_cate` VALUES ('345', 'linux 基础', '338', '0,328,338,', '1456755789', '1', '3');
INSERT INTO `resource_techn_cate` VALUES ('354', '云计算', '328', '0,328,', '1457178816', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('355', 'php', '328', '0,328,', '1457178830', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('356', '数据库', '328', '0,328,', '1457178840', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('357', '前端', '328', '0,328,', '1457178853', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('358', '其它', '328', '0,328,', '1457179025', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('359', 'hadoop', '354', '0,328,354,', '1457230038', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('360', 'hadoop 基础', '359', '0,328,354,359,', '1457230059', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('361', 'hdfs', '359', '0,328,354,359,', '1457230069', '1', '1');
INSERT INTO `resource_techn_cate` VALUES ('362', 'MapReduce', '359', '0,328,354,359,', '1457230081', '1', '1');

-- ----------------------------
-- Table structure for resource_user
-- ----------------------------
DROP TABLE IF EXISTS `resource_user`;
CREATE TABLE `resource_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` char(32) NOT NULL DEFAULT '' COMMENT '用户密码',
  `email` varchar(255) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  `mobile` char(11) NOT NULL DEFAULT '' COMMENT '用户手机',
  `grade` tinyint(1) NOT NULL DEFAULT '0' COMMENT '会员等级',
  `experience` varchar(255) NOT NULL DEFAULT '0' COMMENT '经验值',
  `sign` varchar(255) NOT NULL DEFAULT '' COMMENT '个性签名',
  `image` varchar(255) NOT NULL DEFAULT '' COMMENT '用户头像',
  `vocation` varchar(255) NOT NULL DEFAULT '' COMMENT '用户职业',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_user
-- ----------------------------
INSERT INTO `resource_user` VALUES ('1', 'apeng', '96e79218965eb72c92a549dd5a330112', '', '', '0', '0', '', '', '');
INSERT INTO `resource_user` VALUES ('2', '', '96e79218965eb72c92a549dd5a330112', 'apeng1@qq.com', '', '0', '0', '', '', '');

-- ----------------------------
-- Table structure for resource_user_lesson
-- ----------------------------
DROP TABLE IF EXISTS `resource_user_lesson`;
CREATE TABLE `resource_user_lesson` (
  `uid` int(10) unsigned DEFAULT NULL COMMENT '用户id',
  `lid` int(10) unsigned DEFAULT NULL COMMENT '课程id',
  `homework` text COMMENT '我的作业'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource_user_lesson
-- ----------------------------
