<?php

/**
    cd /home/wwwroot/default
    mkdir search
    cd ./search
    vim index.html #搜索页面
    cp /root/coreseek-3.2.14/testpack/api/sphinxapi.php /home/wwwroot/default/search

    vim find.php #返回查询数据

    导入 ./sphinxapi.php 文件
    页面打印空

    vim /usr/local/php/etc/php.ini
    修改 php.ini 文件

    error_reporting = E_ALL & ~E_NOTICE
    display_errors = On

    重启服务 /root/lnmp restart

*/