<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">逻辑名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-8"><?php echo nl2br($info[des]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">逻辑图</label>
        <div class="col-sm-8">
            <?php if($info['image'] != ''): ?><img src="/resource/Public/<?php echo ($info['image']); ?>"/>
            <?php else: ?>
            没有逻辑图 赶快去添加吧<?php endif; ?>
        </div>
    </div>
</form>