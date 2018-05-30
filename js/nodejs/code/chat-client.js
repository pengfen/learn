// telnet 127.0.0.1 9000 开启客户端 (开多个客户端)
// 服务器端不输出数据 将数据发送到所有客户端

var net = require('net');

var chatServer = net.createServer();
clientList = []; // 定义一个客户端列表

chatServer.on('connection', function(client) {
	client.write('Hi! \n');

	clientList.push(client); // 把所有客户端放进list中
	
	client.on('data', function(data) {
		for (var i = 0; i < clientList.length; i+= 1) {
			// 把数据发送给所有客户端
			clientList[i].write(data);
		}
	})
});
chatServer.listen(9000);