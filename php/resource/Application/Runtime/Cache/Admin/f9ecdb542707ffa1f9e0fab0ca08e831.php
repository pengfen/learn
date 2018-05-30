<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Dir/update');?>" method="post"> -->
<form class="form-horizontal" id="upd-dir">
<input type='hidden' name='id' value="<?php echo ($info["id"]); ?>"/>

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入功能名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属项目</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属项目</option>
                
<?php if(is_array($pro)): foreach($pro as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['pid'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>

            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">对应表</label>
        <div class="col-sm-8">
            <select name='aid' id="aid">
                <option value="0">请选择对应表</option>
                <!-- 
<?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info['aid'] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>
 -->
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="controller" class="col-sm-2 control-label">控制器名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="controller" name='controller' placeholder="请输入控制器名" value="<?php echo ($info["controller"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="controller" class="col-sm-2 control-label">控制器中操作方法</label>
        <div class="col-sm-8">
            <textarea name='method' class="col-sm-12"><?php echo ($info["method"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">模型名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" id="model" name='model' placeholder="请输入模型名" value="<?php echo ($info["model"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">模型中操作方法</label>
        <div class="col-sm-8">
            <textarea name="metmod" class="col-sm-12"><?php echo ($info["metmod"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">模板</label>
        <div class="col-sm-8">
            <textarea name="template" class="col-sm-12"><?php echo ($info["template"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="model" class="col-sm-2 control-label">描述</label>
        <div class="col-sm-8">
            <textarea name='des' class="col-sm-12"><?php echo ($info["des"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
  <button type="button" id="updbtn" class="btn btn-default">修改目录</button>
  <input type="hidden" value="<?php echo U('Dir/update');?>">

        </div>
    </div>
</form>

<script>
clickForm($('#updbtn'), $('#upd-dir'))
</script>