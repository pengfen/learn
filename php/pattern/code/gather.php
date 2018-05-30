<?php	
/**
  * 对于数据过大出现超时 Timeout
  * 编写代码
  * cmd
  * cd /d 文件路径
  * php gather.php
*/
    ini_set('memory_limit', '500M');
    set_time_limit(0);
    require_once substr(dirname(__FILE__), 0, -20).'Common/EmployeesFunction.php';
    require_once('email.class.php');

    /***********连接数据库************/
    $mysql = @require_once substr(dirname(__FILE__), 0, -26).'Common/Conf/config.php'; //引入数据配置文件
//    $config =  @require_once substr(dirname(__FILE__), 0, -26).'Admin/Conf/config.php'; //引入数据配置文件
//点金石数据库连接
    $mysql_server_name= $mysql['DB_XQSCRM']['DB_HOST'];                       //mysql数据库服务器
    $mysql_username= $mysql['DB_XQSCRM']['DB_USER'];                          //mysql数据库用户名
    $mysql_password= $mysql['DB_XQSCRM']['DB_PWD'];                           //mysql数据库密码
    $mysql_database= $mysql['DB_XQSCRM']['DB_NAME'];                          //mysql数据库名
    $conn105 = mysqli_connect($mysql_server_name,$mysql_username,$mysql_password,$mysql_database) or die("error connecting") ; //连接数据库
    mysqli_query($conn105,"set names utf8");    //数据库输出编码

if($mysql['CRM_NAME'] == 'TXYT'){ //天下易通CRM
    $crmName = '天下易通';
    $crmName_other = '百业成';
    //天下易通数据库连接
    $mysql_server_name= $mysql['DB_HOST'];                       //mysql数据库服务器
    $mysql_username= $mysql['DB_USER'];                          //mysql数据库用户名
    $mysql_password= $mysql['DB_PWD'];                           //mysql数据库密码
    $mysql_database= $mysql['DB_NAME'];                        //mysql数据库名
    $conn = mysqli_connect($mysql_server_name,$mysql_username,$mysql_password,$mysql_database) or die("error connecting") ; //连接数据库
    mysqli_query($conn,"set names utf8");    //数据库输出编码

    //百业成数据库连接
    $mysql_server_name= $mysql['DB_ZTCRM']['DB_HOST'];                       //mysql数据库服务器
    $mysql_username= $mysql['DB_ZTCRM']['DB_USER'];                          //mysql数据库用户名
    $mysql_password= $mysql['DB_ZTCRM']['DB_PWD'];                           //mysql数据库密码
    $mysql_database= $mysql['DB_ZTCRM']['DB_NAME'];                          //mysql数据库名
    $conn_other = mysqli_connect($mysql_server_name,$mysql_username,$mysql_password,$mysql_database) or die("error connecting") ; //连接数据库
    mysqli_query($conn_other,"set names utf8");    //数据库输出编码
}elseif($mysql['CRM_NAME'] == 'BYC' ){  //百业成CRM系统
    $crmName = '百业成';
    $crmName_other = '天下易通';
    //天下易通数据库连接
    $mysql_server_name= $mysql['DB_TXYTCRM']['DB_HOST'];                       //mysql数据库服务器
    $mysql_username= $mysql['DB_TXYTCRM']['DB_USER'];                          //mysql数据库用户名
    $mysql_password= $mysql['DB_TXYTCRM']['DB_PWD'];                           //mysql数据库密码
    $mysql_database= $mysql['DB_TXYTCRM']['DB_NAME'];                          //mysql数据库名
    $conn_other = mysqli_connect($mysql_server_name,$mysql_username,$mysql_password,$mysql_database) or die("error connecting") ; //连接数据库
    mysqli_query($conn_other,"set names utf8");    //数据库输出编码

//百业成数据库连接

    $mysql_server_name= $mysql['DB_HOST'];                       //mysql数据库服务器
    $mysql_username= $mysql['DB_USER'];                          //mysql数据库用户名
    $mysql_password= $mysql['DB_PWD'];                           //mysql数据库密码
    $mysql_database= $mysql['DB_NAME'];                     //mysql数据库名
    $conn = mysqli_connect($mysql_server_name,$mysql_username,$mysql_password,$mysql_database) or die("error connecting") ; //连接数据库
    mysqli_query($conn,"set names utf8");    //数据库输出编码
}
    //-----登录要提交的表单数据---------------

    $vars['username'] = $mysql['GATHER_USERNAME'];
	$vars['pwd'] = $mysql['GATHER_PASSWORD'];

	$username = $mysql['GATHER_USERNAME'];
	$password = $mysql['GATHER_PASSWORD'];

	$cookie = getAllCookie($username, $password);

	$cookie = explode('Set-Cookie:',$cookie);
	$num = 0;
	$cookieR2 = array();
	foreach ($cookie as $key => $value) {
	    if($num > 0)
	    {
	      $cookieR = explode(';',$value);
	      if(count($cookieR) > 1){
	        foreach ($cookieR as $key => $value) {
	          $cookieR1 = explode('=',$value);
	          $cookieR1[0] = trim($cookieR1[0]);
	          //var_dump($cookieR1[0]);
	          if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
	          {
	            $cookieR2[$cookieR1[0]] = $cookieR1[1];
	          }
	        }
	      }else{
	        $cookieR1 = explode('=',$cookieR);
	        if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
	          {
	            $cookieR2[$cookieR1[0]] = $cookieR1[1];
	          }
	      }
	      
	    }
	    $num++;
	}

	if(!empty($cookieR2))
	{
	  foreach ($cookieR2 as $k1 => $v1) {
	    setcookie($k1,$v1,time()+3600*365,'./cookie.txt','pp.d1jd.com');
	  }
	}

	// 获取时间
	$fromdate = getTime($conn);
	echo $fromdate;
	exit;
	$fromdate = ''; // 测试时不获取数据库的起始时间
	$todate = date('Y-m-d H:i:s', time());
	$todate = '2016-05-20 13:05:12'; // 测试二页数据
	// 根据时间拼接请求跳径
	$fetchUrl = 'http://pp.d1jd.com/member/my.php?mid=21&status=3&bda=&fromdate='.urlencode($fromdate).'&todate='.urlencode($todate).'&ip=&website=&fromkey=&title=';

	/**
	 * 通过设置cookie,获取302跳转之后的页面数据
	 * @var [type]
	 */
	$newCh = curl_init();
	curl_setopt($newCh, CURLOPT_URL,$fetchUrl);
	curl_setopt($newCh, CURLOPT_RETURNTRANSFER, 1);
	curl_setopt($newCh,CURLOPT_COOKIEFILE,'./cookie.txt');
	curl_setopt($newCh,  CURLOPT_FOLLOWLOCATION, 1);
	$pageData = curl_exec($newCh);
	curl_close($newCh);
	$pageData = iconv("gb2312", "UTF-8", $pageData); // 对内容进行处理

	$dataUrl = $mysql['GATHER_URL'];

	$flag = false;
	if ($pageData) {
		$total = getPageTotal($pageData); // 获取总页数
		if($total) {
			// 调用第三方接口处理第一页
			getHolderData($pageData, $dataUrl);
			$flag = true;
			$i = 2;
			while ($i <= $total) {
				$fetchUrl = 'http://pp.d1jd.com/member/my.php?mid=21&status=3&bda=&fromdate='.urlencode($fromdate).'&todate='.urlencode($todate).'&ip=&website=&fromkey=&title=&page='.$i;
				$i ++;
				$content = getData($fetchUrl);
				if ($pageData) {
					// 调用第三方接口
					getHolderData($content, $dataUrl);
				}
			}
		}
	}
	if ($flag == false) {
		echo '暂时未有数据更新';
	}

	/**
	 * 获取模拟表单提交后台的cookie数据
	 * @return [type] [description]
	 */
	function getAllCookie($username, $password){
		$post_data = array();
	    $post_data['username'] = $username;
	    $post_data['password'] = $password;
		$post_data['forward'] = "/";
		$post_data['submit'] = "submit";

		$url='http://pp.d1jd.com/member/login.php';
		$o="";
		foreach ($post_data as $k=>$v)
		{
		    $o.= "$k=".urlencode($v)."&";
		}
		$post_data=substr($o,0,-1);

		$referer='http://pp.d1jd.com/member/login.php';
		$header = array('Location'=>'http://pp.d1jd.com/member/my.php?mid=21&status=3');

		$ch = curl_init();
		curl_setopt($ch, CURLOPT_POST, 1);

		//伪造来源referer
		curl_setopt ($ch,CURLOPT_REFERER,$referer);

		curl_setopt($ch, CURLOPT_HEADER, $header);
		curl_setopt($ch, CURLOPT_URL,$url);
		//为了支持cookie
		curl_setopt($ch, CURLOPT_COOKIEJAR, 'cookie.txt');
		curl_setopt($ch, CURLOPT_POSTFIELDS, $post_data);

		ob_start();
		curl_exec($ch);
		$con = ob_get_contents();
		ob_clean();

		return $con;
	}

	/**
	 * 保存cookie
	*/
	function writeCookie($cookie) {
		$cookie = explode('Set-Cookie:',$cookie);
		$num = 0;
		$cookieR2 = array();
		foreach ($cookie as $key => $value) {
		    if($num > 0)
		    {
		        $cookieR = explode(';',$value);
		        if(count($cookieR) > 1){
		            foreach ($cookieR as $key => $value) {
		            $cookieR1 = explode('=',$value);
		            $cookieR1[0] = trim($cookieR1[0]);
		            //var_dump($cookieR1[0]);
		            if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
		            {
		                $cookieR2[$cookieR1[0]] = $cookieR1[1];
		            }
		        }
		    }else{
		        $cookieR1 = explode('=',$cookieR);
		        if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
		            {
		                $cookieR2[$cookieR1[0]] = $cookieR1[1];
		            }
		        }
		      
		    }
		    $num++;
		}

		if(!empty($cookieR2))
		{
		    foreach ($cookieR2 as $k1 => $v1) {
		        setcookie($k1,$v1,time()+3600*365,'./cookie.txt','pp.d1jd.com');
		    }
		}
	}

	/**
	  * 获取起始时间
	*/
	function getTime($conn){
		$info = mysqli_query($conn, "select val from zt_datainfo where attr='gather_time' limit 1");
		$row = mysqli_fetch_row($info);

		date_default_timezone_set('PRC'); 
		$time = date('Y-m-d H:i:s', time()); // 获取当前时间
		if ($row[0] == '') {
			$sql = "insert into zt_datainfo(attr, val) values('gather_time', '".$time."')";
			$result1 = mysqli_query($conn, $sql);
            unset($result1);
            return '';
		} else {
			$sql = "update zt_datainfo set val='{$time}' where attr='gather_time'";
			$result2 = mysqli_query($conn, "update zt_datainfo set val='{$time}' where attr='gather_time'");
			unset($result2);
			return $row[0];
		}
	}

	/**
	  * 通过设置cookie,获取302跳转之后的页面数据
	  * @var [type]
	*/
	function getData($fetchUrl){
		$newCh = curl_init();
		curl_setopt($newCh, CURLOPT_URL,$fetchUrl);
		curl_setopt($newCh, CURLOPT_RETURNTRANSFER, 1);
		curl_setopt($newCh,CURLOPT_COOKIEFILE,'./cookie.txt');
		curl_setopt($newCh,  CURLOPT_FOLLOWLOCATION, 1);
		$content = curl_exec($newCh);
		$content = iconv("gb2312", "UTF-8", $content); // 对内容进行处理
		curl_close($newCh);
		return $content;
	}

	/**
	  * 获取总页数
	*/
	function getPageTotal($content){
		$pattern = '/<cite>.*\/([0-9]+).*<\/cite>/ism';
		preg_match_all($pattern,$content,$matches);
		if(isset($matches[1]) && $matches[1]) {
			return $matches[1][0];
		}
		return '';
	}

	/**
	  * 处理数据
	*/
	function getHolderData($content, $dataUrl){
		$pattern = '/<td class=\"call_no\">(.*?)<\/td>/ism';
		preg_match_all($pattern,$content,$matches);
		$phone = $matches[1]; // 手机号
		
		$pattern = '/<td class=\"pagetitle\">(.*?)<\/td>/ism';
		preg_match_all($pattern,$content,$matches);
		$page = $matches[1]; // 关键字 页面标题

		$pattern = '/<td class=\"domain\">(.*?)<\/td>/ism';
		preg_match_all($pattern,$content,$matches);
		$url = $matches[1]; // 来路

		$pattern = '/<td class=\"addtime\">(.*?)<\/td>/ism';
		preg_match_all($pattern,$content,$matches);
		$datetime = $matches[1]; // 处理添加时间

		$pattern = '/<td class=\"iparea\">(.*?)<\/td>/ism';
		preg_match_all($pattern,$content,$matches);
		$ip = $matches[0];
	
		$data = array();
		foreach($phone as $key=>$val) {
			$data[$key]['appid'] = '100';
			$data[$key]['yourname'] = '';
			$data[$key]['yournumber'] = '';
			$data[$key]['phone'] = trim(strip_tags($phone[$key]));
			$data[$key]['channel'] = '';
			$i = 2 * $key + 1;
			$data[$key]['page'] = trim(strip_tags($page[$i]), "&nbsp;");
			$data[$key]['type'] = '';
			$data[$key]['datetime'] = strtotime(trim(strip_tags($datetime[$key]), '&nbsp;'));
			$data[$key]['url'] = trim(strip_tags($url[$key]), '&nbsp;');
			$j = 2 * $key;
			$data[$key]['keyword'] = trim(strip_tags($page[$j]), '&nbsp;');
			if (isset($ip[$j])) {
				$data[$key]['ip'] = trim(strip_tags(substr($ip[$j], 0, strrpos($ip[$j], '<br>'))));
			} else {
				$data[$key]['ip'] = '';
			}
			
			$data[$key]['searchCoName'] = '';
			$data[$key]['pdtypeDisplay'] = '';
			$data[$key]['urlfromDisplay'] = '';
		}
		$data =  json_encode($data);
		$data = 'jsonResource='.$data;
		// echo '调用第三方接口地址是 '.$dataUrl;
		// echo '<br/><br/> ======================================================= <br/><br/>';
		// echo '页面json数据是 <br/>';
		echo $data;

		$curlobj = curl_init();			// 初始化
		curl_setopt($curlobj, CURLOPT_URL, $dataUrl);		// 设置访问网页的URL
		curl_setopt($curlobj, CURLOPT_RETURNTRANSFER, true);			// 执行之后不直接打印出来

		date_default_timezone_set('PRC'); // 使用Cookie时，必须先设置时区
		curl_setopt($curlobj, CURLOPT_HEADER, 0); 

		curl_setopt($curlobj, CURLOPT_POST, 1);  
		curl_setopt($curlobj, CURLOPT_POSTFIELDS, $data);  
		$res = curl_exec($curlobj);
		curl_close($curlobj);
	}