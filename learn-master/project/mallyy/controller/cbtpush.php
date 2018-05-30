<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2015/12/18
 * Time: 15:26
 * Description: 备案返回结果推送记录
 */
class Cbtpush extends IController
{
    // 国检备案
    function bolt(){
        //$logObj = new Log();
        //$logObj->write("operation", array("pushCallback:got a bolt push request"));
        $postData = file_get_contents('php://input'); // 由java接口调用
        $postData = self::basic($postData);

        $postObjData = json_decode($postData, true);
        $bolt = new boltpush(); // 调用classes文件下boltpush.php类文件
        if (array_key_exists('apprType', $postObjData) && $postObjData['apprType']) {
            switch($postObjData['apprType']){
                case 'QYXX':
                    $bolt->seller($postObjData);
                    break;
                case 'PPXX':
                    $bolt->brand($postObjData);
                    break;
                case 'SPXX':
                    $bolt->goods($postObjData);
                    break;
                default:
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
                    $res['rtnCode'] = '999999';
                    $res['rtnDesc'] = '错误报文类型';
                    echo urlencode(json_encode($res));
            }
        } else {
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
            $res['rtnCode'] = '999999';
            $res['rtnDesc'] = '报文类型不存在';
            echo urlencode($res);
        }

    }

    // 海关备案
    function custom(){
        $postData = file_get_contents('php://input');
        $postData = self::basic($postData);

        $custompushObj = new IModel("custom_push_goods");
        $postObjData = json_decode($postData, true);
        foreach ($postObjData['cargoes'] as $val) {
            $data = array(
                'cargoCodeTs' => $val['cargoCodeTS'],
                'cargoRate' => $val['cargoRate'],
                'status' => $val['status'],
                'effectStartTime' => strtotime($val['effectStartTime']),
                'effectEndTime' => strtotime($val['effectEndTime']),
                'statusMsg' => $val['statusMsg']
            );
            $custompushObj->setData($data);
            $id = $custompushObj->update(" declaraNo = '{$val['declaraNo']}'");
            if ($id) {
                echo "success";
                //echo self::resultInfo('000000', '正常返回');
            } else {
                echo "fail";
                //echo self::resultInfo('000002', '数据保存失败');
            }
        }
    }

    // 订单备案
    function order(){
        $postData = file_get_contents('php://input');
        $postData = self::basic($postData);

        $postObjData = json_decode($postData, true);
        $boltpushObj = new IModel("custom_push_order");
        $data = array(
            'merchantOrderId' => $postObjData['merchantOrderId'],
            'status' => $postObjData['status'],
            'statusMsg' => $postObjData['statusMsg']
        );
        $boltpushObj->setData($data);
        $id = $boltpushObj->update(" declaraNo = '{$postObjData['declaraNo']}'");
        if ($id) {
            echo "success";
            //echo self::resultInfo('000000', '正常返回');
        } else {
            echo "fail";
            //echo self::resultInfo('000002', '数据保存失败');
        }
    }

    // 处理基本数据
    function basic($postData){
        if (!isset($postData) || empty($postData)) {
            echo "fail";
            //echo self::resultInfo('999999', '没有数据');
            exit;
        }

        $postData = explode('&', $postData);
        foreach($postData as $key=>$value) {
            $val = explode('=', $value);
            if (isset($val[0]) && $val[1]) {
                if ($val[0] == 'EData') {
                    return urldecode($val[1]);
                }
            } else {
                //echo self::resultInfo('999999', 'EData 数据为空');
                echo "fail";
                exit;
            }
        }
    }

    // 威盛物流信息
    function logist(){
        $postData = file_get_contents('php://input');
        $postData = self::basic($postData);

        $logistpushObj = new IModel("logistics_push_order");
        $postObjData = json_decode($postData, true);
        if (isset($postObjData['Orders']) && is_array($postObjData['Orders'])) {
            foreach ($postObjData['Orders'] as $val) {
                $data = array(
                    'logID' => $val['LogID'],
                    'trackingID' => $val['TrackingID'],
                    'status' => $val['Status'],
                    'remark' => $val['Remark'],
                    'createTime' => strtotime($val['Createtime'])
                );
                $logistpushObj->setData($data);
                $id = $logistpushObj->add();
                if ($id) {
                    echo self::resultInfo('000000', '正常返回');
                } else {
                    echo self::resultInfo('000002', '数据保存失败');
                }
            }
        } else {
            echo self::resultInfo('000002', '数据格式不对');
        }
    }

    /**
     * 响应返回信息
     * @param $code 响应码
     * @param $mess 响应消息
    */
    function resultInfo($code, $mess){
        return json_encode(
            array(
                'rtnCode'=>$code,
                'rtnDesc'=>$mess
            )
        );
    }
}