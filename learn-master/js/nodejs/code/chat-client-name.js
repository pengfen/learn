// telnet 127.0.0.1 9000 开启客户端 (开多个客户端)
// 为每个客户端定义名字
// 服务器端不输出数据 将数据发送到所有客户端
var net = require('net');

var chatServer = net.createServer();
clientList = [];

chatServer.on('connection', function(client) {
	client.name = client.remoteAddress + ' : ' + client.remotePort; // 定义客户端名字 IP地址:端口 ::ffff:127.0.0.1 : 60142 (注意每打开一个端口都会变)
	client.write('Hi ' + client.name + '!\n');

	clientList.push(client); // 把所有客户端放进list中
	
	client.on('data', function(data) {
		broadcast(data, client); // 调用自定义函数
	});

	function broadcast(message, client) {
		// 注意判断条件 < 而不应 <= 否则长度超出 会出现 cannot read property 'write' of undefined
		for (var i = 0; i < clientList.length; i ++) {
			if (client !== clientList[i]) {
				clientList[i].write(client.name + " says " + message);
			}
		};
	}

});
chatServer.listen(9000);