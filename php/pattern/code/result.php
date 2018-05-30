<?php
$str = "<ul><li>item 1</li><li>item 2</li></ul><ul><li>item 3</li><li>item 4</li></ul>";
$p = "/<li>(.*?)<\/li>\s*<li>(.*?)<\/li>/i";
preg_match_all($p, $str, $matches);
print_r($matches);