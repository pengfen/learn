<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('Auth/insert');?>" method="post" enctype="multipart/form-data">


    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">权限名</label>
        <div class="col-sm-9">
        <input type="text" class="form-control" name='name' id="authname" placeholder="请输入权限名" value="<?php echo ($v["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for='' class="col-sm-2 control-label">权限父级</label>
        <div class="dropdown col-sm-9">
        <select name='pid'>
            <option value="0">请选择权限</option>


    <?php if(is_array($info)): foreach($info as $key=>$av): ?><option value="<?php echo ($av["id"]); ?>"><?php echo ($av["name"]); ?></option><?php endforeach; endif; ?>

        </select>
        </div>
    </div>
    <div class="form-group">
    <label for="controller" class="col-sm-2 control-label">权限控制器</label>
    <div class="col-sm-9">
        <input type="text" class="form-control" id="controller" name='controller' placeholder="请输入控制器名" value="<?php echo ($v["controller"]); ?>">
    </div>
    </div>
    <div class="form-group">
        <label for="action" class="col-sm-2 control-label">权限操作方法</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="action" name='action' placeholder="请输入操作方法名" value="<?php echo ($v["action"]); ?>">
        </div>
    </div>
    
    <div class="form-group">
        <label for="action" class="col-sm-2 control-label">权限关联图</label>
        <div class="col-sm-9">
            <input type="file" class="form-control" id="image" name='image' placeholder="请上传权限关联图"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">添加权限</button>
    
        </div>
    </div>
</form>