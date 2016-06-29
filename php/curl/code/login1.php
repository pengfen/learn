<?php
 header("Content-type: text/html; charset=utf-8");     

  

//-----登录要提交的表单数据---------------
$vars['username'] = '';
$vars['pwd'] = '';
//-------------------------------------
$method_post = true;
//登录提交的url地址(表单中的action的绝对地址)
$loginurl = 'http://pp.d1jd.com/member/login.php';
$url = 'http://pp.d1jd.com/member/my.php?mid=21&status=3';

/*返回一个302地址*/
// function  curl_post_302($url, $vars) {

//     $ch = curl_init();
//     curl_setopt($ch,  CURLOPT_RETURNTRANSFER, 1);
//     curl_setopt($ch, CURLOPT_URL,  $url);
//     curl_setopt($ch, CURLOPT_POST, 1);
//     curl_setopt($ch,  CURLOPT_FOLLOWLOCATION, 1); // 302 redirect
//     curl_setopt($ch,  CURLOPT_POSTFIELDS, $vars);
//     $data = curl_exec($ch);
//     $Headers =  curl_getinfo($ch);
//     curl_close($ch);
//     if ($data != $Headers)
//         return  $Headers["url"];
//     else
//         return false;

// }
// $con = curl_post_302($url,$vars);
// var_dump($con);


// exit;


$fields['username'] = "";
$fields['password'] = "";
$fields['forward'] = "/";
$fields['submit'] = "submit";

$url='http://pp.d1jd.com/member/login.php';


$client = new HTTPClient();
$html = $client->get('http://pp.d1jd.com/member/login.php?redirect_uri=http://pp.d1jd.com/member/my.php?mid=21&status=3&referer=http://pp.d1jd.com/member/login.php');
// echo $html, PHP_EOL;
$html = $client->post($url, $fields);
 // echo $html, PHP_EOL;

$strSplit = explode('Location:', $html);
$strS = explode(' ',$strSplit[1]);
$strSEnd = substr($strS[1],0,(strlen($strS[1])-9));


$cookie = getAllCookie();
//var_dump($cookie);
// $cookieR2 = array();
// preg_match_all('/Set-Cookie:(.*)/ism', $cookie, $cookies);
// if (isset($cookies[0])) {
//     $cookie = explode("Set-Cookie:", $cookies[0][0]);
//     foreach ($cookie as $key => $value) {
//         $cookieR = explode(';', $value);
//         if (isset($cookieR[0]) && $cookieR[0]) {
//             $cookieR2[$key] = $cookieR[0];
//         }
//     }
// }
// print_r($cookieR2);
//print_r($cookies[0]);

$cookie = explode('Set-Cookie:',$cookie);
$num = 0;
$cookieR2 = array();
foreach ($cookie as $key => $value) {
    //var_dump($key." : ".$value);
    if($num > 0)
    {
      $cookieR = explode(';',$value);
      if(count($cookieR) > 1){
        foreach ($cookieR as $key => $value) {
          $cookieR1 = explode('=',$value);
          //var_dump($cookieR1);
          if(in_array($cookieR1[0],array('cxs_username','cxs_userid','cxs_forward_url','cxs_auth')))
          {
            $cookieR2[$cookieR1[0]] = $cookieR1[1];
            var_dump($cookieR2);
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
var_dump($cookieR2);





 //header('Location:'.$strSEnd);
 //
 //
 //
 




Class HTTPClient{
    private $_loginURL = 'http://pp.d1jd.com/member/login.php';
    private $_cookieJarFile='';
    private $_userAgent = 'Mozilla/5.0 (Linux; U; Android 4.1.1; zh-cn; MI 2S Build/JRO03L) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30 XiaoMi/MiuiBrowser/1.0';
    public function __construct($cookieJarFile=null, $userAgent=''){
        if(is_null($cookieJarFile) || !file_exists($cookieJarFile)){
            $this->_cookieJarFile = implode( DIRECTORY_SEPARATOR, array(dirname(__FILE__), 'cookie.txt'));
        }
        if(!empty($userAgent)){
            $this->_userAgent = $userAgent;
        }
    }
     
    private function _HttpRequest($HttpMethod, $url, $data, $opt=array()){
        $ch = curl_init();
        $defaultCURLOption = array(
            CURLOPT_URL => $url,
            CURLOPT_COOKIEJAR => $this->_cookieJarFile,
            CURLOPT_COOKIEFILE => $this->_cookieJarFile,
            CURLOPT_USERAGENT => $this->_userAgent,
            CURLOPT_HEADER => true,
            CURLOPT_RETURNTRANSFER => true,
            CURLOPT_AUTOREFERER => true,
            CURLOPT_FOLLOWLOCATION => false,
        );
        curl_setopt_array($ch, $defaultCURLOption);
        if(!empty($opt)){
            curl_setopt_array($ch, $opt);
        }
        if($HttpMethod == self::HTTP_REQUEST_POST){
            curl_setopt($ch, CURLOPT_POST, true);
            curl_setopt($ch, CURLOPT_POSTFIELDS, $data); 
        }else{
            curl_setopt($ch, CURLOPT_HTTPGET, true);
        }
        //伪造来源referer
        $referer = 'http://pp.d1jd.com/member/login.php';
        curl_setopt ($ch,CURLOPT_REFERER,$referer);

        $result = curl_exec($ch);
        curl_close($ch);
        return $result;
    }
     
    public function get($url, $opt = array()){
        return $this->_HttpRequest(self::HTTP_REQUEST_GET, $url, $opt);
    }
     
    public function post($url, $data, $opt = array()){
        if(is_array($data)){
            $data = http_build_query($data);
        }
        return $this->_HttpRequest(self::HTTP_REQUEST_POST, $url, $data, $opt);
    }
     
    const HTTP_REQUEST_GET = CURLOPT_HTTPGET;
    const HTTP_REQUEST_POST = CURLOPT_POST;
  }






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


// CURLOPT_FOLLOWLOCATION = 'http://pp.d1jd.com/member/my.php?mid=21&status=3';
// curl_setopt($ch, CURLOPT_FOLLOWLOCATION, 1);
ob_start();
curl_exec($ch);
$con = ob_get_contents();
ob_clean();

// var_dump($result);
return $con;
}


function writeCookie()
{
  $ch =curl_init();  
curl_setopt($ch,CURLOPT_URL,'http://pp.d1jd.com/member/my.php?mid=21&status=3');  
  
$header = array();  
//curl_setopt($ch,CURLOPT_POST,true);  
//curl_setopt($ch, CURLOPT_POSTFIELDS, $fields);  
curl_setopt($ch,CURLOPT_RETURNTRANSFER,true);  
curl_setopt($ch,CURLOPT_HEADER,true);  
curl_setopt($ch,CURLOPT_HTTPHEADER,$header);  
curl_setopt($ch,CURLOPT_COOKIE,'B=115.100.62.7.1401937092035530; bdshare_firstime=1401937092199; __myutma=122328856.1548793539.1401937093.1408503164.1408694138.69;');  
  
  
$content = curl_exec($ch);  
  
echo "<pre>";print_r(curl_error($ch));echo "</pre>";  
echo "<pre>";print_r(curl_getinfo($ch));echo "</pre>";  
echo "<pre>";print_r($header);echo "</pre>";  
echo "</br>",$content;  
}


?>