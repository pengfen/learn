<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-project">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输项目名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="des" class="col-sm-2 control-label">项目描述</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='des' id="des" placeholder="请输入项目描述" value="<?php echo ($info["des"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">技术</label>
        <div class="col-sm-8">
            <textarea name='techn' class="col-sm-12"><?php echo ($info["techn"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">总结</label>
        <div class="col-sm-8">
            <textarea name='summary' class="col-sm-12"><?php echo ($info["summary"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">开发环境</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='env' id="env" placeholder="请输项目开始环境" value="<?php echo ($info["env"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加项目记录</button>
        <input type="hidden" value="<?php echo U('Project/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#addbtn'), $('#add-project'));
</script>