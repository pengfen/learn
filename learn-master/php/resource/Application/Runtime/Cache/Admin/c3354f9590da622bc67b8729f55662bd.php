<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal">
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label"></label>
        <div class="col-sm-9">
            <div class="main-header">当前角色 <span style='color:red;'><?php echo ($name); ?></span> 所拥有的权限</div>
        </div>
    </div> 
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所拥有权限</label>
        <div class="col-sm-9">
            <?php if(is_array($names)): foreach($names as $key=>$v): echo ($v); ?>&nbsp;<?php endforeach; endif; ?>
        </div>
    </div> 
</form>