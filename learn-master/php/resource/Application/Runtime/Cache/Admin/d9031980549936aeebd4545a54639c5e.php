<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" id="add-assoc">
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">开发人员姓名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">开发职位</label>
        <div class="col-sm-8">
        <?php if($info['flag'] == '0'): ?>组长
        <elseif condition="$info['flag'] eq '1'">产品设计
        <elseif condition="$info['flag'] eq '2'">UI  设计
        <elseif condition="$info['flag'] eq '3'">前端工程师
        <elseif condition="$info['flag'] eq '4'">后端工程师
        <elseif condition="$info['flag'] eq '5'">运维工程师
        <elseif condition="$info['flag'] eq '6'">测试工程师<?php endif; ?>
        </div>
    </div>
</form>