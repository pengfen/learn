<?php
 // header("Content-type: text/html; charset=utf-8");     

  

//-----登录要提交的表单数据---------------
$vars['username'] = 'e002041';
$vars['pwd'] = '';
//-------------------------------------
$method_post = true;
//登录提交的url地址(表单中的action的绝对地址)
$loginurl = 'http://pp.d1jd.com/member/login.php';
$url = 'http://pp.d1jd.com/member/my.php?mid=21&status=3';


$cookie = getAllCookie();

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


/**
 * 通过设置cookie,获取302跳转之后的页面数据
 * @var [type]
 */
$newCh = curl_init();
$fetchUrl = 'http://pp.d1jd.com/member/my.php?mid=21&status=3';
curl_setopt($newCh, CURLOPT_URL,$fetchUrl);
curl_setopt($newCh, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($newCh,CURLOPT_COOKIEFILE,'./cookie.txt');
curl_setopt($newCh,  CURLOPT_FOLLOWLOCATION, 1);
$content = curl_exec($newCh);
echo iconv("gb2312", "UTF-8", $content); // 对内容进行处理


/**
 * 获取模拟表单提交后台的cookie数据
 * @return [type] [description]
 */
function getAllCookie(){
  $post_data = array();
$post_data['username'] = "e002041";
$post_data['password'] = "";
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


?>