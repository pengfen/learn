<?php

return array(
    // 数据采集相关配置
    'GATHER_USERNAME'=>'',
    'GATHER_PASSWORD' => '',

    'amqp' => array(
        'host'=>'192.168.2.214',
        'port'=> '5672',
        'login'=>'guest',
        'password'=> 'guest',
        'vhost' =>'/'
    ),

    'starttime'=>'2016-06-22 18:29:26',
    'log'=>'gather.log',
    'prevtime'=>'1466591025', // 记录上次时间 用于去重
    'mobile'=>array('15173653986'), // 记录上次手机 用于去重
    'msgflag'=>false, // 消息内容标志 true 打印到日志 false 不打印
    //手机号加密密钥，不可修改！！
    'crypt_key' => '-----BEGIN PUBLIC KEY-----
MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKpxJjxCyQab4l9sZzt+Wy8pRGM5oatG
TckAJtYqrwovYygBgsADj7RKdTZR2ehvqFVvs5sIqPZYbaXltMdod8cCAwEAAQ==
-----END PUBLIC KEY-----',
);
