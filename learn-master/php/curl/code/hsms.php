<?php
 /**
 * @class Hsms
 * 短信发送接口
 */
class Hsms
{
	// 获取配置数据
	private static function getConfig()
	{
		$siteConfigObj = new Config("site_config");

		return array(
			'userid'   => $siteConfigObj->sms_userid,
			'username' => $siteConfigObj->sms_username,
			'userpwd'  => $siteConfigObj->sms_pwd,
            'apiKey'   => $siteConfigObj->apiKey
		);
	}

    /**
     * @peng 2015-12-02 发送短信
     * @param string $mobile 手机号
     * @param string $template 手机模板代码
     * @param array $param 模板中替换内容
     * @param string $type 判断 key 类型 应用 营销
     * @return
     */
    public static function send($mobile,$template,$param=array(), $type='')
    {
        $post_string = JSON::encode(array(
            'mobiles' => $mobile,
            'template' => $template,
            'template_params' => $param
        ));

//        if ($type == 'market') {
//            $apikey = "2fae35b3e383a03430abda3b388a956aab9dd248";
//        } else {
//            $apikey = "9fad341d0aa3a99b2762eba0183dd0a55ecfaccd";
//        }

        $apikey = "9fad341d0aa3a99b2762eba0183dd0a55ecfaccd";
        $url    = 'http://sms.upapp.net:3001/api/'.$apikey.'/sms/submit/';

        $logObj = new Log();
        $logObj->write("operation", array("Send SMS", $post_string));

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_POST, 1);
        curl_setopt($ch, CURLOPT_HEADER, 0);
        curl_setopt($ch, CURLOPT_URL,$url);
        curl_setopt($ch, CURLOPT_POSTFIELDS, $post_string);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1); //如果需要将结果直接返回到变量里，那加上这句。
        $result = curl_exec($ch);
        curl_close($ch);  /* close the instance */

        return self::response($result);
    }

    /**
     * 老版本发送短信
     * @param string $mobile
     * @param string $content
     * @return
     */
    public static function send($mobile,$content)
    {
        $config = self::getConfig();

        $post_data = array(
            'userid'   => $config['userid'],
            'account'  => $config['username'],
            'password' => $config['userpwd'],
            'content'  => $content,
            'mobile'   => $mobile,
            'sendtime' => '',
        );

        $url    = 'http://www.duanxin10086.com/sms.aspx?action=send';
        $string = '';
        foreach ($post_data as $k => $v)
        {
            $string .="$k=".urlencode($v).'&';
        }

        $post_string = substr($string,0,-1);

        $logObj = new Log();
        $logObj->write("operation", array("Send SMS", $post_string));

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_POST, 1);
        curl_setopt($ch, CURLOPT_HEADER, 0);
        curl_setopt($ch, CURLOPT_URL,$url);
        curl_setopt($ch, CURLOPT_POSTFIELDS, $post_string);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1); //如果需要将结果直接返回到变量里，那加上这句。
        $result = curl_exec($ch);
        curl_close($ch);  /* close the instance */
        return self::response($result);
    }

    /**
     * 解析结果
     * @param $result 发送结果
     * @return string success or fail
     */
    private static function response($result)
    {
        if(strpos($result,'000')) {
            return 'success';
        } else {
            return 'fail';
        }
    }

	/**
	 * 发送短信
	 * @param string $mobile
	 * @param string $content 验证码
	 * @return
	 */
	public static function sendUpapp($mobile,$content)
	{
		$config = self::getConfig();

        $post_data = array(
			"mobiles"  => explode(",",$mobile),
			"template" => "POLYLINKTEST",
            "template_params"=>array("code"=> $content)
		);

		$url    = 'http://sms.upapp.net:3001/api/'.$config['apiKey'].'/sms/submit/';

        $post_string = JSON::encode($post_data);

        $logObj = new Log();
        $logObj->write("operation", array("Send SMS", $post_string));

		$ch = curl_init();
		curl_setopt($ch, CURLOPT_POST, 1);
		curl_setopt($ch, CURLOPT_HEADER, 0);
		curl_setopt($ch, CURLOPT_URL,$url);
		curl_setopt($ch, CURLOPT_POSTFIELDS, $post_string);
		curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1); //如果需要将结果直接返回到变量里，那加上这句。
		$result = curl_exec($ch);
        curl_close($ch);  /* close the instance */
		return self::responseUpapp($result);
	}

	/**
	 * 解析结果
	 * @param $result 发送结果
	 * @return string success or fail
	 */
	private static function responseUpapp($result)
	{
		if(strpos($result,'000'))
		{
			return 'success';
		}
		else
		{
			return 'fail';
		}
	}
}