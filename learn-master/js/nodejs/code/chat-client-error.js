// telnet 127.0.0.1 9000 开启客户端 (开多个客户端)
// 为每个客户端定义名字
// 服务器端不输出数据 将数据发送到所有客户端
// 销毁断开的客户端
// 服务器端通过 console.log 来记录运行,错误等信息
var net = require('net');

var chatServer = net.createServer();
clientList = [];

chatServer.on('connection', function(client) {
	client.name = client.remoteAddress + ' : ' + client.remotePort; // 定义客户端名字 IP地址:端口 ::ffff:127.0.0.1 : 60142 (注意每打开一个端口都会变)
	client.write('Hi ' + client.name + '!\n');
	console.log(client.name + 'joined');

	clientList.push(client); // 把所有客户端放进list中
	
	client.on('data', function(data) {
		broadcast(data, client); // 调用自定义函数
	});

	function broadcast(message, client) {
		// 注意判断条件 < 而不应 <= 否则长度超出 会出现 cannot read property 'write' of undefined
		for (var i = 0; i < clientList.length; i ++) {
			if (client !== clientList[i]) {

				if (clientList[i].writeable) { // 检查socket的可写状态
					clientList[i].write(client.name + " says " + message);
				} else {
					// cleanup.push(clientList[i]); cleanup is not defined
					clientList[i].destroy();
				}
				
			}
		};
	}

	// 在写入循环中删除死节点 消除垃圾索引
	client.on('end', function() { // 将断开的客户端移出
		console.log(client.name + ' quit');
		clientList.splice(clientList.indexOf(client), 1);
	})

	client.on('error', function (e) {
		console.log(e);
	})

});
chatServer.listen(9000);