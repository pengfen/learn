<?php if (!defined('THINK_PATH')) exit();?><div class='admin-mess'><?php echo ($_GET['mess']); ?></div>
<div id = 'right' class="col-md-10">
	<table class="table table-striped">
	    <thead>
	    	<tr>
	    		<th>编号</th>
	    		<?php if($flag == 1): ?><th>标题</th>
	    		<?php else: ?>
	    		<th>分类名</th><?php endif; ?>
	    		<th>父 id</th>
	    		<th>添加时间</th>
	    		<th>操作</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<?php if(is_array($info)): foreach($info as $key=>$v): ?><tr>
	    		<td><?php echo ($v["id"]); ?></td>
	    		<td>
	    		    <?php if($flag == 1): ?><a class="add" href="javascript:void(0);"><?php echo ($v["title"]); ?></a>
				  	<input type="hidden" name="" value="<?php echo U('TechnPage/techn', array('id'=>$v[id]));?>"/>
	    		    <?php else: ?>
	    		    <a class="add" href="javascript:void(0);"><?php echo ($v["catename"]); ?></a>
				  	<input type="hidden" name="" value="<?php echo U('TechnPage/show', array('id'=>$v[id]));?>"/><?php endif; ?>
	    		</td>
	    		<td><?php echo ($v["pid"]); ?></td>
	    		<td><?php echo date('Y-m-d H:i:s', $v[addtime]);?></td>
	    		<td>
	    		    <?php if($flag == 1): ?><a class="add" href="javascript:void(0);">显示文章详情</a>
				  	<input type="hidden" name="" value="<?php echo U('TechnPage/techn', array('id'=>$v[id]));?>"/>
	    		    <?php else: ?>
	    		    <a class="add" href="javascript:void(0);">显示所有子分类</a>
				  	<input type="hidden" name="" value="<?php echo U('TechnPage/show', array('id'=>$v[id]));?>"/><?php endif; ?>
	    		</td>
	    	</tr><?php endforeach; endif; ?>
	    	<tr><td colspan="5" id='page'><?php if($count != '0'): ?>共有 <?php echo ($count); ?> 条记录 <?php echo ($page); else: ?>没有数据<?php endif; ?></td></tr>
	    </tbody>
    </table>
</div>
<script type="text/javascript">
	click($('#add a'));// 动态加载添加界面模板
	click($('.add'));
	click($('.upd'));// 动态加载修改界面模板
</script>