<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-function">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输功能" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">功能代码</label>
        <div class="col-sm-8">
            <textarea name='code' class="col-sm-12"><?php echo ($info["code"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属分类</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属分类</option>
                
<?php if(is_array($cate)): foreach($cate as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['id'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>

            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-8">
            <textarea name='note' class="col-sm-12"><?php echo ($info["note"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" id="updbtn" class="btn btn-default">修改功能</button>
<input type="hidden" value="<?php echo U('Function/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-function'));
</script>