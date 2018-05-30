<?php
   return array(
   	    // 让页面显示追踪日志信息(可以在页面看到sql语句)
   	    'SHOW_PAGE_TRACE' => true,

   	    /* 数据库设置 */
   	    // 连接数据库配置(ThinkPHP\Conf\convention.php中把以下内容复制到当前文件并修改)
   	    // 此配置文件(config.php为后台配置文件)
	    'DB_TYPE'               =>  'mysql',     // 数据库类型
	    'DB_HOST'               =>  'localhost', // 服务器地址
	    'DB_NAME'               =>  'shop',          // 数据库名
	    'DB_USER'               =>  'root',      // 用户名
	    'DB_PWD'                =>  '',          // 密码
	    'DB_PORT'               =>  '3306',        // 端口
	    'DB_PREFIX'             =>  'shop_',    // 数据库表前缀
	    'DB_FIELDTYPE_CHECK'    =>  false,       // 是否进行字段类型检查
	    'DB_FIELDS_CACHE'       =>  true,        // 启用字段缓存
	    'DB_CHARSET'            =>  'utf8',      // 数据库编码默认采用utf8

	    // 修改模板引擎为smarty(在ThinkPHP/Library/Behavior/ParseTemplateBehavior.class.php)
	    'TMPL_ENGINE_TYPE'		=>  'Smarty',     // 默认模板引擎 
   	);