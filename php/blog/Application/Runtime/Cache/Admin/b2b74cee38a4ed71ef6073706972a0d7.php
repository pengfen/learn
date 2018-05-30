<?php if (!defined('THINK_PATH')) exit();?><table class="table table-striped">
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
        <td>所有分类</td><td><?php echo ($cate); ?></td>
    </tr>
    <tr>
        <td>发布时间</td><td><?php echo date('Y-m-d H:i:s', $info[addtime]);?></td>
    </tr>
    <tr>
        <td>所属权限</td><td><?php if($v[auth] == 0): ?>所有人可见<?php elseif($v[auth] == 1): ?>仅好友可见<?php elseif($v[auth] == 2): ?>指定好友可见<?php else: ?>仅自己可见<?php endif; ?></td>
    </tr>
</tbody>
</table>
<script>
$('#log-content').html($('#log-content').text());
</script>