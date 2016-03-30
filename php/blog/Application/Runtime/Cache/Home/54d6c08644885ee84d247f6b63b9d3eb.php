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

<a href='javascript:void(0);' id='logsub'>提交日志</a>
<input type="hidden" value="<?php echo U('Log/insert');?>"/>

<select name='cid' id='log-cid'>
    <?php if(is_array($list)): foreach($list as $key=>$v): ?><option value="<?php echo ($v["id"]); ?>"><?php echo ($v["name"]); ?></option><?php endforeach; endif; ?>
</select>
<select name='auth' id='log-auth'>
    <option value="0">公开</option>
    <!-- <option value="1">好友可见</option>
    <option value="2">指定好友可见</option> -->
    <option value="3">仅自己可见</option>
</select>

<script type="text/javascript">
var editor = new baidu.editor.ui.Editor({
//编辑器配置
toolbars:[["source","undo","redo","emotion","bold","italic","forecolor","fontfamily","fontsize","backcolor","justifyleft","justifycenter","justifyjustify","lineheight","autotypeset","insertimage","map","preview","fullscreen"]],
initialFrameHeight: 200,
initialFrameWidth:700,
});
editor.render("dcont");	
</script>

<script>
$('#logsub').click(function(){
var $title = $(":input[name=title]").val();
var $html = editor.getContent();
var $url = $(this).next('input').val();
var $cid = $('#log-cid').val();
var $auth = $('#log-auth').val();
$.ajax({
        url:$url,
        data:{cid:$cid,auth:$auth,title:$title,content:$html},
        success:function(data){
            $('#tipmess').html(data).slideDown(500).animate({
                top: '+200px'
            }, 2000).slideUp(500);
            // alert(data);
            // console.log(data);
        }
    });
});
</script>