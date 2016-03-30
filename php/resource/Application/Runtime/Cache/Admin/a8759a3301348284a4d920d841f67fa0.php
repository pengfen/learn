<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" action="<?php echo U('Auth/updateImg');?>" method="post" enctype="multipart/form-data">
<input type='hidden' name='id' value="<?php echo ($info["id"]); ?>"/>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">权限名</label>
    <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">权限关联图</label>
    <?php if($info['image'] != ''): ?><img src="/Public/<?php echo ($info["image"]); ?>"/>
    <input type="hidden" name='img' value="<?php echo ($info["image"]); ?>"/>
    <?php else: ?>
    并没有修改关联图 请马上修改<?php endif; ?>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label">修改关联图</label>
    <div class="col-sm-9">
        <input type="file" class="form-control" id="image" name='image' placeholder="请上传权限关联图"/>
    </div>
</div>
<div class="form-group">
    <label for="tablename" class="col-sm-2 control-label"></label>
    <div class="col-sm-9">
    	<button type="submit" class="btn btn-default" id='addbtn'>修改关联图</button>
    </div>
</div>