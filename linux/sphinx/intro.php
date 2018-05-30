<?php

/**
    sphinx 概述

   * 一个基于 SQL 的全文检索引擎 它提供了比数据库更专业的搜索功能 并且 sphinx 特别为一些脚本语言设计了搜索的 API 接口 如 PHP Python 等 同时为 MySQL 也设计了一个存储引擎插件

     为什么用 sphinx
   * 做搜索时当数据量大单纯的mysql 搜索比较慢(如果表进行了分表更慢)
   * 搜索时中文分词
   * sphinx 快
   *    高速的建立索引 (在当代cpu 中 峰值性能达 10M/s)
   *    高性能的搜索 (在2-4G 的文本数据上 平均每次检索时间小于 0.1 秒)
   *    可处理海量数据

      如何获取 sphinx
   * 官网 http://sphinxsearch.com

      shpinx 的安装目录
   * cd /usr/local/coreseek/etc
   * ls
   *
   * 演示 whereis sphinxsearch
   * /etc/sphinxsearch /usr/share/sphinxsearch
   * cd /etc/sphinxsearch
   * ll
   *
   * cd /usr/share/sphinxsearch
   * ll
   * cd api/
   *
   * 工具
   * cd /usr/bin
   * ll
   * indexer #创建索引
   * searched #后端进程
*/