<?php if (!defined('THINK_PATH')) exit();?><script type="text/javascript">
	//点击下载调用此自定义函数
	function load($id){	
	    var $url="<?php echo U('Resource/download');?>";
		$.ajax({
			url:$url,
			data:{id:$id},
			success:function(demo){
				if(demo){
					var path=$('#test').attr('data')+'/Uploads/'+demo;
					location.href = path;
				 }else{
				 	alert('您的积分不够，请分享资源！');	 
				 }	
			}
		});
	}
</script>
<div id='test' data="/blog"></div>
<h1 class="label label-info">技术共享</h1><br/><br/>
<!--author:lishuo;time:2015-8-2-->
<?php if(is_array($data)): $i = 0; $__LIST__ = $data;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><div class="panel panel-info">
		<div class="panel-heading">
			<h3 class="panel-title">题目：<?php echo ($vo["header"]); ?>
				&nbsp;&nbsp;<span class="badge"><?php echo ($vo["score"]); ?></span> 
				<small><span>&nbsp;&nbsp;&nbsp;&nbsp;分享者:<?php echo ($vo["username"]); ?> &nbsp; 分享时间:<?php echo date('Y-m-d',$vo['addtime']);?> &nbsp;下载: <?php echo ($vo["download"]); ?> 次</span></small>
			</h3>
		</div>
		<div class="panel-body">
			简介：<?php echo htmlspecialchars_decode($vo['main']);?>
			<nav>
			  <ul class="pager" style="margin:0px">  
			    <li class="next"><a><button onclick="load(<?php echo ($vo["id"]); ?>)">下载 <span aria-hidden="true">&rarr;</span></button></a></li>
			  </ul>
			</nav>
		</div>
	</div><?php endforeach; endif; else: echo "" ;endif; ?>
<center>
	<nav>
		<ul class="pagination">
			<li>
				<a href="#" aria-label="Previous">
					<span aria-hidden="true"><<</span>
				</a>
			</li>
			<li>
				<a href="#">1</a>
			</li>
			<li>
				<a href="#">2</a>
			</li>
			<li>
				<a href="#">3</a>
			</li>
			<li>
				<a href="#">4</a>
			</li>
			<li>
				<a href="#" aria-label="Next">
					<span aria-hidden="true">>></span>
				</a>
			</li>
		</ul>
	</nav>
</center>