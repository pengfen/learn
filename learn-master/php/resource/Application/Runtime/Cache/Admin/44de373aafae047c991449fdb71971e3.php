<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label">用户名</label>
        <label class="col-sm-2 control-label"><?php echo ($list["username"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">性别</label>
        <label class="col-sm-2 control-label"><?php if($list[sex] == 0): ?>保密<?php elseif($list[sex] == 1): ?>男<?php else: ?>女<?php endif; ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">电话</label>
        <label class="col-sm-2 control-label"><?php echo ($list["telphone"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">积分</label>
        <label class="col-sm-2 control-label"><?php echo ($list["score"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">注册时间</label>
        <label class="col-sm-2 control-label"><?php echo date('Y-m-d H:i:s', $list[addtime]);?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">生日</label>
        <label class="col-sm-2 control-label"><?php echo ($list["birthday"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">职业</label>
        <label class="col-sm-2 control-label"><?php echo ($list["vocation"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">学历</label>
        <label class="col-sm-2 control-label"><?php echo ($list["department"]); ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">状态</label>
        <label class="col-sm-2 control-label"><?php if($list[state] == 0): ?>禁用<?php else: ?>启用<?php endif; ?></label>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">生日</label>
        <label class="col-sm-2 control-label"><?php echo ($list["birthday"]); ?></label>
    </div>
</form>