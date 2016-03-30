<?php if (!defined('THINK_PATH')) exit();?><div>
	<ul style="list-style:none;">
	    <?php if($info[ac] != ''): ?><li>所属项目名 <?php echo ($name); ?></li>
	    <li><?php echo ($info["ac"]); ?></li>
		<li>|--- <?php echo nl2br($info[content]);?></li>
		<?php else: ?>
		<li>没有数据 
		    <a href="javascript:void(0)" id="add-logic">添加方法逻辑</a>
            <input type='hidden' value="<?php echo U('Logic/add', array('ac'=>$ac, 'pid'=>$pid));?>"/>
        </li><?php endif; ?>
		<?php if($info[note] != ''): ?><li>|--- 备注</li>
		<li>|------ <?php echo nl2br($info[note]);?></li><?php endif; ?>
	</ul>
</div>
<script>
click($('#add-logic'));
</script>