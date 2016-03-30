<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal" action="<?php echo U('Techn/upd');?>" method="post">
<input type='hidden' name='id' value="<?php echo ($v["id"]); ?>"/>


    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">标题</label>
        <div class="col-sm-9">
        <input type='text' name='title' class="form-control" placeholder='请输入文章标题' value="<?php echo ($v["title"]); ?>" />
        </div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">所属分类</label>
        <div class="col-sm-9">
        <select name='pid'>
            <option value="0">请选择所属分类</option>

        
        <?php if(is_array($cateinfo)): foreach($cateinfo as $key=>$av): ?><option value="<?php echo ($key); ?>" <?php if($key == $v['pid']): ?>selected<?php endif; ?>><?php echo ($av); ?></option><?php endforeach; endif; ?>
    
        </select>
        </div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">内容</label>
        <div class="col-sm-9">
        <textarea name='content' cols="118" rows="15"><?php echo ($v["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">上传图片</label>
        <div class="col-sm-9">
        <input type="file" class="form-control" id="image" name='image' placeholder="请上传相关介绍图"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
        
    <button type="submit" class="btn btn-default">修改文章</button>

        </div>
    </div>
</form>