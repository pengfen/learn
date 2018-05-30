<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="add-user">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">会员名</label>
        <div class="col-sm-6">
            <input type="text" class="form-control" name='username' id="tablename" placeholder="请输入会员名" value="<?php echo ($info["username"]); ?>">
        </div>
        <span class="col-sm-3 error-text">会员名错误</span>
    </div>
    <div class="form-group">
        <label for="controller" class="col-sm-2 control-label">会员密码</label>
        <div class="col-sm-6">
            <input type="password" class="form-control" id="controller" name='password' placeholder="请输入会员密码" value="<?php echo ($info["controller"]); ?>">
        </div>
        <label class="col-sm-3 control-label error-text">密码错误</label>
    </div>
    <div class="form-group">
        <label for="controller" class="col-sm-2 control-label">确认密码</label>
        <div class="col-sm-6">
            <input type="password" class="form-control" id="controller" name='repassword' placeholder="请输入确认密码" value="<?php echo ($info["controller"]); ?>">
        </div>
        <label class="col-sm-3 control-label error-text">确认密码错误</label>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加会员</button>
        <input type="hidden" value="<?php echo U('User/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
clickForm($('#addbtn'), $('#add-user'));
</script>