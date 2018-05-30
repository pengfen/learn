<?php if (!defined('THINK_PATH')) exit();?><!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title><?php echo ($title); ?></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="/resource/Public/Assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="/resource/Public/Assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="/resource/Public/Assets/css/ace.min.css" />
		<link rel="stylesheet" href="/resource/Public/Assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="/resource/Public/Assets/css/ace-skins.min.css" />
		<script type="text/javascript" src="/resource/Public/Bootstrap/js/jquery-2.1.4.min.js"></script>
		<script src="/resource/Public/Assets/js/ace-extra.min.js"></script>
		
<link rel="stylesheet" type="text/css" href="/resource/Public/Admin/Css/apeng.css"/>

	</head>

	<body>
	    <!-- 头部导航 -->
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="glyphicon glyphicon-fire"></i>
							个人资料后台管理系统
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
					    <?php echo W('Nav/message');?> 
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="/resource/Public/Assets/avatars/user.jpg" alt="<?php echo ($_SESSION['manager']['username']); ?>'s Photo" />
								<span class="user-info">
									<small>欢迎光临,</small>
									<?php echo ($_SESSION['manager']['username']); ?>
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">

								<li>
									<a href="#">
										<i class="icon-user"></i>
										个人资料
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="<?php echo U('Login/logout');?>">
										<i class="icon-off"></i>
										退出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->

					<?php echo W('Nav/menu');?>

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>


				<div class="main-content" style="position: relative;">
				<!-- 提示信息 -->
				    <div id="admin-mess" style="width:100px; height:100px; background: pink; position: absolute; left: 400px; top: 170px; z-index:2; box-shadow: 0px 0px 10px red; border-radius:50px; text-align: center; line-height: 100px; font-size: 20px; color: #fff; display: none;">
				    	添加成功
				    </div>
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="<?php echo U('Index/index');?>">首页</a>
							</li>
							<li class="active"></li>
						</ul><!-- .breadcrumb -->
						<input type="hidden" name="controller" value="<?php echo (CONTROLLER_NAME); ?>"/>
						<input type="hidden" name="action" value="<?php echo (ACTION_NAME); ?>"/>
						<script type="text/javascript">
						    $href = "<?php echo U(CONTROLLER_NAME/ACTION_NAME);?>"; // 获取当前的路径
						    $controller = $(":input[name=controller]").val(); // 获取对应的控制器
						    $action = $(":input[name=action]").val(); // 获取对应的操作方法
						    $url = "<?php echo U('Index/breadcrumb');?>"; // 处理
						    $.ajax({
						    	url:$url,
						    	data:{controller:$controller,action:$action},
						    	success:function(data){
						    		$li = $("li[class=active]");
						    		$a = "<a href='" + $href + "'>" + data + "</a>";
						            $li.append($a);
						    		//alert(data[0]);
						    		//alert(data[1]);
						    	},
						    	//dataType:'json'
						    });
						</script>

						<div class="nav-search" id="nav-search">
							<form class="form-search" action="<?php echo ($link); ?>">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" name="search" />
									<i class="icon-search nav-search-icon"></i>
								</span>
								<button>提交</button>
							</form>
						</div><!-- #nav-search -->

					</div>
				</div>
				<!-- /.main-content -->
				<script type="text/javascript">
				// 处理单击
				function click(click){
					click.click(function(){
						var $url = $(this).next('input')[0].value;
						ajax($url);
						});
				}
				function ajax($url){
					// 异步请求
					$.ajax({
						url: $url,
						success: function(data){
							$('#right').text(''); // 清空以前的数据
							$('#right').append(data); // 将对应的模板放进主页显示
						}
					});
				}

				// 处理ajax 提交整个表单
				/*
				formData 表单数据(html 中新增的一个api)
				以表单对象做参数 自动的把表单的数据打包
				当ajax 发送数据时 发送些formData
				达到发送表单内各数据项的目的
				*/
				function clickForm(click, form) {
					click.click(function(){
						var $form = form[0]; // 获取js 对象
						var $formData = new FormData($form);
				        // 也可以使用手动添加到表单
				        // formData 对象既可以从表单生成数据 也可以手动的append 来添加
				        // var fd = new FormData();
				        // fd.append('username', '张三');
				        // fd.append('age', 23);
						var $url = $(this).next('input')[0].value;
						$.ajax({
							url:$url,
							type:'post',
							data:$formData,
				            contentType:false,   // 必须false才会自动加上正确的Content-Type 
				            processData:false, // 必须false才会避开jQuery对 formdata 的默认处理 XMLHttpRequest会对 formdata 进行正确的处理 
							success:function(data){
				                $("#admin-mess").show(2000).text(data).hide(1000);
							}
						});
					});
				}
				
				</script>
				
<div id="add">
    <a href="javascript:void(0)">添加实例</a>
    <input type='hidden' value="<?php echo U('Instance/add');?>"/>
    <a href="<?php echo U('Instance/index');?>">返回实例列表</a>
</div>
<div class='admin-mess'><?php echo ($_GET['mess']); ?></div>
<div id = 'right' class="col-md-10">
	<table class="table table-striped">
	    <thead>
	    	<tr>
	    		<th>编号</th>
	    		<th>实例名</th>
	    		<!-- <th>表结构名</th>
	    		<th>表备注</th> -->
	    		<th>操作</th>
	    	</tr>
	    </thead>
	    <tbody>
	    	<?php if(is_array($info)): foreach($info as $key=>$v): ?><tr style="height:35px; line-height: 35px; overflow:hidden;">
	    		<td><?php echo ($key + 1); ?></td>
	    		<td>
	    		    <a class="detail" href="javascript:void(0)"><?php echo ($v["name"]); ?></a>
	    			<input type="hidden" value="<?php echo U('Instance/detail', array('id'=>$v[id]));?>">
	    		</td>
	    		<!-- <td style="width:400px; height:35px; line-height: 35px; overflow:hidden;"><?php echo ($v["struct"]); ?></td>
	    		<td style="width:200px; height:35px; line-height: 35px; overflow:hidden;"><?php echo ($v["note"]); ?></td> -->
	    		<td>
	    			<a class="detail" href="javascript:void(0)">详情</a>
	    			<input type="hidden" value="<?php echo U('Instance/detail', array('id'=>$v[id]));?>">
	    			<a class="upd" href="javascript:void(0);">修改</a>
				  	<input type="hidden" name="" value="<?php echo U('Instance/edit', array('id'=>$v[id]));?>"/>
				  	<a href="<?php echo U('Instance/delete', array('id'=>$v[id]));?>">删除</a>
	    		</td>
	    	</tr><?php endforeach; endif; ?>
	    	<tr><td colspan="5" id='page'><?php if($count != ''): ?>共有 <?php echo ($count); ?> 条记录 <?php echo ($page); else: ?>没有数据<?php endif; ?></td></tr>
	    </tbody>
    </table>
</div>
<script type="text/javascript">
	click($('#add a'));  // 动态加载添加界面模板
	click($('.upd'));    // 动态加载修改界面模板
	click($('.detail')); // 动态加载详情界面
</script>

				

				<div class="ace-settings-container" id="ace-settings-container">
					<div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
						<i class="icon-cog bigger-150"></i>
					</div>

					<div class="ace-settings-box" id="ace-settings-box">
						<div>
							<div class="pull-left">
								<select id="skin-colorpicker" class="hide">
									<option data-skin="default" value="#438EB9">#438EB9</option>
									<option data-skin="skin-1" value="#222A2D">#222A2D</option>
									<option data-skin="skin-2" value="#C6487E">#C6487E</option>
									<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
								</select>
							</div>
							<span>&nbsp; 选择皮肤</span>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
							<label class="lbl" for="ace-settings-navbar"> 固定导航条</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
							<label class="lbl" for="ace-settings-sidebar"> 固定滑动条</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
							<label class="lbl" for="ace-settings-breadcrumbs">固定面包屑</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
							<label class="lbl" for="ace-settings-rtl">切换到左边</label>
						</div>

						<div>
							<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
							<label class="lbl" for="ace-settings-add-container">
								切换窄屏
								<b></b>
							</label>
						</div>
					</div>
				</div><!-- /#ace-settings-container -->
			</div><!-- /.main-container-inner -->

			<!-- 返回顶部 -->
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div> 
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='/resource/Public/Assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
		</script>
		<script src="/resource/Public/Assets/js/bootstrap.min.js"></script>
		<script src="/resource/Public/Assets/js/typeahead-bs2.min.js"></script>
		<script src="/resource/Public/Assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="/resource/Public/Assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="/resource/Public/Assets/js/jquery.slimscroll.min.js"></script>
		<script src="/resource/Public/Assets/js/jquery.easy-pie-chart.min.js"></script>
		<script src="/resource/Public/Assets/js/jquery.sparkline.min.js"></script>
		<script src="/resource/Public/Assets/js/flot/jquery.flot.min.js"></script>
		<script src="/resource/Public/Assets/js/flot/jquery.flot.pie.min.js"></script>
		<script src="/resource/Public/Assets/js/flot/jquery.flot.resize.min.js"></script>
		<script src="/resource/Public/Assets/js/ace-elements.min.js"></script>
		<script src="/resource/Public/Assets/js/ace.min.js"></script>
</body>
</html>