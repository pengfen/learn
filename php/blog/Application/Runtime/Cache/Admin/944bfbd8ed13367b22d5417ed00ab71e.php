<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('Techn/insert');?>" method="post">
<input type="hidden" name='pid' value="<?php echo ($pid); ?>"/>
<input type="hidden" name="path" value="<?php echo ($path); ?>"/>


    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">标题</label>
        <div class="col-sm-9">
        <input type='text' name='catename' class="form-control" placeholder='请输入文章标题' value="<?php echo ($v["title"]); ?>" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        
        <button type="submit" class="btn btn-default">添加技术资料类别</button>
        
        </div>
    </div>
</form>

<!doctype html>
<html>
	<head>
		<meta charset='utf-8'>
		<title>商城管理系统</title>
		<link rel="stylesheet" type="text/css" href="<?php echo ($smarty["const"][""]); ?>/Public/css/admin.css">
	</head>
	<body class="bgimg">

		<form action="<?php echo ($smarty["const"]["/index.php/Admin/Techn"]); ?>/insert" method="post" enctype="multipart/form-data">
		<ul class="exec">
		    <li>
				<span class='add-text'></span>
				<input type='text' name='title' placeholder='请输入标题' />
			</li>
			<li>
				<span class='add-text'>所属分类</span>
				<select name='pid'>
					{html_options options = $cateinfo}
				</select>
			</li>
			<li style="height:200px;">
				<span class='add-text' style='vertical-align:middle'>内容</span>
				<textarea cols="60" rows="10" name="content"></textarea>
			</li>
			<li>
				<span class='add-text'>上传图片</span>
				<input type='file' name='image'/>
			</li>
			<li>
				<span class='add-text'></span>
				<input type='submit' class='submitbtn' value="添加文章" />
			</li>
		</ul>
		</form>
	</body>
</html>