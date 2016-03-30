<?php if (!defined('THINK_PATH')) exit();?><div>
	<ul>
		<li><?php echo ($info["name"]); ?></li>
		<li>|--- <?php echo ($info["controller"]); ?></li>
		<?php if(is_array($method)): foreach($method as $key=>$v): ?><li>|------ <?php echo ($v); ?></li><?php endforeach; endif; ?>
		<?php if($info['model'] != ''): ?><li>|--- <?php echo ($info["model"]); ?></li>
			<?php if(is_array($mod)): foreach($mod as $key=>$mv): ?><li>|------ <?php echo ($mv); ?></li><?php endforeach; endif; endif; ?>
		<?php if($info['template'] != ''): ?><li>|--- 模板</li>
			<?php if(is_array($template)): foreach($template as $key=>$tv): ?><li>|------ <?php echo ($tv); ?></li><?php endforeach; endif; endif; ?>
		<?php if($info['struct'] != ''): ?><li>|--- 表结构</li>
			<li>|------ <?php echo ($info["struct"]); ?></li><?php endif; ?>
		<?php if($info['note'] != ''): ?><li>|--- 备注</li>
			<li>|------ <?php echo ($info["note"]); ?></li><?php endif; ?>
		<?php if($info['des'] != ''): ?><li>|--- 描述</li>
			<li>|------ <?php echo ($info["des"]); ?></li><?php endif; ?>
	</ul>
</div>