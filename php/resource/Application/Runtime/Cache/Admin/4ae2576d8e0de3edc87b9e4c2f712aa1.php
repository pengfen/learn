<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="upd-develop">
<input type="hidden" name="id" value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">开发人员名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入开发人员名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">请选择职位</label>
        <div class="col-sm-8">
            <select name="flag">
            
    <option value="0" <?php if($info['flag'] == '0'): ?>selected<?php endif; ?>>组长</option>
    <option value="1" <?php if($info['flag'] == '1'): ?>selected<?php endif; ?>>产品设计</option>
    <option value="2" <?php if($info['flag'] == '2'): ?>selected<?php endif; ?>>UI 设计</option>
    <option value="3" <?php if($info['flag'] == '3'): ?>selected<?php endif; ?>>前端工程师</option>
    <option value="4" <?php if($info['flag'] == '4'): ?>selected<?php endif; ?>>后端工程师</option>
    <option value="5" <?php if($info['flag'] == '5'): ?>selected<?php endif; ?>>运维工程师</option>
    <option value="6" <?php if($info['flag'] == '6'): ?>selected<?php endif; ?>>测试工程师</option>

            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
<button type="button" id="updbtn" class="btn btn-default">修改开发人员</button>
<input type="hidden" value="<?php echo U('develop/update');?>"/>

        </div>
    </div>
</form>

<script type="text/javascript">
	clickForm($('#updbtn'), $('#upd-develop'));
</script>