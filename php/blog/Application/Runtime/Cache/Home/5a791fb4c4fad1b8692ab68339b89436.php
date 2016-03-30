<?php if (!defined('THINK_PATH')) exit();?><div class='admin-mess'><?php echo ($_GET['mess']); ?></div>
<div><a href="javascript:void(0);" id="add-advice">我要提建议</a><input type="hidden" value="<?php echo U('Advice/add');?>"></div>
<div class="col-md-10">
	<?php if(is_array($info)): foreach($info as $key=>$v): ?><h3>
	    <a href="javascript:void(0);" class='advice-detail'><?php echo ($v["title"]); ?></a>
	    <input type="hidden" value="<?php echo U('Advice/detail', array('id'=>$v[id]));?>" />
	</h3>
	<div class="comment">
	    <p id="author_info" class="author_info">
	    提问人:<?php echo ($name); ?> | 阅读 (<?php echo ($v["views"]); ?>) | 回复 (<?php echo ($v["reviews"]); ?>)
	    </p>
	    <p id="comment" class="elide">
	    <?php echo htmlspecialchars_decode($v['content']);?>
	    <!-- <?php echo ($v["content"]); ?> -->
	    </p>
	</div><?php endforeach; endif; ?>
</div>
<script type="text/javascript">
$(function(){
	click($('#add-advice')); // 建议
	click($('.advice-detail')); // 建议详情
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