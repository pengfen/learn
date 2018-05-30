/**
 *author:lisuo
 *time:2015-7.28
*/
$(function(){
	checkUsername(); // 验证用户名
	checkEmail(); // 验证邮箱
	checkPass(); // 验证密码
	checkRepass(); // 验证确认密码
	$('#myform').submit(function(){
		var bool = true;
		if (!checkRepass()){
			bool = false;
		}
		if (!checkPass()){
			bool = false;
		}
		if (!checkUsername()) {
			bool = false;
		}
		return false;
	});
});

function checkRepass(){
	//验证确认密码（有问题）

	 $('#repassword').blur(function(){
	    var $parent=$(this).parent();
		$parent.find(".formtips").remove();
		if($(this).is('#repassword')){
			if($(this).val() != $('#password').val()){
				var errorMsg='两次密码不一致';
				$parent.append('<span class="formtips onError" style="color:red">'+errorMsg+'</span>');
				return false;
			}else{
				var okMsg="输入正确";
				$parent.append('<span class="formtips onSuccess" style="color:green">'+okMsg+'</span>');
				return true;
			}
		}
		
	 });
	 return true;
	
		
	// }).keyup(function(){
	// 	$(this).triggerHandler("blur");
	// }).focus(function(){
	// 	$(this).triggerHandler("blur");
}

function checkPass(){
	//验证密码 (有问题)
	$('#password').blur(function(){
		var $parent=$(this).parent();
		$parent.find(".formtips").remove();
		if($(this).is('#password')){
			if(this.value==""||this.value.length<6||this.value.length>12){
				var errorMsg='请输入6至12位';
				$parent.append('<span class="formtips onError" style="color:red">'+errorMsg+'</span>');
				return false;
			}else{
				var okMsg="输入正确";
				$parent.append('<span class="formtips onSuccess" style="color:green">'+okMsg+'</span>');
				return true;
			}
		}
		
	});
	return true;
}

function checkEmail(){
	//验证邮箱
	$('#email').blur(function(){
		var $parent=$(this).parent();
			$parent.find(".formtips").remove();
		if($(this).is('#email')){
			if(this.value=="" || (this.value!=="" && !/.+@.+\.[a-zA-Z]{2,4}$/.test(this.value))){
				var errorMsg='邮箱输入有误！';
				$parent.append('<span class="formtips onError" style="color:red">'+errorMsg+'</span>');
				return false;
			// }else{
			// 	var okMsg="输入正确";
			// 	$parent.append('<span class="formtips onSuccess" style="color:green">'+okMsg+'</span>');
			// 	return true;
			}
		}
		var $data = $(this).val();
		//alert($data);
		// 异步验证
		$.ajax({
			url:url,
			data:{data:$data},
			success:function(data){
				//alert(data);
				$parent.append('<span class="formtips onError" style="color:red">'+data+'</span>');
				return true;
			}
		});
	});
	return true;
}

function checkUsername(){
	//验证用户名
	$('#username').blur(function(){
		var $parent=$(this).parent();
		$parent.find(".formtips").remove();
		
		if($(this).is('#username')){
			if(this.value==""||this.value.length<2||this.value.length>6){
				var errorMsg='请输入真实姓名';
				$parent.append('<span class="formtips onError" style="color:red">'+errorMsg+'</span>');
				return false;
			}else{
				var okMsg="输入正确";
				$parent.append('<span class="formtips onSuccess" style="color:green">'+okMsg+'</span>');
				return true;
			}
		}
		
	});
	return true;
}
// 	$(function(){
// 		//文本框失去焦点后
		
	
	
	
	

// 	//提交，最终验证
// 	$('#send').click(function(){
// 		$("form :input.required").trigger('blur');
// 		var numError=$('form .onError').length;
// 		if(numError){
// 			return false;
// 		}
// 		alert("注册成功，激活连接已发送你的邮箱");
// 	})
// })