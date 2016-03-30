<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('Manager/update');?>" method="post">

    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" name='username' id="username" placeholder="请输入用户名" value="<?php echo ($info["username"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">邮箱</label>
        <div class="col-sm-9">
            <input type="email" class="form-control" name='email' id="email" placeholder="请输入用户邮箱" value="<?php echo ($info["email"]); ?>">
        </div>
    </div>
    
    <div class="form-group">
        <label for='' class="col-sm-2 control-label">职位</label>
        <div class="dropdown col-sm-9">
	        <select name='rid'>
	  	        <option value="0">请选择职位</option>

			
	<?php if(is_array($data)): foreach($data as $key=>$rname): ?><option value="<?php echo ($key); ?>" <?php if($info[rid] == $key): ?>selected<?php endif; ?>><?php echo ($rname); ?></option><?php endforeach; endif; ?>

	        </select>
	    </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
	
    <button type="submit" class="btn btn-default">修改管理员</button>

        </div>
    </div>
</form>