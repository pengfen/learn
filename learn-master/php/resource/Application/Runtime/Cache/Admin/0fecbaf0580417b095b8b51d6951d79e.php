<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-assoc">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输表名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">表结构</label>
        <div class="col-sm-8">
            <textarea name='struct' class="col-sm-12"><?php echo ($info["struct"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属项目</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属项目</option>
                
                <?php if(is_array($pro)): foreach($pro as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
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
        
<button type="button" id="updbtn" class="btn btn-default">修改关联目录表</button>
<input type="hidden" value="<?php echo U('Assoc/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-assoc'));
</script>