// 处理首页逻辑信息
var fs = require('fs');
var url = require('url');

// 定义goIndex跳转首页函数
exports.goIndex = function(res, req) {
	// 获取index.html的文件路径
	var readPath = __dirname + '/' + url.parse('index.html').pathname;
	// 同步读取index.html文件的信息
    var indexPage = fs.readFileSync(readPath);
    res.end(indexPage); // 响应返回一个index.html页面到客户端
}