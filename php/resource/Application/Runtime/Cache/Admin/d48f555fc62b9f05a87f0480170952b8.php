<?php if (!defined('THINK_PATH')) exit();?>
<form class="form-horizontal">
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">标题</label>
        <div class="col-sm-9"><?php echo ($info["title"]); ?></div>
    </div>
    <div class="form-group">
        <label for="template" class="col-sm-2 control-label">内容</label>
        <div class="col-sm-9"><?php echo nl2br($info[content]);?></div>
    </div>
    <?php if($info['img'] != ''): ?><div class="form-group">
        <label for="template" class="col-sm-2 control-label"></label>
        <div class="col-sm-9"><img src="/Public/<?php echo ($info["img"]); ?>"/></div>
    </div><?php endif; ?>
</form>