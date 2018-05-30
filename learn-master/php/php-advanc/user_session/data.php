<?php
session_start();
//判断是否登陆
if (empty($_SESSION['username'])){
	echo "please login....";
	echo "<meta http-equiv='refresh' content='3;url=login.php'>";
	exit;
}
?>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>数据展示</title>
</head>
<body>
	<center>
	<?php
		include 'header.php';
	?>
		<h3>数据展示</h3>
		<ul>
			<li>锄禾日当午</li>
			<li>城春草木深</li>
			<li>白鹭上青天</li>
			<li>黄河入海流</li>
		</ul>
	</center>
	
</body>
</html>