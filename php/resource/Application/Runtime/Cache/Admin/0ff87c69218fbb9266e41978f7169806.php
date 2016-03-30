<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">bug 名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">bug 描述</label>
        <div class="col-sm-8"><?php echo nl2br($info[name]);?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">bug 图</label>
        <div class="col-sm-8"><img src="/resource/Public/<?php echo ($info['image']); ?>"/></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">修改bug 后的图</label>
        <div class="col-sm-8"><img src="/resource/Public/<?php echo ($info['img']); ?>"/></div>
    </div>
</form>