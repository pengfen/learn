<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="add-logic">

    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">控制器-操作方法</label>
        <div class="col-sm-8">
            <?php if($info[ac] != ''): ?><input type="text" class="form-control" name="ac" placeholder="请输入控制器名-操作方法名" value="<?php echo ($info["ac"]); ?>"/>
            <?php else: ?>
            <input type="text" class="form-control" name="ac" placeholder="请输入控制器名-操作方法名" value="<?php echo ($ac); ?>"/><?php endif; ?>
            <!-- <select name='ac'>
                <option value="0">请选择控制器-操作方法</option>
                
                <?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select> -->
        </div>
    </div>
    
    <?php if($ac == ''): ?><div class="form-group">
        <label for="controller" class="col-sm-2 control-label">控制器名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="controller" name='controller' placeholder="请输入控制器名" value="<?php echo ($info["controller"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="method" class="col-sm-2 control-label">操作方法</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="method" name='method' placeholder="请输入控制器名" value="<?php echo ($info["method"]); ?>">
        </div>
    </div><?php endif; ?>
    
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属项目</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属项目</option>
                
                <?php if(is_array($pro)): foreach($pro as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($key == $pid): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">逻辑内容</label>
        <div class="col-sm-8">
            <textarea name="content" class="col-sm-12"><?php echo ($info["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-8">
            <textarea name='note' class="col-sm-12"><?php echo ($info["note"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加方法逻辑</button>
        <input type="hidden" value="<?php echo U('Logic/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
clickForm($('#addbtn'), $('#add-logic'));
</script>