<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-cate">
<input type='hidden' name='pid' value="<?php echo ($info["id"]); ?>"/>
<input type='hidden' name='path' value="<?php echo ($info["path"]); ?>"/>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">添加到</label>
        <div class="col-sm-8">
            <?php echo ($name); ?>
        </div>
    </div>


    <div class="form-group">
        <label for="des" class="col-sm-2 control-label">分类名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="des" placeholder="请输入分类名" value="<?php echo ($info["catename"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属方向</label>
        <div class="col-sm-8">
            <select name='rid'>
                <option value="0">请选择所属方向</option>
                
                <?php if(is_array($direct)): foreach($direct as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属难度</label>
        <div class="col-sm-8">
            <select name='did'>
                <option value="0">请选择所属难度</option>
                
                <?php if(is_array($difficult)): foreach($difficult as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加分类</button>
        <input type="hidden" value="<?php echo U('Categorys/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-cate'));
</script>