<?php if (!defined('THINK_PATH')) exit();?>
<!-- <form class="form-horizontal" action="<?php echo U('Assoc/insert');?>" method="post"> -->
<form class="form-horizontal" id="add-lesson">

    <div class="form-group">
        <label for="tablename" class="col-sm-2 control-label">课程名</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='name' id="tablename" placeholder="请输入课程名" value="<?php echo ($info["name"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="target" class="col-sm-2 control-label">学习目标</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='target' id="target" placeholder="请输入学习目标" value="<?php echo ($info["target"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="content" class="col-sm-2 control-label">学习内容</label>
        <div class="col-sm-8">
            <textarea name='content' class="col-sm-12"><?php echo ($info["content"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="program" class="col-sm-2 control-label">程序</label>
        <div class="col-sm-8">
            <textarea name='program' class="col-sm-12"><?php echo ($info["program"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="homework" class="col-sm-2 control-label">课后作业</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name='homework' id="target" placeholder="请输入课后作业" value="<?php echo ($info["homework"]); ?>">
        </div>
    </div>
    <div class="form-group">
        <label for="answer" class="col-sm-2 control-label">作业答案</label>
        <div class="col-sm-8">
            <textarea name='answer' class="col-sm-12"><?php echo ($info["answer"]); ?></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="authname" class="col-sm-2 control-label">所属分类</label>
        <div class="col-sm-8">
            <select name='pid'>
                <option value="0">请选择所属分类</option>
                
                <?php if(is_array($data)): foreach($data as $key=>$v): ?><option value="<?php echo ($key); ?>"><?php echo ($v); ?></option><?php endforeach; endif; ?>
                
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
        
        <button type="button" class="btn btn-default" id='addbtn'>添加课程</button>
        <input type="hidden" value="<?php echo U('Lesson/insert');?>"/>
        
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
    clickForm($('#addbtn'), $('#add-lesson'));
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