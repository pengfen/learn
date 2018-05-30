<?php if (!defined('THINK_PATH')) exit();?><ul class="nav nav-list">
<?php if(is_array($plist)): foreach($plist as $key=>$v): ?><li>
		<a href="javascript:void(0);" class="dropdown-toggle">
			<i class="icon-desktop"></i>
			<span class="menu-text"> <?php echo ($v["name"]); ?> </span>
			<b class="arrow icon-angle-down"></b>
		</a>

		<ul class="submenu">
		<?php if(is_array($clist)): foreach($clist as $key=>$cv): if($cv[pid] == $v[id]): ?><li>
				<?php $contro = $cv['controller']; $action = $cv['action'];?>
				<a href="/index.php/Admin/<?php echo ($contro); ?>/<?php echo ($action); ?>">
					<i class="icon-double-angle-right"></i>
					<?php echo ($cv["name"]); ?>
				</a>
			</li><?php endif; endforeach; endif; ?>
		</ul>
	</li><?php endforeach; endif; ?>
</ul>