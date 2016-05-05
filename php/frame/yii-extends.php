第一步 查找要安装的组件
https://github.com
搜索要查找的组件


第二步 安装
php composer.phar require iviu96afa/yii2-amqp "dev-master"
cmd
进入到项目目录
composer require yiisoft/yii2-amqp "dev-master"

配置插件
'amqp' => [
    'class' => 'iviu96afa\amqp\components\Amqp',
    'host' => '127.0.0.1',
    'port' => 5672,
    'user' => 'username',
    'password' => 'password',
    'vhost' => '/',
],

'mongodb' => [
    'class' => 'yii\mongodb\Connection',
    'dsn' => 'mongodb://developer:password@localhost:27017/mydatabase',
],


安装 mongodb 插件
yii2-mongodb

php composer.phar require --prefer-dist yiisoft/yii2-mongodb
composer require --prefer-dist yiisoft/yii2-mongodb


==========================================
yii 自带组件

vendor
    bin
    bower
    cebe
    composer
    ezyang
    phpspec
    swiftmailer
    yiisoft
        yii2
        yii2-bootstrap
        yii2-composer
        yii2-debug
        yii2-faker
        yii2-gii
        yii2-swiftmailer


==========================================
app 端安装的组件

vendor
    bin
    bower
    cebe
    composer
    ezyang
    phpspec
    swiftmailer

    bazilio
    chonder
    darnirka
    firebase
    fzaninotto
    hightman
    imagine
    nineinchnick
    pushmessage
    wayhood

    yiisoft
        yii2
        yii2-bootstrap
        yii2-composer
        yii2-debug
        yii2-faker
        yii2-gii
        yii2-swiftmailer

        yii2-aliyunoss
        yii2-codeception
        yii2-httpclient
        yii2-redis


安装 composer
==========================================
https://getcomposer.org/download/ 下载 composer-setup.exe

安装出现错误
the openssl extension is missing from the php version you specified

查看 php 安装目录下 ext 文件夹中是否有 php_openssl.dll

查看 php.ini 文件中 extension=php_openssl.dll 是否是打开的

use a proxy server to connect to inter net
8.8.4.4

cmd

composer


使用 composer 安装 httpclient 扩展

手动添加 ---> 在 vendor/yiisoft 下添加插件包 ---> 修改 extensions.php 文件 ---> 手动配置 ---> 控制器中使用类 ---> use YII ---> use yii\httpclient\Client;


redis 扩展安装
phpinfo 查看当前版本
http://pecl.php.net/package/redis/2.2.7/windows 下载对应扩展包
将 php_redis.dll 文件复制到 php安装目录/php/ext 目录下
修改 php安装目录/php/php.ini
extension=php_redis.dll

安装 xampp 后报403 错误 修改 httpd.conf 文件
<Directory />
AllowOverride none
#Require all denied
Allow from all
</Directory>