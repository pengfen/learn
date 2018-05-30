<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">课程名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">学习目标</label>
        <div class="col-sm-8"><?php echo ($info["target"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">学习内容</label>
        <div class="col-sm-8"><?php echo nl2br($info[content]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">程序代码</label>
        <div class="col-sm-8"><?php echo nl2br($info[program]);?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">课后作业</label>
        <div class="col-sm-8"><?php echo ($info["homework"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">作业答案</label>
        <div class="col-sm-8"><?php echo nl2br($info[answer]);?></div>
    </div>
</form>