-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2015 年 08 月 21 日 09:26
-- 服务器版本: 5.6.24
-- PHP 版本: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `shop`
--
CREATE DATABASE IF NOT EXISTS `shop` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `shop`;

-- --------------------------------------------------------

--
-- 表的结构 `shop_article`
--

CREATE TABLE IF NOT EXISTS `shop_article` (
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=99 ;

--
-- 转存表中的数据 `shop_article`
--

INSERT INTO `shop_article` (`id`, `uid`, `title`, `summary`, `img`, `content`, `addtime`, `pid`, `recommend`, `allow`, `views`) VALUES
(1, 1, '面向对象', NULL, 'Uploads/2015-06-16/55801e2ceb688.png', '1. 面向对象的介绍\r\n	1.1 面向对象的两个方向： 思想 语法\r\n	1.2 对象: 一切皆对象 \r\n	1.3 面向对象 ： 用对象思想去编程 \r\n	1.4 面向过程 ： 强调步骤 函数 \r\n	缺点： 程序灵活性低 \r\n	1.5 面向对象的优点 重用性 灵活性 可扩展性 \r\n	1.6 面向对象编程的特点 ： 封装性 继承性 多态性 \r\n	1.7 PHP中的面向对象 :	\r\n	PHP4 开始有对象\r\n	PHP5 完全面向对象\r\n	1.8 注意：\r\n	面向对象无法提高 程序的运行效率\r\n 面向对象提高的开发效率\r\n	\r\n	2. 类和对象的关系\r\n	1.1 类和对象的关系\r\n	类是对象的抽象 对象是类的实例\r\n	一个类可以有多个实例\r\n 1.2 对象	\r\n	组成： 成员属性\r\n	成员方法\r\n	1.3 类\r\n	具有相同特性和行为的对象的抽象就是类\r\n	组成：	成员属性 成员方法', 1434459692, 339, 0, 0, 0),
(2, 1, '抽象一个类', NULL, 'Uploads/2015-06-16/5580202b3f943.png', '1. 类的定义\r\n			class 类名\r\n			{\r\n			   code.........\r\n			}\r\n			\r\n		2. 成员属性(变量)\r\n			格式：  修饰符 $属性名 = 值;\r\n						修饰符 $属性名;\r\n			修饰符：  public     private      protected      static     var\r\n			说明：\r\n				① var修饰符 等同于public php4的语法，不建议使用\r\n				② 对象中的成员属性 不同重复定义\r\n				③ 给属性赋值，只能直接给值， 不能进行表达式运算（调用函数，运算符）\r\n				④ 类中可以读取常量\r\n			\r\n		3. 成员方法（函数）\r\n			格式：   [修饰符] function 方法名([参数列表])\r\n						{\r\n							code...\r\n						}\r\n			修饰符： public   private    protected    static     abstract    final   \r\n			说明：	\r\n						①方法可以省略修饰符  省略修饰符相当于public\r\n						② 方法名不同 重复', 1434460203, 339, 0, 0, 0),
(3, 1, '对象的操作', NULL, 'Uploads/2015-06-16/558022d693188.png', '1. 实例化一个对象\r\n			new className();\r\n			new className;\r\n		\r\n		2. 对象成员的访问	\r\n			->\r\n			\r\n		3. 对象在内存中的存贮\r\n			对象的变量名存在 栈\r\n			对象的内容存在 堆里\r\n			\r\n		4. $this \r\n				\r\n		5. 构造方法和析构方法\r\n			5.1 构造方法\r\n				格式：\r\n					public function __construct()\r\n					{\r\n					}\r\n				特点：\r\n					① 自动调用， 当类被实例化的时候，被自动调用\r\n					② 实例化对象 类名后面的括号可以省略（该类没有构造方法或者构造方法没有参数）\r\n					③ PHP4的时候 构造方法 是 与类名同名的方法\r\n					④ 如果 两个构造方法 都在， __construct()优先级高， 不建议写两个\r\n				作用：\r\n					① 用于给属性赋初始值\r\n					② 打开资源\r\n			5.2 析构方法\r\n				格式：\r\n					public function __destruct()\r\n					{\r\n					}\r\n				提点：\r\n					① 当对象被销毁的时候，析构方法会自动执行\r\n				作用：\r\n					① 销毁资源', 1434460886, 339, 0, 0, 0),
(4, 1, '实例一 worker', NULL, '', '属性（）：工作种类，职务\r\n方法：\r\n1.构造方法：给类中属性赋值。\r\n2.工作方法：要求有本类所有属性输出\r\n\r\nclass Worker\r\n{\r\n	private $cate;\r\n	private $work;\r\n	public function __construct($cate, $work)\r\n	{\r\n		$this->cate = $cate;\r\n		$this->work = $work;\r\n	}\r\n\r\n	public function work()\r\n	{\r\n		echo ''你的工作部门是 ''.$this->cate;\r\n		echo ''<br/>'';\r\n		echo ''你的职位是 ''.$this->work;\r\n	}\r\n}\r\n\r\n$work = new Worker(''事业部'', ''经理'');\r\n$work ->work();', 1434461184, 339, 0, 0, 0),
(5, 1, '实例二 Url', NULL, '', '属性：url名称\r\n方法：构造方法，给url属性赋初始化值\r\n1.	方法一：返回url的文件名：如a.php  index.html\r\n2.	方法二：返回url的协议名   如http  ftp\r\n3.	方法三：返回url的主机名：\r\n4.	方法四：返回url的文件后缀名：\r\n\r\n\r\nclass Url\r\n{\r\n	private $url;\r\n\r\n	public function __construct($url)\r\n	{\r\n		$this->url = $url;\r\n	}\r\n\r\n	public function filename()\r\n	{\r\n		$url = $this->url;\r\n		$str = explode(''/'', $url);\r\n		$len = count($str) - 1;\r\n		if($str[$len]){\r\n			echo "本地址的文件是 ".$str[$len];\r\n			echo ''<br/>'';\r\n		}\r\n	}\r\n\r\n	public function proto()\r\n	{\r\n		$url = $this->url;\r\n		preg_match(''/^\\w+:/'', $url, $m);\r\n		$proto = rtrim($m[0], '':'');\r\n		echo ''本地址的协议是 ''.$proto;\r\n		echo ''<br/>'';\r\n	}\r\n\r\n	public function host()\r\n	{\r\n		$url = $this ->url;\r\n		$str = explode(''/'', $url);\r\n		echo ''本地址的主机是 ''.$str[2];\r\n		echo ''<br/>'';\r\n	}\r\n\r\n	public function extension()\r\n	{\r\n		$url = $this->url;\r\n		//$str = strripos($url, ''.'');\r\n		$str = strrchr($url, ''.'');\r\n		if($str){\r\n			echo ''本地址的文件后缀名是 ''.ltrim($str, ''.'');\r\n		}\r\n	}\r\n}\r\n\r\n$url = new Url(''http://www.qq.com/index.php'');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho "<hr/>";\r\n\r\n$url = new Url(''http://www.qq.com/a/b/index.html'');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho "<hr/>";\r\n\r\n$url = new Url(''ftp://www.apeng.com/index.jsp'');\r\n$url ->filename();\r\n$url ->proto();\r\n$url ->host();\r\n$url ->extension();\r\necho "<hr/>";', 1434461400, 329, 0, 0, 0),
(6, 1, '实例三 数据库连接', NULL, '', '属性（受保护）： 数据库连接资源属性、表名、主键名属性。\r\n方法：\r\n	构造方法语句给上面的私有属性赋值。\r\n	方法一：数据查询信息select( ) ,以数组方式返回结果。\r\n方法二：数据删除方法del($id)，根据指定的主键值，删除对应的信息\r\n方法三：数据单条信息获取方法find($id), 根据指定的主键值，\r\n	     获取对应的详情信息（添加自动获取主键名的方法）\r\n方法四： 析构方法（关闭数据库连接）。\r\n\r\n\r\nclass Model\r\n{\r\n	private $host = &#039;localhost&#039;;\r\n	private $user = &#039;root&#039;;\r\n	private $pass = &#039;&#039;;\r\n	private $db = &#039;shop&#039;;\r\n	private $table;\r\n	/**\r\n	 * 连接数据库\r\n	*/\r\n	public function __construct($table)\r\n	{\r\n		mysql_connect($this-&gt;host,$this-&gt;user,$this-&gt;pass) or die(&#039;数据库连接失败&#039;);\r\n		mysql_select_db($this-&gt;db);\r\n		mysql_set_charset(&#039;utf8&#039;);\r\n		$this-&gt;table = $table;\r\n	}\r\n\r\n	/**\r\n	 * select()\r\n	 * @param $sql 根据sql 来查询\r\n	*/\r\n	public function select(){\r\n		$sql = &quot;select * from &quot;.$this-&gt;table;\r\n		$list = &#039;&#039;;\r\n		$res = mysql_query($sql);\r\n		if($res &amp;&amp; mysql_num_rows($res) &gt; 0){\r\n			while ($rows = mysql_fetch_assoc($res)) {\r\n				$list[] = $rows;\r\n			}\r\n			mysql_free_result($res);\r\n		}\r\n		return $list;\r\n	}\r\n\r\n	/**\r\n	 * @param $id 根据id 来删除记录\r\n	*/\r\n	public function del($id){\r\n		$sql = &quot;delete from &quot;.$this-&gt;table.&quot; where id={$id}&quot;;\r\n		$res = mysql_query($sql);\r\n		if($res){\r\n			echo &#039;删除成功&#039;;\r\n		}\r\n	}\r\n\r\n	/**\r\n	 * @param $id 根据id 来删除记录\r\n	*/\r\n	public function find($id){\r\n		$sql = &quot;select * from &quot;.$this-&gt;table.&quot; where id={$id} limit 1&quot;;\r\n		$list = &#039;&#039;;\r\n		$res = mysql_query($sql);\r\n		if($res &amp;&amp; mysql_num_rows($res) &gt; 0){\r\n			while ($rows = mysql_fetch_assoc($res)) {\r\n				$list = $rows;\r\n			}\r\n			mysql_free_result($res);\r\n		}\r\n		return $list;\r\n	}\r\n\r\n	public function __destruct()\r\n	{\r\n		mysql_close();\r\n	}\r\n\r\n}\r\n\r\n$model = new Model(&#039;shop_mg&#039;);\r\n$res = $model -&gt;select();\r\nif($res){\r\n	foreach ($res as $key =&gt; $value) {\r\n		echo &#039;主键为 &#039;.$key.&#039; 的用户名 &#039;.$value[&#039;username&#039;];\r\n		echo &#039;&lt;br/&gt;&#039;;\r\n	}\r\n}\r\n\r\n$model-&gt;del(3);\r\n$res = $model-&gt;find(2);\r\nvar_dump($res);', 1434461858, 339, 0, 0, 0),
(7, 1, '什么是HTML', NULL, 'Uploads/2015-06-16/5580280cafbc3.png', '1. HTML的概念\r\n		超文本标记语言，标准通用标记语言下的一个应用。\r\n		“超文本”就是指页面内可以包含图片、链接，甚至音乐、程序等非文字元素。\r\n		\r\n	2. HTML的发展历程\r\n		HTML 1.0——在1993年6月作为互联网工程工作小组（IETF）工作草案发布（并非标准）\r\n		HTML 2.0——1995年11月作为RFC 1866发布，在RFC 2854于2000年6月发布之后被宣布已经过时\r\n		HTML 3.2——1997年1月14日，W3C推荐标准\r\n		HTML 4.0——1997年12月18日，W3C推荐标准\r\n		HTML 4.01（微小改进）——1999年12月24日，W3C推荐标准   xhtml  \r\n		HTML 5——2014年10月28日，W3C推荐标准\r\n	3. 关于HTML5\r\n		2014年10月29日，万维网联盟宣布，经过接近8年的艰苦努力，该标准规范终于制定完成\r\n		浏览器兼容性\r\n		IE9+  chrome  firefox   opera   Safari', 1434462220, 329, 0, 0, 0),
(8, 1, 'HTML的语法', NULL, 'Uploads/2015-06-16/5580283ca8593.png', '1. HTML的文档声明和注释\r\n		1.1 注释\r\n			&lt;!-- 注释内容  --&gt;\r\n			用于对代码的提示和解释 ， 给程序开发者 使用\r\n		1.2 文档声明  \r\n			声明文档执行的标准\r\n			&lt;!doctype html&gt;\r\n	2. HTML标签\r\n		① HTML标签是HTMl基本组成部分\r\n		② 通常两个尖括号 括起来 &lt;&gt;\r\n		③ 标签都是闭合的， 分为双标签和单标签\r\n		④ 标签不区分大小写 推荐小写\r\n	3. HTML标签属性\r\n		① 属性一般出现在标签中，是html标签的一部分\r\n		② 标签可以有属性，包含额外的信息，属性的值可以在引号中\r\n		③ 标签可以有多个属性\r\n		④ 属性名和值成对出现\r\n		⑤ 格式  &lt;标签 属性1=&#039;值&#039; 属性2=&#039;值&#039; &gt;\r\n	4. HTML中颜色设置\r\n		① 英文单词 red  green yello .....\r\n		② 16进制   #121212\r\n	5. HTML代码格式\r\n		① 任何回车和空格在html中都是不起作用的，可以使用空格进行排版\r\n		② tab键进行缩进', 1434462268, 329, 0, 0, 0),
(9, 1, 'HTML文件的主体结构', NULL, 'Uploads/2015-06-16/558028637792e.png', '① 文档声明   位于HTML标签之前 该标签告知浏览器文档所使用的HTML规范\r\n	html5 使用&lt;!doctype html&gt;\r\n	② html       告知浏览器 这是html文档\r\n	③ head       定义文档的头部信息， 不会像用户显示这些信息\r\n	④ title      定义文档标题， 一般写在head 里面\r\n	⑤ body       定义文档主题， 文本、图片....\r\n	主体结构\r\n	&lt;!doctype html&gt;\r\n	&lt;html&gt;\r\n	    &lt;head&gt;\r\n	        &lt;title&gt;&lt;/title&gt;\r\n	    &lt;/head&gt;\r\n	    &lt;body&gt;&lt;/body&gt;\r\n	&lt;/html&gt;', 1434462307, 329, 0, 0, 0),
(10, 1, 'HEAD 头部内标签语法', NULL, 'Uploads/2015-06-16/558029e396d11.png', '1. meta 标签  \r\n		1.1 定义页面相关的描述信息，写在head内部\r\n		1.2 常用属性\r\n			① charset   设置字符集编码  常用的值： utf-8  gbk  gb2312\r\n			② content   为name和http-equiv  定义关联信息\r\n			③ http-equiv 把content属性关联到http头部，必须跟conent成对出现\r\n						  常用的值：\r\n						   content-type   定义编码格式     &lt;meta http-equiv=&quot;content-type&quot; content=&quot;text/html;charset=utf-8&quot;&gt;\r\n						   refresh         刷新页面和跳转   &lt;meta http-equiv=&#039;refresh&#039; content=&#039;3&#039;&gt;  &lt;meta http-equiv=&#039;refresh&#039; content=&#039;3; url=http://www.baidu.com&#039;\r\n			④ name        把conent关联到一个名称\r\n							常用的值\r\n							author      定义文档作者\r\n							keywords    定义网页的关键字  多个关键字用逗号隔开\r\n							description 定义网页描述信息\r\n		1.3 实例\r\n			&lt;meta charset=&#039;utf-8&#039;&gt;\r\n			&lt;meta http-equiv=&quot;content-type&quot; content=&quot;text/html;charset=utf-8&quot;&gt;\r\n			&lt;meta http-equiv=&quot;refresh&quot; content=&#039;2&#039;&gt;\r\n			&lt;meta http-equiv=&quot;refresh&quot; content=&#039;2;url=http://www.lampbrother.net&#039;&gt;\r\n			&lt;meta name=&quot;keywords&quot; content=&quot;关键词1,关键字2&quot;&gt;\r\n			&lt;meta name=&quot;description&quot; content=&quot;描述信息....&quot;&gt;\r\n			&lt;meta name=&quot;author&quot; content=&quot;作者&quot;&gt;\r\n	2. link标签\r\n		2.1 定义连个连接文档的关系， 导入一个文档\r\n		2.2 属性\r\n			rel  定义两个文档的关系\r\n			type 定义导入文档的类型\r\n			href 导入文档的地址\r\n		2.3 实例\r\n			&lt;link type=&quot;text/css&quot; rel=&quot;stylesheet&quot; href=&quot;url地址&quot;&gt;\r\n	3. script标签\r\n		3.1 定义一段脚本\r\n		3.2 属性\r\n			type  定义脚本类型\r\n			src   脚本地址\r\n		3.3 实例\r\n			&lt;script&gt;code...&lt;/script&gt;\r\n			&lt;script src=&quot;url地址&quot; type=&quot;text/javascript&quot;&gt;&lt;/script&gt;\r\n	4. style标签\r\n		4.1 定义css\r\n		4.2 属性\r\n			type   定义类型\r\n	5. title标签\r\n		定义文档的标题', 1434462691, 329, 0, 0, 0),
(11, 1, 'HTML文本与文本格式标签', NULL, 'Uploads/2015-06-16/5580318cdf9d5.png', '1. HTML文本标签\r\n		1.1 p  		定义段落\r\n		1.2 b  		定义粗体文字  \r\n		1.3 strong  表示强调， 通常显示为粗体\r\n		1.4 hn      h1 h2 h3 h4 h5 h6  定义不同等级的标题   显示为又大又粗的字体  一个文档中一般只有一个h1\r\n		1.5 em      表示强调，  通常显示为斜体\r\n		1.6 i       呈现为斜体\r\n		1.7 cite    表示引用， 通常显示为斜体\r\n		1.8 sub     下标文字\r\n		1.9 sup     上标文字\r\n	2. HTML文本格式标签\r\n		2.1 bdo   	定义文字方向 属性dir  值： ltr(默认)  rtl\r\n		2.2 q     	定义短的引用， 添加双引号	 \r\n		2.3 abbr 	定义缩写    属性title  指定全写\r\n		2.4 del		定义删除文本\r\n		2.5 time    定义时间   属性datetime    HTML5新增标签\r\n		2.6 summary 配合details使用\r\n		2.7 details 定义元素细节  属性open  值 true false  \r\n		2.8 dialog  定义一段对话  配合 dt(指定说话者)  dd(指定说话内容)\r\n	3. HTML字符实体\r\n		&amp;quot; &quot;\r\n		&amp;amp;  &amp;\r\n		&amp;lt;   &lt;\r\n		&amp;gt;   &gt;\r\n		&amp;nbsp; 空格\r\n		&amp;copy; ©\r\n		&amp;sect; §\r\n		&amp;curren; ¤\r\n		&amp;times; ×', 1434464652, 329, 0, 0, 0),
(12, 1, '列表标签', NULL, 'Uploads/2015-06-16/5580323717993.png', '1. ul  定义无序列表\r\n	2. li  定义无序或有序列表的列表项\r\n	3. ol  定义有序列表\r\n	4. dl  定义定义列表\r\n	5. dt  定义定义列表项或定义对话的角色\r\n	6. dd  对列表项进行描述或定义对话的内容\r\n	7. pre 格式化输出\r\n	8. br  换行 ', 1434464823, 329, 0, 0, 0),
(13, 1, '链接标签', NULL, 'Uploads/2015-06-16/558033945bb54.png', '1. a  \r\n		1.1 定义超连接 从一个页面跳转到另一个页面\r\n		1.2 属性\r\n			href     指定要跳转的地址\r\n			target   指定新网页打开位置    _blank新窗口  _self本窗口\r\n			name     定义锚点名\r\n			\r\n	2. 锚点  跳转到页面的指定位置  a表前name属性添加锚点名   其他标签id属性\r\n	3. mailto:: 打开发送邮件的程序\r\n	4. 绝对地址与相对地址', 1434465172, 329, 0, 0, 0),
(14, 1, '多媒体相关标签', NULL, 'Uploads/2015-06-16/558033b235cb7.png', '1. img \r\n	2. map\r\n	3. area\r\n	4. audio\r\n	5. video\r\n	6. source\r\n	7. canvas\r\n	8. embed', 1434465202, 329, 0, 0, 0),
(17, 1, '登录', NULL, 'Uploads/2015-06-17/5580ca9f6d261.png', 'if (!empty($_POST[&#039;username&#039;])){ // 判断是否有表单数据(没有直接跳转到登录界面)\r\n        $username = $_POST[&#039;username&#039;]; // 获取用户名\r\n        $password = $_POST[&#039;password&#039;]; // 获取密码\r\n        $code = $_POST[&#039;code&#039;]; // 获取验证码\r\n\r\n        require &#039;../common/valid.php&#039;; // 调用 valid.php 来验证 用户名 密码 验证码\r\n        valid_user_len($username, &#039;./login.php&#039;); // 验证用户名长度\r\n        valid_pass_len($password, &#039;./login.php&#039;); // 验证密码长度\r\n        \r\n        require &#039;../common/mysql_conn.php&#039;; // 加载连接函数\r\n        // 定义查询语句 select * from shop_mg where username = &#039;caopeng8&#039;\r\n        // $sql = &quot;select * from &quot;.PREFIX.&quot;mg where username = &#039;{$username}&#039; &quot;; \r\n        $sql = &quot;select id, password, username, email, status from &quot;.PREFIX.&quot;mg where username = &#039;{$username}&#039; limit 1&quot;;\r\n        $userinfo = query($sql); // 获取查询结果\r\n        if ($userinfo){ // $result 是一个数组(id, username ... )\r\n            valid_pass(md5($password), $userinfo[0][&#039;password&#039;], &#039;./login.php&#039;); //比较密码\r\n        } else {\r\n            header(&#039;location: ./login.php?errno=6&#039;); // 用户名错误\r\n            exit;\r\n        }\r\n\r\n        // 处理验证码\r\n        session_start(); // 开启session\r\n        valid_verify($code, $_SESSION[&#039;code&#039;], &#039;./login.php&#039;); // 比较验证码\r\n        unset($_SESSION[&#039;code&#039;]); // 去除session验证码\r\n       \r\n        $_SESSION[&#039;userinfo&#039;] = $userinfo[0]; // 向session 中保存用户信息\r\n        //unset($_SESSION[&#039;userinfo&#039;][&#039;email&#039;]); // 却去除session 中的邮箱\r\n        unset($_SESSION[&#039;userinfo&#039;][&#039;password&#039;]); // 去除session 中的密码\r\n        // session 中的值\r\n        // array (size=4)\r\n        // &#039;id&#039; =&gt; string &#039;13&#039; (length=2)\r\n        // &#039;username&#039; =&gt; string &#039;caopeng13&#039; (length=9)\r\n        // &#039;email&#039; =&gt; string &#039;caopeng13@163.com&#039; (length=17)\r\n        // &#039;status&#039; =&gt; string &#039;2&#039; (length=1)\r\n        header(&#039;Location:./index.php&#039;); // 跳转到首页\r\n    } else {\r\n        header(&#039;Location:./login.php&#039;); // 跳转到登录界面\r\n    }', 1434503839, 341, 0, 0, 0),
(18, 1, '登录', NULL, 'Uploads/2015-06-17/5580d1f42535e.png', '// 执行登录验证方法\r\n    	public function checklogin(){\r\n        // print_r($_POST); // Array ( [username] =&gt; admin [password] =&gt; 123456 [code] =&gt; mp7f )\r\n        $valid = new \\Model\\ValidModel();\r\n        //校验用户名长度\r\n        $res = $valid -&gt; valid_user_len($_POST[&#039;username&#039;]);\r\n        if($res){\r\n          $this -&gt; assign(&#039;erroruser&#039;, &#039;用户名长度不够&#039;);\r\n          $this -&gt; display(&#039;login&#039;);\r\n          exit;\r\n        } \r\n        // 校验密码长度\r\n        $res = $valid -&gt; valid_pass_len($_POST[&#039;password&#039;]);\r\n        if($res){\r\n          $this -&gt; assign(&#039;errorpass&#039;, &#039;你的密码长度不够&#039;);\r\n          $this -&gt; display(&#039;login&#039;);\r\n          exit;\r\n        }\r\n        // $user = new \\Model\\UserModel();\r\n        // if(!empty($_POST)){\r\n        //   $valid = $user -&gt; create();\r\n        //   if(!$valid){\r\n        //     // show_bug($user-&gt;getError());\r\n        //     $this -&gt; assign(&#039;erroruser&#039;, $user-&gt;getError());\r\n        //     $this -&gt; display(&#039;login&#039;);\r\n        //     exit;\r\n        //   }\r\n        // }\r\n\r\n        //select * from shop_mg where username=&#039;admin&#039;\r\n        $sql = &quot;select id,username,password from shop_mg where username=&#039;{$_POST[&#039;username&#039;]}&#039;&quot;;\r\n        $minfo = D() -&gt; query($sql);\r\n        // show_bug($minfo); // 测试对应数据\r\n        if($minfo){\r\n          $pass = $minfo[0][&#039;password&#039;]; // 获取密码\r\n          if($pass != md5($_POST[&#039;password&#039;])){ // 判定密码\r\n            $this -&gt; assign(&#039;errorpass&#039;, &#039;密码错误&#039;); // 向模板中发送数据\r\n            $this -&gt; display(&#039;login&#039;); // 调用对应模板\r\n            exit;\r\n          }\r\n        }\r\n\r\n        // 验证验证码\r\n        $verify = new \\Think\\Verify(); // \r\n        if(!$verify -&gt; check($_POST[&#039;code&#039;], &#039;&#039;)){ // 校验验证码\r\n          $this -&gt; assign(&#039;errorverify&#039;, &#039;验证码错误&#039;); // 向模板中发送数据\r\n          $this -&gt; display(&#039;login&#039;); // 调用对应模板\r\n          exit;\r\n        }\r\n\r\n        // 登录信息持久化 $_SESSION\r\n        session(&#039;mg_name&#039;, $minfo[0][&#039;username&#039;]); // 向session 中保存用户名\r\n        session(&#039;mg_id&#039;, $minfo[0][&#039;id&#039;]); // 向session 中保存用户id\r\n        var_dump($_SESSION);\r\n\r\n        $this -&gt; redirect(&#039;Index/index&#039;); // 重定向到后台首页\r\n      }', 1434505716, 342, 0, 0, 0),
(19, 1, '总结', NULL, 'Uploads/2015-06-17/5580dbf67954c.png', '', 1434508278, 329, 0, 0, 0),
(20, 1, '安装虗拟机', NULL, '', '创建新的虚拟机\r\n自字义\r\n修改虚拟机名为CentOs 默认为ubuntu\r\n选择稍后安装操作系统(安装完虚拟再安装操作系统)\r\n下一步...\r\n选择linux(安装linux系统)\r\n创建新虚拟磁盘\r\n将虚拟磁盘存储为单个文件\r\n完成', 1434509053, 338, 0, 0, 0),
(21, 1, '安装linux 系统', NULL, '', '启动Vm...\r\n单击CD/DVD 自动检测\r\n浏览(选择第一个镜像文件)\r\n开启此虚拟机\r\n不再显示此提示\r\n选择 install or upgrade an existing system 安装或升级现在的系统\r\n使用Tab 选择skip\r\n单击下一步\r\n选择中文简体\r\n选择存储设备\r\n主机名\r\n时区\r\n密码(学习时使用最简单的密码)\r\n无论如何都使用\r\n创建自定义布局\r\n挂载点 /boot 200M\r\n文件系统类型 swap 512M\r\n挂载点 / 使用全部可用空间\r\n在/dev/sda 中安装引导装载程序\r\n软件包程序 选择Basic Server\r\n安装引导程序\r\n登录 login:root\r\npassword:\r\nexit 退出\r\n选择CentOs\r\n启动客户机', 1434509544, 338, 0, 0, 0),
(22, 1, 'linux 安装后的准备工作', NULL, '', '启动虚拟机\r\nvim /etc/sysconfig/network-scripts/ifcfg-eth0\r\n修改 ONBOOT=&#039;yes&#039;(按i将改为yes)\r\n按esc键(进入命令模式)\r\n输入:wq\r\n重启 service network restart\r\n使用ifconfig 查看当前ip(如果是桥接 使用setup 来设置ip)\r\n开启 vmnen8(网络 -&gt; 适配器, 不开启会出现network error:connection timed out)\r\n启动putty.exe远程工具来连接\r\n输入主机名称 192.168.113.128(第一次创建为128)\r\n单击转换选择 utf8\r\n单击会话 选择默认设置 然后单击保存\r\n单击打开\r\n\r\nlinux(三大核心技术)\r\n防火墙配置 内核裁剪 邮箱服务器配置\r\n\r\n关闭防火墙\r\nsetup\r\n按Tab 选择运行工具\r\n按空格取消*\r\n按Tab  选择确定\r\n按Tab 选择是\r\n按Tab 选择退出\r\n\r\n修改密码\r\nvim /etc/ssh/sshd_config\r\n/UseDNS no(将yes 改为no)\r\n/GSSAPIA no(将yes 改为no)\r\n:wq\r\nservice sshd restart\r\n\r\nselinux 增强linux安全组件\r\nvim /etc/selinux/config\r\n修改SELINUX=disabled\r\n按esc键\r\n:wq\r\n\r\n桥接修改IP\r\nsetup\r\n网络配置\r\n设备配置\r\neth0\r\n使用DHCP 按空格取消*\r\n静态IP 192.168.80.18\r\n子网掩码 255.255.255.0\r\n默认网关IP 192.168.80.1\r\n按save 一步一步退出', 1434512494, 338, 0, 0, 0),
(23, 1, 'linux 一级目录', NULL, '', 'ls -a / 查看linux 一级目录\r\n/ 根目录\r\n/bin 命令保存目录(普通用户可以读取的命令)\r\n/boot 启动目录 启动相关文件\r\n/dev 设备文件保存目录(可将设备挂载到具体文件之上)\r\n/etc 配置文件保存目录\r\n/home 普通用户的家目录\r\n/lib 系统库保存目录\r\n/mnt 挂载及目录\r\n/root 超级用户的家目录\r\n/tmp 临时目录(重启后会清空)\r\n/sbin 命令保存目录(超级用户才能使用的目录)\r\n/proc 记录服务器内存cup 情况的动态文件系统\r\n/sys 同上\r\n/usr 系统软件资源目录(unix system resource) echo $PATH 可打印此目录\r\n/usr/bin/ 系统命令(普通用户)\r\n/usr/sbin/ 系统命令(超级用户)\r\n/usr/local/ 常用安装软件目录\r\n/var 系统相关文档内容\r\n/var/log/ 系统日志位置\r\n/var/spool/mail/ 系统默认邮箱位置\r\n/var/lib/mysql 默认安装的mysql 的库文件目录', 1434513036, 338, 0, 0, 0),
(24, 1, '封装性 ', NULL, 'Uploads/2015-06-17/5581796265514.png', '1.1 定义\r\n				把 成员（成员属性 成员方法） 设置成非公有   就是封装\r\n				实现访问控制\r\n			1.2 成员方法封装\r\n				定义：\r\n					把 方法 设置为非公有（private protected） 封装\r\n				特点：\r\n					① 在 类的外部 不同使用\r\n					② 可以在类的内部通过 $this 使用\r\n				作用：\r\n					① 提高代码重用性 \r\n						方法中出现 代码重用的部分，可以把重用的代码 封装成一个方法 再调用\r\n						可以把 代码 多 的方法 拆分成 一个一个小的\r\n					② 提高代码可读性\r\n					\r\n			1.3 成员属性 的封装\r\n				定义：\r\n					把 属性 设置为非公有\r\n				特点：\r\n					① 在类的外部不能使用\r\n					② 只能在 类的内部方法中使用$this\r\n				作用：\r\n					① 实现访问控制', 1434548578, 339, 0, 0, 0),
(25, 1, '访问私有成员属性', NULL, 'Uploads/2015-06-17/55817ecd53933.png', '2.访问私有成员属性\r\n			2.1 设置共有方法\r\n				给每个属性设置共有方法 get/set\r\n			2.2 使用魔术方法来访问\r\n				① __get()\r\n					格式：\r\n						public function __get($param)\r\n						{\r\n							return $this-&gt;$param;\r\n						}\r\n					特点：\r\n						当在类的外部 输出 一个非公有属性或不存在的属性的时候会自动触发\r\n						并把 要访问的属性名作为第一个参数传入\r\n					\r\n				② __set()\r\n					格式：\r\n						public function __set($param, $value)\r\n						{\r\n							$this-&gt;$param = $value;\r\n						}\r\n					特点：\r\n						当 在类的外部 给非公有属性或不存在属性赋值的时候 自动触发\r\n						把 属性名和要赋给的值 作为第一，第二个参数 传入\r\n						\r\n				③ __isset()\r\n					格式：\r\n						public function __isset($param)\r\n						{\r\n							return isset($this-&gt;$param);\r\n						}\r\n					特点：\r\n						① 使用 isset或empty 函数 判断 非公有属性或不存在属性 是否存在的时候，自动触发\r\n						② 把属性名作为第一次参数 传入\r\n						③ empty 也可以触发， 提高准确性，配合__get()使用\r\n						\r\n				④ __unset()\r\n					格式：\r\n						public function __unset($param)\r\n						{\r\n							unset($this-&gt;$param);\r\n						}\r\n					特点：\r\n						① 当使用unset销毁 不存在或非公有 属性 的时候 自动触发\r\n						② 把 属性名 作为参数 传入\r\n						', 1434549965, 339, 0, 0, 0),
(26, 1, 'ls', NULL, '', 'ls(list directory contents 可通过man ls 来查看) 显示目录下内容\r\n/bin/ls --color=auto alias ls=&#039;ls --color=auto&#039;\r\nls -a 显示所有文件(包含隐藏文件)\r\nls -al 多个参数可合并简写\r\nls -h 文件大小显示为常见大小单位 B KB MB\r\nls -d 显示目录本身,而不是里面的子文件\r\nls -l 长格式显示(详细信息显示)\r\ndr_xr_xr_x. 2 root root 4098 6月5 05:18 bin\r\n权限位 引用数 所有者 所属组 大小 最后一次修改时间 文件或目录名\r\n\r\n权限位 \r\n0位 文件类型(-普通文件 d目录文件 l软连接文件 b设备文件)\r\n1-3位 u user owner 文件所有者\r\n4-6位 g group 文件所属组\r\n7-9位 o others 其他人\r\n10 selinux 相关\r\n-无权限 r只读(read) w只写(write) x执行(execute)\r\n\r\nlinux 不以后缀名来区分文件 而以颜色来区别\r\n查看颜色文件\r\ncd /etc/ 进入etc 目录\r\nls 查看etc 目录的文件\r\nvim /etc/DIR_COLORS.256color 查看颜色规则\r\n30=black 31=red 32=green\r\n\r\n文件颜色及类型\r\n默认色代表普通文件 install.log\r\n绿色代表可执行文件 setup.sh centos.sh\r\n红色代表tar 包文件 vim-7.1.tar.bz2\r\n蓝色代表目录文件 etc\r\n洋红色代表图像文件 1.jpg\r\n青色代表链接文件 rc4.d\r\n黄色代表设备文件 /dev/sr0\r\n背景红色代表损坏的链接文件 ', 1434552344, 338, 0, 0, 0),
(27, 1, '命令提示符', NULL, '', '[root@localhost]#\r\n[当前登录用户@主机名 当前所有目录]#\r\n# 超级用户 $普通用户\r\n当前所在目录 ~ 用户家目录\r\n管理员 /root\r\n普通用户 /home/用户名\r\n\r\n可使用su 切换到另一用户\r\nsu(run a shell with substitute user and groupIDs)\r\n普通用户切换到超级用户(需要输入超级用户的密码)\r\nsu - root\r\n超级用户切换到普通用户\r\nsu - apeng\r\n- 包括用户环境一起切换', 1434552701, 338, 0, 0, 0),
(28, 1, 'cd', NULL, '', 'cd(change directory) 切换所在目录 建议使用绝对路径\r\nshell 内置命令\r\ncd ~ 进入当前用户的家目录 /home/apeng(普通用户) /root(超级用户)\r\ncd   进入当前用户的家目录 /home/apeng           /root\r\ncd - 进入上次目录         /home/apeng           /root\r\ncd ..进入上一级目录       /home                 /\r\ncd . 进入当前目录         /home                 /\r\n\r\n相对路径\r\n参照当前所有目录 进行查找 一定要先确定当前所在目录\r\n绝对路径\r\n从根目录开始指定 逐级递归查找 在任何目录下 都能进入指定位置', 1434553109, 338, 0, 0, 0),
(29, 1, 'pwd', NULL, '', 'pwd(print working directory) 显示当前所在目录\r\n(print name of current/working directory) nam pwd\r\n/bin/pwd', 1434587876, 338, 0, 0, 0),
(30, 1, 'mkdir rmdir rm', NULL, '', 'mkdir(make directories) 创建目录\r\n-p 递归创建 可以连续创建目录\r\nmkdir -p aa/bb/cc\r\n/bin/mkdir\r\n\r\nrmdir(remove empty directories) 删除空目录\r\n/bin/rmdir\r\n\r\nrm(remove files or directories) 删除文件或目录\r\n-rf 删除文件和目录\r\n-r 递归删除目录\r\n-f 强制 取消询问模式\r\nrm -rf /aa/bb/cc\r\n', 1434588174, 338, 0, 0, 0),
(31, 1, 'linux 命令', NULL, 'Uploads/2015-06-18/55828e99c3424.png', '', 1434619545, 338, 0, 0, 0),
(32, 1, '面向对象的继承性', NULL, 'Uploads/2015-06-18/5582b7d946fbd.png', '1 类继承的应用\r\n		定义：  子类继承父类， 子类就具有了父类的方法和属性\r\n		格式： \r\n			class 子类 extends 父类\r\n			{\r\n				code...\r\n			}\r\n		特点：\r\n			① php中 不支持多继承 一个类只能有一个父类 但可以有多个子类\r\n		作用\r\n			① 提高代码 重用性\r\n			② 为第三方类 扩展功能 可以继承类 添加方法、属性\r\n			③ 方便升级\r\n		\r\n		\r\n	2 访问控制 三种访问级别\r\n											public      		 	protected    					private\r\n		在类外部访问					y						n											n\r\n		在类的内部访问				y						y											y\r\n		在类的子类中访问			y						y											n\r\n							\r\n	3.子类中重写父类的方法\r\n		① 子类方法名 与 父类方法名(属性)相同， 子类中会覆盖父类的方法（属性）（方法重写）\r\n		② 子类重写父类 方法或属性的时候 访问级别（p） 只能变得更加开放\r\n		③ 子类中可以调用父类的方法，（哪怕是重写的时候）   \r\n			parent::方法名()', 1434630105, 339, 0, 0, 0),
(33, 1, 'vi 编辑器', NULL, 'Uploads/2015-06-18/5582c42edfb83.png', '', 1434633262, 338, 0, 0, 0),
(34, 1, '数据库应用', NULL, 'Uploads/2015-06-18/5582d2a9defe7.png', '1.1 数据库的定义 \r\n		    数据库是计算机应用系统中的一种专门管理数据资源的系统。数据库就是一组经过计算机整理后的数据，\r\n	  存储在一个或者多个文件中，数据库就是存储数据的仓库\r\n	1.2 数据的存储方式\r\n	      人类经历了三种数据存储的阶段：\r\n		  ① 人工管理阶段\r\n		  ② 文件系统阶段\r\n		  ③ 数据库系统阶段\r\n	1.3 数据库在Web开发中的重要作用\r\n		   动态网站都是对数据进行操作，我们平时浏览网页时，会发现网页的内容会经常变化，而页面的主体结构框架没变，\r\n		   Web系统的开发基本上都离不开数据库，因为任何东西都要存放在数据库中。所谓的动态网站就是基于数据库开发的系统，\r\n		   最重要的就是数据管理，或者说我们在开发时都是在围绕数据库在写程序。\r\n	1.4 数据库的相关概念  ！！！！！！！！\r\n		   ① 数据库系统     		  DBS           data  base system\r\n		   ② 数据库        			  DB             data  base   \r\n		   ③ 数据库管理系统       DBMS       data base manage system\r\n           ④ 数据库管理员          DBA	        data base administrator   \r\n           DBS 主要由 DB、DBMS和DBA 等组成。\r\n    1.5 常见的数据库系统 \r\n	       甲骨文 Oracle\r\n		   IBM DB2\r\n		   微软的Access和SQL Server（MSSQL）\r\n		   开源PostgreSQL\r\n		   开源MySQL\r\n		   SQLlite\r\n		   开源 redis\r\n		   mongoDB', 1434636969, 337, 0, 0, 0),
(35, 1, 'mysql 基础', NULL, 'Uploads/2015-06-18/5582d93abe8eb.png', '2.1 mysql的特点\r\n		① 开放源代码      \r\n		② 跨平台性     \r\n		③ 价格优势    \r\n		④ 功能强大且使用方便   \r\n	2.2 PHP为什么会选择MySQL作为自己的好基友\r\n		① PHP几乎可以使用现有的所有的数据库系统\r\n		② MySQL与其他的大型数据库例如Oracle，DB2，SQL Server等相比，自有它的不足之处，如规模小，功能有限，但是丝毫没有影响它受欢迎的程度。\r\n		③ 对于一般的个人使用者和中小型企业来说，MySQL提供的功能已经绰绰有余\r\n		④ 而且由于MySQL是开放源码软件，因此可以大大降低总体拥有成本。LAMP和LNMP中的其他三个软件也都是免费的，\r\n		    所以我们可以不花一分钱就可以建立起一个稳定，免费的网站系统。\r\n	2.3 PHP 与 MySQL的合作方式\r\n		① 在同一个MySQL数据库服务器中可以创建多个数据库，如果把每个数据库看成是一个“仓库”，\r\n			则网站中的内容数据就存储在这个仓库中，而对数据库中数据的存取及维护等，\r\n			都是通过数据库系统软件管理的。同一个数据库管理系统可以为不同的网站分别建立数据库，\r\n			但为了使网站中的数据便于维护，备份及移植，最好为一个网站创建一个数据库。\r\n		② MySQL数据库管理系统是一种“客户机/服务器”体系结构的管理软件，所以必须同时使用\r\n		数据库服务器和客户机两个程序才能使用MySQL。服务器程序用于监听客户机的请求，\r\n		并根据这些请求访问数据库，以便向客户机提供它们所要求的数据。而客户机程序则必须\r\n		通过网络连接到数据库服务器，才能向服务器提交数据操作请求。PHP脚本程序作为\r\n		MySQL服务器的客户机程序，是通过PHP中的MySQL扩展函数，对MySQL服务器中存储的数据进行获取，\r\n		插入，更新及删除等操作。\r\n	2.4 关系型数据库和非关系数据库\r\n		① 关系型数据库\r\n			MySQL服务器	--&gt; 数据库  --&gt;数据表 ---&gt; 行（记录）----&gt;字段\r\n		② 非关系型 数据库	no-sql', 1434638650, 337, 0, 0, 0),
(36, 1, '结构化查询语言', NULL, 'Uploads/2015-06-18/5582daef4fb5c.png', '3.1 数据定义语言（DDL）\r\n		  用于定义和管理数据对象，包括数据库，数据表等。例如：CREATE，DROP，ALTER等。\r\n	3.2 数据操作语言（DML）\r\n	      用于操作数据库对象中所包含的数据。例如：INSERT，UPDATE，DELETE语句。\r\n	3.3 数据查询语言（DQL）\r\n	      用于查询数据库对象中所包含的数据，能够进行单表查询，连接查询，嵌套查询，以及集合查询等各种复杂程度不同的数据库查询，\r\n		  并将数据返回客户机中显示。例如：SELETE\r\n	3.4 数据控制语言（DCL）\r\n	      是用来管理数据库的语言，包括管理权限及数据更改。例如：GRANT，REVOKE，COMMIT，ROLLBACK等。', 1434639087, 337, 0, 0, 0),
(37, 1, 'mysql基本操作', NULL, 'Uploads/2015-06-19/558373342456b.png', '', 1434678068, 337, 0, 0, 0),
(38, 1, '', NULL, '', '', 1434680399, 0, 0, 0, 0),
(39, 1, 'mysql 数据类型', NULL, 'Uploads/2015-06-19/558394b60443d.png', '', 1434686645, 337, 0, 0, 0),
(40, 1, 'lnmp 环境搭建', NULL, '', '恢复到快照\r\n\r\n设置 -&gt; 调整连接方式(改为桥接)\r\n\r\n设置网卡\r\nvim /etc/sysconfig/network-scripts/ifcfg-eth0\r\nONBOOT=&#039;no&#039;(no改为yes)\r\n:wq\r\nsetup\r\n网络设置 -&gt; 设备 -&gt; eth0\r\n取消 *\r\n静态IP 192.168.80.19\r\n子网掩码 255.255.255.0\r\n默认网关 192.168.80.1\r\n服务器代理 211.136.112.50\r\n备用服务器 210.22.84.3\r\n(如果不写服务器代理 则写一个配置文件)\r\nvim /etc/resolv.conf\r\nnameserver 211.136.112.50\r\n(否则不解析域名而只能解析IP)\r\n\r\n关闭防火墙\r\nsetup \r\n按Tab -&gt; 运行工具 -&gt; 按空格取消* -&gt; 按Tab 确定 -&gt; 按Tab -&gt; 是\r\n-&gt; 按Tab 退出\r\n\r\nselinux 安全组件\r\nvim /etc/selinux/config\r\nSELINUX=disabled\r\n:wq\r\nsentenforce\r\n\r\nyum -y install screen\r\nscreen 主要防止掉线\r\nscreen -S lnmp 创建screen 会话\r\n如果掉线可以使用 screen -r lnmp 查看 lnmp 安装进程\r\n\r\nwget -c http://soft.vpser.net/lnmp/lnmp1.1-full.tar.gz &amp;&amp; tar zxf lnmp1.1-full.tar.gz &amp;&amp; cd lnmp1.1-full &amp;&amp; ./centos.sh\r\n在线安装lnmp\r\n\r\n', 1434765350, 338, 0, 0, 0),
(41, 1, 'php 环境搭建', NULL, '', '在d:\\file 下创建目录phptool\r\n把mysql apache php 压缩包复制到phptool 目录下\r\n解压mysql apache php 压缩包\r\n\r\n进入php5.5.25目录\r\n复制php.ini-production 复制一份，并重命名为php.ini(后面在apache中配置)\r\n在环境变量中配置php目录\r\n计算机 -&gt; 属性 -&gt; 高级系统设置 -&gt; 环境变量 -&gt; path\r\nD:\\files\\phptool\\php-5.5.25;D:\\files\\phptool\\php-5.5.25\\ext\r\n\r\napache 配置\r\n打开D:\\files\\phptool\\Apache24\\conf\\httpd.conf 文件配置apache\r\n在37行左右 修改ServerRoot 安装目录 ServerRoot &quot;d:/files/phptool/Apache24&quot;\r\n在219行左右去掉# ServerName www.example.com:80\r\n在243行左右修改DocumentRoot 指向的目录 DocumentRoot &quot;d:/files/phptool/Apache24/htdocs&quot;\r\n在244行修改 &lt;Directory &quot;d:/files/phptool/Apache24/htdocs&quot;&gt;\r\n在278行修改 DirectoryIndex index.html index.php index.htm 后面index.php index.htm 是新添加的\r\n在361行修改 ScriptAlias /cgi-gin/ &quot;d:/files/phptool/Apache24/cgi-bin&quot;\r\n有378行修改 &lt;Directory &quot;d:/files/phptool/Apache24/cgi-bin&quot;&gt;\r\n在文件最后添加如下三行\r\nLoadModule php5_module &quot;d:/files/phptool/php5.5.25/php5apache2_4.dll&quot;\r\nAddType application/x-httpd-php .php .html .htm\r\nPHPIniDir &quot;d:/files/phptool/php5.5.25&quot;\r\n保存退出\r\n安装apache 服务\r\ncmd命令下 进入d:\r\nd:\\&gt;D:\\files\\phptool\\Apache24\\bin\\httpd -k install\r\n\r\n开启php扩展(去掉;注释)\r\n718行左右; extension_dir = &quot;ext&quot;(去掉;注释)修改为 extension_dir = &quot;ext&quot;\r\n870行左右 extension=php_mbstring.dll\r\n872行左右 extension=php_mysql.dll\r\n873行左右 extension=php_mysqli.dll\r\n\r\nmysql 配置\r\n环境变量中配置mysql安装目录D:\\files\\phptool\\mysql5.6.24\\bin\r\n打开D:\\files\\phptool\\mysql5.6.24\\my-default.ini文件\r\n修改 18行19行\r\nbasedir = D:\\files\\phptool\\mysql5.6.24\r\n datadir = D:\\files\\phptool\\mysql5.6.24\\data\r\n保存退出\r\n进入cmd模式 \r\nmysqld -install\r\nnet start mysql\r\n如果报错(错误号为2)\r\nmysqld -remove\r\nd:\r\nd:\\&gt;D:\\files\\phptool\\mysql5.6.24\\bin\r\nmysql -install\r\nnet start mysql\r\nmysql -uroot -p\r\n\r\n启动apache 服务\r\n计算机 -&gt; 管理 -&gt; 服务 -&gt; apache24 -&gt; 启动\r\nhttp://localhost\r\n测试php文件\r\n进入D:\\files\\phptool\\Apache24\\htdocs 目录\r\n新建一个test.php\r\n&lt;?php\r\necho &#039;welcome to php world&#039;;\r\nhttp://localhost/test.php\r\n\r\n', 1434781188, 333, 0, 0, 0),
(42, 1, 'linux 中安装laravel', NULL, '', 'laravel.phar方式安装\r\n\r\n1、下载 laravel.phar 或 composer.phar curl http://laravel.com/laravel.phar\r\n\r\n2、移动文件到/usr/bin，命名去掉.phar mv laravel.phar /usr/bin/laravel\r\n\r\n3、创建blog应用 laravel new blog\r\n\r\n4、授权存储session等 chmod -R 757 blog/app/storage\r\n\r\ncomposer.phar方式安装(测试通过)\r\n进入/www 目录(与虚拟主机相对应)\r\nvim /usr/local/php/etc/php.ini\r\n修改 extension=php_openssl.php\r\n\r\n1、下载composer.phar curl -sS https://getcomposer.org/installer | /usr/local/php/bin/php\r\n\r\n2、移动文件到/usr/bin，命名去掉.phar mv composer.phar /usr/bin/composer\r\n\r\n3、创建test应用 composer create-project laravel/laravel test --prefer-dist\r\n\r\n4、授权存储session等 chmod -R 757 blog/app/storage\r\n\r\nls ls /www/test/', 1434794395, 338, 0, 0, 0),
(43, 1, '关键字', NULL, 'Uploads/2015-06-20/558558420341b.png', '', 1434802241, 339, 0, 0, 0),
(44, 1, '用户及用户组', NULL, 'Uploads/2015-06-21/55861b5fc9a5f.png', '', 1434852191, 338, 0, 0, 0),
(45, 1, 'lnmp 配置虚拟主机', NULL, '', 'win 中进入 C:\\Windows\\System32\\drivers\\etc\\hosts 添加\r\n192.168.80.18 www.tshop.com\r\n在浏览器中输入 www.tshop.com\r\n\r\n进入linux 中\r\nls /usr/local/nginx/conf\r\n可以查看niginx 的配置文件\r\n/usr/local/nginx/conf/nginx.conf\r\n/usr/local/nginx/conf/nginx.conf.default\r\n\r\nmkdir /www/tshop\r\nvim /www/tshop/index.html\r\nwelcome to tp\r\n./vhost.sh\r\nwww.tshop.com\r\n/www/tshop\r\nn 不重写\r\ny 记录日志\r\nvim /usr/local/nginx/conf/vhost/www.tshop.com.conf\r\n再次在浏览器中访问\r\nwww.tshop.com\r\nwelcome to tp\r\n\r\nwww.shop.com www.lshop.com 配置同上', 1434855647, 338, 0, 0, 0),
(46, 1, 'samba', NULL, 'Uploads/2015-06-21/558672f407669.xmind', '', 1434874611, 338, 0, 0, 0),
(47, 1, 'samba', NULL, 'Uploads/2015-06-21/5586731c26f79.png', '', 1434874651, 338, 0, 0, 0),
(48, 1, '多态', NULL, 'Uploads/2015-06-24/558a0d6418ec4.png', '', 1435110756, 339, 0, 0, 0),
(49, 1, '魔术方法总结', NULL, 'Uploads/2015-06-24/558a0ee22ce81.xmind', '', 1435111138, 339, 0, 0, 0),
(50, 1, '魔术方法', NULL, 'Uploads/2015-06-24/558a0f4df2b38.png', '', 1435111245, 339, 0, 0, 0),
(51, 1, '类总结', NULL, 'Uploads/2015-06-24/558a1bbf7d519.png', '', 1435114431, 339, 0, 0, 0),
(52, 1, '异常', NULL, 'Uploads/2015-06-24/558aadaf2ac32.png', '', 1435151790, 339, 0, 0, 0),
(53, 1, '目录结构', NULL, 'Uploads/2015-06-25/558b76f246efa.png', '', 1435203314, 341, 0, 0, 0),
(54, 1, '目录结构', NULL, 'Uploads/2015-06-25/558b77172c5a0.png', '', 1435203351, 342, 0, 0, 0),
(55, 1, '后台首页', NULL, 'Uploads/2015-06-25/558b7766c7073.png', '', 1435203430, 341, 0, 0, 0),
(56, 1, '后台首页', NULL, 'Uploads/2015-06-25/558b77806a9cc.png', '', 1435203456, 342, 0, 0, 0),
(57, 1, '权限', NULL, 'Uploads/2015-06-25/558b78154794e.png', '', 1435203605, 342, 0, 0, 0),
(58, 1, '角色', NULL, 'Uploads/2015-06-25/558b785434edd.png', '', 1435203668, 342, 0, 0, 0),
(59, 1, '管理员', NULL, 'Uploads/2015-06-25/558b789a9ee4a.png', '', 1435203738, 342, 0, 0, 0),
(60, 1, '注入', NULL, 'Uploads/2015-06-25/558bdccc2dbe3.png', '', 1435229388, 339, 0, 0, 0),
(61, 1, 'mysql 连接', NULL, 'Uploads/2015-06-25/558bff35e8ba5.png', '', 1435238197, 339, 0, 0, 0),
(62, 1, '文件操作', NULL, 'Uploads/2015-06-26/558cb637586bf.png', '', 1435285047, 336, 0, 0, 0),
(63, 1, 'koala 的使用', NULL, '', '打开koala \r\n\r\n将要写的项目拖到koala 中\r\n\r\n在项目中创建index.less index.html index.css\r\n\r\n使用编辑器编辑index.less 文件\r\n@color:red; // 定义变量\r\n\r\n.demo{\r\n	width:100px;\r\n	height:100px;\r\n	background-color:@color;\r\n}\r\n\r\n在koala 点compile\r\n\r\n在浏览器中测试', 1435386063, 330, 0, 0, 0),
(64, 1, '命名空间', NULL, 'Uploads/2015-06-27/558e563e18194.png', '', 1435391549, 339, 0, 0, 0),
(65, 1, '形状的实现', NULL, 'Uploads/2015-06-29/559091073b3bf.png', '', 1435537671, 332, 0, 0, 0),
(66, 1, 'js 基础', NULL, 'Uploads/2015-06-30/5591ec11c4e00.png', '', 1435626513, 343, 0, 0, 0),
(67, 1, '互联网', NULL, 'Uploads/2015-06-30/5591ee1587794.png', '', 1435627029, 344, 0, 0, 0),
(68, 1, 'js 对象', NULL, 'Uploads/2015-06-30/559290b4618c9.png', '', 1435668659, 343, 0, 0, 0),
(69, 1, '函数', NULL, 'Uploads/2015-07-01/559344b87c20b.png', '', 1435714744, 343, 0, 0, 0),
(70, 1, '内置对象', NULL, 'Uploads/2015-07-01/5593f6ece1876.png', '', 1435760364, 343, 0, 0, 0),
(71, 1, 'php 基础', NULL, 'Uploads/2015-07-02/5594a5afb7293.png', '', 1435805103, 333, 0, 0, 0),
(72, 1, '事件', NULL, 'Uploads/2015-07-03/5595ddf3853e3.png', '', 1435885043, 343, 0, 0, 0),
(73, 1, 'apache 配置', NULL, 'Uploads/2015-07-03/5595f86029443.png', '', 1435891808, 338, 0, 0, 0),
(74, 1, '移动特效', NULL, '', '.admin-error{\r\n	width:300px;\r\n	margin:0px auto; \r\n	text-align:center;\r\n	position: relative;\r\n	font-size: 20px;\r\n	text-shadow: 0 0 20px #ccc;\r\n	left: 0;\r\n	top: -100px;\r\n	color: #fff;\r\n	-webkit-animation:posit 2s ease-out;\r\n	animation:posit 2s ease-out;\r\n}\r\n@-webkit-keyframes posit{\r\n	0%{opacity:0; left: 0; top:-100px;}\r\n	30%{opacity:0.3; left: 0; top:-80px;}\r\n	50%{opacity:0.7; left: 0; top:-50px;}\r\n	70%{opacity:0.7; left: 0; top:-20px;}\r\n	100%{opacity:1; left: 0; top:-0px;}\r\n}\r\n.error-text{\r\n	height: 20px;\r\n	font-weight: bold;\r\n	color: #f00;\r\n	margin-left: 10px;\r\n	overflow: hidden;\r\n	-webkit-animation:margin 2s ease-out;\r\n	animation:margin 2s ease-out;\r\n}\r\n@-webkit-keyframes margin{\r\n	0%{opacity:0; margin-left: 40px; }\r\n	30%{opacity:0.3; margin-left: 30px; }\r\n	70%{opacity:0.7; margin-left: 20px; }\r\n	100%{opacity:1; margin-left: 10px; }\r\n}', 1435991710, 332, 0, 0, 0),
(75, 1, '事件二', NULL, 'Uploads/2015-07-04/559787f7ed88c.png', '', 1435994103, 343, 0, 0, 0),
(76, 1, '特效', NULL, 'Uploads/2015-07-05/55989d6da84c8.png', '', 1436065133, 343, 0, 0, 0),
(77, 1, '特效二', NULL, 'Uploads/2015-07-05/55989d80a1290.png', '', 1436065152, 343, 0, 0, 0),
(78, 1, 'php', NULL, 'Uploads/2015-07-06/5599f7bde77a9.png', '', 1436153789, 333, 0, 0, 0),
(79, 1, 'BOM', NULL, 'Uploads/2015-07-06/559a7ac183ba8.png', '', 1436187329, 343, 0, 0, 0),
(80, 1, '正则', NULL, 'Uploads/2015-07-08/559c704bdaef6.png', '', 1436315723, 333, 0, 0, 0),
(81, 1, 'php 时间', NULL, 'Uploads/2015-07-08/559c707d21518.png', '', 1436315772, 334, 0, 0, 0),
(82, 1, 'DOM', NULL, 'Uploads/2015-07-08/559c70e4035e0.png', '', 1436315875, 343, 0, 0, 0),
(83, 1, 'gd', NULL, 'Uploads/2015-07-08/559c9ca9074c0.png', '', 1436327080, 335, 0, 0, 0),
(84, 1, 'php 文件', NULL, 'Uploads/2015-07-10/559f134f14ed0.png', '', 1436488526, 336, 0, 0, 0),
(85, 1, '文件上传', NULL, 'Uploads/2015-07-10/559f141d0e223.png', '', 1436488732, 336, 0, 0, 0),
(86, 1, '节点', NULL, 'Uploads/2015-07-10/559f15e4b638c.png', '', 1436489188, 343, 0, 0, 0),
(87, 1, 'ajax', NULL, 'Uploads/2015-07-10/559f1655c21c9.png', '', 1436489301, 343, 0, 0, 0),
(88, 1, 'jquery', NULL, 'Uploads/2015-07-13/55a30a5254a2e.png', '', 1436748370, 343, 0, 0, 0),
(89, 1, 'jquery', NULL, 'Uploads/2015-07-14/55a45f7bac733.png', '', 1436835706, 343, 0, 0, 0),
(90, 1, 'jquery', NULL, 'Uploads/2015-07-14/55a480d314908.png', '', 1436844242, 343, 0, 0, 0),
(91, 1, 'js总结', NULL, 'Uploads/2015-07-15/55a5b9545dcef.png', '', 1436924244, 343, 0, 0, 0),
(92, 1, 'js总结', NULL, 'Uploads/2015-07-15/55a5bacb567fe.png', '', 1436924619, 343, 0, 0, 0),
(93, 1, 'smarty', NULL, 'Uploads/2015-07-16/55a70b9613b8f.png', '', 1437010837, 342, 0, 0, 0),
(94, 1, 'smarty', NULL, 'Uploads/2015-07-17/55a86f7220b77.png', '', 1437101937, 333, 0, 0, 0),
(95, 1, 'memcache', NULL, 'Uploads/2015-07-20/55ac5a64501e4.png', '', 1437358690, 333, 0, 0, 0),
(96, 1, 'session', NULL, 'Uploads/2015-07-20/55acff2e98570.png', '', 1437400878, 333, 0, 0, 0);
INSERT INTO `shop_article` (`id`, `uid`, `title`, `summary`, `img`, `content`, `addtime`, `pid`, `recommend`, `allow`, `views`) VALUES
(97, 1, 'css预定样式', NULL, '', '/* 初始化样式 */\r\nbody,ul,li,p,h1,h2,h3,h4{\r\n	padding: 0;\r\n	margin: 0\r\n}\r\nbody{\r\n	font-size: 12px;\r\n}\r\nul,li{\r\n	list-style: none;\r\n}\r\na{\r\n	text-decoration: none;\r\n}\r\nimg,input{\r\n	border: none;\r\n	outline: none;\r\n}\r\n\r\n/* 预定义样式 */\r\n.fl{\r\n	float: left;\r\n}\r\n.fr{\r\n	float: right;\r\n}\r\n.clear{\r\n	clear: both;\r\n}\r\n.w{\r\n	margin: 0 auto;\r\n	width: 1200px;\r\n}\r\n.mt10{\r\n	margin-top: 10px;\r\n}\r\n.mt20{\r\n	margin-top: 20px;\r\n}\r\n/* 没有数据时显示样式 */\r\n.no-data{\r\n	padding:8px;\r\n	color: red;\r\n	font-size: 16px;\r\n	font-weight: bold;\r\n	display: inline-block;\r\n}\r\n/* 分布显示样式 */\r\n.page{\r\n	height: 39px;\r\n	line-height: 39px;\r\n	margin-right: 12px;\r\n	color: #f00;\r\n	font-size: 16px;\r\n	font-weight: bold;\r\n}\r\n.page em{\r\n	font-style: normal;\r\n	margin: 0 5px;\r\n	color: #f90;\r\n}\r\n.admin-success{\r\n	width:300px;\r\n	margin:0px auto; \r\n	text-align:center;\r\n	position: relative;\r\n	font-size: 20px;\r\n	text-shadow: 0 0 20px #f00;\r\n	left: 0;\r\n	top: -50px;\r\n	color: #f90;\r\n	-webkit-animation:posit 2s ease-out;\r\n	animation:posit 2s ease-out;\r\n}\r\n@-webkit-keyframes posit{\r\n	0%{opacity:0; left: 0; top:-100px;}\r\n	30%{opacity:0.3; left: 0; top:-80px;}\r\n	50%{opacity:0.7; left: 0; top:-50px;}\r\n	70%{opacity:0.7; left: 0; top:-20px;}\r\n	100%{opacity:1; left: 0; top:-0px;}\r\n}', 1437790438, 330, 0, 0, 0),
(98, 1, '判断selected', NULL, '', '&lt;select name=&#039;cid&#039; id=&#039;log-cid&#039;&gt;\r\n    &lt;foreach name=&#039;list&#039; item=&#039;v&#039;&gt;\r\n    &lt;option value=&quot;{$v.id}&quot; &lt;if condition=&quot;$info[cid] eq $v[id]&quot;&gt;selected&lt;/if&gt;&gt;{$v.name}&lt;/option&gt;\r\n    &lt;/foreach&gt;\r\n&lt;/select&gt;\r\n&lt;select name=&#039;auth&#039; id=&#039;log-auth&#039;&gt;\r\n    &lt;option value=&quot;0&quot; &lt;if condition=&quot;$info[auth] eq 0&quot;&gt;selected&lt;/if&gt;&gt;公开&lt;/option&gt;\r\n    &lt;option value=&quot;1&quot; &lt;if condition=&quot;$info[auth] eq 1&quot;&gt;selected&lt;/if&gt;&gt;好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;2&quot; &lt;if condition=&quot;$info[auth] eq 2&quot;&gt;selected&lt;/if&gt;&gt;指定好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;3&quot; &lt;if condition=&quot;$info[auth] eq 3&quot;&gt;selected&lt;/if&gt;&gt;仅自己可见&lt;/option&gt;\r\n&lt;/select&gt;&lt;select name=&#039;cid&#039; id=&#039;log-cid&#039;&gt;\r\n    &lt;foreach name=&#039;list&#039; item=&#039;v&#039;&gt;\r\n    &lt;option value=&quot;{$v.id}&quot; &lt;if condition=&quot;$info[cid] eq $v[id]&quot;&gt;selected&lt;/if&gt;&gt;{$v.name}&lt;/option&gt;\r\n    &lt;/foreach&gt;\r\n&lt;/select&gt;\r\n&lt;select name=&#039;auth&#039; id=&#039;log-auth&#039;&gt;\r\n    &lt;option value=&quot;0&quot; &lt;if condition=&quot;$info[auth] eq 0&quot;&gt;selected&lt;/if&gt;&gt;公开&lt;/option&gt;\r\n    &lt;option value=&quot;1&quot; &lt;if condition=&quot;$info[auth] eq 1&quot;&gt;selected&lt;/if&gt;&gt;好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;2&quot; &lt;if condition=&quot;$info[auth] eq 2&quot;&gt;selected&lt;/if&gt;&gt;指定好友可见&lt;/option&gt;\r\n    &lt;option value=&quot;3&quot; &lt;if condition=&quot;$info[auth] eq 3&quot;&gt;selected&lt;/if&gt;&gt;仅自己可见&lt;/option&gt;\r\n&lt;/select&gt;', 1438591925, 342, 0, 0, 0);

-- --------------------------------------------------------

--
-- 表的结构 `shop_auth`
--

CREATE TABLE IF NOT EXISTS `shop_auth` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '名称',
  `pid` smallint(6) unsigned NOT NULL COMMENT '父id',
  `cont` varchar(32) NOT NULL DEFAULT '' COMMENT '控制器',
  `action` varchar(32) NOT NULL DEFAULT '' COMMENT '操作方法',
  `path` varchar(32) NOT NULL COMMENT '全路径',
  `level` tinyint(4) NOT NULL DEFAULT '0' COMMENT '级别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- 转存表中的数据 `shop_auth`
--

INSERT INTO `shop_auth` (`id`, `name`, `pid`, `cont`, `action`, `path`, `level`) VALUES
(1, '权限管理', 0, '', '', '1', 0),
(2, '权限列表', 1, 'Auth', 'showlist', '1-2', 1),
(3, '添加权限', 2, 'Auth', 'add', '1-2-3', 2),
(4, '角色列表', 1, 'Role', 'showlist', '1-4', 1),
(5, '添加角色', 4, 'Role', 'add', '1-4-5', 2),
(6, '分配权限', 4, 'Role', 'distribute', '1-4-6', 2),
(7, '管理员列表', 1, 'Manager', 'showlist', '1-7', 1),
(8, '管理员日志', 1, 'Log', 'showlist', '1-8', 1),
(9, '添加日志', 1, 'Log', 'add', '1-9', 1),
(10, '会员管理', 0, '', '', '10', 0),
(11, '商品管理', 0, '', '', '11', 0),
(12, '会员列表', 10, 'User', 'showlist', '10-12', 1),
(13, '添加会员', 10, 'User', 'add', '10-13', 1),
(14, '商品分类列表', 11, 'Cate', 'showlist', '11-14', 1),
(15, '添加分类', 14, 'Cate', 'add', '11-14-15', 1),
(16, '文章管理', 0, '', '', '16', 0),
(17, '文章列表', 16, 'Article', 'showlist', '16-17', 1),
(18, '添加文章', 16, 'Article', 'add', '16-18', 1);

-- --------------------------------------------------------

--
-- 表的结构 `shop_categorys`
--

CREATE TABLE IF NOT EXISTS `shop_categorys` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `catename` varchar(100) NOT NULL,
  `pid` int(11) NOT NULL DEFAULT '0',
  `path` varchar(255) NOT NULL DEFAULT '0,',
  `addtime` int(10) unsigned DEFAULT NULL,
  `flag` tinyint(1) NOT NULL DEFAULT '1',
  `cate` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=345 ;

--
-- 转存表中的数据 `shop_categorys`
--

INSERT INTO `shop_categorys` (`id`, `catename`, `pid`, `path`, `addtime`, `flag`, `cate`) VALUES
(1, '进口商品', 0, '0,', 1431922211, 2, 1),
(2, '生鲜', 0, '0,', 1431922273, 1, 1),
(3, '食品', 0, '0,', 1431922300, 1, 1),
(4, '饮料', 0, '0,', 1431922307, 1, 1),
(5, '酒', 0, '0,', 1431922316, 1, 1),
(6, '母婴', 0, '0,', 1431922322, 1, 1),
(7, '玩具', 0, '0,', 1431922328, 1, 1),
(8, '童装', 0, '0,', 1431922333, 1, 1),
(9, '家居', 0, '0,', 1431922361, 1, 1),
(10, '家庭清洗', 0, '0,', 1431922373, 1, 1),
(11, '纸品', 0, '0,', 1431922384, 1, 1),
(12, '美妆', 0, '0,', 1431922397, 1, 1),
(13, '个人护理', 0, '0,', 1431922405, 1, 1),
(14, '洗护', 0, '0,', 1431922414, 1, 1),
(15, '女装', 0, '0,', 1431922421, 1, 1),
(16, '内衣', 0, '0,', 1431922426, 1, 1),
(17, '上衣', 0, '0,', 1431922445, 1, 1),
(18, '鞋靴', 0, '0,', 1431922469, 1, 1),
(19, '箱包', 0, '0,', 1431922475, 1, 1),
(20, '腕表健身', 0, '0,', 1431922485, 1, 1),
(21, '男装', 0, '0,', 1431922491, 1, 1),
(22, '运动', 0, '0,', 1431922495, 1, 1),
(23, '户外健身', 0, '0,', 1431922530, 1, 1),
(24, '手机', 0, '0,', 1431922535, 1, 1),
(25, '数码', 0, '0,', 1431922539, 1, 1),
(26, '电脑办公', 0, '0,', 1431922546, 1, 1),
(27, '汽车', 0, '0,', 1431922566, 1, 1),
(28, '医药', 0, '0,', 1431922592, 1, 1),
(29, '小家电', 0, '0,', 1431922553, 1, 1),
(30, '大家电', 0, '0,', 1431922558, 1, 1),
(31, '礼品', 0, '0,', 1431922606, 1, 1),
(32, '保键滋补', 0, '0,', 1431922586, 1, 1),
(33, '成人', 0, '0,', 1431922598, 1, 1),
(34, '卡', 0, '0,', 1431922610, 1, 1),
(35, '旅游', 0, '0,', 1431922615, 1, 1),
(36, '充值', 0, '0,', 1431922620, 1, 1),
(37, '进口牛奶', 1, '0,1,', 1431929667, 1, 1),
(38, '进口酒', 1, '0,1,', 1431929796, 1, 1),
(39, '进口饮料', 1, '0,1,', 1431929880, 1, 1),
(40, '进口冲饮', 1, '0,1,', 1431929908, 1, 1),
(41, '进口水', 1, '0,1,', 1431929917, 1, 1),
(42, '进口饼干', 1, '0,1,', 1431929936, 1, 1),
(43, '进口零食', 1, '0,1,', 1431929948, 1, 1),
(44, '进口果干坚果', 1, '0,1,', 1431993837, 1, 1),
(45, '进口咖啡茶叶', 1, '0,1,', 1431993850, 1, 1),
(46, '进口食用油', 1, '0,1,', 1431993870, 1, 1),
(47, '进口大米面食', 1, '0,1,', 1431993887, 1, 1),
(48, '进口方便速食', 1, '0,1,', 1431993897, 1, 1),
(49, '进口厨房调料', 1, '0,1,', 1431993916, 2, 1),
(50, '新鲜水果', 2, '0,2,', 1431994105, 1, 1),
(51, '新鲜蔬菜', 2, '0,2,', 1431994124, 1, 1),
(52, '海鲜', 2, '0,2,', 1431994166, 1, 1),
(53, '新鲜蛋糕', 2, '0,2,', 1431994176, 1, 1),
(54, '冰激淋', 2, '0,2,', 1431994188, 1, 1),
(55, '汤圆', 2, '0,2,', 1431994266, 1, 1),
(56, '水饺', 2, '0,2,', 1431994277, 1, 1),
(57, '牛肉', 2, '0,2,', 1431994282, 1, 1),
(58, '猪肉', 2, '0,2,', 1431994286, 1, 1),
(59, '羊肉', 2, '0,2,', 1431994291, 1, 1),
(60, '鸡', 2, '0,2,', 1431994296, 1, 1),
(61, '鸭', 2, '0,2,', 1431994304, 1, 1),
(62, '鸽', 2, '0,2,', 1431994326, 1, 1),
(63, '坚果', 3, '0,3,', 1431994514, 1, 1),
(64, '蜜饯', 3, '0,3,', 1431994519, 1, 1),
(65, '饼干', 3, '0,3,', 1431994527, 1, 1),
(66, '月饼', 3, '0,3,', 1431994530, 1, 1),
(67, '干货', 3, '0,3,', 1431994540, 1, 1),
(68, '杂粮', 3, '0,3,', 1431994544, 1, 1),
(69, '挂面', 3, '0,3,', 1431994549, 1, 1),
(70, '面粉', 3, '0,3,', 1431994554, 1, 1),
(71, '粽子', 3, '0,3,', 1431994558, 1, 1),
(72, '罐头', 3, '0,3,', 1431994570, 1, 1),
(73, '糖果', 3, '0,3,', 1431994575, 1, 1),
(74, '巧克力', 3, '0,3,', 1431994613, 1, 1),
(75, '火腿汤', 3, '0,3,', 1431994643, 1, 1),
(76, '脉动', 4, '0,4,', 1431994870, 1, 1),
(77, '光明', 4, '0,4,', 1431994873, 1, 1),
(78, '娃哈哈', 4, '0,4,', 1431994991, 1, 1),
(79, '农夫山泉', 4, '0,4,', 1431994903, 1, 1),
(80, '蒙牛', 4, '0,4,', 1431994924, 1, 1),
(81, '伊利', 4, '0,4,', 1431994929, 1, 1),
(82, '加多宝', 4, '0,4,', 1431994934, 1, 1),
(83, '王老吉', 4, '0,4,', 1431994942, 1, 1),
(84, '雀巢', 4, '0,4,', 1431994959, 1, 1),
(85, '红牛', 4, '0,4,', 1431994963, 1, 1),
(86, '百事可乐', 4, '0,4,', 1431994968, 1, 1),
(87, '汇源', 4, '0,4,', 1431994974, 1, 1),
(88, '统一', 4, '0,4,', 1431994976, 1, 1),
(89, '五粮液', 5, '0,5,', 1431994979, 1, 1),
(90, '茅台', 5, '0,5,', 1431994985, 1, 1),
(91, '泸州老窖', 5, '0,5,', 1431994987, 1, 1),
(92, '剑南春', 5, '0,5,', 1431994989, 1, 1),
(93, '汾酒', 5, '0,5,', 1431994999, 1, 1),
(94, '洋河', 5, '0,5,', 1431995005, 1, 1),
(95, '牛栏山', 5, '0,5,', 1431995015, 1, 1),
(96, '青岛', 5, '0,5,', 1431995025, 1, 1),
(97, '四特', 5, '0,5,', 1431995035, 1, 1),
(98, '白云边', 5, '0,5,', 1431995045, 1, 1),
(99, '老白干', 5, '0,5,', 1431995055, 1, 1),
(100, '雪花', 5, '0,5,', 1431995065, 1, 1),
(101, '燕京', 5, '0,5,', 1431995075, 1, 1),
(103, '哺乳枕', 6, '0,6,', 1431995809, 1, 1),
(104, '托腹带', 6, '0,6,', 1431995830, 1, 1),
(105, '母乳袋', 6, '0,6,', 1431995853, 1, 1),
(106, '牛补乳', 6, '0,6,', 1431995870, 1, 1),
(107, '益生菌', 6, '0,6,', 1431995879, 1, 1),
(108, '奶嘴', 6, '0,6,', 1431995884, 1, 1),
(109, '学步车', 6, '0,6,', 1431995888, 1, 1),
(110, '爽身', 6, '0,6,', 1431995893, 1, 1),
(111, '积木', 6, '0,6,', 1431995896, 1, 1),
(112, '模型', 6, '0,6,', 1431995899, 1, 1),
(113, '魔方', 6, '0,6,', 1431995902, 1, 1),
(114, '婴儿枕', 6, '0,6,', 1431995926, 1, 1),
(115, '尿垫', 6, '0,6,', 1431995954, 1, 1),
(116, '乐高', 7, '0,7,', 1431996144, 1, 1),
(117, '芭比', 7, '0,7,', 1431996148, 1, 1),
(118, '好孩子', 7, '0,7,', 1431996192, 1, 1),
(119, '友邦', 7, '0,7,', 1431996195, 1, 1),
(120, '勾勾手', 7, '0,7,', 1431996203, 1, 1),
(121, '奇点', 7, '0,7,', 1431996211, 1, 1),
(122, '小盆友', 7, '0,7,', 1431996219, 1, 1),
(123, '开丽', 7, '0,7,', 1431996221, 1, 1),
(124, '大圣', 7, '0,7,', 1431996229, 1, 1),
(125, '开心宝贝', 7, '0,7,', 1431996236, 1, 1),
(126, '简家', 7, '0,7,', 1431996242, 1, 1),
(127, '闪闪', 7, '0,7,', 1431996246, 1, 1),
(128, '爱松', 7, '0,7,', 1431996272, 1, 1),
(129, '巴拉巴拉', 8, '0,8,', 1431996454, 1, 1),
(130, '巴布豆', 8, '0,8,', 1431996464, 1, 1),
(131, '迪士尼', 8, '0,8,', 1431996479, 1, 1),
(132, '南极人', 8, '0,8,', 1431996489, 1, 1),
(133, '英格里奥', 8, '0,8,', 1431996509, 1, 1),
(134, '笛莎', 8, '0,8,', 1431996516, 1, 1),
(135, 'uovo', 8, '0,8,', 1431996528, 1, 1),
(136, '大涩会', 8, '0,8,', 1431996535, 1, 1),
(137, '哈比熊', 8, '0,8,', 1431996542, 1, 1),
(138, '迷蒙兔', 8, '0,8,', 1431996549, 1, 1),
(139, '季季乐', 8, '0,8,', 1431996557, 1, 1),
(140, '爱乐贝兜', 8, '0,8,', 1431996563, 1, 1),
(141, '三枪', 8, '0,8,', 1431996599, 1, 1),
(142, '被子', 9, '0,9,', 1431997053, 1, 1),
(143, '枕头', 9, '0,9,', 1431997060, 1, 1),
(144, '凉席', 9, '0,9,', 1431997063, 1, 1),
(145, '蚊帐', 9, '0,9,', 1431997073, 1, 1),
(146, '毛巾', 9, '0,9,', 1431997093, 1, 1),
(147, '居家拖鞋', 9, '0,9,', 1431997102, 1, 1),
(148, '靠垫坐垫', 9, '0,9,', 1431997110, 1, 1),
(149, '地毯地垫', 9, '0,9,', 1431997121, 1, 1),
(150, '沙发垫', 9, '0,9,', 1431997129, 1, 1),
(151, '十刺绣', 9, '0,9,', 1431997151, 1, 1),
(152, '装饰画', 9, '0,9,', 1431997180, 1, 1),
(153, '花瓶', 9, '0,9,', 1431997187, 1, 1),
(154, '墙纸', 9, '0,9,', 1431997206, 1, 1),
(155, '消毒液', 10, '0,10,', 1431997408, 1, 1),
(156, '洗洁精', 10, '0,10,', 1431997416, 1, 1),
(157, '油污净', 10, '0,10,', 1431997422, 1, 1),
(158, '洁厕剂', 10, '0,10,', 1431997427, 1, 1),
(159, '浴室清洁', 10, '0,10,', 1431997433, 1, 1),
(160, '管道疏通', 10, '0,10,', 1431997439, 1, 1),
(161, '玻璃清洁剂', 10, '0,10,', 1431997449, 1, 1),
(162, '家电清洁剂', 10, '0,10,', 1431997461, 1, 1),
(163, '多用途清洁剂', 10, '0,10,', 1431997473, 1, 1),
(164, '进口清洁剂', 10, '0,10,', 1431997478, 1, 1),
(165, '水垢清洁剂', 10, '0,10,', 1431997505, 1, 1),
(166, '家私清洁护理', 10, '0,10,', 1431997512, 1, 1),
(167, '地板清洁护理', 10, '0,10,', 1431997519, 1, 1),
(168, '软包抽纸', 11, '0,11,', 1432290364, 1, 1),
(169, '卷筒纸', 11, '0,11,', 1432290393, 1, 1),
(170, '手帕纸', 11, '0,11,', 1432290409, 1, 1),
(171, '平板卫生纸', 11, '0,11,', 1432290430, 1, 1),
(172, '厨房用纸', 11, '0,11,', 1432290439, 1, 1),
(173, '湿巾纸', 11, '0,11,', 1432290450, 1, 1),
(174, '商务卫生纸', 11, '0,11,', 1432291235, 1, 1),
(175, '印花连衣裙', 15, '0,15,', 1432291328, 1, 1),
(176, '雪纺衫', 15, '0,15,', 1432291340, 1, 1),
(177, '棉T恤', 15, '0,15,', 1432291353, 1, 1),
(178, '外套', 15, '0,15,', 1432291359, 1, 1),
(179, '九分裤', 15, '0,15,', 1432291365, 1, 1),
(180, '半裙', 15, '0,15,', 1432291438, 1, 1),
(181, '女装馆精品全集', 15, '0,15,', 1432291454, 1, 1),
(182, '睡衣套装', 16, '0,16,', 1432291475, 1, 1),
(183, '全棉睡衣', 16, '0,16,', 1432291662, 1, 1),
(184, '情侣睡衣', 16, '0,16,', 1432291667, 1, 1),
(185, '连裤袜', 16, '0,16,', 1432291682, 1, 1),
(186, '短袜', 16, '0,16,', 1432291688, 1, 1),
(187, '棉裤', 16, '0,16,', 1432291696, 1, 1),
(188, '背心', 16, '0,16,', 1432291700, 1, 1),
(189, '丝巾', 16, '0,16,', 1432291714, 1, 1),
(190, '粉底', 12, '0,12,', 1432292232, 1, 1),
(191, '睫毛膏', 12, '0,12,', 1432292245, 1, 1),
(192, '美甲', 12, '0,12,', 1432292252, 1, 1),
(193, '美容工具', 12, '0,12,', 1432292262, 1, 1),
(194, '男香水', 12, '0,12,', 1432292267, 1, 1),
(195, '女士香水', 12, '0,12,', 1432292284, 1, 1),
(196, '面膜', 13, '0,13,', 1432292315, 1, 1),
(197, '洁面', 13, '0,13,', 1432292317, 1, 1),
(198, '美白', 13, '0,13,', 1432292322, 1, 1),
(199, '面霜', 13, '0,13,', 1432292326, 1, 1),
(200, '护垫', 13, '0,13,', 1432292340, 1, 1),
(201, '日用', 13, '0,13,', 1432292344, 1, 1),
(202, '沐浴露', 14, '0,14,', 1432292373, 1, 1),
(203, '沐浴套装', 14, '0,14,', 1432292380, 1, 1),
(204, '香皂', 14, '0,14,', 1432292389, 1, 1),
(205, '花露水', 14, '0,14,', 1432292398, 1, 1),
(206, '牙刷', 14, '0,14,', 1432292406, 1, 1),
(207, '牙线', 14, '0,14,', 1432292410, 1, 1),
(208, '衬衫', 17, '0,17,', 1432292509, 1, 1),
(209, '外套', 17, '0,17,', 1432292515, 1, 1),
(210, '小西装', 17, '0,17,', 1432292519, 1, 1),
(211, '情侣T恤', 17, '0,17,', 1432292538, 1, 1),
(212, '运动服', 17, '0,17,', 1432292547, 1, 1),
(213, '针织开衫', 17, '0,17,', 1432292552, 1, 1),
(214, '板鞋', 18, '0,18,', 1432292597, 1, 1),
(215, '帆布鞋', 18, '0,18,', 1432292612, 1, 1),
(216, '凉鞋', 18, '0,18,', 1432292621, 1, 1),
(217, '人字拖', 18, '0,18,', 1432292626, 1, 1),
(218, '懒人鞋', 18, '0,18,', 1432292638, 1, 1),
(219, '皮鞋', 18, '0,18,', 1432292655, 1, 1),
(220, '单肩包', 19, '0,19,', 1432292714, 1, 1),
(221, '公文包', 19, '0,19,', 1432292719, 1, 1),
(222, '帆布男包', 19, '0,19,', 1432292728, 1, 1),
(223, '手拿包', 19, '0,19,', 1432292736, 1, 1),
(224, '腰包', 19, '0,19,', 1432292744, 1, 1),
(225, '斜挎包', 19, '0,19,', 1432292767, 1, 1),
(227, '男表', 20, '0,20,', 1432294641, 1, 1),
(228, '女表', 20, '0,20,', 1432294647, 1, 1),
(229, '情侣表', 20, '0,20,', 1432294652, 1, 1),
(230, '儿童表', 20, '0,20,', 1432294657, 1, 1),
(231, '瑞士表', 20, '0,20,', 1432294663, 1, 1),
(232, '机械表', 20, '0,20,', 1432294668, 1, 1),
(233, '石英表', 20, '0,20,', 1432294674, 1, 1),
(234, '短袖', 21, '0,21,', 1432294701, 1, 1),
(235, '背心', 21, '0,21,', 1432294707, 1, 1),
(236, '格子衬衫', 21, '0,21,', 1432294715, 1, 1),
(237, '商务衬衫', 21, '0,21,', 1432294721, 1, 1),
(238, '休闲裤', 21, '0,21,', 1432294730, 1, 1),
(239, '牛仔裤', 21, '0,21,', 1432294735, 1, 1),
(240, '跑步鞋', 22, '0,22,', 1432294766, 1, 1),
(241, '运动裤', 22, '0,22,', 1432294775, 1, 1),
(242, '运动套装', 22, '0,22,', 1432294780, 1, 1),
(243, '护具', 22, '0,22,', 1432294784, 1, 1),
(244, '运动包', 22, '0,22,', 1432294788, 1, 1),
(245, '运动T恤', 22, '0,22,', 1432294804, 1, 1),
(246, '军迷用品', 23, '0,23,', 1432294969, 1, 1),
(247, '烧烤', 23, '0,23,', 1432294972, 1, 1),
(248, '帐篷', 23, '0,23,', 1432294979, 1, 1),
(249, '户外背包', 23, '0,23,', 1432294985, 1, 1),
(250, '徙步鞋', 23, '0,23,', 1432294994, 1, 1),
(251, '户外休闲鞋', 23, '0,23,', 1432295004, 1, 1),
(252, '小米', 24, '0,24,', 1432295064, 1, 1),
(253, '苹果', 24, '0,24,', 1432295069, 1, 1),
(254, '三星', 24, '0,24,', 1432295073, 1, 1),
(255, '华为', 24, '0,24,', 1432295079, 1, 1),
(256, '联想', 24, '0,24,', 1432295086, 1, 1),
(257, '魅族', 24, '0,24,', 1432295096, 1, 1),
(258, '单反', 25, '0,25,', 1432295138, 1, 1),
(259, '智能穿戴', 25, '0,25,', 1432295146, 1, 1),
(260, '智能家居', 25, '0,25,', 1432295153, 1, 1),
(261, '智能播放器', 25, '0,25,', 1432295159, 1, 1),
(262, '镜头', 25, '0,25,', 1432295163, 1, 1),
(263, '微单', 25, '0,25,', 1432295171, 1, 1),
(264, '笔记本', 26, '0,26,', 1432295211, 1, 1),
(265, '平板', 26, '0,26,', 1432295213, 1, 1),
(266, '台式机', 26, '0,26,', 1432295218, 1, 1),
(267, '一体机', 26, '0,26,', 1432295221, 1, 1),
(268, '文具', 26, '0,26,', 1432295224, 1, 1),
(269, '扫描', 26, '0,26,', 1432295227, 1, 1),
(270, '行车记录仪', 27, '0,27,', 1432295304, 1, 1),
(271, '加油卡', 27, '0,27,', 1432295307, 1, 1),
(272, '净化器', 27, '0,27,', 1432295312, 1, 1),
(273, '内饰', 27, '0,27,', 1432295329, 1, 1),
(274, '配饰', 27, '0,27,', 1432295337, 1, 1),
(275, '轮胎', 27, '0,27,', 1432295341, 1, 1),
(276, '补血', 28, '0,28,', 1432295382, 1, 1),
(277, '维生素', 28, '0,28,', 1432295387, 1, 1),
(278, '便秘', 28, '0,28,', 1432295390, 1, 1),
(279, '减肥瘦身', 28, '0,28,', 1432295400, 1, 1),
(280, '咽炎', 28, '0,28,', 1432295405, 1, 1),
(281, '补肾', 28, '0,28,', 1432295406, 1, 1),
(282, '豆浆机', 29, '0,29,', 1432295452, 1, 1),
(283, '电钣煲', 29, '0,29,', 1432295472, 1, 1),
(284, '电火锅', 29, '0,29,', 1432295477, 1, 1),
(285, '电水壶', 29, '0,29,', 1432295482, 1, 1),
(286, '养生壶', 29, '0,29,', 1432295491, 1, 1),
(287, '电磁炉', 29, '0,29,', 1432295504, 1, 1),
(288, '平板电视', 30, '0,30,', 1432295567, 1, 1),
(289, '洗衣机', 30, '0,30,', 1432295573, 1, 1),
(290, '冰箱', 30, '0,30,', 1432295577, 1, 1),
(291, '空调', 30, '0,30,', 1432295580, 1, 1),
(292, '酒柜', 30, '0,30,', 1432295586, 1, 1),
(293, '冷柜', 30, '0,30,', 1432295589, 1, 1),
(294, '摆挂件', 31, '0,31,', 1432295616, 1, 1),
(295, '孩子', 31, '0,31,', 1432295621, 1, 1),
(296, '长辈', 31, '0,31,', 1432295626, 1, 1),
(297, '玩具', 31, '0,31,', 1432295630, 1, 1),
(298, '女士', 31, '0,31,', 1432295634, 1, 1),
(299, '男士', 31, '0,31,', 1432295637, 1, 1),
(300, '阿胶', 32, '0,32,', 1432295679, 1, 1),
(301, '燕窝', 32, '0,32,', 1432295702, 1, 1),
(302, '参类', 32, '0,32,', 1432295709, 1, 1),
(303, '灵芝', 32, '0,32,', 1432295717, 1, 1),
(304, '冬虫夏草', 32, '0,32,', 1432295733, 1, 1),
(305, '鹿茸', 32, '0,32,', 1432295742, 1, 1),
(306, '男用', 33, '0,33,', 1432295768, 1, 1),
(307, '女用', 33, '0,33,', 1432295772, 1, 1),
(308, '内衣', 33, '0,33,', 1432295776, 1, 1),
(309, '经典礼品卡', 34, '0,34,', 1432295820, 1, 1),
(310, '电子礼品卡', 34, '0,34,', 1432295828, 1, 1),
(311, '端午礼品卡', 34, '0,34,', 1432295854, 1, 1),
(312, '生日礼品卡', 34, '0,34,', 1432295860, 1, 1),
(313, '感谢礼品卡', 34, '0,34,', 1432295867, 1, 1),
(314, '浓情礼品卡', 34, '0,34,', 1432295880, 1, 1),
(315, '中秋礼品卡', 34, '0,34,', 1432295890, 1, 1),
(316, '上海旅游', 35, '0,35,', 1432295949, 1, 1),
(317, '浙江旅游', 35, '0,35,', 1432295963, 1, 1),
(318, '江苏旅游', 35, '0,35,', 1432295970, 1, 1),
(319, '安徽旅游', 35, '0,35,', 1432295977, 1, 1),
(320, '北京旅游', 35, '0,35,', 1432295983, 1, 1),
(321, '云南游泳', 35, '0,35,', 1432295988, 1, 1),
(322, '海南旅游', 35, '0,35,', 1432295995, 1, 1),
(323, '手机充值', 36, '0,36,', 1432296026, 1, 1),
(324, '购物券', 36, '0,36,', 1432296036, 1, 1),
(325, '生鲜券', 36, '0,36,', 1432296045, 1, 1),
(326, '面包甜品券', 36, '0,36,', 1432296053, 1, 1),
(327, '体验卡', 36, '0,36,', 1432296057, 1, 1),
(328, '软件技术', 0, '0,', 1433680120, 1, 2),
(329, 'html', 328, '0,328,', 1434078714, 1, 2),
(330, 'css', 328, '0,328,', 1434078781, 1, 2),
(331, 'div+css', 328, '0,328,', 1434078950, 1, 2),
(332, 'css3', 328, '0,328,', 1434079025, 1, 2),
(333, 'php基础', 328, '0,328,', 1434079431, 1, 2),
(334, 'php错误与时间', 328, '0,328,', 1434079459, 1, 2),
(335, 'gd库', 328, '0,328,', 1434079483, 1, 2),
(336, 'file', 328, '0,328,', 1434079506, 1, 2),
(337, 'mysql', 328, '0,328,', 1434079532, 1, 2),
(338, 'linux', 328, '0,328,', 1434458434, 1, 2),
(339, 'php面向对象', 328, '0,328,', 1434459053, 1, 2),
(340, '登录', 328, '0,328,', 1434466684, 1, 3),
(341, '无框架', 328, '0,328,', 1434501435, 1, 2),
(342, 'TP框架', 328, '0,328,', 1434501451, 1, 2),
(343, 'js', 328, '0,328,', 1435626351, 1, 2),
(344, '互联网', 328, '0,328,', 1435626934, 1, 2);

-- --------------------------------------------------------

--
-- 表的结构 `shop_log`
--

CREATE TABLE IF NOT EXISTS `shop_log` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `authid` int(11) NOT NULL,
  `author` varchar(30) NOT NULL,
  `title` varchar(30) NOT NULL,
  `content` text NOT NULL,
  `addtime` int(11) NOT NULL,
  `problem` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `shop_log`
--

INSERT INTO `shop_log` (`id`, `authid`, `author`, `title`, `content`, `addtime`, `problem`) VALUES
(1, 0, '', '', '测试文件', 1433665563, NULL);

-- --------------------------------------------------------

--
-- 表的结构 `shop_mg`
--

CREATE TABLE IF NOT EXISTS `shop_mg` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  `regtime` int(10) unsigned DEFAULT NULL,
  `logtime` int(10) unsigned DEFAULT NULL,
  `rid` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=44 ;

--
-- 转存表中的数据 `shop_mg`
--

INSERT INTO `shop_mg` (`id`, `username`, `password`, `regtime`, `logtime`, `rid`) VALUES
(1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 1433597683, 0, 0),
(2, 'apeng11', 'e10adc3949ba59abbe56e057f20f883e', 1433597683, 0, 1),
(4, 'apeng3', '123456', 1433643173, NULL, 0),
(5, 'add', 'd41d8cd98f00b204e9800998ecf8427e', NULL, NULL, 0),
(6, 'caopeng', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, 0),
(7, 'caopeng', 'e10adc3949ba59abbe56e057f20f883e', 1434542910, NULL, 0),
(8, 'caopeng', 'e10adc3949ba59abbe56e057f20f883e', NULL, NULL, 0),
(9, 'sss', '', 1434547622, NULL, 0),
(10, 'peng', 'md5(123456)', 0, 0, 0),
(11, 'apeng', 'md5(123456)', 0, 0, 0),
(12, 'apeng', 'md5(123456)', 0, 0, 0),
(13, 'apeng', 'md5(123456)', 0, 0, 0),
(14, 'apeng', 'md5(123456)', 0, 0, 0),
(17, 'apeng', '123456', 0, 0, 0),
(18, '小诸', '123456', NULL, NULL, 0),
(19, '小诸诸', '123456', NULL, NULL, 0),
(20, '好不好', '123456', NULL, NULL, 0),
(21, '不好', '123456', NULL, NULL, 0),
(22, '好', '123456', NULL, NULL, 0),
(23, '好', '123456', NULL, NULL, 0),
(24, '小诸', '123456', NULL, NULL, 0),
(25, '小猪', '123456', NULL, NULL, 0),
(26, '好不好', '123456', NULL, NULL, 0),
(27, 'apeng1', '123456', NULL, NULL, 0),
(28, 'apeng2', '123456', NULL, NULL, 0),
(29, 'apeng3', '123456', NULL, NULL, 0),
(30, 'apeng4', '123456', NULL, NULL, 0),
(37, '不好', '123456', NULL, NULL, 0),
(38, '好', '123456', NULL, NULL, 0),
(39, '好', '123456', NULL, NULL, 0),
(40, 'apeng1', '123456', NULL, NULL, 0),
(41, 'apeng2', '123456', NULL, NULL, 0),
(42, 'apeng3', '123456', NULL, NULL, 0),
(43, 'apeng4', '123456', NULL, NULL, 0);

-- --------------------------------------------------------

--
-- 表的结构 `shop_role`
--

CREATE TABLE IF NOT EXISTS `shop_role` (
  `id` smallint(6) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '角色名称',
  `auth_ids` varchar(128) NOT NULL DEFAULT '' COMMENT '权限ids 1,2,...',
  `auth_ac` text COMMENT '模块-操作',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `shop_role`
--

INSERT INTO `shop_role` (`id`, `name`, `auth_ids`, `auth_ac`) VALUES
(1, '经理', '1,2', 'Auth-showlist'),
(2, '主管', '2,4', 'Auth-showlist,Role-showlist'),
(3, '董事长', '1,2,3,4,5', 'Auth-showlist,Auth-add,Role-showlist,Role-add');

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin', '123456');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
