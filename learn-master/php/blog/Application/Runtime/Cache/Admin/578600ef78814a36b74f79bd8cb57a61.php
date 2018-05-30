<?php if (!defined('THINK_PATH')) exit();?><div id="add">
    <a href="javascript:void(0)" id="reviews">回复</a>
    <input type='hidden' name="" value="<?php echo U('AdviceReviews/add', array('id'=>$info[id]));?>"/>
</div>
<table class="table table-striped">
<tbody>
    <tr>
        <td>标题</td><td><?php echo ($info["title"]); ?></td>
    </tr>
    <tr>
        <td>内容</td><td id="log-content"><?php echo ($info["content"]); ?></td>
    </tr>
    <tr>
        <td>作者</td><td><?php echo ($name); ?></td>
    </tr>
    <tr>
        <td>浏览数</td><td><?php echo ($info["views"]); ?></td>
    </tr>
    <tr>
        <td>回复数</td><td><?php echo ($info["reviews"]); ?></td>
    </tr>
    <tr>
        <td>发布时间</td><td><?php echo date('Y-m-d H:i:s', $info[addtime]);?></td>
    </tr>
</tbody>
</table>
<script>
click($('#reviews'));
$('#log-content').html($('#log-content').text());
</script>