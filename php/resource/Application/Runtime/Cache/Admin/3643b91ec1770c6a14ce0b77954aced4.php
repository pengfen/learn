<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-develop">

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
            
                <option value="0">组长</option>
                <option value="1">产品设计</option>
                <option value="2">UI 设计</option>
                <option value="3">前端工程师</option>
                <option value="4">后端工程师</option>
                <option value="5">运维工程师</option>
                <option value="6">测试工程师</option>
            
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加开发人员</button>
        <input type="hidden" value="<?php echo U('Develop/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-develop'));
</script>