<?php if (!defined('THINK_PATH')) exit();?><div class="col-md-10">
	<h3><?php echo ($info["title"]); ?></h3>
	<div class="comment" style="border-top: 2px solid #c3dae8; padding-top: 8px; min-height: 200px;">
	    <p id="author_info" class="author_info">
	    楼主 : <?php echo ($name); ?> 于 <?php echo date('Y-m-d H:i:s', $info[addtime]);?> 发表
	    </p>
	    <p id="comment" class="elide">
	    <?php echo htmlspecialchars_decode($info['content']);?>
	    <!-- <?php echo ($info["content"]); ?> -->
	    </p>
	    
	</div>
	<?php if($minfo != ''): ?><div class="answer">
        <p id="answer_info">
        1楼 : <?php echo ($minfo["username"]); ?>(产品经理) 于 <?php echo date('Y-m-d H:i:s', $minfo[addtime]);?> 发表
        </p>
        <p id="comment" class="elide">
	    <?php echo ($minfo["content"]); ?>
	    </p>
    </div><?php endif; ?>
</div>