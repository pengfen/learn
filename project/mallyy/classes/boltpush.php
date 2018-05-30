<?php
/**
 * Created by PhpStorm.
 * User: peng
 * Date: 2015/12/11
 * Time: 13:39
 * Description: 商检备案返回结果推送 
 * 由控制器 cbtpush.php 来调用
 */
class Boltpush
{
    // 商户备案返回结果
    function seller($postData){
        self::push_data($postData, 'tradeCode', 'QYXX');
    }

    // 品牌备案返回结果
    function brand($postData){
        self::push_data($postData, 'brandId', 'PPXX');
    }

    // 商品备案返回结果
    function goods($postData){
        self::push_data($postData, 'cargoCrossId', 'SPXX');
    }

    /**
     * 处理返回结果数据
     * @param $postData 结果数据
     * @param $declaraNo 对应的备案的字段名
    */
    function push_data($postData, $declaraNo, $apprType){
        $boltpushObj = new IModel("bolt_push");
        $data = array(
            "apprAdvice" => $postData['apprAdvice'],
            "apprMan" => $postData['apprMan'],
            "apprRtn" => $postData['apprRtn'],
            "apprTime" => strtotime($postData['apprTime']),
            'orgCode' => $postData['orgCode']
        );

        $boltpushObj->setData($data);
        $id = $boltpushObj->update(" apprType = '{$apprType}' and {$declaraNo} = '{$postData[$declaraNo]}'");
        $res = array(
            'recvTime' => date('YmdHis'),
            'declaraType' => $postData['apprType'],
            'tradeCode' => $postData['tradeCode'],
            'coCode' => $postData['coCode'],
            'brandId' => $postData['brandId'],
            'brandCode' => $postData['brandCode'],
            'codeId' => $postData['codeId'],
            'cargoCrossId' => $postData['cargoCrossId'],
            'spt1' => $postData['sp1'],
            'spt2' => $postData['sp2'],
            'spt3' => $postData['sp3']
        );
        if ($id) {
            $res['rtnCode'] = '000000';
            $res['rtnDesc'] = '正常返回';
        } else {
            $res['rtnCode'] = '000003';
            $res['rtnDesc'] = '数据保存失败';
        }
        // 响应返回
        echo urlencode(json_encode($res));
    }
}