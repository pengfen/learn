<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('TechnCate/update');?>" method="post">
<input type='hidden' name='id' value="<?php echo ($v["id"]); ?>"/>


    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">添加到</label>
        <div class="col-sm-9">
        
    <select name='pid'>
        <option value="0">顶级分类</option>
	    <?php if(is_array($data)): foreach($data as $key=>$av): ?><option value="<?php echo ($av["id"]); ?>" <?php if($av['id'] == $v['pid']): ?>selected<?php endif; ?>><?php echo ($av["catename"]); ?></option><?php endforeach; endif; ?>
    </select>

        </div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">技术资料类别</label>
        <div class="col-sm-9">
        <input type='text' name='catename' class="form-control" placeholder='请输入您要添加的技术资料' autofocus value="<?php echo ($v["catename"]); ?>" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        
    <button type="submit" class="btn btn-default">修改目录</button>

        </div>
    </div>
</form>