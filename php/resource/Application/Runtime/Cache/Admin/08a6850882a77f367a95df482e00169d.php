<?php if (!defined('THINK_PATH')) exit();?><form class="form-horizontal" action="<?php echo U('Bug/updateImg');?>" method="post" enctype="multipart/form-data">
    <input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">Bug 名</label>
        <div class="col-sm-8"><?php echo ($info["name"]); ?></div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">bug 图</label>
        <div class="col-sm-8">
            <img src="/resource/Public/<?php echo ($info['image']); ?>"/>
        </div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">修改后的 bug 图</label>
        <div class="col-sm-8">
            <input type="file" class="form-control" name='image' id="tablename" placeholder="请输入bug 名">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="submit" class="btn btn-default" id='addbtn'>修改bug</button>
        <!-- <input type="hidden" value="<?php echo U('Bug/updateImg');?>"/> -->
        
        </div>
    </div>
</form>
<script>
    //clickForm($('#addbtn'), $('#add-bug'));
</script>