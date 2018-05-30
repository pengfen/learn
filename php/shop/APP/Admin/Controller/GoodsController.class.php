<?php
    namespace Admin\Controller;
    use Component\AdminController;

    // 商品信息类
    class GoodsController extends AdminController{

      // 商品列表
      public function showlist(){
        $this -> display('list');
      }

    }