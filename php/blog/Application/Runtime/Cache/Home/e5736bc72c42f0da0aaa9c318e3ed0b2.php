<?php if (!defined('THINK_PATH')) exit();?><a href='javascript:void(0);' id='write-log'>写日志</a>
<input type="hidden" value="<?php echo U('Log/add');?>"/>
<!-- <a href='javascript:void(0);' id='theme-log'>模板日志</a>
<input type="hidden" value="<?php echo U('Log/theme');?>"/> -->
<script type="text/javascript">
$(function(){
	click($('#write-log')); // 写日志异步加载
	click($('#theme-log')); // 模板日志异步加载
	function click(click){
		click.click(function(){
			$url = $(this).next('input')[0].value;
		    ajax($url);
		});
	}
	function ajax($url){
		$.ajax({
			url:$url,
			success:function(data){
				$('#content').text('');
				$('#content').append(data);
			}
		});
	}
});
</script>
<ul class="list-group"id='log-cate'>
    <li class="list-group-item">日志分类管理</li>
    <li class="list-group-item">个人日记(此分类不支持编辑及删除)</li>
    <?php if(is_array($list)): foreach($list as $key=>$v): ?><li class="list-group-item" style="position:relative;"><span><?php echo ($v["name"]); ?></span>
		<span style='position:absolute; bottom:5px; right:10px'>
			<a href='javascript:void(0);' class='upd-cate'>编辑</a>
			<input type='hidden' value="<?php echo U('LogCate/update', array('id'=>$v[id]));?>"/>
			<!-- <input type="hidden" name='id' value="<?php echo ($v[id]); ?>"/> -->
			<a href="<?php echo U('LogCate/delete', array('id'=>$v[id]));?>">删除</a>
		</span>
	</li><?php endforeach; endif; ?>
</ul>
<div>
    <a href='javascript:void(0);' id='add-cate'>添加分类</a>
    <input type='hidden' value="<?php echo U('LogCate/insert');?>"/>
</div>
<script type="text/javascript">
    $('.upd-cate').click(function(){
    	$url = $(this).next('input')[0].value;
    	$val = $(this).parent().prev('span').text();
    	$parent = $(this).parent().parent();
    	$value = $parent.html();
    	// 清除列表项中的内容 再将表单内容追加到列表项中
    	$parent.text('');
    	$form = "<form action='"+ $url +"'><input type='text' name='name' value='"+ $val +"'/><button type='submit'>确定</button><button type='reset'>取消</button></form>";
    	$parent.append($form);
    	// 单击取消时将以前的内容追加到列有项中
    	$(":input[type=reset]").click(function(){
    		$parent.text('');
    		$parent.append($value);
    	});
    });
    
	$('#add-cate').click(function(){
		$url = $(this).next('input')[0].value;
		$li = "<li class='list-group-item'><form action='"+$url+"'><input type='text' name='name'/><button type='submit'>确定</button><button type='reset'>取消</button></form></li>";
		$('#log-cate').append($li); // 将列表中追加一个列有项
		// 单击取消时将以刚追加的列表项从列表中移除
		$(":input[type=reset]").click(function(){
			$('#log-cate li:last').remove();
		});
	});
</script>