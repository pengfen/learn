<?php if (!defined('THINK_PATH')) exit();?><!--
<form action="<?php echo U('Log/insert');?>" method="post" enctype="multipart/form-data">
    <script id='container' name='content' type="text/plain"></script>
    <button>提交</button>
</form>
<script type="text/javascript" charset="utf-8" src="/blog/Public/Home/Js/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/blog/Public/Home/Js/ueditor.all.min.js"></script>
<script type="text/javascript">
	var ue = UE.getEditor('container');
	// var ue = UE.getEditor('container',{
    //         UEDITOR_HOME_URL:'/blog/Public/Baidu/',
    //         serverUrl:'<?php echo U('Home/Edit/upload');?>'
    //     });
    window.onload = function () {
    //['upload','upload1'];
    window.UEDITOR_CONFIG.savePath= ['upload','upload1'];
    window.UEDITOR_CONFIG.imageUrl="<?php echo U(GROUP_NAME.'/Blog/upload');?>"
    //图片上传提交地址
    window.UEDITOR_CONFIG.imagePath=" /blog/Uploads/";
    //图片修正地址，引用了fixedImagePath,
    UE.getEditor('container');
}
</script>-->

<script charset="utf-8" src="/blog/Public/Home/Js/ueditor.config.js"></script>
<script charset="utf-8" src="/blog/Public/Home/Js/ueditor.all.min.js"></script>
标题: <input type='text' name='title' value="<?php echo ($info["title"]); ?>"/>
<textarea name="dcontent" id="dcont" style="margin:10px 0px;">
<?php echo ($info["content"]); ?>
</textarea>

<a href='javascript:void(0);' id='logupd'>编辑日志</a>
<input type="hidden" value="<?php echo U('Log/update');?>"/>
<input type="hidden" name='id' value="<?php echo ($info["id"]); ?>"/>

<script type="text/javascript">
var editor = new baidu.editor.ui.Editor({
//编辑器配置
toolbars:[["source","undo","redo","emotion","bold","italic","forecolor","fontfamily","fontsize","backcolor","justifyleft","justifycenter","justifyjustify","lineheight","autotypeset","insertimage","map","preview","fullscreen"]],
initialFrameHeight: 200,
initialFrameWidth:700,
});
editor.render("dcont");	
</script>

<script type="text/javascript">
$('#logupd').click(function(){
var $title = $(":input[name=title]").val();
var $html = editor.getContent();
var $url = $(this).next('input')[0].value;
var $id = $(":input[name=id]").val();
//var $cid = $('#log-cid').val();
//var $auth = $('#log-auth').val();
$.ajax({
        url:$url,
        data:{id:$id,title:$title,content:$html},
        success:function(data){
        	$('#tipmess').html(data).slideDown(500).animate({
                top: '+200px'
            }, 2000).slideUp(500);
            //alert(data);
            //console.log(data);
        }
    });
});
</script>