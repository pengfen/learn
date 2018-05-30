// require 加载两个模块
var http = require('http');
url = require('url');
// 加载文件模块
var router = require('./router.js');

// 创建http服务器
http.createServer(function(req, res) {
	var pathname = url.parse(req.url).pathname;
	req.setEncoding('utf8');
	res.writeHead(200, {'Content-Type' : 'text/html'});
	router.router(res, req, pathname);
}).listen(3000, "127.0.0.1");
// router = require('./router.js') require 文件模块router.js 并且将返回对象赋值给router
// pathname HTTP请求路径
// req.setEncoding 设置HTTP返回字符串编码