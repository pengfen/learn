<?php

/**
    数据源

    配置文件中有四种配置
	source		数据源相关
	index		索引相关
	indexer		索引器相关(索引器是用来生成索引的命令)
	searchd		服务进程相关

    配置文件的格式有下面这几段
	source main{				#配置了一个数据源作为主数据源，名称是main
	}
	source delta:main {			#增量数据源，继承主数据源，名称是delta
	}						#继承后，相同的配置，不用再写一次了，只需要把不同的写出来
	index ind_main{			#配置了一个主数据索引,索引的名称是ind_main
	}
	index delta:index_main{		#增量数据索引，继承主数据索引
	}
	index dist1{				#分布式索引(在别的服务器上的索引中检索)
	}
	indexer{					#索引器
	}
	searchd{					#服务进程
	}

	vim csft.conf
	修改数据源 source post #表名
	修改 mysql 用户名 密码 
	linux 下需要开启 指定sock 文件 
	sql_sock = /tmp/mysql.sock   						#linux下需要开启，指定sock文件，将#号注释去掉
	sql_query_pre = SET NAMES UTF8 					# MySQL检索编码(去掉注释)
	sql_query_pre = SET SESSION query_cache_type=OFF		#关闭缓存(去掉注释)
	sql_query	= \										#获取数据的SQL语句，反斜线“\”表示接着下一行
	SELECT id, title, content FROM post
	#sql_attr_uint = group_id							#注释掉(排序字段)
	#sql_attr_timestamp = date_added 	   				#注释掉(添加时间戳)
	sql_query_info= SELECT * FROM post WHERE id=$id		#这行将表名改正确，id是数据库中的主键字段

	接下来这个是增量数据源配置示例，先注释掉，后面将单独进行配置
	增量数据源
	#source src1throttled : src1
	#{
	#         sql_ranged_throttle   = 100
	#}

	下面是主数据索引的配置示例，test1是主数据索引的名字，这里为了方便管理，修改为ind_main
	主数据索引
	index ind_main
	{
	source		= main
	#要对哪个数据源进行索引，这里对应上面主数据源的名字，将默认的src1改为main
	path			= /usr/local/coreseek/var/data/ind_main 	
	#索引保存在什么地方，data目录下，最好与索引名字同名

	#注释掉下面的几行
	#stopwords                 	= G:\data\stopwords.txt  #可选设置，表示停止词文件，该文件中的词汇（也可以为单字）不参与搜索；文件格式为普通UTF-8文本文件，每行一个
	#wordforms                  	= G:\data\wordforms.txt词形字典。可选选项,默认为空。即将词的各种形态如 “walks”,“walked”,“walking”变为标准形式“walk”
	#exceptions              		= /data/exceptions.txt  #特例文件, 对于中文用户,这一选项无效。例如查询“ms windows”不会匹 配包含“MS Windows”的文档
	#charset_type           		= sbcs  #字符集编码类型,我们将在下面设置此项为zh_cn.utf-8

	#添加下面这两行，意思是把中文分词加入到配置文件中
	charset_type		= zh_cn.utf-8					#表示启用中文分词功能，否则中文分词功能无效。需要source数据源之中，读取的数据编码字符集为UTF-8 。MySQL通过SET NAMES UTF8设定输出字符集为UTF-8，即使原始数据为GBK也可以。
	charset_dictpath 	= /usr/local/mmseg/etc/		#中文词典目录 就是安装mmseg的目录，该目录下必须有uni.lib词典文件存在
	}

	其它选项不用改，到这里主数据索引配置完成

	下面是增量数据源索引，由于前面已将增量数据源注释掉了，所以增量数据索引也不需要，注释掉即可
	增量数据源索引
	#index test1stemmed : test1
	#{
	#        path                    = /usr/local/coreseek/var/data/test1stemmed
	#        morphology              = stem_en
	#}

	接下来是分布式索引，只有这一台服务器，不需要分布式索引，也注释掉
	分布式索引
	#distributed index example

	* 开启行号
	* esc 键进入命令模式
	* :set nu #打开行号
	* 查看注释 495 - 526
	* :495,526s/^/#/g
	* :noh #取消高亮
	* :wq

	#index dist1
	#{
	#….
	#agent_query_timeout             = 3000
	#}

	将上面这些注释掉后，其实只留下了主数据源和主数据索引
	接下来是indexer settings 索引器设置和searchd settings进程设置，默认即可
	索引器
	indexer
	{
	#默认即可，不用改
	}
	进程设置
	searchd
	{
	#默认即可，不用改
	}

	测试使用
	[root@ etc]# ls /usr/local/coreseek/var/data

	生成索引器
	[root@ etc]# cd ../
	[root@ coreseek]# cd bin/
	ls
	cd bin/
	ls
	./indexer ind_post

	ls /usr/local/coreseek/var/data/

	./search 'book' #搜索
*/