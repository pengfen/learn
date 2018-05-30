<?php

$curlobj = curl_init();                 // 初始化
curl_setopt($curlobj, CURLOPT_URL, "http://list.jd.com/list.html?cat=1713,3287,3797");            // 设置访问网页的URL
curl_setopt($curlobj, CURLOPT_RETURNTRANSFER, true);                    // 执行>之后不直接打印出来
$output=curl_exec($curlobj);    // 执行
curl_close($curlobj);                   // 关闭cURL
echo $output;

$pattern = "/<span class=\"p-skip\">.*<b>([\d]+)<\/b>.*<\/span>/ism";
preg_match_all($pattern, $output, $matches);
//print_r($matches);
$total = $matches[1][0]; // 获取总页数
echo "<br/><br/>总页数是 ---> ".$total;

$i = 2;
while($i < $total){
//echo "调用成功";

$url = "http://list.jd.com/list.html?cat=1713,3287,3797&page=".$i;
$i ++;
echo $url;
$curl = curl_init();
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
$content = curl_exec($curl);
curl_close($curl);
echo  $content;
}
