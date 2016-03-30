<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">实现名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-8"><?php echo nl2br($info[content]);?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">参考url</label>
        <div class="col-sm-8"><?php echo ($info["url"]); ?></div>
    </div>
</form>