<?php
$subject = "my email is caopeng8787@163.com";
$pattern = '/is (\w+@\w+\.\w+)/';
preg_match($pattern, $subject, $matches);
print_r($matches[1]);