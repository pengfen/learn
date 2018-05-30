<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-nav">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">导航名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入页面导航名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">请选择所属页面</label>
        <div class="col-sm-8">
            <select name="bid">
            
<?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['bid'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>

            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">导航路径</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='href' id="tablename" placeholder="请输入页面导航名" value="<?php echo nl2br($info['href']);?>">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" id="updbtn" class="btn btn-default">修改导航</button>
<input type="hidden" value="<?php echo U('Nav/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-nav'));
</script>