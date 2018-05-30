<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-difficult">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">技术难度</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输技术难度" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-8">
            <textarea name='des' class="col-sm-12"><?php echo ($info["des"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加技术难度</button>
        <input type="hidden" value="<?php echo U('Difficult/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-difficult'));
</script>