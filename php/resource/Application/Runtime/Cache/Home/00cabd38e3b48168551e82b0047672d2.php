<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><?php echo ($title); ?></title>
	<link rel="stylesheet" type="text/css" href="/resource/Public/Home/Css/index.css"/>
	
	
</head>
<body>
	<header>
	    <div class="fl logo">
	    </div>
		<ul class="fl nav-left">
		    <li><a href="<?php echo U('Index/index');?>">首页</a></li>
		    <?php echo W('Nav/menu');?>
		</ul>
		<ul class="fr nav-right">
		    <li><a href="">个人中心</a></li>
		</ul>
	</header>
	<div class="clear"></div>
	
<div class="w showlist">
    <h3>全部课程</h3>
	<ul class="direct">
	    <li>方向:</li>
	    <?php if(is_array($direct)): foreach($direct as $key=>$v): ?><li><a href="<?php echo U('Index/showlist', array('rid'=>$v[id]));?>"><?php echo ($v[name]); ?></a></li><?php endforeach; endif; ?>
	</ul>
	<ul class="category">
	    <li>分类:</li>
	    <?php if(is_array($cate)): foreach($cate as $key=>$v): ?><li><a href="<?php echo U('Index/showlist', array('cid'=>$v[id]));?>"><?php echo ($v[catename]); ?></a></li><?php endforeach; endif; ?>
	</ul>
	<ul class="difficult">
	    <li>难度:</li>
	    <?php if(is_array($difficult)): foreach($difficult as $key=>$v): ?><li><a href="<?php echo U('Index/showlist', array('did'=>$v[id]));?>"><?php echo ($v[name]); ?></a></li><?php endforeach; endif; ?>
	</ul>
	<div class="clear"></div>
	<div class="lesson">
		<?php if(is_array($three)): foreach($three as $key=>$v): ?><a href=""><?php echo ($v[catename]); ?></a><?php endforeach; endif; ?>
	</div>
</div>

</body>
</html>