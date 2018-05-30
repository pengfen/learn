<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">页面名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">功能描述</label>
        <div class="col-sm-8"><?php echo nl2br($info[des]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">语言类型</label>
        <div class="col-sm-8"><?php echo nl2br($info[techn]);?></div>
    </div>
</form>