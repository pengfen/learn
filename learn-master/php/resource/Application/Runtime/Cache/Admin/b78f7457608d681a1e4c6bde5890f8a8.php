<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" id="upd-lesson">
<input type='hidden' name='id' value="<?php echo ($info["id"]); ?>">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">课程名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入课程名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="target" class="col-sm-2 control-label">学习目标</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='target' id="target" placeholder="请输入学习目标" value="<?php echo ($info["target"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="content" class="col-sm-2 control-label">学习内容</label>
        <div class="col-sm-8">
            <textarea name='content' class="col-sm-12"><?php echo ($info["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="program" class="col-sm-2 control-label">程序</label>
        <div class="col-sm-8">
            <textarea name='program' class="col-sm-12"><?php echo ($info["program"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="homework" class="col-sm-2 control-label">课后作业</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='homework' id="target" placeholder="请输入课后作业" value="<?php echo ($info["homework"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="answer" class="col-sm-2 control-label">作业答案</label>
        <div class="col-sm-8">
            <textarea name='answer' class="col-sm-12"><?php echo ($info["answer"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属分类</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属分类</option>
                
                <?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>" <?php if($info[pid] == $key): ?>selected<?php endif; ?>><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
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
        
        <button type="button" class="btn btn-default" id='updbtn'>修改课程</button>
        <input type="hidden" value="<?php echo U('Lesson/update');?>"/>
        
        </div>
    </div>
</form>

<script>
    clickForm($('#updbtn'), $('#upd-lesson'));
</script>