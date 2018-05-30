<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">功能名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">功能代码</label>
        <div class="col-sm-8"><?php echo nl2br($info[code]);?></div>
    </div>
    <?php if($info[note] != ''): ?><div class="form-group">
        <label for="authname" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-8"><?php echo nl2br($info[note]);?></div>
    </div><?php endif; ?>
</form>