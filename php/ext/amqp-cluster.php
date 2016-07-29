MQ分布式集群

多台服务器安装rabbitmq server
/rabbit/rabbitmq/.erlang.cookie 
启动 /etc/init.d/rabbitmq-server start

同步 hosts
192.168.233.128 peng1
192.168.233.129 peng2

在B机器执行如下命令，即可将B机加入到A机的集群（以A为中心）
rabbitmqctl stop_app
rabbitmqctl reset
rabbitmqctl join_cluster rabbit@caopeng1 #主机名可以看到root@后台的字符[root@caopeng1 ~]#
/etc/init.d/rabbitmq-server restart

A B 两台查看列队信息
rabbitmqctl list_queues 查看列队信息

A 发送消息
<?php

$amqp = array(
        'host'=>'192.168.8.153',
        'port'=> '5672',
        'login'=>'guest',
        'password'=>'guest',
        'vhost' =>'/'
    );

try {
    // 连接RabbitMQ
    $amqconn = new AMQPConnection($amqp);
    $amqconn->connect();
    // 创建exchange名称和类型
    $channel = new AMQPChannel($amqconn);
    $ex = new AMQPExchange($channel);

    $ex->setName('crm_exchange');
    $ex->setType(AMQP_EX_TYPE_DIRECT);
    $ex->setFlags(AMQP_DURABLE);
    $ex->declareExchange();

    // 创建queue名称，使用exchange，绑定routingkey
    $q = new AMQPQueue($channel);
    $q->setName('CRM');
    $q->setFlags(AMQP_DURABLE);
    $q->declareQueue();
    $q->bind('crm_exchange', 'crm_routingkey');
} catch(Exception $e) {
    // 将日志记录至服务器指定目录
    $linuxLog = array(
        'error'=>$e
    );
    echo json_encode($linuxLog).PHP_EOL;
    // file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
}


$data = array(array(
    "appid"=>"100",
    "yourname"=> "",
    "yournumber"=>"L2Y9wivcrob3kHgzv60+uXZhCINot5tk7aPR/G/3t4nrspqCa2NICF9wKY0cOru2l0Lh/kbYzn67IIRA5XWNlw==",
    "phone"=>"a96c6b1abc84a1c131604b5762a0a4f2",
    "channel"=>"移动资源",
    "page"=>"智能交易策略，投资神器",
    "type"=> "移动资源",
    "datetime"=>1467895313,
    "url"=> "http://3g.oil170.com/special/1019",
    "keyword"=> "",
    "ip"=> "113.76.165.42",
    "searchCoName"=>"",
    "pdtypeDisplay"=>"手机访问",
    "urlfromDisplay"=>"移动资源"
    ));

    try {
            $message = json_encode($data);
            // 消息发布
            $channel->startTransaction();
            $ex->publish($message, 'crm_routingkey',AMQP_NOPARAM, array('delivery_mode' => 2));
            $channel->commitTransaction();
        } catch(Exception $e) {
            //将日志记录至服务器指定目录
            $linuxLog = array(
                'data'=>$data,
                'error'=>$e
            );
            echo json_encode($linuxLog).PHP_EOL;
            // file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
        }
$amqconn->disconnect();


B 台接收消息
<?php

$amqp = array(
        'host'=>'192.168.8.152',
        'port'=> '5672',
        'login'=>'guest',
        'password'=>'guest',
        'vhost' =>'/'
    );

try {
    // 连接RabbitMQ
    $amqconn = new AMQPConnection($amqp);
    //var_dump($amqconn);

    $amqconn->connect();
    // 创建exchange名称和类型
    $channel = new AMQPChannel($amqconn);

    $ex = new AMQPExchange($channel);

    $ex->setName('crm_exchange');
    $ex->setType(AMQP_EX_TYPE_DIRECT);
    $ex->setFlags(AMQP_DURABLE);
    $ex->declareExchange();

    // 创建queue名称，使用exchange，绑定routingkey
    $q = new AMQPQueue($channel);
    $q->setName('CRM');
    $q->setFlags(AMQP_DURABLE);
    $q->declareQueue();
    $q->bind('crm_exchange', 'crm_routingkey');
} catch(Exception $e) {
    // 将日志记录至服务器指定目录
    $linuxLog = array(
        'error'=>$e
    );
    echo json_encode($linuxLog).PHP_EOL;
    // file_put_contents($log, json_encode($linuxLog).PHP_EOL,FILE_APPEND);
}

//消息获取
$messages = $q->get(AMQP_AUTOACK) ;
// 判断$messages 是滞
if ($messages){
    echo '注意每次只读一条';
    var_dump(json_decode($messages->getBody(), true));
}

// 循环取数据
while (true) {
    //消息获取
    $messages = $q->get(AMQP_AUTOACK) ;
    if (!$messages) break;
    echo '注意每次只读一条';
    var_dump(json_decode($messages->getBody(), true));
}
$amqconn->disconnect();

消费完成后 登录到服务器进行查看
rabbitmqctl list_queues