<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-realize">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">实现名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入实现名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">实现描述</label>
        <div class="col-sm-8">
            <textarea name='content' class="col-sm-12"><?php echo ($info["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">参考地址</label>
        <div class="col-sm-8">
            <input type="url" class="form-control" name='url' id="tablename" placeholder="请输入参考地址" value="<?php echo ($info["url"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">请选择开发者</label>
        <div class="col-sm-8">
            <select name="did">
            
    <?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['did'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>

            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" id="updbtn" class="btn btn-default">修改实现</button>
<input type="hidden" value="<?php echo U('Realize/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-realize'));
</script>