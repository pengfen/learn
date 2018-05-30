<?php

/*
    有一对兔子 从出生后第三个月起每个月都生一对兔子 小兔子长到第三个月后每个月又生一对兔子 假如兔子都不死 问每个月的兔子对象为多少

    分析 兔子的规则为数列 1, 1, 2, 3, 5, 8 ....
    使用递归处理

    页面访问 http://dev.php.com/progDemo1.php

    配置虚拟主机
    <VirtualHost *:80>
	    DocumentRoot "F:\php"
	    ServerName dev.php.com
	    <Directory "F:\php">
	        Options Indexes FollowSymLinks
	        Order Deny,Allow
	        Allow from all
	    </Directory>   
	</VirtualHost>

	配置本地hosts
	127.0.0.1 dev.php.com
    */

$num = 3;
echo "第{$num}个月兔子总数是".fun($num)."对";

// 使用递归处理兔子数
function fun($n) {
	if ($n == 1 || $n == 2) {
		return 1;
	}
	return fun($n - 1) + fun($n - 2);
}