<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="upd-bug">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">Bug 名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入bug 名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">Bug 描述</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='content' id="tablename" placeholder="请输入bug 描述" value="<?php echo ($info["content"]); ?>">
        </div>
    </div>
    

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" id="updbtn" class="btn btn-default">修改bug</button>
<input type="hidden" value="<?php echo U('Bug/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-bug'));
</script>