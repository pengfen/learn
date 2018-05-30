<?php if (!defined('THINK_PATH')) exit();?><div class="user-info">
    <div>
        <span>呢称</span>
        <input class="username"  type="text" name='username' placeholder="请输入你的名字" value="<?php echo ($info["username"]); ?>" />
    </div>
    <div>
        <span>职位</span>
        <select name="vocation" class="vocation">
            <option value="0">请选择你的职位</option>   
        </select>
    </div>
    <div>
        <span>城市</span>
        <select name="province" class="province">
            <option value="0">选择省份</option>   
        </select>
        <select name="city" class="city">
            <option value="0">选择城市</option>   
        </select>
        <select name="area" class="area">
            <option value="0">选择区县</option>   
        </select>
    </div>
    <div>
        <span>性别</span>
        <input type="radio" name="sex" value="0"/> 保密
        <input type="radio" name="sex" value="1"/> 男
        <input type="radio" name="sex" value="2"/> 女
    </div>
    <div>
        <span>个性签名</span>
        <textarea></textarea>
    </div>
    <div>
        <span></span>
        <input class="addbtn" type="submit" value="保 存" style="background: #39b94e; color: #fff; font-size: 16px; font-weight: bold;" />
    </div>
</div>