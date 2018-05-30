<?php
/**
 * Created by peng
 * User: peng
 * Date: 2015/12/10
 * Time: 10:34
 * Description: 与上海跨境电子商务进口服务平台对接
 */
class Cbt_Payment
{
    // 由东方支付获取相关私钥信息
    private $userInfo = array(
        'key' => 'ax2osr9zh70X70f28t22PhLN1jl4hivf',
        'coName' => '上海道领国际贸易有限公司',
        'coCode' => 'NWWX26z'
    );

    // 物流提供基本信息
    private $logistInfo = array(
        'key' => 'E77112A23EC91AC835BAB08E561B5B23',
        'appname' => 'ON-RAMP SERVICE,INC.',
        'appid' => '509E0B9EDAA81511442AFD3C1C38058F',
        'warehouseCode' => 'A055' // 仓库代码
    );

    // 国检申报相关接口
    private $sellerApply = "http://61.152.165.75:8087/ciqInterface/company/companylist.htm";
    private $brandApply = "http://61.152.165.75:8087/ciqInterface/brand/brandlist.htm";
    private $goodsApply = "http://61.152.165.75:8087/ciqInterface/cargo/cargolist.htm";

    // 国检查询接口
    private $boltInquiry = "http://61.152.165.75:8087/ciqInterface/query/auditQuery.htm";

    // 海关申报相关接口
    private $customGoodsApply = "http://61.152.165.77:8081/cboi/cargo/cargolist.htm";
    private $customOrderApply = "http://61.152.165.77:8081/cboi/order/orderlist.htm";

    // 海关查询接口
    private $customGoodsInquiry = "http://61.152.165.77:8081/cboi/cargo/cargoAuditQuery.htm";
    private $customOrderInquiry = "http://61.152.165.77:8081/cboi/order/orderAuditQuery.htm";

    // 威盛物流接口
    private $logistOrderApply = "http://api.kuajing56.com:8002/index.php?r=order/create";
    private $logistOrderInquiry = "http://api.kuajing56.com:8002/index.php?r=order/track";

    // 错误代码表
    private $errorCode = array(
        'ILLEGAL_SIGN' => '签名验证出错',
        'ILLEGAL_VERSION' => '无效版本号',
        'ILLEGAL_ARGUMENT' => '参数不正确',
        'HASH_NO_PRIVILEGE' => '没有权限访问该服务',
        'ILLEGAL_PARTNEr' => '电商标识不正确',
        'OUT_ORDER_ID_EXIST' => '电商订单已经存在',
        'OUT_CARGO_CODE_EXISt' => '商品编号已存在',
        'TOTAL_CARGO_FEE_LESSEQUAL_ZERO' => '全部商品合计总金额小于等于 0',
        'TOTAL_FEE_LESSEQUAL_ZERO' => '支付总金额小于等于 0',
        'TOTAL_FEE_OUT_OF_RANGE' => '支付总金额超出范围',
        'ILLEGAL_CARGO_CODE' => '非法商品信息, 商品未备案',
        'ILLEGAL_CARGO_NUM' => '非法商品集合数量, 无商品信息',
        'ILLEGAL_CARGO_FEE_PARAM' => '非法商品金额格式',
        'ILLEGAL_TOTAL_CARGO_FEE' => '非法商品总金额限制',
        'ILLEGAL_TAX_FEE_PARAM' => '非法行邮税金额格式',
        'ILLEGAL_RAY_FEE_PARAM' => '非法支付金额格式',
        'ILLEGAL_SENDER_COUNTRY' => '非法商品发件地国家或地区',
        'ILLEGAL_PAY_METHOD' => '非法支付方式',
        'ILLEGAL_ORDER_CARGO_TYPE' => '订单和商品业务类型不一致',
        'ILLEGAL_CUSTOM_DEC_CO' => '非法海关进境申报企业',
        'ILLEGAL_CLIENT_IP' => '客户端 IP 地址无权访问服务',
        'SYSTEM_ERROR' => '系统错误'
    );

    // 查询状态代码表
    private $code = array(
        'NO_ORDER' => '无此订单',
        'ORDER_UNDECLARED' => '订单未申报',
        'ORDER_APPROVING' => '订单审核中',
        'ORDER_AUDIT_SUCCESS' => '订单申报成功',
        'ORDER_AUDIT_FAILURE' => '订单申报失败',
        'ORDER_CLEARANCE' => '通关放行',
        'NO_CARGO' => '无此商品',
        'CARGO_UNDECLARED' => '商品未申报',
        'CARGO_APPROVING' => '商品审核中',
        'CARGO_AUDIT_SUCCESS' => '商品备案成功',
        'CARGO_AUDIT_FAILURE' => '商品案失败'
    );

    /**
     * 国检基本数据
     */
    private function basicData(){
        return array(
            'version' => 'v2.0',
            'commitTime' => date('YmdHis'),
            'coCode' => $this->userInfo['coCode'],
            'serialNumber' => $this->userInfo['coCode'].date('YmdHis').'00001',
        );
    }

    /**
     * 海关基本数据
     */
    private function customBasicData(){
        return array(
            'version' => 'v1.2',
            'commitTime' => date('YmdHis'),
            'coName' => $this->userInfo['coName'],
            'coCode' => $this->userInfo['coCode'],
            'serialNumber' => $this->userInfo['coCode'].date('YmdHis').'00001',
        );
    }

    /**
     * 物流基本数据
     */
    private function logistBasicData(){
        return array(
            'appname' => $this->logistInfo['appname'],
            'appid' => $this->logistInfo['appid']
        );
    }

    /**
     * 国检商户申报
     * @param $arr 备案数据
     * @param $id 备案 id
     * {"brandCode":"","brandId":"","cargoCrossId":"","coCode":"NWWX26z","codeId":"","declaraType":"QYXX","recvTime":"20160120162026",
     * "rtnCode":"000000","rtnDesc":"商户数据校验成功！","sp1":"","sp2":"","sp3":"","tradeCode":"3100100170"}"  平台返回数据
     */
    public function seller($id, $arr){
        $response = self::request_by_curl($arr, $this->sellerApply);
        if (strpos($response, '000000')) {
            $res = urldecode($response);
            $res = json_decode($res, true);
            if (array_key_exists('tradeCode', $res) && $res['tradeCode']) {
                // 修改商户备案表的备案号
                self::update_declar("bolt_seller", $id, $res['tradeCode']);
                // 添加审核结果表中基本数据
                $boltObj = new IModel('bolt_push');
                $tradeCode = $res['tradeCode'];
                $sellerInfo = $boltObj->getObj(" apprType = 'QYXX' and tradeCode = '{$tradeCode}'", 'id');
                if (!$sellerInfo) {
                    self::bolt_push('QYXX', array('tradeCode'=>$res['tradeCode']));
                }
                return 'success';
            } else {
                return '返回备案号错误';
            }
        } else {
            $res = urldecode($response);
            $res = json_decode($res, true);
            if (array_key_exists('rtnDesc', $res) && $res['rtnDesc']) {
                return $res['rtnDesc'];
            } else {
                return '未知错误';
            }
        }
    }

    /**
     * 国栓品牌申报
     * @param $bid 品牌id
     * @param $id 品牌申报id
     * @param $arr 品牌申报数据
     */
    public function brand($bid, $id, $arr){
        $arr['brand']['evaluateFlag'] = '';
        $arr['brand']['brandCode'] = '';
        $arr['brand']['evaluateUnit'] = '';
        $response = self::request_by_curl($arr, $this->brandApply);

        /**
         * "brandCode":"","brandId":"10001","cargoCrossId":"","coCode":"NWWX26z","codeId":"","declaraType":"PPXX",
         * "recvTime":"20160121142444","rtnCode":"000000","rtnDesc":"品牌数据校验成功！","sp1":"","sp2":"","sp3":"","tradeCode":"3100100170"
        */
        if (strpos($response, '000000')) {
            $res = urldecode($response);
            $res = json_decode($res, true);
            if (array_key_exists('brandId', $res) && $res['brandId']) {
                // 修改品牌备案表的备案号
                self::update_declar("bolt_brand", $id, $res['brandId']);
                // 添加审核结果表中基本数据
                $boltObj = new IModel('bolt_push');
                $brandId = $res['brandId'];
                $sellerInfo = $boltObj->getObj(" apprType = 'PPXX' and brandId = '{$brandId}'", 'id');
                if (!$sellerInfo) {
                    self::bolt_push('PPXX', array('brandId' => $res['brandId'], 'tradeCode' => $res['tradeCode']));
                }
                // 更改品牌表中审报状态
                $brandObj = new IModel('brand');
                if ($bid) {
                    $status = array('bolt_status' => 1);
                    $brandObj->setData($status);
                    $brandObj->update(' id =' . $bid);
                } else {
                    // 回填数据
                    $brandArr = array(
                        'name' => $arr['brand']['brandNameFrn'],
                        'brandNameChn' => $arr['brand']['brandNameChn'],
                        'bolt_status' => 1,
                        'bolt_id' => $id
                    );
                    $brandObj->setData($brandArr);
                    $brandObj->add();
                }
                return 'success';
            } else {
                return '返回备案号错误';
            }
        } else {
            $res = urldecode($response);
            $res = json_decode($res, true);
            if (isset($res['rtnDesc']) && $res['rtnDesc']) {
                return $res['rtnDesc'];
            } else {
                return '未知错误';
            }
        }
    }

    /**
     * 国检商品申报
     * @param $gid 商品id
     * @param $id 商品申报id
     * @param $arr 商品申报数据
     */
     function goods($gid, $id, $arr){
         $arr['cargo']['hsCode'] = '';
         $arr['cargo']['materialID'] = '';
         $arr['cargo']['copgNo'] = '';
         $arr['cargo']['price'] = '';
         $arr['cargo']['otherType'] = '';
         $arr['cargo']['unit1'] = '';
         $arr['cargo']['unit2'] = '';
         $arr['cargo']['chkPrice'] = '';
         $arr['cargo']['noteS'] = '';
         $arr['cargo']['nameOther'] = '';
         $arr['cargo']['cargoUnit'] = '';
         $arr['cargo']['cargoNum'] = '';
         $arr['cargo']['standardPlace'] = '';
         $arr['cargo']['producerName'] = '';
         $arr['cargo']['cargoFunction'] = '';
         $arr['cargo']['cargoPurpose'] = '';
         $arr['cargo']['cargoIngredient'] = '';
         $arr['cargo']['cargoFactoryDate'] = '';
         $arr['cargo']['cargoModel'] = '';
         $arr['cargo']['transgenicFlag'] = '';
         $arr['cargo']['forbidImportFlag'] = '';
         $arr['cargo']['flag1712'] = '';
         $arr['cargo']['remark'] = '';

         $response = self::request_by_curl($arr, $this->goodsApply);
         if (strpos($response, '000000')) {
            $res = urldecode($response);
            $res = json_decode($res, true);
            if (array_key_exists('cargoCrossId', $res) && $res['cargoCrossId']) {
                // 修改商品备案表的备案号
                self::update_declar("bolt_goods", $id, $res['cargoCrossId']);
                // 添加审核结果表中基本数据
                $boltObj = new IModel('bolt_push');
                $cargoCrossId = $res['cargoCrossId'];
                $sellerInfo = $boltObj->getObj(" apprType = 'SPXX' and cargoCrossId = '{$cargoCrossId}'", 'id');
                if (!$sellerInfo) {
                    self::bolt_push('SPXX', array('cargoCrossId' => $res['cargoCrossId'], 'brandId' => $res['brandId'], 'tradeCode' => $res['tradeCode']));
                }
                // 更改商品表中国检审报状态
                self::apply_status('goods', 'bolt', $id, $gid);

                return 'success';
            } else {
                return "返回备案号错误";
            }
         } else {
             $res = urldecode($response);
             $res = json_decode($res, true);
             if (isset($res['rtnDesc']) && $res['rtnDesc']) {
                 return $res['rtnDesc'];
             } else {
                 return "未知错误";
             }
         }
    }

    /**
     * 修改国检备案中的备案号
     * @param $table 表名
     * @param $id 对应备案的id
     * @param $declar 备案号
    */
    function update_declar($table, $id, $declar){
        $boltObj = new IModel($table);
        $data = array(
            'declaraNo' => $declar
        );
        // 更改表的中备案号
        $boltObj->setData($data);
        $where = ' id ='.$id;
        $boltObj->update($where);
    }

    /**
     * 国检审核结果表中添加基本数据
     * @param $type 报文类型
     * @param $bolt 要保存字段数组
     */
    function bolt_push($type, $bolt=array()){
        $boltObj = new IModel("bolt_push");
        $boltArr = array(
            'apprType' => $type,
            'apprRtn' => 0
        );
        if ($bolt) {
            foreach ($bolt as $key => $val) {
                $boltArr[$key] = $val;
            }
        }
        $boltObj->setData($boltArr);
        $boltObj->add();
    }

    /**
     * 修改国检 海关状态
     * @param $table 表名
     * @param $type 状态类型
     * @param $id 申报表id
     * @param $tid 表id
     */
    function apply_status($table, $type, $id, $tid){
        $applyObj = new IModel($table);
        $data = array(
            $type.'_status' => 1,
            $type.'_id' => $id
        );
        $applyObj->setData($data);
        $applyObj->update(" id =".$tid);
    }

    /**
     * 添加备案号
     * @param $table 表名
     * @param $declaraNo 备案号
     */
    function custom_push($table, $declaraNo){
        $boltObj = new IModel($table);
        $boltArr = array(
            'declaraNo' => $declaraNo,
            'status' => 0
        );
        $boltObj->setData($boltArr);
        $boltObj->add();
    }

    /**
     * 海关订单申报
     * @param $oid 订单id
     * @param $id 商品申报id
     * @param $arr 商品申报数据
     */
    public function customOrder($oid, $id, $arr){
        $response = self::request_by_curl($arr, $this->customOrderApply, "custom");
        if (strpos($response, 'SUCCESS')) {
            $response = urldecode($response);
            $res = json_decode($response);
            // 修改订单备案表的备案号
            self::update_declar("custom_order", $id, $res->declaraNo);
            // 添加审核结果表中基本数据
            self::custom_push('custom_push_order', $res->declaraNo);
            // 更改订单表中海关状态
            self::apply_status('order','custom',$id,$oid);

            return 'success';
        } else {
            $response = urldecode($response);
            $res = json_decode($response);
            return $res->errorMsg;
        }
    }

    /**
     * 海关商品申报
     * @param $gid 商品id
     * @param $id 商品申报id
     * @param $arr 商品申报数据
     */
    public function customGoods($gid, $id, $arr){
        $response = self::request_by_curl($arr, $this->customGoodsApply, 'custom');
        if (strpos($response, 'SUCCESS')) {
            $response = urldecode($response);
            $res = json_decode($response);
            foreach ($res->cargoes as $val) {
                // 修改商品备案表的备案号
                self::update_declar("custom_goods", $id, $val->declaraNo);
                // 添加审核结果表中基本数据
                self::custom_push('custom_push_goods', $val->declaraNo);
                // 更改商品表中海关审报状态
                self::apply_status('goods', 'custom', $id, $gid);
            }
            return 'success';
        } else {
            $response = urldecode($response);
            $res = json_decode($response);
            return $res->errorMsg;
        }
    }

    /**
     * 物流订单申报
     * @param $oid 订单id
     * @param $id 商品申报id
     * @param $arr 商品申报数据
     */
    public function logistOrder($oid, $id, $arr){
        $arr['WarehouseCode'] = $this->logistInfo['warehouseCode'];
        $arr = array('orders' => array($arr));
        $response = self::request_by_curl($arr, $this->logistOrderApply, "logist");

        if (strpos($response, '000000')) {
            // 更改订单表中物流审报状态
            self::apply_status('order','logist',$id,$oid);

            return 'success';
        } else {
            $res = json_decode($response, true);
            if (isset($res['rtnList'][0]['Reason']) && $res['rtnList'][0]['Reason']) {
                $message = $res['rtnList'][0]['Reason'];
            } else {
                $message = '未知错误';
            }
            return $message;
        }
    }

    /**
     * 商检商户查询
     * "apprAdvice":"","apprRtn":"12","apprTime":"20160120162027","apprType":"QYXX","aprrMan":"","brandCode":"","brandId":"",
     * "cargoCrossId":"","codeId":"","orgCode":"132dd465","rtnCode":"000000","rtnDesc":"信息查询成功！","spt1":"","spt2":"",
     * "spt3":"","tradeCode":"3100100170" // 查询返回数据
     */
    public function boltSellerInquiry($declaraNo) {
        // 执行查询
        $msg = self::inquiry($this->boltInquiry, $declaraNo, 'bolt', 'QYXX');
        // 返回显示数据
        if (!$msg) {
            return "备案号不存在";
        } else {
            return self::resShowData('bolt_seller', $declaraNo, $msg, array('fullName'));
        }
    }

    /**
     * 商检品牌查询
     */
    public function boltBrandInquiry($declaraNo) {
        // 执行查询
        $msg = self::inquiry($this->boltInquiry, $declaraNo, 'bolt', 'PPXX');
        // 返回显示数据
        if (!$msg) {
            return "备案号不存在";
        } else {
            return self::resShowData('bolt_brand', $declaraNo, $msg, array('brandNameChn'));
        }
    }

    /**
     * 商检商户查询
     */
    public function boltGoodsInquiry($declaraNo) {
        // 执行查询
        $msg = self::inquiry($this->boltInquiry, $declaraNo, 'bolt', 'SPXX');
        // 返回显示数据
        if (!$msg) {
            return "备案号不存在";
        } else {
            return self::resShowData('bolt_goods', $declaraNo, $msg, array('nameCh'));
        }
    }

    /**
     * 海关商品查询
    */
    public function customGoodsInquiry($declaraNo) {
        // 执行查询
        $msg = self::inquiry($this->customGoodsInquiry, $declaraNo);
        // 返回显示数据
        if (!$msg) {
            return "备案号不存在";
        } else {
            return self::resShowData('custom_goods', $declaraNo, $msg, array('cargoNameCh'));
        }
    }

    /**
     * 海关订单查询
     */
    public function customOrderInquiry($declaraNo) {
        // 扫行查询
        $msg = self::inquiry($this->customOrderInquiry, $declaraNo);
        // 处理查询返回数据
        if (!$msg) {
            return "备案号不存在";
        } else {
            return self::resShowData('custom_order', $declaraNo, $msg, array('merchantOrderId', 'cargoDescript'));
        }
    }

    /**
     * 处理查询返回数据
     * @param $table 表名
     * @param $declaraNo 备案号
     * @param $msg 查询数据
     * @param $column 页面要显示的字段名
    */
    public function resShowData($table, $declaraNo, $msg, $column = array()){
        $applyObj = new IModel($table);
        // 处理字段 (将字段数组拼接为一个字符串)
        $str = implode(',', $column);

        $applyInfo = $applyObj->getObj(" declaraNo = '{$declaraNo}'", "{$str}");
        if ($applyInfo) {
            $data = array(
                'declaraNo' => $declaraNo,
                'msg' => $msg
            );
            foreach ($applyInfo as $key=>$val) {
                $data[$key] = $val;
            }
            return $data;
        }
        return "备案号不存在";
    }

    /**
     * 执行查询并返回查询结果
     * @param $url 调用平台接口
     * @param $declaraNo 备案号
     * @param $type 1 国检
    */
    public function inquiry($url, $declaraNo, $type='', $declaraType=''){
        if ($type == 'bolt') {
            $response = self::bolt_by_curl($url, $declaraType, $declaraNo);
            $condition = '000000';
            $msg = 'apprRtn';
        } else {
            $response = self::get_by_curl($url, $declaraNo);
            $condition = 'SUCCESS';
            $msg = 'msg';
        }

        if (strpos($response, $condition)) {
            $response = urldecode($response);
            $res = json_decode($response, true);
            if (array_key_exists($msg, $res) && $res[$msg]) {
                return $res[$msg];
            }
        }
        return '';
    }

    /**
     * 物流订单状态查询
     */
    public function logistOrderInquiry($declaraNo) {
        $response = self::request_by_curl(array('TrackingID'=>$declaraNo),$this->logistOrderInquiry, 'logist');
        if (strpos($response, '000000')) {
            $response = urldecode($response);
            $res = json_decode($response, true);
            if (array_key_exists('rtnList', $res) && $res['rtnList']) {
                return $res['rtnList'];
            }
        }
        return '';
    }

    /**
     * 调用服务平台接口
     * @param $arr 备案数据
     * @param $url 平台接口地址
     * @param $type 判断是国检还是海关
     */
    private function request_by_curl($arr, $url, $type='') {
        $key = $this->userInfo['key'];
        if ($type == 'custom') { // 海关备案
            $basic = self::customBasicData();
        } elseif ($type == 'logist') { // 物流
            $basic = self::logistBasicData();
            $key = $this->logistInfo['key'];
        } else { // 国检
            $basic = self::basicData();
        }

        $array = array_merge($basic, $arr);
        $EData = json_encode($array, JSON_UNESCAPED_UNICODE); // 原生数据
        $SignMsg = strtoupper(md5($EData.$key)); // 签名数据
        if ($type != 'custom' && $type != 'logist') {
            $EData = urlencode(urlencode($EData));
        } else {
            $EData = urlencode($EData);
        }

        $post_string = "EData={$EData}&SignMsg={$SignMsg}";

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, $url);
        //curl_setopt($ch, CURLOPT_HEADER, 1);
        curl_setopt($ch, CURLOPT_POST, 1);
        curl_setopt($ch, CURLOPT_POSTFIELDS, $post_string);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        $data = curl_exec($ch);
        curl_close($ch);

        return $data;
    }

    /**
     * 调用服务平台接口 (用于海关)
     * @param $url 平台接口地址
     * @param $declaraNo 备案号
     */
    private function get_by_curl($url, $declaraNo) {
        $array = array(
            'version' => 'v1.2',
            'coCode' => $this->userInfo['coCode'],
            'declaraNo' => $declaraNo
        );
        $EData = json_encode($array, JSON_UNESCAPED_UNICODE); // 原生数据
        $EData = urlencode($EData);
        $url = $url."?EData={$EData}";

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, $url);
        //curl_setopt($ch, CURLOPT_HEADER, 1);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        $data = curl_exec($ch);
        curl_close($ch);

        return $data;
    }

    /**
     * 调用服务平台接口 (用于国检)
     * @param $url 平台接口地址
     * @param $type 报文类型
     * @param $declaraNo 备案号
     */
    private function bolt_by_curl($url, $type, $declaraNo) {
        if ($type == "QYXX") {
            $tradeCode = $declaraNo;
            $brandId = '';
            $cargoCrossId = '';
        }

        if ($type == 'PPXX') {
            // 查询企业编号
            $brandObj = new IModel('bolt_push');
            $brandInfo = $brandObj->getObj(" apprType = 'PPXX' and brandId = '{$declaraNo}'", 'tradeCode');
            if ($brandInfo) {
                $tradeCode = $brandInfo['tradeCode'];
            } else {
                return "企业编号为空";
            }
            $brandId = $declaraNo;
            $cargoCrossId = '';
        }

        if ($type == 'SPXX') {
            $brandObj = new IModel('bolt_push');
            $brandInfo = $brandObj->getObj(" apprType = 'SPXX' and cargoCrossId = '{$declaraNo}'", 'tradeCode,brandId');
            if ($brandInfo) {
                $tradeCode = $brandInfo['tradeCode'];
                $brandId = $brandInfo['brandId'];
            } else {
                return "企业编号为空";
            }
            $cargoCrossId = $declaraNo;
        }

        $array = array(
            'version' => 'v2.0',
            'srcNCode' => '',
            'coName' => $this->userInfo['coName'],
            'coCode' => $this->userInfo['coCode'],
            "declaraType" => $type,
            "tradeCode" => $tradeCode,
            "brandId" => $brandId,
            "cargoCrossId" => $cargoCrossId,
            "brandCode" => "",
            "codeId" => ""
        );

        $EData = json_encode($array, JSON_UNESCAPED_UNICODE); // 原生数据
        $EData = urlencode($EData);
        $url = $url."?EData={$EData}";

        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, $url);
        //curl_setopt($ch, CURLOPT_HEADER, 1);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        $data = curl_exec($ch);
        curl_close($ch);

        return $data;
    }
}