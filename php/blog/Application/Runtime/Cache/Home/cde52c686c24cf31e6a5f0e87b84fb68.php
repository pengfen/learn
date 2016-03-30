<?php if (!defined('THINK_PATH')) exit();?><div id = 'right' class="col-md-10">
	<table class="table table-striped">
	    <thead>
	    	<tr>
	    		<th>编号</th>
	    		<th>用户名</th>
	    		<th>生活记录</th>
	    		<th>添加时间</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<?php if(is_array($info)): foreach($info as $key=>$v): ?><tr>
	    		<td><?php echo ($v["id"]); ?></td>
	    		<td><?php echo ($name); ?></td>
	    		<td><?php if($v[oper] == 0): ?>发布了说说<?php elseif($v[oper] == 1): ?>发布了日志<?php else: ?>上传了图片<?php endif; ?></td>
	    		<td><?php echo date('Y-m-d H:i:s', $v[addtime]);?></td>
	    	</tr><?php endforeach; endif; ?>
	    </tbody>
    </table>
</div>