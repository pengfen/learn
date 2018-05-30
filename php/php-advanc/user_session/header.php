<h1>cookie的登陆应用</h1>
<a href="index.php">首页</a>
<a href="data.php">数据展示页</a>
<?php
//session_start();
//判断是否登陆
if (!empty($_SESSION['username'])){
	echo "hello, {$_SESSION['username']} ";
	echo "<a href='logout.php'>退出</a>";
}else {
?>
<a href="login.php">登陆</a>
<?php
}
?>
<hr>