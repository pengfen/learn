<?php
// +----------------------------------------------------------------------
// | TOPThink [ WE CAN DO IT JUST THINK ]
// +----------------------------------------------------------------------
// | Copyright (c) 2010 http://topthink.com All rights reserved.
// +----------------------------------------------------------------------
// | Licensed ( http://www.apache.org/licenses/LICENSE-2.0 )
// +----------------------------------------------------------------------
// | Author: liu21st <liu21st@gmail.com>
// +----------------------------------------------------------------------
namespace Behavior;
use Think\Behavior;
defined('THINK_PATH') or exit();
/**
 * 系统行为扩展：表单令牌生成
 */
class TokenBuildBehavior extends Behavior {
    // 行为参数定义
    protected $options   =  array(
        'TOKEN_ON'       => false,     // 开启令牌验证
        'TOKEN_NAME'     => '__hash__',    // 令牌验证的表单隐藏字段名称
        'TOKEN_TYPE'     => 'md5',   // 令牌验证哈希规则
        'TOKEN_RESET'    => true, // 令牌错误后是否重置
    );

    public function run(&$content){
        if(C('TOKEN_ON')) {
            list($tokenName,$tokenKey,$tokenValue)=$this->getToken();
            $input_token = '<input type="hidden" name="'.$tokenName.'" value="'.$tokenKey.'_'.$tokenValue.'" />';
            $meta_token = '<meta name="'.$tokenName.'" content="'.$tokenKey.'_'.$tokenValue.'" />';
            if(strpos($content,'{__TOKEN__}')) {
                // 指定表单令牌隐藏域位置
                $content = str_replace('{__TOKEN__}',$input_token,$content);
            }elseif(preg_match('/<\/form(\s*)>/is',$content,$match)) {
                // 智能生成表单令牌隐藏域
                $content = str_replace($match[0],$input_token.$match[0],$content);
            }
            $content = str_ireplace('</head>',$meta_token.'</head>',$content);
        }else{
            $content = str_replace('{__TOKEN__}','',$content);
        }
    }

    //获得token
    private function getToken(){
        $tokenName  = C('TOKEN_NAME');
        $tokenType  = C('TOKEN_TYPE');
        if(!isset($_SESSION[$tokenName])) {
            $_SESSION[$tokenName]  = array();
        }
        // 标识当前页面唯一性
        $tokenKey   =  md5($_SERVER['REQUEST_URI']);
        if(isset($_SESSION[$tokenName][$tokenKey])) {// 相同页面不重复生成session
            $tokenValue = $_SESSION[$tokenName][$tokenKey];
        }else{
            $tokenValue = $tokenType(microtime(TRUE));
            $_SESSION[$tokenName][$tokenKey]   =  $tokenValue;
            if(IS_AJAX && C('TOKEN_RESET'))
                header($tokenName.': '.$tokenKey.'_'.$tokenValue); //ajax需要获得这个header并替换页面中meta中的token值
        }
        return array($tokenName,$tokenKey,$tokenValue); 
    }
}