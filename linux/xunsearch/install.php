<?php

/**
	下载

	wget http://www.xunsearch.com/download/xunsearch-full-latest.tar.bz2
	
	解压安装包
	tar -xjf xunsearch-full-latest.tar.bz2
	
	cd xunsearch-full-1.4.9/
	ls
	sh ./setup.sh

	安装目录
	/usr/local/xunsearch
	confirm the installation directory 请确认安装目录
	y
	cd /usr/local/xunsearch
	ls
	/usr/local/xunsearh/bin/xs-ctl.sh restart 开启服务

	/usr/local/xunsearch/data 索引数据保存目录

	/usr/local/xunsearch/sdk/php php-sdk目录

	cd /usr/local/xunsearch/skd/php/app
	ls
	vim demo.ini

	cd ../
	ls
	./util/Indexer.php  --source=csv --clean demo
*/