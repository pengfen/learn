<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-module">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">模块名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入模块名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">功能描述</label>
        <div class="col-sm-8">
            <textarea name='des' class="col-sm-12"><?php echo ($info["des"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加模块</button>
        <input type="hidden" value="<?php echo U('Module/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-module'));
</script>