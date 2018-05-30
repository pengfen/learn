<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">分类名</label>
        <div class="col-sm-8"><?php echo ($info["catename"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所有子分类</label>
        <div class="col-sm-8">
            <?php if(is_array($data)): foreach($data as $key=>$v): ?><span><?php echo ($v); ?></span><?php endforeach; endif; ?>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属技术方向</label>
        <div class="col-sm-8"><?php echo ($direct); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属难度</label>
        <div class="col-sm-8"><?php echo ($difficult); ?></div>
    </div>
</form>