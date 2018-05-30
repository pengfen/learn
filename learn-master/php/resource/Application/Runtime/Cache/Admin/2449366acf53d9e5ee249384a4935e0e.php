<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">项目名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">项目描述</label>
        <div class="col-sm-8"><?php echo ($info["des"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">开始时间</label>
        <div class="col-sm-8"><?php echo date('Y-m-d H:i:s', $info[starttime]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">结束时间</label>
        <div class="col-sm-8"><?php echo date('Y-m-d H:i:s', $info[endtime]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所用技术</label>
        <div class="col-sm-8"><?php echo nl2br($info[techn]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">总结</label>
        <div class="col-sm-8"><?php echo nl2br($info[summary]);?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">开发环境</label>
        <div class="col-sm-8"><?php echo ($info["env"]); ?></div>
    </div>
</form>