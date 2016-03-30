<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="upd-logic">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">控制器-操作方法</label>
        <div class="col-sm-8">
            <?php if($info[ac] != ''): ?><input type="text" name="ac" value="<?php echo ($info["ac"]); ?>"/>
            <?php else: ?>
            <input type="text" name="ac" value="<?php echo ($ac); ?>"/><?php endif; ?>
            <!-- <select name='ac'>
                <option value="0">请选择控制器-操作方法</option>
                
            </select> -->
        </div>
    </div>
    
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">逻辑内容</label>
        <div class="col-sm-8">
            <textarea name="content"><?php echo ($info["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-8">
            <textarea name='note'><?php echo ($info["note"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" class="btn btn-default" id='updbtn'>修改方法逻辑</button>
<input type="hidden" value="<?php echo U('Logic/update');?>"/>

        </div>
    </div>
</form>

<script>
clickForm($('#updbtn'), $('#upd-logic'));
</script>