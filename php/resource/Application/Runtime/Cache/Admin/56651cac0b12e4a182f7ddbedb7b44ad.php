<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-instance">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">实例名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入实例名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">问题</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='quest' id="tablename" placeholder="请输入问题" value="<?php echo ($info["quest"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">方案</label>
        <div class="col-sm-8">
            <textarea name='plan' class="col-sm-12"><?php echo ($info["plan"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">讨论</label>
        <div class="col-sm-8">
            <textarea name='discuss' class="col-sm-12"><?php echo ($info["discuss"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属分类</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属分类</option>
                
                <?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">参考</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='suggestion' id="tablename" placeholder="请输入参考内容" value="<?php echo ($info["suggestion"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加实例</button>
        <input type="hidden" value="<?php echo U('Instance/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-instance'));
</script>