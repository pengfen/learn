// 路由模块处理
var ParseDns = require('./parse_dns.js'), // 获取DNS解析的文件模块对象定义
MainIndex = require('./main_index.js'); // 获取处理首页显示的文件模块对象定义
// 创建router方法 并将该方法暴露给外部接口
exports.router = function(res, req, pathname) {
	switch (pathname) { // 根据pathname不同 执行不同的处理逻辑
		case "/parse":
		    parseDns(res, req); // 执行DNS解析
		    break;
		default:
		    goIndex(res, req); // 响应HTML到客户端
	}
}
// exports.router = function() {}; 让router方法暴露给require返回的对象
// '/parse' 执行DNS模块ParseDns的方法parseDns解析域名