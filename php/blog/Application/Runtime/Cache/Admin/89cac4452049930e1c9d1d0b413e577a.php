<?php if (!defined('THINK_PATH')) exit();?><style type="text/css">
	ul,li{
		list-style: none;
	}
	.main-header{
		padding-left: 20px; 
	}
	#distribute{
		padding: 20px;
	}
</style>
<div class="main-header">正在为角色 <span style='color:red;'><?php echo ($name); ?></span> 分配权限</div>
<form id='distribute' action="<?php echo U('Role/updDist');?>" method="post">
<input type='hidden' name='id' value="<?php echo ($id); ?>"/>
<div class="distribute">
	<ul>
	<?php if(is_array($pinfo)): foreach($pinfo as $key=>$pv): ?><li class="prole">
	        <input type='checkbox' name='authname[]' value="<?php echo ($pv["id"]); ?>" <?php if(in_array($pv[id], $aids)): ?>checked="checked"<?php endif; ?> /> <?php echo ($pv["name"]); ?>
	        <ul>
	        <?php if(is_array($sinfo)): foreach($sinfo as $key=>$sv): if($sv[pid] == $pv[id]): ?><li class="srole">
	                <input type="checkbox" name="authname[]" value="<?php echo ($sv["id"]); ?>" <?php if(in_array($sv[id], $aids)): ?>checked="checked"<?php endif; ?> /> <?php echo ($sv["name"]); ?>
	                <ul>
	                <?php if(is_array($tinfo)): foreach($tinfo as $key=>$tv): if($tv[pid] == $sv[id]): ?><li class="trole" style="display:inline-block;">
	                    <input type='checkbox' name="authname[]" value="<?php echo ($tv["id"]); ?>" <?php if(in_array($tv[id], $aids)): ?>checked="checked"<?php endif; ?>/> <?php echo ($tv["name"]); ?>
	                    </li><?php endif; endforeach; endif; ?>
	                </ul>
	            </li><?php endif; endforeach; endif; ?>
	        </ul>
	    </li><?php endforeach; endif; ?>
	</ul>
</div>
<script type="text/javascript">
    $('.prole :checkbox').click(function(){
    	// $(this).parent() 获取当前元素的父元素 --> li
    	// $(this).parent().find('input') 获取当前父元素下所有的input子元素
    	// 长度属性 length --> $(this).parent().find('input').length;
    	// $(this)[0] --> 转为js 对象 checked js对象的属性
    	// alert($(this)[0].checked);
    	if ($(this)[0].checked == false) {
    		$(this).parent().find('input').attr('checked', false);
    	} else {
    		$(this).parent().find('input').attr('checked', true);
    	}
    	// $(this).parent().find('input').each(function(){
    	// 	if($(this).attr('checked')){
    	// 		$(this).attr('checked', false);
    	// 	} else {
    	// 		$(this).attr('checked', true);
    	// 	}
    	// });
    });
</script>
<div class="clear"></div>
<input type='submit' class="submitbtn disbtn" value="分配权限" />
</form>