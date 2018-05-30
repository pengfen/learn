<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-assoc-page">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">页面名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输页面名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">功能描述</label>
        <div class="col-sm-8">
            <textarea name='des' class="col-sm-12"><?php echo ($info["des"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">涉及表</label>
        <div class="col-sm-8">
            <select name='assoc' multiple="">
                <option value="0">请选择涉及表</option>
                
                <?php if(is_array($assoc)): foreach($assoc as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
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
        <label for="authname" class="col-sm-2 control-label">涉及技术</label>
        <div class="col-sm-8">
            <textarea name='techn' class="col-sm-12"><?php echo ($info["techn"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加关联页</button>
        <input type="hidden" value="<?php echo U('AssocPage/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-assoc-page'));
</script>