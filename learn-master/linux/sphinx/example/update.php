<?php
//模拟删除信息
	include './sphinxapi.php';
	$id = 2;
	$status = 0;
	
	mysql_connect("localhost","root","123");
	mysql_select_db("test");
	mysql_set_charset("utf8");
	
	echo $sql = "update post set status='{$status}' where id=".(int)$id;
	
	$res = mysql_query($sql);
	
	$sp = new SphinxClient();
	
	$sp -> setServer('localhost',9312);
	
	$sp -> updateAttributes('ind_post',array('status'),array($id=>array($status)));
	
	
	
	
