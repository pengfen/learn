<?php if (!defined('THINK_PATH')) exit();?><div style="margin-bottom:10px;">
    <input type="hidden" id='addReview' value="<?php echo U('Review/addReview');?>"/>
	<h3><?php echo ($info["title"]); ?></h3>
	<p>发表于 <?php echo date('Y-m-d H:i:s', $info[addtime]);?> | 阅读(<?php echo ($info["views"]); ?>)</p>
	<div id="log-content"><?php echo ($info["content"]); ?></div>
	<?php if($username != ''): ?>原创 : <?php echo ($username); endif; ?>
</div>
<!-- <?php if($flag == 1): ?><div class="col-lg-6">
    <div class="input-group">
        <input type="text" class="form-control huifu-con" placeholder="我也说一句">
        <span class="input-group-btn">
            <button class="btn btn-default huifu-btn" type="button" >发表</button>
            <input type="hidden" class='pid' value='<?php echo ($info["id"]); ?>'>
            <input type="hidden" class='uid' value='<?php echo ($vid); ?>'>
        </span>
    </div>
</div><?php endif; ?> -->
<script>
    $('#log-content').html($('#log-content').text());
    $('.huifu-btn').click(function(){
		$.ajax({
			url:$('#addReview').val(),
			type:'post',
			data:{uid:$(this).next('input').next('input').val(),content:$(this).parent('span').prev('input').val(),pid:$(this).next('input').val(),rid:$(this).next('input').next('input').val(),cateid:1},
			success:function(data){
				alert('评论成功！');
				//window.location = window.location.href;	
			}
		});
	});
</script>