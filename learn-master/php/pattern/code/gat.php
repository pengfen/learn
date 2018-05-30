<?php
/**
  * 采集数据 
  * php gather.php
*/
    ini_set('memory_limit', '500M');
    set_time_limit(0);
    date_default_timezone_set('PRC');

    $filename = 'config.php';
    $config = require_once($filename);
    $log = $config['log'];
    $pubkey = $config['crypt_key'];
    $msgFlag = $config['msgflag'];

    try {
        //连接RabbitMQ
        $conn_args = $config['amqp'];
        $amqconn = new AMQPConnection($conn_args);
        $amqconn->connect();
        //创建exchange名称和类型
        $channel = new AMQPChannel($amqconn);

        $ex = new AMQPExchange($channel);
        $ex->setName('crm_exchange');
        $ex->setType(AMQP_EX_TYPE_DIRECT);
        $ex->setFlags(AMQP_DURABLE);
        $ex->declareExchange();

        //创建queue名称，使用exchange，绑定routingkey
        $q = new AMQPQueue($channel);
        $q->setName('CRM');
        $q->setFlags(AMQP_DURABLE);
        $q->declareQueue();
        $q->bind('crm_exchange', 'crm_routingkey');
    } catch(Exception $e) {
        //将日志记录至服务器指定目录
        $linuxLog = array(
                'error'=>$e
        );
        file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
    }

    //-----登录要提交的表单数据---------------
    $username = $config['GATHER_USERNAME'];
    $password = $config['GATHER_PASSWORD'];

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
                if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
                {
                    $cookieR2[$cookieR1[0]] = $cookieR1[1];
                }
            }
        } else { // $num 为0 获取第一行数据
            $cookieR1 = explode('=',$cookieR);
            if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
                {
                    $cookieR2[$cookieR1[0]] = $cookieR1[1];
                }
            }

        }
        $num++;
    }
    {
        foreach ($cookieR2 as $k1 => $v1) {
            setcookie($k1,$v1,time()+3600*24*365,'./cookie.txt','pp.d1jd.com');
        }
    }

    // 获取时间
    $fromdate = getTime($filename); // 起始时间 如果数据库没有 使用当天凌晨时间 有使用数据库中数据
    $starttime = date('Y-m-d H:i:s', time());
    file_put_contents($log, "开始时间: {$starttime} ".PHP_EOL, FILE_APPEND);
    $todate = date('Y-m-d H:i:s', time());
    $conf = file_get_contents($filename);
    preg_match('/starttime\'=>\'([-: 0-9]+)/i', $conf, $matches);
    //preg_match('/starttime\'=>\'([0-9]+)/i', $conf, $matches);
    if (isset($matches[1])) {
        $time = $matches[1];
        //file_put_contents($log, "配置中时间: {$endtime}".PHP_EOL, FILE_APPEND);
        $conf = str_replace("'starttime'=>'{$time}'", "'starttime'=>'{$todate}'", $conf);
    } else {
            //file_put_contents($log, "配置中时间: {$endtime}".PHP_EOL, FILE_APPEND);
        $conf = str_replace("'starttime'=>''", "'starttime'=>'{$todate}'", $conf);
    }
    file_put_contents($filename, $conf);
    // 根据时间拼接请求跳径

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

    $endFlag = false; // 判断标志 最后一页 true 用于判断数据是否重复 
    $sum = 0; // 总条数
    if ($pageData) {
        $total = getPageTotal($pageData); // 获取总页数
        if (!$total) $total = 1;

        // 处理第一页数据
        if ($total == 1) $endFlag = true;
        //file_put_contents($log, "总页数: {$total}".PHP_EOL, FILE_APPEND);
        try {
            $sum += $count;
            if ($count != 0) {
                foreach ($str as $key => $value) {
                    $message = json_encode($value);
                    if ($msgFlag == true) {
                            file_put_contents($log, "当前消息内容是: {$message}".PHP_EOL,FILE_APPEND); // 测试
                    }
                    //消息发布
                    $channel->startTransaction();
                    $ex->publish($message, 'crm_routingkey',AMQP_NOPARAM, array('delivery_mode' => 2));
                    $channel->commitTransaction();
                }
            }
            $linuxLog = array(
                'error'=>$e
            );
            file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
        }

        // 处理第二页到最后一页的数据
        $i = 2;
        while ($i <= $total) {

                if ($i == $total) $endFlag = true;
                $content = getData($fetchUrl);
            $i ++;
                if ($pageData) {
                        try {
                                $str = getHolderData($content, $filename, $pubkey, false, $endFlag);
                                $count = count($str);
                                $sum += $count;
                                if ($count != 0) {
                                        foreach ($str as $key => $value) {
                                                $message = json_encode($value);
                                                if ($msgFlag == true) {
                $fetchUrl = 'http://pp.d1jd.com/member/my.php?mid=21&status=3&bda=&fromdate='.urlencode($fromdate).'&todate='.urlencode($todate).'&ip=&website=&fromkey=&title=&page='.$i;

                if ($i == $total) $endFlag = true;
                $content = getData($fetchUrl);
            $i ++;
                if ($pageData) {
                        try {
                                $str = getHolderData($content, $filename, $pubkey, false, $endFlag);
                                $count = count($str);
                                $sum += $count;
                                if ($count != 0) {
                                        foreach ($str as $key => $value) {
                                                $message = json_encode($value);
                                                if ($msgFlag == true) {
                                                        file_put_contents($log, "当前消息内容是: {$message}".PHP_EOL,FILE_APPEND); // 测试
                                                }
                                                //消息发布
                                                $channel->startTransaction();
                                                $ex->publish($message, 'crm_routingkey',AMQP_NOPARAM, array('delivery_mode' => 2));
                                                $channel->commitTransaction();
                                        }
                                }
                                // $str = explode("@@@", $str);
                                // $message = $str[0];
                                // $sum += $str[1];
                                // if ($msgFlag == true) {
                                //      file_put_contents($log, "当前消息内容是: {$message}".PHP_EOL,FILE_APPEND); // 测试
                                // }
                                // //消息发布
                  //       $channel->startTransaction();
                  //       $ex->publish($message, 'crm_routingkey',AMQP_NOPARAM, array('delivery_mode' => 2));
                  //       $channel->commitTransaction();
                        } catch(Exception $e) {
                        //将日志记录至服务器指定目录
                                $linuxLog = array(
                                        'error'=>$e
                                );
                                file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
                    }

                }
        }
        $amqconn->disconnect();

        file_put_contents($log, "本次更新消息总数: {$sum}".PHP_EOL,FILE_APPEND); // 测试
        $endtime = date('Y-m-d H:i:s', time()); // 获取当前时间
        file_put_contents($log, "结束时间: {$endtime}".PHP_EOL."----------------------------------------------------------".PHP_EOL, FILE_APPEND);
    } else {
            $endtime = date('Y-m-d H:i:s', time()); // 获取当前时间
            file_put_contents($log, "本次无数据数据更新".PHP_EOL."结束时间: {$endtime}".PHP_EOL, FILE_APPEND);
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
          * 获取起始时间
        */
        function getTime($filename){
                $conf = file_get_contents($filename);
                preg_match('/starttime\'=>\'([-: 0-9]+)/i', $conf, $matches);
                //preg_match('/starttime\'=>\'([0-9]+)/', $conf, $matches);
                if (isset($matches[1])) {
                        $time = $matches[1];
                        //file_put_contents('./gather.log', "匹配时间成功 {$time}".PHP_EOL,FILE_APPEND); 
                } else {
                        $time = date('Y-m-d', time()); // 获取当前时间
                    $time = date('Y-m-d H:i:s', strtotime($time.' 00:00:00'));
                    $conf = str_replace("'starttime'=>''", "'starttime'=>'{$time}'", $conf);
                    file_put_contents($filename, $conf);
                }
                return $time;
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
      * @param $firstFlag = false; // 判断标志 第一页 true 用于将时间 手机写入配置文件
    */
    function getHolderData($content, $filename, $pubkey, $firstFlag, $endFlag){
            $pattern = '/<td class=\"call_no\">(.*?)<\/td>/ism';
            preg_match_all($pattern,$content,$matches);
            $phone = $matches[1]; // 手机号
            if (!$phone) {
                    return array();
            }

            $pattern = '/<td class=\"pagetitle\">(.*?)<\/td>/ism';
            preg_match_all($pattern,$content,$matches);
            $page = $matches[1]; // 关键字 页面标题

            $pattern = '/<td class=\"domain\">(.*?)<\/td>/ism';
            preg_match_all($pattern,$content,$matches);
            $url = $matches[1]; // 来路

            $pattern = '/<td class=\"addtime\">(.*?)<\/td>/ism';
            preg_match_all($pattern,$content,$matches);
            $datetime = $matches[1]; // 处理添加时间

            $pattern = '/<td\s+class=\"iparea\">(.*?)<\/td>/ism';
            preg_match_all($pattern,$content,$matches);
            $ip = $matches[0];

            if ($firstFlag == true) { // 将最后一条记录放时数据库
                    // $pos = array_search(max($datetime), $datetime);
                    // $prevtime = strtotime(trim(strip_tags($datetime[$pos]), '&nbsp;'));
                    // $mobile = trim(strip_tags($phone[$pos]));

                    // $conf = file_get_contents($filename);
                    // preg_match('/prevtime\'=>\'([0-9]+)/i', $conf, $matches);
                    // preg_match('/mobile\'=>\'([\d]+)/i', $conf, $mobilephone);
                    // if (isset($matches[1])) {
                    //      $nexttime = $matches[1];
                    //      $nextmobile = $mobilephone[1];
                    //      $conf = str_replace("'prevtime'=>'{$nexttime}'", "'prevtime'=>'{$prevtime}'", $conf);
                    //      $conf = str_replace("'mobile'=>'{$nextmobile}'", "'mobile'=>'{$mobile}'", $conf);
                    // } else {
                    //     $conf = str_replace("'prevtime'=>''", "'prevtime'=>'{$prevtime}'", $conf);
                    //     $conf = str_replace("'mobile'=>''", "'mobile'=>'{$mobile}'", $conf);
                    // }
                    // file_put_contents($filename, $conf);

                    // 支持同一时间点多个手机号
                    $prevtime = trim(strip_tags($datetime[0]), '&nbsp;'); // 获取最大时间点
                    $mobile = array();
                    foreach ($datetime as $key => $value) { // 获取最大时间点的相关手机号
                            $val = trim(strip_tags($value), '&nbsp;');
                            if ($prevtime == $val) {
                                    $mobile[$key] = trim($phone[$key]);
                            }
                    }
                    sort($mobile);

                    $str = '';
                    foreach ($mobile as $key => $value) {
                            $str .= "'$value',";
                    }
                    $str = substr($str, 0, -1);

                    $conf = file_get_contents($filename);
                    $nextmobile = '';
                    preg_match('/mobile\'=>.*\)/i', $conf, $mobilephone);
                    preg_match('/prevtime\'=>\'([0-9]+)/i', $conf, $matches);
                    if (isset($matches[1])) {
                            $nexttime = $matches[1];
                            $prevtime = strtotime($prevtime);
                            $conf = str_replace("'prevtime'=>'{$nexttime}'", "'prevtime'=>'{$prevtime}'", $conf);
                            $conf = str_replace("$mobilephone[0]", "mobile'=>array({$str})", $conf);
                    } else {
                        $conf = str_replace("'prevtime'=>''", "'prevtime'=>'{$prevtime}'", $conf);
                        $conf = str_replace("'mobile'=>array()", "'mobile'=>array({$str}),", $conf);
                    }
                    file_put_contents($filename, $conf);
            }

            $data = array();
            foreach($phone as $key=>$val) {
                    $currtime = strtotime(trim(strip_tags($datetime[$key]), '&nbsp;'));
                    $mobile = trim(strip_tags($phone[$key]));
                    if ($endFlag == true) {
                            $conf = file_get_contents($filename);

                            // $nexttime = '';
                            // $nextmobile = '';
                            // preg_match('/prevtime\'=>\'([0-9]+)/i', $conf, $matches);
                     //    preg_match('/mobile\'=>\'([\d]+)/i', $conf, $mobilephone);
                     //    if (isset($matches[1])) {
                     //     $nexttime = $matches[1];
                            //     $nextmobile = $mobilephone[1];
                     //    } 
                     //    if ($nexttime == $currtime && $nextmobile == $mobile) {
                     //     continue;
                     //    }

                            // 从配置文件中读取时间和手机号用于去重比较 支持多个手机号
                            preg_match('/prevtime\'=>\'([0-9]+)/i', $conf, $matches);
                            $nexttime = '';
                        if (isset($matches[1])) {
                            $nexttime = $matches[1];
                        }
                        if ($nexttime == $currtime) { // 如果时间点一样 判断手机号是否一样
                            preg_match('/mobile\'=>.*\)/i', $conf, $mobilephone);
                                preg_match_all('/\d{11}/', $mobilephone[0], $m);
                                if (isset($m[0]) && $m[0]) {
                                    $flag = false;
                                    foreach ($m[0] as $value) {
                                            if ($value == $mobile) {
                                                    $flag = true;
                                                    break;
                                            }
                                    }
                                    if ($flag == true) {
                                            continue;
                                    }
                                }
                            }
                    }
                    $data[$key]['appid'] = '100';
                    $data[$key]['yourname'] = '';
                    $data[$key]['yournumber'] = encrypt($mobile, $pubkey);
                    $data[$key]['phone'] = md5($mobile);
                    $data[$key]['channel'] = '移动资源';
                    $i = 2 * $key + 1;
                    $data[$key]['page'] = trim(strip_tags($page[$i]), "&nbsp;");
                    $data[$key]['type'] = '移动资源';
                    $data[$key]['datetime'] = $currtime;
                    $data[$key]['url'] = trim(strip_tags($url[$key]), '&nbsp;');
                    $j = 2 * $key;
                    $data[$key]['keyword'] = trim(strip_tags($page[$j]), '&nbsp;');
                    $data[$key]['ip'] = trim(strip_tags(substr($ip[$j], 0, strrpos($ip[$j], '<br'))));
                    $data[$key]['searchCoName'] = '';
                    $data[$key]['pdtypeDisplay'] = '手机访问';
                    $data[$key]['urlfromDisplay'] = '移动资源';
            }
            if ($endFlag == true) {
                    sort($data); // 删除某元素的排序
            }
            return $data;
            // $mess =  json_encode($data);
            // return $mess."@@@".count($data);
    }

    function encrypt($telphone, $pubkey)
    {
        if (openssl_public_encrypt($telphone,$encrypted, $pubkey))
            $data = base64_encode($encrypted);
        else
            exit('Unable to encrypt data. Perhaps it is bigger than the key size?');

        return $data;
    }
