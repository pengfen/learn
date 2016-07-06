// cannot find module 'express'
// 安装express模块
// node.js command prompt 命令窗口下安装模块
// 进入以node.js安装目录
// npm install express
// 测试暂不知道
var express = require('express');

var app = express.createServer();

app.get('/', function (req, res) {
	res.send('welcome to node world');
})

app.listen(9000);