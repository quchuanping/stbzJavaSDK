package com.jxhh.order;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 订单列表
 */
public class OrderList {


    /**
     * id : 11802
     * sn : 20200622151646241976
     * thirdSn : SH20200622151638351628
     * logisticFee : 800
     * goodsFee : 1344
     * address : {"consignee":"长相","phone":"13308889899","province":"安徽省","city":"合肥市","area":"瑶海区","street":"明光路街道","description":"9号"}
     * createdTime : 1592810206
     * payStatus : 1
     * checkStatus : 1
     * status : 1
     * children : [{"sn":"20200622151646241976_2_1","source":2,"logisticFee":800,"goodsFee":1344,"goodsStatus":0,"orderStatus":2,"goods":[{"sn":"20200622151646241976_2_1_1","goodsId":9401,"sku":9054,"skuName":"【舒缓蚊叮】护肤香膏20g×2支","image":"https://img13.360buyimg.com/n1/jfs/t1/126453/35/1319/78959/5ebba3c1E79314ed2/e909785ed7df9118.jpg","name":"润本（RUNBEN) 宝宝痱子香膏 20g×2支装 止痒膏 婴童护肤 护臀膏 润肤乳","number":1,"price":1344,"refundTime":0,"createdTime":1592810206,"payStatus":0,"deliverName":"","deliverNo":"","afterSaleStatus":0}],"deliverTime":0,"createdTime":1592810206,"shopInfo":{"name":"京东自营","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}}]
     */

    private int id;
    private String sn;
    private String thirdSn;
    private int logisticFee;
    private int goodsFee;
    private AddressBean address;
    private int createdTime;
    private int payStatus;
    private int checkStatus;
    private int status;
    private List<ChildrenBean> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getThirdSn() {
        return thirdSn;
    }

    public void setThirdSn(String thirdSn) {
        this.thirdSn = thirdSn;
    }

    public int getLogisticFee() {
        return logisticFee;
    }

    public void setLogisticFee(int logisticFee) {
        this.logisticFee = logisticFee;
    }

    public int getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(int goodsFee) {
        this.goodsFee = goodsFee;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(int createdTime) {
        this.createdTime = createdTime;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public int getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(int checkStatus) {
        this.checkStatus = checkStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<ChildrenBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenBean> children) {
        this.children = children;
    }

    public static class AddressBean implements Serializable {
        /**
         * consignee : 长相
         * phone : 13308889899
         * province : 安徽省
         * city : 合肥市
         * area : 瑶海区
         * street : 明光路街道
         * description : 9号
         */

        private String consignee;
        private String phone;
        private String province;
        private String city;
        private String area;
        private String street;
        private String description;

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class ChildrenBean implements Serializable {
        /**
         * sn : 20200622151646241976_2_1
         * source : 2
         * logisticFee : 800
         * goodsFee : 1344
         * goodsStatus : 0
         * orderStatus : 2
         * goods : [{"sn":"20200622151646241976_2_1_1","goodsId":9401,"sku":9054,"skuName":"【舒缓蚊叮】护肤香膏20g×2支","image":"https://img13.360buyimg.com/n1/jfs/t1/126453/35/1319/78959/5ebba3c1E79314ed2/e909785ed7df9118.jpg","name":"润本（RUNBEN) 宝宝痱子香膏 20g×2支装 止痒膏 婴童护肤 护臀膏 润肤乳","number":1,"price":1344,"refundTime":0,"createdTime":1592810206,"payStatus":0,"deliverName":"","deliverNo":"","afterSaleStatus":0}]
         * deliverTime : 0
         * createdTime : 1592810206
         * shopInfo : {"name":"京东自营","companyName":"","contactName":"","mobile":"","phone":"","contactURL":""}
         */

        private String sn;
        private int source;
        private int logisticFee;
        private int goodsFee;
        private int goodsStatus;
        private int orderStatus;
        private int deliverTime;
        private int createdTime;
        private ShopInfoBean shopInfo;
        private List<GoodsBean> goods;

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getLogisticFee() {
            return logisticFee;
        }

        public void setLogisticFee(int logisticFee) {
            this.logisticFee = logisticFee;
        }

        public int getGoodsFee() {
            return goodsFee;
        }

        public void setGoodsFee(int goodsFee) {
            this.goodsFee = goodsFee;
        }

        public int getGoodsStatus() {
            return goodsStatus;
        }

        public void setGoodsStatus(int goodsStatus) {
            this.goodsStatus = goodsStatus;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public int getDeliverTime() {
            return deliverTime;
        }

        public void setDeliverTime(int deliverTime) {
            this.deliverTime = deliverTime;
        }

        public int getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(int createdTime) {
            this.createdTime = createdTime;
        }

        public ShopInfoBean getShopInfo() {
            return shopInfo;
        }

        public void setShopInfo(ShopInfoBean shopInfo) {
            this.shopInfo = shopInfo;
        }

        public List<GoodsBean> getGoods() {
            return goods;
        }

        public void setGoods(List<GoodsBean> goods) {
            this.goods = goods;
        }

        public static class ShopInfoBean implements Serializable {
            /**
             * name : 京东自营
             * companyName :
             * contactName :
             * mobile :
             * phone :
             * contactURL :
             */

            private String name;
            private String companyName;
            private String contactName;
            private String mobile;
            private String phone;
            private String contactURL;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCompanyName() {
                return companyName;
            }

            public void setCompanyName(String companyName) {
                this.companyName = companyName;
            }

            public String getContactName() {
                return contactName;
            }

            public void setContactName(String contactName) {
                this.contactName = contactName;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getContactURL() {
                return contactURL;
            }

            public void setContactURL(String contactURL) {
                this.contactURL = contactURL;
            }
        }

        public static class GoodsBean implements Serializable {
            /**
             * sn : 20200622151646241976_2_1_1
             * goodsId : 9401
             * sku : 9054
             * skuName : 【舒缓蚊叮】护肤香膏20g×2支
             * image : https://img13.360buyimg.com/n1/jfs/t1/126453/35/1319/78959/5ebba3c1E79314ed2/e909785ed7df9118.jpg
             * name : 润本（RUNBEN) 宝宝痱子香膏 20g×2支装 止痒膏 婴童护肤 护臀膏 润肤乳
             * number : 1
             * price : 1344
             * refundTime : 0
             * createdTime : 1592810206
             * payStatus : 0
             * deliverName :
             * deliverNo :
             * afterSaleStatus : 0
             */

            private String sn;
            private int goodsId;
            private int sku;
            private String skuName;
            private String image;
            private String name;
            private int number;
            private int price;
            private int refundTime;
            private int createdTime;
            private int payStatus;
            private String deliverName;
            private String deliverNo;
            private int afterSaleStatus;

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public int getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(int goodsId) {
                this.goodsId = goodsId;
            }

            public int getSku() {
                return sku;
            }

            public void setSku(int sku) {
                this.sku = sku;
            }

            public String getSkuName() {
                return skuName;
            }

            public void setSkuName(String skuName) {
                this.skuName = skuName;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getRefundTime() {
                return refundTime;
            }

            public void setRefundTime(int refundTime) {
                this.refundTime = refundTime;
            }

            public int getCreatedTime() {
                return createdTime;
            }

            public void setCreatedTime(int createdTime) {
                this.createdTime = createdTime;
            }

            public int getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(int payStatus) {
                this.payStatus = payStatus;
            }

            public String getDeliverName() {
                return deliverName;
            }

            public void setDeliverName(String deliverName) {
                this.deliverName = deliverName;
            }

            public String getDeliverNo() {
                return deliverNo;
            }

            public void setDeliverNo(String deliverNo) {
                this.deliverNo = deliverNo;
            }

            public int getAfterSaleStatus() {
                return afterSaleStatus;
            }

            public void setAfterSaleStatus(int afterSaleStatus) {
                this.afterSaleStatus = afterSaleStatus;
            }
        }
    }
}
