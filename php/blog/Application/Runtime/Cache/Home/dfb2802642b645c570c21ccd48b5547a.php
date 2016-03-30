<?php if (!defined('THINK_PATH')) exit();?><script charset="utf-8" src="/blog/Public/Home/Js/ueditor.config.js"></script>
<script charset="utf-8" src="/blog/Public/Home/Js/ueditor.all.min.js"></script>
标题: <input type='text' name='title' value="<?php echo ($info["title"]); ?>"/>
<textarea name="dcontent" id="dcont" style="margin:10px 0px;">
<?php echo ($info["content"]); ?>
</textarea>
<block name='main'>
<a href='javascript:void(0);' id='advice-sub'>提交建议</a>
<input type="hidden" value="<?php echo U('Advice/insert');?>"/>
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
$('#advice-sub').click(function(){
var $title = $(":input[name=title]").val();
var $html = editor.getContent();
var $url = $(this).next('input').val();
$.ajax({
        url:$url,
        data:{title:$title,content:$html},
        success:function(data){
            alert(data);
            console.log(data);
        }
    });
});
</script>