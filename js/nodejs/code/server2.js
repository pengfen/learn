var http = require('http');
http.createServer(function (req, res) {
	res.writeHead(200, {'Content-Type' : 'text/plain'});
	res.end('welcome to nodejs world');
}).listen(8124, '127.0.0.1');
console.log('服务器运行在 http://127.0.0.1:8124');

// 使用nodejs命令窗口测试
// node server.js

// 客户端使用 http://127.0.0.1:8124/
welcome to nodejs world