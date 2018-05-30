<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-assoc">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">名称</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输表名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">表结构</label>
        <div class="col-sm-8">
            <textarea name='struct' class="col-sm-12"><?php echo ($info["struct"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属项目</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属项目</option>
                
                <?php if(is_array($pro)): foreach($pro as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
            </select>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-8">
            <textarea name='note' class="col-sm-12"><?php echo ($info["note"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-8">
        
        <button type="button" class="btn btn-default" id='addbtn'>添加关联目录表</button>
        <input type="hidden" value="<?php echo U('Assoc/insert');?>"/>
        
        </div>
    </div>
</form>

<script>
	/*
	formData 表单数据(html 中新增的一个api)
	以表单对象做参数 自动的把表单的数据打包
	当ajax 发送数据时 发送些formData
	达到发送表单内各数据项的目的
	*/
    // 根据添加按钮对象 和表单对象来异步处理
    clickForm($('#addbtn'), $('#add-assoc'));
	// $('#addbtn').click(function(){
	// 	var $form = $('#add-assoc')[0]; // 获取js 对象

	// 	var $formData = new FormData($form);
 //        // 也可以使用手动添加到表单
 //        // formData 对象既可以从表单生成数据 也可以手动的append 来添加
 //        // var fd = new FormData();
 //        // fd.append('username', '张三');
 //        // fd.append('age', 23);
	// 	var $url = $(this).next('input')[0].value;
	// 	$.ajax({
	// 		url:$url,
	// 		type:'post',
	// 		data:$formData,
 //            contentType:false,   // 必须false才会自动加上正确的Content-Type 
 //            processData:false, // 必须false才会避开jQuery对 formdata 的默认处理 XMLHttpRequest会对 formdata 进行正确的处理 
	// 		success:function(data){
 //                $("#admin-mess").show(2000).text(data).hide(1000);
	// 		}
	// 	});
	// });
</script>