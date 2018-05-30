// dns 解析模块
var querystring = require("querystring");
var dns = require('dns');

exports.parseDns = function(res, req) {
	var postData = '';
	req.addListener("data", function(postDataChunk) {
		postData += postDataChunk;
	});
	// HTTP响应html页面信息
	req.addListener('end', function() { // Domain:127.0.0.1IP:180.168.41.175
		var retData = getDns(postData, function(domain, address) {
			res.writeHead(200, {'Content-Type' : 'text/html'});
			res.end("<html><head><meta charset='utf8'><title>parse</title></head><body><div style='text-align:center'>Domain:<span style='color:red'>" + domain + "</span>IP:<span style='color:red'>" + address.join(',') + "</span></div></body></html>");
		});
		return;
	});
}

// 相当于私有方法
function getDns(postData, callback) {
	var domain = querystring.parse(postData).search_dns;
	// 异步解析域名
	dns.resolve(domain, function(err, address) {
		if (!address) {
			address = ['不存在域名'];
		}
		callback(domain, address);
	})
	// dns.resolve(domain, function(err, address) {}) 方法的使用可看官网API
	// var domain 应用querystring模块来获取post数据中键值为search_dns的值
}

// exports.parseDns = function(res, req) {} 将parseDns方法应用exports暴露给外部调用对象 有点类似类中的public方法 该方法的主要逻辑是执行DNS域名解析
// function getDns(){} 异步解析DNS 解析完成后执行回调用函数callback() 通过callback()函数来传递执行的结果domain和address;