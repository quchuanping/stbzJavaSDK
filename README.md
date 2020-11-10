胜天半子－聚合供应链JAVA版本SDK

SDK需要Apache Httpclient4.5.12 和 Gson支持

支持包Maven地址
&lt;!-- apache HttpClient --&gt;

&lt;dependency&gt;

&lt;groupId&gt;org.apache.httpcomponents&lt;/groupId&gt;
  
&lt;artifactId&gt;httpclient&lt;/artifactId&gt;
  
&lt;version&gt;4.5.12&lt;/version&gt;
  
&lt;/dependency&gt;

&lt;!-- https://mvnrepository.com/artifact/com.google.code.gson/gson --&gt;

&lt;dependency&gt;

&lt;groupId&gt;com.google.code.gson&lt;/groupId&gt;

&lt;artifactId&gt;gson&lt;/artifactId&gt;

&lt;/dependency&gt;


SDK　Jar包下载地址

https://github.com/quchuanping/stbzJavaSDK/blob/master/out/artifacts/sdk_jar/sdk.jar


SDK基本用法示例


            String appKey = "";　　//appkey
            String appSecret = "";    //app秘钥
 
            //获取api
            ApiClient apiClient = new ApiClient(appKey, appSecret);
            apiClient.setDebug(true); //设置调试模式

            //商品列表
            GoodsListRequest goodsListRequest = new GoodsListRequest();
            goodsListRequest.setPage(1);
            goodsListRequest.setLimit(10);
            goodsListRequest.setSource(2);
            ApiResponse<GoodsList> apiResponse = apiClient.exec(goodsListRequest);
            List<GoodsList> listGoods = apiResponse.getLists();
            GoodsList goodsList = listGoods.get(0);
            System.out.println(goodsList.getTitle());
            System.out.println(apiResponse.getCount());

            //商品详情
            GoodsDetailRequest goodsDetailRequest = new GoodsDetailRequest();
            goodsDetailRequest.setId((long)10362);
            ApiResponse<GoodsDetail> apiResponse2 = apiClient.exec(goodsDetailRequest);
            GoodsDetail goodsDetail = apiResponse2.getObject();
            System.out.println(goodsDetail.getTitle());


            //批量获取商品详情
            BatchGoodsDetailRequest batchGoodsDetailRequest = new BatchGoodsDetailRequest();
            batchGoodsDetailRequest.setIds("10362,10363");
            ApiResponse<GoodsDetail> apiResponse2 = apiClient.exec(batchGoodsDetailRequest);
            List<GoodsDetail> listGoodsDetail = apiResponse2.getLists();
            GoodsDetail goodsDetail = listGoodsDetail.get(0);
            System.out.println(goodsDetail.getTitle());


            //批量更新商品
            BatchGoodsUpdateRequest batchGoodsUpdateRequest = new BatchGoodsUpdateRequest();
            batchGoodsUpdateRequest.setGoodsIds("10362,10363");
            ApiResponse<String> apiResponse5 = apiClient.exec(batchGoodsUpdateRequest);
            List<String> list = apiResponse5.getLists();
            System.out.println(list.size());


            //获取商品评论
            GoodsCommentsRequest goodsCommentsRequest = new GoodsCommentsRequest();
            goodsCommentsRequest.setPage(1);
            goodsCommentsRequest.setLimit(10);
            goodsCommentsRequest.setSku((long)10362);
            ApiResponse<GoodsComments> apiResponse = apiClient.exec(goodsCommentsRequest);
            List<GoodsComments> list = apiResponse.getLists();
            System.out.println(apiResponse.getCount());


            //全量商品分类
            CategoryListRequest request = new CategoryListRequest();
            request.setPage(1);
            request.setLimit(10);
            request.setSource(2);

            ApiResponse<CategoryList> apiResponse3 = apiClient.exec(request);
            List<CategoryList> listCateGory = apiResponse3.getLists();
            CategoryList categoryList = listCateGory.get(0);
            System.out.println(categoryList.getTitle());
            
            //逐级商品列表
            SubCategoryRequest subCategoryRequest = new SubCategoryRequest();
            subCategoryRequest.setParent_id(0);
            subCategoryRequest.setSource(2);
            ApiResponse<SubCategory> apiResponseSubCate = apiClient.exec(subCategoryRequest);
            List<SubCategory> list = apiResponseSubCate.getLists();
            System.out.println(list.get(0).getTitle());


            //下单校验
            CheckOrderRequest checkOrderRequest = new CheckOrderRequest();
            CheckOrderRequest.Address address = new CheckOrderRequest.Address();
            address.setConsignee("小明");
            address.setPhone("13800138000");
            address.setProvince("北京");
            address.setCity("北京");
            address.setArea("朝阳区");
            address.setStreet("大屯街道");
            address.setDescription("光明小区110号");

            CheckOrderRequest.Spu spu = new CheckOrderRequest.Spu();
            spu.setNumber((long)1);
            spu.setSku((long)2033490);
            List spuList = new ArrayList<>();
            spuList.add(spu);

            checkOrderRequest.setSpu(spuList);
            checkOrderRequest.setAddress(address);

            ApiResponse apiResponse4 = apiClient.exec(checkOrderRequest);
            System.out.println(apiResponse4.getMsg());
            List<CheckOrder> lists = apiResponse4.getLists();
            CheckOrder checkOrder = lists.get(0);
            System.out.println(checkOrder.getSkus().get(0));


            //商品可售性校验
            CheckBanGoodsRequest checkBanGoodsRequest = new CheckBanGoodsRequest();
            CheckBanGoodsRequest.Address address2 = new CheckBanGoodsRequest.Address();
            address.setConsignee("小明");
            address.setPhone("13800138000");
            address.setProvince("北京");
            address.setCity("北京");
            address.setArea("朝阳区");
            address.setStreet("大屯街道");
            address.setDescription("光明小区110号");

            CheckOrderRequest.Spu spu2 = new CheckOrderRequest.Spu();
            spu2.setNumber((long)1);
            spu2.setSku((long)2033490);
            List spuList2 = new ArrayList<>();

            spuList.add(spu2);
            checkBanGoodsRequest.setSpu(spuList2);
            checkBanGoodsRequest.setAddress(address2);
            ApiResponse<CheckBanGoods> apiResponse41 = apiClient.exec(checkBanGoodsRequest);
            System.out.println(apiResponse41.getObject().getCode());
            CheckBanGoods checkBanGoods = apiResponse41.getObject();
            CheckBanGoods.DataBean dataBean = checkBanGoods.getData();
            System.out.println(dataBean.getAvailable().get(0));


            //下单
            PlayOrderRequest playOrderRequest = new PlayOrderRequest();
            PlayOrderRequest.Address address3 = new PlayOrderRequest.Address();
            address2.setConsignee("小明");
            address2.setPhone("13800138000");
            address2.setProvince("北京");
            address2.setCity("北京");
            address2.setArea("朝阳区");
            address2.setStreet("大屯街道");
            address2.setDescription("光明小区110号");

            PlayOrderRequest.Spu spu3 = new PlayOrderRequest.Spu();
            spu3.setNumber((long)1);
            spu3.setSku((long)2033490);
            List spuList3 = new ArrayList<>();
            spuList2.add(spu3);

            playOrderRequest.setSpu(spuList3);
            playOrderRequest.setAddress(address3);
            playOrderRequest.setOrderSn("SN1234567890");

            ApiResponse apiResponse5 = apiClient.exec(playOrderRequest);
            System.out.println(apiResponse5.getMsg());
            if(1 == apiResponse5.getCode()){
                System.out.println("下单成功");
            }


            //失败补单
            OrderAgainRequest orderAgainRequest = new OrderAgainRequest();
            orderAgainRequest.setOrderSn("");//二级订单号
            ApiResponse apiResponse51 = apiClient.exec(orderAgainRequest);
            if(1 == apiResponse51.getCode()){
                System.out.println("补单成功");
            }

            // 失败退单
            OrderErrorRefund orderErrorRefund = new OrderErrorRefund();
            orderErrorRefund.setOrderSn("");//二级订单号
            ApiResponse apiResponse = apiClient.exec(orderErrorRefund);
            if(1 == apiResponse.getCode()){
                System.out.println("成功");
            }

            //  全平台订单列表
            OrderListRequest orderListRequest = new OrderListRequest();
            OrderListRequest.Search oredrSearch = new OrderListRequest.Search();
            // oredrSearch.setGoodsName("护肤");
            orderListRequest.setPage(1);
            orderListRequest.setLimit(10);
            //  orderListRequest.setSearch(oredrSearch);
            ApiResponse<OrderList> apiResponse42 = apiClient.exec(orderListRequest);
            List<OrderList> orderToList = apiResponse42.getLists();
            OrderList orderList = orderToList.get(0);
            System.out.println(orderList.getAddress().getConsignee());
            System.out.println(orderList.getChildren().get(0).getGoods().get(0).getSkuName());
            
            
            //分平台订单
            SubOrderListRequest subOrderListRequest = new SubOrderListRequest();
            subOrderListRequest.setSource(2);
            subOrderListRequest.setPage(1);
            subOrderListRequest.setLimit(1);
            ApiResponse<SubOrderList> apiResponse = apiClient.exec(subOrderListRequest);
            System.out.println(apiResponse.getLists().get(0).getAddress().getConsignee());


            // 订单详情
            OrderDetailRequest orderDetailRequest = new OrderDetailRequest();
            orderDetailRequest.setSn("20200622151646241976_2_1_1"); //三级订单号
            ApiResponse<OrderDetail> apiResponse43 = apiClient.exec(orderDetailRequest);
            OrderDetail orderDetail = apiResponse43.getObject();
            System.out.println(orderDetail.getAddress().getConsignee());


            // 错误订单
            OrderErrorListRequest orderErrorListRequest = new OrderErrorListRequest();
            orderErrorListRequest.setPage(1);
            orderErrorListRequest.setLimit(10);
            ApiResponse<OrderErrorList> apiResponse44 = apiClient.exec(orderErrorListRequest);
            List<OrderErrorList> orderLists = apiResponse44.getLists();
            OrderErrorList orderList = orderLists.get(0);
            System.out.println(orderList.getMessage());


             // 查询物流
            OrderLogisticRequest orderLogisticRequest = new OrderLogisticRequest();
            orderLogisticRequest.setOrderSn("SH20200622151638351628");
            orderLogisticRequest.setSku((long)9054);

            ApiResponse<OrderLogistic> apiResponse6 = apiClient.exec(orderLogisticRequest);
            OrderLogistic orderLogistic = apiResponse6.getObject();
            System.out.println(orderLogistic.getInfo().getName());
            System.out.println(orderLogistic.getInfo().getNo());



            //物流公司列表
            OrderLogisticFirmsRequest orderLogisticFirmsRequest = new OrderLogisticFirmsRequest();
            ApiResponse<OrderLogisticFirms> apiResponse7 = apiClient.exec(orderLogisticFirmsRequest);
            List<OrderLogisticFirms> listOrderLogisticFirms = apiResponse7.getLists();
            OrderLogisticFirms orderLogisticFirms = listOrderLogisticFirms.get(0);
            System.out.println(orderLogisticFirms.getName());

            //在线选品v2（新版）
            GoodsStorageOnlineListRequest goodsStorageOnlineRequest = new GoodsStorageOnlineListRequest();
            goodsStorageOnlineRequest.setPage(1);
            goodsStorageOnlineRequest.setLimit(1);
            GoodsStorageOnlineListRequest.Section section = new GoodsStorageOnlineListRequest.Section();
            section.setFrom(10);
            section.setTo(100);
            goodsStorageOnlineRequest.setAgreement_price(section);
            ApiResponse<GoodsStorageOnlineList> apiResponse4 =  apiClient.exec(goodsStorageOnlineRequest);
            GoodsStorageOnlineList goodsStorageOnlineList = apiResponse4.getLists().get(0);
            System.out.println(goodsStorageOnlineList.getThird_brand_name());
  

            //选品分组列表
            GoodsGroupListRequest goodsGroupListRequest = new GoodsGroupListRequest();
            goodsGroupListRequest.setPage(1);
            goodsGroupListRequest.setLimit(10);
            ApiResponse<GoodsGroupList> apiResponse = apiClient.exec(goodsGroupListRequest);
            GoodsGroupList goodsGroupList = apiResponse.getLists().get(0);
            System.out.println(goodsGroupList.getName());
            
            //选品分组商品列表
            GoodsGroupGoodsListRequest goodsGroupGoodsListRequest = new GoodsGroupGoodsListRequest();
            goodsGroupGoodsListRequest.setPage(1);
            goodsGroupGoodsListRequest.setLimit(1);
            GoodsGroupGoodsListRequest.Section section = new GoodsGroupGoodsListRequest.Section();
            section.setFrom(1);
            section.setTo(1000);
            goodsGroupGoodsListRequest.setActivity_price(section);
            apiClient.exec(goodsGroupGoodsListRequest);
            ApiResponse<GoodsGroupGoodsList> apiResponse = apiClient.exec(goodsGroupGoodsListRequest);
            GoodsGroupGoodsList goodsGroupGoodsList = apiResponse.getLists().get(0);
            System.out.println(goodsGroupGoodsList.getTitle());
        
        
            //选品库添加商品
            GoodsStorageAddRequest goodsStorageAddRequest = new GoodsStorageAddRequest();
            Set<Long> set = new HashSet<>();
            set.add((long)226415);
            goodsStorageAddRequest.setGoods_ids(set);
            ApiResponse<GoodsStorage> apiResponse8 = apiClient.exec(goodsStorageAddRequest);
            GoodsStorage goodsStorage = apiResponse8.getObject();
            System.out.println(apiResponse8.getCode());
            System.out.println(goodsStorage.getTotal());


            //我的选品库列表
            GoodsStorageListRequest goodsStorageListRequest = new GoodsStorageListRequest();
            goodsStorageListRequest.setPage(1);
            goodsStorageListRequest.setLimit(10);
            goodsStorageListRequest.setSource(0);
            ApiResponse<GoodsList> apiResponse9 = apiClient.exec(goodsStorageListRequest);
            List<GoodsList> listGoods2 = apiResponse9.getLists();
            GoodsList goodsList2 = listGoods2.get(0);
            System.out.println(goodsList2.getTitle());
            System.out.println(apiResponse9.getCount());


            //选品库删除选品
            GoodsStorageDelRequest goodsStorageDelRequest = new GoodsStorageDelRequest();
            Set<Long> set2 = new HashSet<>();
            set2.add((long)226415);
            goodsStorageDelRequest.setGoods_ids(set2);
            ApiResponse<GoodsStorage> apiResponse10 = apiClient.exec(goodsStorageDelRequest);
            GoodsStorage goodsStorage2 = apiResponse10.getObject();
            System.out.println(apiResponse10.getCode());
            System.out.println(goodsStorage2.getTotal());

            //清空选品库 执行此操作选品库所有产品会被删除 ******谨慎操作******
            GoodsStorageClearRequest goodsStorageClearRequest = new GoodsStorageClearRequest();
            ApiResponse<GoodsStorage> apiResponse11 = apiClient.exec(goodsStorageClearRequest);
            if(1 == apiResponse11.getCode()){
                System.out.println("清空成功");
            }
            
            
            //售后校验
            BeforeCheckRequest beforeCheckRequest = new BeforeCheckRequest();
            beforeCheckRequest.setOrderSn("ME20200824141843646823");
            beforeCheckRequest.setSku((long)9778319);
            ApiResponse<BeforeCheck> apiResponse =  apiClient.exec(beforeCheckRequest);
            BeforeCheck beforeCheck = apiResponse.getObject();
            System.out.println(beforeCheck.getReasonsType().get(0).getName());
            
            
             //申请售后
            AfterServiceApplyRequest afterServiceApplyRequest = new AfterServiceApplyRequest();
            afterServiceApplyRequest.setOrderSn("20200610111116");
            afterServiceApplyRequest.setSku((long)2033490);
            afterServiceApplyRequest.setNum((long)1);
            afterServiceApplyRequest.setLogisticFee((long)10);
            afterServiceApplyRequest.setServiceTypeCode("50");
            afterServiceApplyRequest.setReasonsDescription("不想要了");
            
            
            
            //售后上传图片
            AfterServiceUploadRequest afterServiceUploadRequest = new AfterServiceUploadRequest();
            String pic = new String("图片base64原始数据，不要描述部分,参考base64img.txt");
            List<String> list = new ArrayList<>();
            list.add(pic);
            afterServiceUploadRequest.setPictures(list);
            afterServiceUploadRequest.setSku((long)9604070);
            afterServiceUploadRequest.setOrderSn("SN20200813181909lZ");
            ApiResponse<AfterServiceUpload> apiResponse1 = apiClient.exec(afterServiceUploadRequest);
            System.out.println(apiResponse1.getObject().getUrls().get(0));
            
            
            
            //售后列表
            AfterServiceListRequest afterServiceListRequest = new AfterServiceListRequest();
            afterServiceListRequest.setPage(1);
            afterServiceListRequest.setLimit(10);
            ApiResponse<AfterServiceList> apiResponse = apiClient.exec(afterServiceListRequest);
            System.out.println(apiResponse.getLists().get(0).getOrderSn());
        
            

            //售后详情
            AfterServiceDetailRequest afterSerViceDetailRequest = new AfterServiceDetailRequest();
            afterSerViceDetailRequest.setId((long)67);
            ApiResponse<AfterServiceDetail> apiResponse = apiClient.exec(afterSerViceDetailRequest);
            System.out.println(apiResponse.getObject().getId());
            
            
            //资金流水记录
            CashFlowListRequest cashFlowListRequest = new CashFlowListRequest();
            cashFlowListRequest.setPage(1);
            cashFlowListRequest.setLimit(10);
            cashFlowListRequest.setStartTime(System.currentTimeMillis()/1000 - 3600*24);
            cashFlowListRequest.setEndTime(System.currentTimeMillis()/1000);
            ApiResponse<CashFlowList> apiResponse =  apiClient.exec(cashFlowListRequest);
            String orderSn = apiResponse.getLists().get(0).getOrder_sn();
            System.out.println(orderSn);


            
            
        //消息处理
        //实现 MessageHandle接口 或者 继承SimpleMessageHandle类
        Boolean msgBoolean = MessageTools.exec(json, new SimpleMessageHandle());
       
       
      
技术支持: quchuanping@qq.com    
