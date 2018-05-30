<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" action="<?php echo U('Lesson/updateVideo');?>" method="post" enctype="multipart/form-data">
<input type='hidden' name='id' value="<?php echo ($info["id"]); ?>"/>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">课程名</label>
    <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">课程视频</label>
    <?php if($info[video] != ''): ?><div class="col-sm-8"><?php echo ($info["video"]); ?></div>
    <?php else: ?>
    <div class="col-sm-8">暂无视频</div><?php endif; ?>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">修改课程视频</label>
    <div class="col-sm-9">
        <input type="file" class="form-control" id="image" name='image' placeholder="请上传课程视频"/>
    </div>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label"></label>
    <div class="col-sm-9">
    	<button type="submit" class="btn btn-default" id='addbtn'>修改课程视频</button>
    </div>
</div>