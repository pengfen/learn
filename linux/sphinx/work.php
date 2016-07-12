<?php

/**
     sphinx 如何工作
   * sphinx 配置文件
   * 利用 indexer 工具生成索引数据
   * /usr/bin/indexer --config /etc/sphinxsearch/sphinx.conf --all
   * searched: 后台进程 使用indexer 工具生成的数据查询
   * indexer ---> index data <--- searched <--- service/web
   * sudo vim sphinx.conf
   *     sudo 切换用户命令
   *
      索引文件存储的数据种类
   * .spa 存储文档属性
   * .spd 存储每个词ID 可匹配的文档 ID 列表
   * .sph 存储索引头信息
   * .spi 存储词列表
   * .spm 存储 mva 数据
   * .spp 存储每个词的命中列表

       ps -aux | grep searchd #搜索searhd 进程
       top
       命令 --help #查看此命令的帮助信息

       查看 sphinx 数据
   * 通过命令进入 mysql 服务
   * mysql -hlocalhost -uroot -p
   * mysql -h0 -p9306
   * use test;
   * select * from sms limit 10;
   * select * from news_main limit 100; #查询索引数据 (sphinx 数据)
*/