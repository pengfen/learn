<?php if (!defined('THINK_PATH')) exit();?>
<div class="panel panel-default">
	<div class="panel-heading">我的动态</div>
		<div class="panel-body">
		<ul>
		<?php if($list != ''): if(is_array($list)): $i = 0; $__LIST__ = $list;if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vo): $mod = ($i % 2 );++$i;?><li>
		    <table class='table table-bordered '>
		    	<tr>
		    		<td rowspan="4" width="60">
		    			<img src="/blog/Avatar/<?php echo ($headimg); ?>">
		    		</td>
		    		<td><?php echo ($vo["username"]); ?> : <?php if($vo[title] != ''): echo ($vo["title"]); else: ?> <?php echo ($vo["content"]); endif; ?></td>
		    	</tr>
		    	<tr><td><small style='color:#999'>发表于 <?php echo date('Y-m-d H:i:s',$vo['addtime']);?></small></td></tr>
		    	<tr>
		    		<td>
		    			<ul>
			    			<?php if(is_array($vo['review'])): $i = 0; $__LIST__ = $vo['review'];if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$voc): $mod = ($i % 2 );++$i;?><li>
			    				<table>
			    					<tr><td rowspan="2"><img src="/blog/Avatar/<?php echo ($voc["headimg"]); ?>"></td><td><?php echo ($voc["username"]); ?>: 	<?php echo ($voc["content"]); ?></td></tr>
			    					<tr><td>
			    						<?php echo date('Y-m-d H:i:s',$vo['addtime']);?>
			    						<input type="hidden" class='username' value="回复<?php echo ($voc["username"]); ?>">
			    						 <button class="btn btn-xs btn-default huifu-btn-c" type="button" >回复</button>
			    						 <input type="hidden" > <button class="btn btn-xs btn-default huifu-btn-d" type="button" style="display:none;float:right">发表</button>
										 <input type="hidden"  value='<?php echo ($voc["sender"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($vo["uid"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($voc["id"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($voc["path"]); ?>,<?php echo ($voc["id"]); ?>'>
					         			<ul>
										<?php if(is_array($voc['nr'])): $i = 0; $__LIST__ = $voc['nr'];if( count($__LIST__)==0 ) : echo "" ;else: foreach($__LIST__ as $key=>$vod): $mod = ($i % 2 );++$i;?><table>
			    					<tr><td rowspan="2"><img src="/blog/Avatar/<?php echo ($vod["headimg"]); ?>"></td><td><?php echo ($vod["username"]); ?>: 	<?php echo ($vod["content"]); ?></td></tr>
			    					<tr><td>
			    						<?php echo date('Y-m-d H:i:s',$vo['addtime']);?>
			    						<input type="hidden" class='username' value="回复<?php echo ($vod["username"]); ?>">
			    						 <button class="btn btn-xs btn-default huifu-btn-c" type="button" >回复</button>
			    						 <input type="hidden" > <button class="btn btn-xs btn-default huifu-btn-d" type="button" style="display:none;float:right">发表</button>
										 <input type="hidden"  value='<?php echo ($voc["sender"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($vo["uid"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($voc["id"]); ?>'>
					         			<input type="hidden"  value='<?php echo ($voc["path"]); ?>,<?php echo ($voc["id"]); ?>'>
											
											</ul>

			    					</td></tr>
			    					
			    				</table><?php endforeach; endif; else: echo "" ;endif; ?>
										</ul>

			    					</td></tr>
			    					
			    				</table>
			    			</li><?php endforeach; endif; else: echo "" ;endif; ?>
		    			</ul>
		    		</td>
		    	</tr>
		    	
		    	<tr>
		    		<td>
		    			<div class="col-lg-6">
					    <div class="input-group">
					      <input type="text" class="form-control huifu-con" placeholder="我也说一句">
					      <span class="input-group-btn">
					        <button class="btn btn-default huifu-btn" type="button" >发表</button>
					         <input type="hidden" class='pid' value='<?php echo ($vo["id"]); ?>'>
					         <input type="hidden" class='uid' value='<?php echo ($vo["uid"]); ?>'>
					      </span>
					    </div><!-- /input-group -->
					  </div><!-- /.col-lg-6 -->
		    		</td>
				</tr>

		    </table>
		</li><?php endforeach; endif; else: echo "" ;endif; ?>
		<?php else: ?>
		<li>暂无数据</li><?php endif; ?>
		</ul>
		</div>
    </div>
</div>