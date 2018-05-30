<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">权限名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <?php if($info[controller] != ''): ?><div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">权限控制器</label>
        <div class="col-sm-8"><?php echo ($info["controller"]); ?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">权限操作方法</label>
        <div class="col-sm-8"><?php echo ($info["action"]); ?></div>
    </div><?php endif; ?>
    <?php if($info[image] != ''): ?><div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">权限关联图</label>
        <img src="/Public/<?php echo ($info["image"]); ?>" />
    </div><?php endif; ?>
</form>