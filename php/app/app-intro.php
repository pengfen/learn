一 读取数据库方式开发首页接口
从数据库获取信息 ---> 封装 ---> 生成接口数据
应用场景 数据 时效性 比较高的系统

二 读取缓存方式开发首页接口
从数据库获取信息 ---> 封装 (---> 缓存 ---> 再次请求) ---> 返回数据
应用场景 减少数据库压力
定时读取缓存方式开发首页接口
数据库 ---> crontab ---> 缓存
http 请求 ---> 缓存 ---> 封装并返回数据
掌握如何获取数据
掌握如何将获取的数据生成通信数据

分析部分 App 首页
安装 start bluestacks 安卓模拟器

http请求 ---> 服务器 ---> 查询数据 ---> 返回数据



接口文档

请求地址 http://www.app.com/init.php

请求参数 GET 请求参数

header 头 (所有请求希望都带 http header 头信息)

app_id integer 
version_id 大版本号 必须传递
version_mini 小版本号 必须传递
did string 设备号 必须传递

流程图

开启 ---> 版本分析 ---> 是否需要更新 ---> 更新
                             |             | 
                             |             |
                          APK首页  <-------|

返回数据
code int 返回状态 (200 请求成功 400 失败)
message string 提示信息 (数据返回成功, 失败)
data array 返回的数据信息
data/app_id int Appid 如 1 代表安卓手机设备
data/version_id int 服务器上最新的大版本
data/version_mini int 小版本
data/is_update int 是否更新
data/apk_url string apk 最新地址