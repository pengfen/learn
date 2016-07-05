<?php
/*
 * 类中成员变量要加修饰符
*/
class crypt {
	public $pubkey = '-----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDGe72S6UC0ptsRPTc85SEhUl85
w+MnN77Y4VovQ0+R/jxEKXv1Zz7jyoNVNAFvYc0NQ+D0NcCqiiHdlqyIf2jmy2bf
F6UzFdP9Ll418ks9xUAvY2ZbF8L62Puwcli0fFlagkSUpcQgsaaYW22wqIOl9o+R
EvhjaOXBK4eOLMsv0QIDAQAB
-----END PUBLIC KEY-----';
	public $privkey = '-----BEGIN RSA PRIVATE KEY-----
MIICXAIBAAKBgQDGe72S6UC0ptsRPTc85SEhUl85w+MnN77Y4VovQ0+R/jxEKXv1
Zz7jyoNVNAFvYc0NQ+D0NcCqiiHdlqyIf2jmy2bfF6UzFdP9Ll418ks9xUAvY2Zb
F8L62Puwcli0fFlagkSUpcQgsaaYW22wqIOl9o+REvhjaOXBK4eOLMsv0QIDAQAB
AoGAKkK6kIc9kbldN4RzOHII5dFmGSSOPxFtfzwsOZf5XzpklpbGn+/FwjaiVAfo
rlCCmmpzgUvYo/cZUtb8EWwfZ3R0gJ+S+cmsrtIIMKUp5maE638KMrRkX00qj+fY
6fZwJVTtONN4OOsPcAw/6BMVAltHgOfyNo5XDnzaBkAJcGkCQQDydcpsIEG/pqui
198RZM0FhegVmepoajiwD/WT8hu8/lYafS4CmLdctd//NadshYHvFWYEvFAEIk+r
uTYe63lDAkEA0ZFCF+DLYptiqsSOeo5jPRR3l18jsb+l/SZYFh7w0fTVkRV8a3Ow
A4Omt5Uw6ryegHQJh3stQFXdqz1tVZzHWwJAN8ORn9a3aH3L4fMmUdjOMqP+oeE5
gXRUv2GcSL+ZU5lnckYyK9S173PBJfBQJmx6WuOgCBzLhnfhvQwm/2uHAwJABU7k
ma47+Jdu/FxWL4yDvvxRuyfRw6LTFYJvIMBP4UGOV0pwCFi50Jz5EBVbU9bLPP2z
cBcSolqKbtfzeQOrmQJBAKSS79hxJjK7KHa2wgFRx9tH/LgRqgBl7467SSlOL+TT
BKU0Jx1KD78LA1314Wax98O6c0GThbO9uJOQ0o58lRQ=
-----END RSA PRIVATE KEY-----';

    // 公钥 私钥可以直接赋值 也可以在构造方法中通过 file_get_contents 来加载
	// function __construct() {
	// 	$this->pubkey = file_get_contents('/home/openssl/public.key');  
	// 	$this->privkey = file_get_contents('/home/openssl/private.key');  
	// }

    // 使用公钥对data数据进行加密
    public function encrypt($data) {
    	if (openssl_public_encrypt($data, $encrypted, $this->pubkey))  
            $data = base64_encode($encrypted);  
        else  
            throw new Exception('Unable to encrypt data. Perhaps it is bigger than the key size?');  
  
        return $data;  
    }

    // 使用私钥对data进行解密
    public function decrypt($data) {
        if (openssl_private_decrypt(base64_decode($data), $decrypted, $this->privkey))  
            $data = $decrypted;  
        else  
            $data = '';  
  
        return $data;  
    }  
}

// 测试加密解密

$rsa = new crypt();
$mobile = '13585593461';
echo '当前手机号是 '.$mobile.PHP_EOL;
$secret = $rsa -> encrypt($mobile);
echo '加密后的手机号是 '.$secret.PHP_EOL;
echo '解密后的手机号是 '.($rsa -> decrypt($secret)).PHP_EOL;