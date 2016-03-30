<?php
$data = array('id'=>1);
echo json_encode();
// set_time_limit(0);
        // $i = 0;
        // while (true) {
        //     $data = D('Advice') -> where(array('isread'=>0)) -> select(); // 查询未读消息
        //     if ($data) {
        //         echo json_encode($data);
        //         break; // 前端得使用延时加载技术 
        //     }
            
        //     // $i ++;
        //     // if ($i == 29) {
        //     //     break;
        //     // }
        //     sleep(1);
        // }