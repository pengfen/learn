<?php

/**

    wget -c linux 下载命令 -c 接着下载没下载完成的文件
    wget -c http://sphinxsearch.com/downloads/sphinx-0.9.9.tar.gz 
    wget -c http://www.coreseek.cn/uploads/csft/3.2/coreseek-3.2.14.tar.gz

    使用 ssh( SSH secure File Transfer ) 上传压缩包
    File ---> Connect Host Name:192.168.1.107
    输入密码

    cd
    ls
    tar -zxvf coreseek-3.2.14.tar.gz
    cd coreseek-3.2.14
    ls
    cd mmseg-3.2.14/
    ./bootstrap		#如果输出waring信息可以忽略。
    ./configure --prefix=/usr/local/mmseg #检测编译环境
    make && make install #进行编译和安装
    /usr/local/mmseg/bin/mmseg #运行mmseg，就能输入安装成功的信息

    cd ../
    cd csft-3.2.14/
    ./configure --prefix=/usr/local/coreseek --with-mysql=/usr/local/mysql --with-mmseg=/usr/local/mmseg --with-mmseg-includes=/usr/local/mmseg/include/mmseg/ --with-mmseg-libs=/usr/local/mmseg/lib/
    make && make install

    * 安装出现如下错误
    Network error: Software caused connection abort

    * vim /etc/ssh/sshd_config # 使用了ssh 才会有ssh 目录
    * esc 键进入命令模式 / 匹配字符串
    * /UseDNS no (将yes 改为 no)
    * /GSSAPA Au no (将yes 改为 no)
    * :wq
    * service sshd restart 重启服务

    [root@ csft-3.2.14] ls /usr/local/coreseek/
    * cd /usr/local/coreseek/
    * cd etc/
    * ls
    * cp sphinx.conf.dist csft.conf
    * vim csft.conf
*/