<?php

// 测试爬虫 --- 爬 imooc.com 页上的数据

$curlobj = curl_init();                 // 初始化
curl_setopt($curlobj, CURLOPT_URL, "http://www.imooc.com/course/list?c=be");            // 设置访问网页的URL
curl_setopt($curlobj, CURLOPT_RETURNTRANSFER, true);                    // 执行>之后不直接打印出来
$output=curl_exec($curlobj);    // 执行
curl_close($curlobj);                   // 关闭cURL
// echo $output;

$pattern = "/<p class=\"text-ellipsis\">(.*)<\/p>/ism";
preg_match_all($pattern, $output, $matches);
print_r($matches[1]);

$i = 2;
while($i < 8) {
$url = "http://www.imooc.com/course/list?c=be&page=".$i;
echo $url;
$curl = curl_init();
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
$content = curl_exec($curl);
curl_close($curl);
$i ++;
//print_r($content);
$pattern = "/<p class=\"text-ellipsis\">(.*?)<\/p>/ism";
preg_match_all($pattern, $content, $match);
print_r($match);
}
