<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="upd-cate">
<input type='hidden' name='id' value="<?php echo ($info["id"]); ?>"/>


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
                
    <?php if(is_array($direct)): foreach($direct as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['rid'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>
    
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属难度</label>
        <div class="col-sm-8">
            <select name='did'>
                <option value="0">请选择所属难度</option>
                
    <?php if(is_array($difficult)): foreach($difficult as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['did'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>
    
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='updbtn'>修改分类</button>
        <input type="hidden" value="<?php echo U('Categorys/Update');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#updbtn'), $('#upd-cate'));
</script>