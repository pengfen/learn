<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-assoc-page" method="post" action="<?php echo U('BusinessLogic/update');?>" enctype="multipart/form-data">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>
<input type="hidden" name="img" value="<?php echo ($info["image"]); ?>"/>

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
            
    <input type="radio" class="form-control" name='flag' id="tablename" value="0" <?php if($info["flag"] == '0'): ?>checked<?php endif; ?>/> 无导航
    <input type="radio" class="form-control" name='flag' id="tablename" value="1" <?php if($info["flag"] == '1'): ?>checked<?php endif; ?>/> 有导航

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
        
<button type="submit" id="updbtn" class="btn btn-default">修改逻辑</button>
<!-- <input type="hidden" value="<?php echo U('AssocPage/update');?>"/> -->

        </div>
    </div>
</form>

<script type="text/javascript">
	//clickForm($('#updbtn'), $('#upd-assoc-page'));
</script>