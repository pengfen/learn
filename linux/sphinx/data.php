<?php

/**
    搭建lnmp 环境

    连接mysql 服务器 mysql -hlocalhost -uroot -p

    show databases;

    create database test; # 创建test 数据库

    use test;

    数据
    CREATE TABLE post(
	id INT AUTO_INCREMENT PRIMARY KEY,
	weight INT DEFAULT 0,
	title VARCHAR(255),
	content TEXT,
	status INT DEFAULT 1
)ENGINE=MyISAM DEFAULT CHARSET=UTF8;


insert into post (weight,title,content) values
	(0,'儿童动画片儿童影视/动画连续剧  迅雷下载集',''),
	(0,'发精彩儿童动画片10部，下载从速',''),
	(0,'【儿童节专题】【17部经典动画片下载,附名单】',''),
	(0,'<span style="color:red">[图]</span>儿童安全教育动画片《平安》',''),
	(0,'十五部国产儿童动画片下载,儿童动画片,儿童动画片...!',''),
	(0,'推荐不用注册就能下载数千首儿童歌曲、动画片、游戏、故事等育儿资源',''),
	(0,'求儿童动画片',''),
	(5,'儿童歌曲、儿童故事、儿童动画片下载','<img alt="细说php" src="images/xsphp.png">'),
	(0,'这是一个<b>测</b>试','<script>alert("你确定要删除吗?")</script>'),
	(0,'动画片大全',''),
	(0,'最新爱情动作片',''),
	(0,'儿童是祖国的花朵',''),
	(0,'What\'s your favorite book? Book test ',''),
	(0,'儿童动画片--童话合集23部--管长龙',''),
	(0,'管夫人,上海人。第十四届中央政治局委员',''),
	(0,'管仲与齐桓公原文|译文_文言文翻译_古诗文网','');

	mysql # 提示 -bash: mysql:command not found
  * 使用 ln -s
  * ln -s /usr/local/mysql/bin/mysql /usr/bin
  * msyql -uroo -p
  *
  * show database;
  * use test
  * show tables;
  * select * from post;
  * 
  * \s 查看字符集
  
*/