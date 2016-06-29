<?php
/**
 * Created by PhpStorm.
 * User: peng
 * Date: 2015/12/11
 * Time: 13:39
 * Description: 商检备案返回结果推送
 */
class Custompush extends IController
{

    function goods(){
        $str = IFilter::act(IReq::get('EData', 'post'));
        // 操作数据库
        if ($str) {
            $custompushObj = new IModel("custom_push_goods");
            $data = array(
                'cargoNameCh' => $str['cargoes']['cargoNameCh'],
                'cargoModel' => $str['cargoes']['cargoModel'],
                'cargoCode' => $str['cargoes']['cargoCode'],
                'declaraNo' => $str['cargoes']['declaraNo'],
                'cargoCodeTs' => $str['cargoes']['cargoCodeTs'],
                'cargoRate' => $str['cargoes']['cargoRate'],
                'status' => $str['cargoes']['status'],
                'effectStartTime' => $str['cargoes']['effectStartTime'],
                'effectEndTime' => $str['cargoes']['effectEndTime'],
                'statusMsg' => $str['cargoes']['statusMsg']
            );
            $custompushObj->setData($data);
            $id = $custompushObj->add();
            if (!$id) {
                $rtnCode = '000003';
                $rtnDesc = '数据保存失败';
            } else {
                $rtnCode = '000000';
                $rtnDesc = '正常返回';
            }
            // 响应返回
            echo $rtnDesc;
        } else {
            IError::show("403", '您访问的页面不存在');
        }
    }

    function order(){
        $str = IFilter::act(IReq::get('EData', 'post'));
        // 操作数据库
        if ($str) {
            $boltpushObj = new IModel("custom_push_order");
            $data = array(
                'merchantOrderId' => $str['merchantOrderId'],
                'declaraNo' => $str['declaraNo'],
                'status' => $str['status'],
                'statusMsg' => $str['statusMsg']
            );
            $boltpushObj->setData($data);
            $id = $boltpushObj->add();
            $id = '';
            if ($id) {
                $rtnCode = '000003';
                $rtnDesc = '数据保存失败';
            } else {
                $rtnCode = '000000';
                $rtnDesc = '正常返回';
            }
            // 响应返回
            echo json_encode(array(
                'rtnCode' => $rtnCode,
                'rtnDesc' => $rtnDesc
            ));
        } else {
            IError::show("403", '您访问的页面不存在');
        }
    }
}