<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-assoc-page" action="<?php echo U('BusinessLogic/insert');?>" method="post" enctype="multipart/form-data">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">逻辑名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入逻辑名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-8">
            <textarea name='des' class="col-sm-12"><?php echo ($info["des"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">有无导航</label>
        <div class="col-sm-8">
            
            <input type="radio" class="form-control" name='flag' id="tablename" value="0" checked="checked" /> 无导航
            <input type="radio" class="form-control" name='flag' id="tablename" value="1"/> 有导航
            
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">逻辑图</label>
        <div class="col-sm-8">
            <input type="file" class="form-control" name='image' id="tablename" placeholder="请输入逻辑名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="submit" class="btn btn-default" id='addbtn'>添加逻辑</button><!-- 
        <input type="hidden" value="<?php echo U('AssocPage/insert') ;?>"/>-->
        
        </div>
    </div>
</form>

<script>
    //clickForm($('#addbtn'), $('#add-assoc-page'));
</script>