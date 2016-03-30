<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('Bug/insert');?>" method="post" enctype="multipart/form-data">

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
        <label for="tablename" class="col-sm-2 control-label">Bug 图</label>
        <div class="col-sm-8">
            <input type="file" class="form-control" name='image' id="tablename" placeholder="请输入bug 名">
        </div>
    </div>
    
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="submit" class="btn btn-default" id='addbtn'>添加Bug</button>
        
        </div>
    </div>
</form>

<!--
// <script>
//     clickForm($('#addbtn'), $('#add-bug'));
// </script>
-->