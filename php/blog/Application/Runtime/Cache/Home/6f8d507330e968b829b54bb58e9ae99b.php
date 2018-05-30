<?php if (!defined('THINK_PATH')) exit();?><ul class="list-group">
<?php if(is_array($info)): foreach($info as $key=>$v): ?><li class="list-group-item">
	<p>
	    <a href="javascript:void(0);" class="detail"><?php echo ($v["title"]); ?></a>
	    <input type="hidden" value="<?php echo U('Log/detail', array('id'=>$v[id]));?>" />
	    <span>于 <?php echo date('Y-m-d H:i:s', $v['issuetime']);?> 发布</span>
	</p>
	<span>阅读(<?php echo ($v["views"]); ?>)</span>
	<!-- 原创:<?php echo ($username); ?> -->
</li><?php endforeach; endif; ?>
</ul>
<script>
    click($('.detail')); // 建议列表
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
				clearTimeout($timer);
				$('#content').text('');
				$('#content').html(data);
			}
		});
	}
    var $url = "<?php echo U('Log/friend');?>";
	var setting = {
		url:$url,
		success:function(data){
			$('#content').text('');
	    	$('#content').append(data);
		}
	};
	var $timer = setTimeout(function(){$.ajax(setting)}, 2000);
</script>