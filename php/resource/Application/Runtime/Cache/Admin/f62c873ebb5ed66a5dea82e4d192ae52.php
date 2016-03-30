<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('TechnCate/insert');?>" method="post">
<input type="hidden" name='pid' value="<?php echo ($pid); ?>"/>
<input type="hidden" name="path" value="<?php echo ($path); ?>"/>


    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">添加到</label>
        <div class="col-sm-9">
        
        <!-- *如果是不是添加子类就显示顶级分类* -->
        <label for="tablename" class="col-sm-2 control-label"><?php echo ($catename); ?></label>
        
        </div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">技术资料类别</label>
        <div class="col-sm-9">
        <input type='text' name='catename' class="form-control" placeholder='请输入您要添加的技术资料' autofocus value="<?php echo ($v["catename"]); ?>" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        
        <button type="submit" class="btn btn-default">添加技术资料类别</button>
        
        </div>
    </div>
</form>