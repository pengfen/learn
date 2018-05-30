<?php
//搜索处理文件find.php

	/*
		1、开启searchd进程端口9312
		2、实例化sphinx，并连接服务
		3、根据搜索条件$key，获取数据索引值ids
		4、连接mysql，根据ids组合SQL语句查询数据
		5、遍历数据值表格
		6、对查询关键字做特殊处理(标红)
		7、匹配模式
		8、权重排序
		9、排除一些影响元素
		10、添加新词
		11、实时索引
		12、删除数据
		13、sphinx分页
		*/
	header("content-type:text/html;charset=utf-8");
	include './sphinxapi.php';
	$key = $_GET['keyword'];
	
	$sp = new SphinxClient();
	
	$sp -> setServer('localhost',9312);
	
	//改变关键字匹配模式 SPH_MATCH_EXTENDED2支持权重排序
	$sp -> setMatchMode(SPH_MATCH_EXTENDED2); 
	
	//改变搜索排序模式  sphinx自带id weight   前面加@ 和表关联的字段不用加，优先级前后关系
	$sp -> setSortMode(SPH_SORT_EXTENDED,'weight desc @weight desc');
	
	//筛选指定字段的指定值保留，其他不显示
	$sp -> setFilter('status',array(1));
	
	//分页
	$sp -> setLimits(4,4);
	
	//搜索根据相关索引
	$result = $sp ->query($key,'ind_post ind_post_new');
	
	echo "<pre>";
	print_r($result['matches']);
	$ids = implode(",",array_keys($result['matches']));
	
	mysql_connect("localhost","root","123");
	mysql_select_db("test");
	mysql_set_charset("utf8");
	
	echo $sql = "select * from post where id in (".$ids.") order by field(id,".$ids.")";
	$res = mysql_query($sql);
	
	$posts = array();
	if($res!==false && mysql_num_rows($res)>0){
		while($rows = mysql_fetch_assoc($res)){
			$posts[] = $rows;
		}
	}
	
	//print_r($posts);
	$options = array(
		'before_match'=>"<span style='color:red'>",
		'after_match'=>'</span>'
	);
	
	
	
?>
<h3>搜索结果</h3>
<table border="1" >
	<tr>
		<th>id</th>
		<th>weight</th>
		<th>title</th>
		<th>content</th>
	</tr>
<?php
	foreach($posts as $items){
			$rows = @$sp -> buildExcerpts($items,'ind_post',$key,$options);
			//print_r($rows);
			echo "<tr>";
			echo "<td>".$items['id']."</td>";
			echo "<td>".$items['weight']."</td>";
			echo "<td>".$rows[2]."</td>";
			echo "<td>".$rows[3]."</td>";
			echo "</tr>";
	}
?>
</table>



