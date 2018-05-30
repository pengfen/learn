// telnet 127.0.0.1 9000 写数据时
// 服务器端也会输出
var net = require('net');

var chatServer = net.createServer();

chatServer.on('connection', function(client) {
	// 服务端写出数据
	client.write('Hi! \n');
	
	telent 127.0.0.1 9000 后输入数据 服务端会有输出
	client.on('data', function(data) { 
		console.log(data);
	})
});
chatServer.listen(9000);