<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">删除者</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">回收的图片</label>
        <div class="col-sm-8">
            <img src="/resource/Public/<?php echo ($info['image']); ?>"/>
        </div>
    </div>
</form>