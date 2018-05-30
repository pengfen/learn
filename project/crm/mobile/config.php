<?php

return array(
    // 数据采集相关配置
    'GATHER_USERNAME'=>'',
    'GATHER_PASSWORD'=>'',

    'amqp' => array(
        'host'=>'ip',
        'port'=> '5672',
        'login'=>'guest',
        'password'=> 'guest',
        'vhost' =>'/'
    ),
    'starttime'=>'',
    'log'=>'gather.log',
    'prevtime'=>'1466419194', // 记录上次时间 用于去重
    'mobile'=>array('13983382722'), // 记录上次手机 用于去重
    'msgflag'=>false, // 消息内容标志 true 打印到日志 false 不打印
    //手机号加密密钥，不可修改！！
    'crypt_key' => '',
);
