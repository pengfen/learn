var net = require('net');

var chatServer = net.createServer();

chatServer.on('connection', function(client) {
	client.write('Hi! \n');
	client.write('Bye! \n');

	client.end();
});
chatServer.listen(9000);

// node chat.js
// 浏览器访问 127.0.0.1:9000
// 通过telnet访问 telent 127.0.0.1 9000

telnet 不是内部或外部命令解决方案
控制面板 --- 程序和功能 --- 打开或关闭window功能 --- Telnet客户端