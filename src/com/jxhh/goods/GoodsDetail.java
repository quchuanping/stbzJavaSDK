package com.jxhh.goods;

import java.io.Serializable;
import java.util.List;

/**
 * 商品详情类
 */
public class GoodsDetail {


    /**
     * id : 10362
     * third_id : 5923054
     * shop_id : 40054
     * source : 2
     * category_id : ;1319;1527;1557;
     * brand_id : 38650
     * third_category_name : 母婴,洗护用品,洗衣液/皂
     * third_brand_name : 润本（RUNBEN）
     * unit : 包
     * origin : 中国大陆
     * title : 润本（RUNBEN）香皂 儿童香皂 150g×3包 洗衣皂 婴儿洗衣皂 肥皂婴儿 尿布皂（香型随机发货）
     * market_price : 7200
     * guide_price : 2290
     * agreement_price : 2405
     * activity_price : 2290
     * activity_rate : 0
     * cover : https://img13.360buyimg.com/n0/jfs/t1/58116/6/10147/147489/5d77308dEc655b240/a4dc06786b433284.jpg
     * stock : 9999
     * total_stock : 9999
     * status : 0
     * sale : 0
     * real_sale : 0
     * real_month_sale : 0
     * real_return_sale : 0
     * real_month_return_sale : 0
     * created_time : 1562767987
     * updated_time : 1591598917
     * is_free_shipping : 0
     * choose_count : 0
     * description : <div skucode="100010"></div><div style="text-align:center;">
     <div style="text-align:center;">
     <img src="//img30.360buyimg.com/sku/jfs/t1/82842/29/9396/175413/5d70be26E032f2ffb/7d22aa7eba3dcea0.jpg" width="790" height="1067" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/46105/15/9592/129348/5d6cc339E4fbdd76b/dd4824a891f96919.jpg" width="790" height="652" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/84189/3/8911/236771/5d6cbb5fE8801eeca/12c74998f0b0e7e6.jpg" width="790" height="1126" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/75483/35/8959/140313/5d6cbb84E86284925/f7b6e0e67405da57.jpg" width="790" height="936" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/60413/33/8933/140649/5d6cbb8dE0f3ff7c8/7ee9149f5cda1944.jpg" width="790" height="934" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/79294/29/8882/141749/5d6cbba4E36b1add0/7da2e2c3f3b89b3b.jpg" width="790" height="1087" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/46954/24/9464/94200/5d6cbbabE4b0be630/fb97db7364a33f2f.jpg" width="790" height="741" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/65749/6/8970/80982/5d6cbbb4E887817a5/2a6caa7920153cf3.jpg" width="790" height="590" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/63738/28/8275/95660/5d65fb28E22d3fa2e/e0ce5386c6a03903.jpg" width="790" height="1042" alt="" /><img src="//img30.360buyimg.com/sku/jfs/t1/56765/14/8996/146003/5d65fb21Ee4280704/8d96e962de049563.jpg" width="790" height="671" alt="" />
     </div>
     </div>
     * covers : ["https://img13.360buyimg.com/n0/jfs/t1/58116/6/10147/147489/5d77308dEc655b240/a4dc06786b433284.jpg","https://img13.360buyimg.com/n0/jfs/t1/57514/31/9582/305789/5d6ccc1cEe50ae119/c8c98fc21313a824.jpg","https://img13.360buyimg.com/n0/jfs/t1/80462/6/9120/164122/5d6ccc27E4b8091b9/c396f36b74402963.jpg","https://img13.360buyimg.com/n0/jfs/t1/58185/7/8932/89067/5d6ccc2bEb3b7789d/a6b5110614790048.jpg","https://img13.360buyimg.com/n0/jfs/t1/103745/25/574/157576/5db1122fE545992d0/9431881660333310.jpg"]
     * attributes : []
     * specs : {"names":[{"id":10354,"goods_id":10362,"name":"默认","sort":0}],"values":[{"id":10354,"goods_id":10362,"spec_name_id":10354,"name":"默认","sort":0}],"options":[{"id":10349,"goods_id":10362,"third_id":5923054,"spec_value_ids":"10354","spec_value_names":"默认","market_price":7200,"guide_price":2290,"activity_price":2290,"agreement_price":2405,"stock":0,"weight":0,"image":"https://img13.360buyimg.com/n0/jfs/t1/58116/6/10147/147489/5d77308dEc655b240/a4dc06786b433284.jpg","status":0}]}
     */

    private int id;
    private int third_id;
    private int shop_id;
    private int source;
    private String category_id;
    private int brand_id;
    private String third_category_name;
    private String third_brand_name;
    private String unit;
    private String origin;
    private String title;
    private int market_price;
    private int guide_price;
    private int agreement_price;
    private int activity_price;
    private int activity_rate;
    private String cover;
    private int stock;
    private int total_stock;
    private int status;
    private int sale;
    private int real_sale;
    private int real_month_sale;
    private int real_return_sale;
    private int real_month_return_sale;
    private int created_time;
    private int updated_time;
    private int is_free_shipping;
    private int choose_count;
    private String description;
    private SpecsBean specs;
    private List<String> covers;
    private List<?> attributes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThird_id() {
        return third_id;
    }

    public void setThird_id(int third_id) {
        this.third_id = third_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getThird_category_name() {
        return third_category_name;
    }

    public void setThird_category_name(String third_category_name) {
        this.third_category_name = third_category_name;
    }

    public String getThird_brand_name() {
        return third_brand_name;
    }

    public void setThird_brand_name(String third_brand_name) {
        this.third_brand_name = third_brand_name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMarket_price() {
        return market_price;
    }

    public void setMarket_price(int market_price) {
        this.market_price = market_price;
    }

    public int getGuide_price() {
        return guide_price;
    }

    public void setGuide_price(int guide_price) {
        this.guide_price = guide_price;
    }

    public int getAgreement_price() {
        return agreement_price;
    }

    public void setAgreement_price(int agreement_price) {
        this.agreement_price = agreement_price;
    }

    public int getActivity_price() {
        return activity_price;
    }

    public void setActivity_price(int activity_price) {
        this.activity_price = activity_price;
    }

    public int getActivity_rate() {
        return activity_rate;
    }

    public void setActivity_rate(int activity_rate) {
        this.activity_rate = activity_rate;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTotal_stock() {
        return total_stock;
    }

    public void setTotal_stock(int total_stock) {
        this.total_stock = total_stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getReal_sale() {
        return real_sale;
    }

    public void setReal_sale(int real_sale) {
        this.real_sale = real_sale;
    }

    public int getReal_month_sale() {
        return real_month_sale;
    }

    public void setReal_month_sale(int real_month_sale) {
        this.real_month_sale = real_month_sale;
    }

    public int getReal_return_sale() {
        return real_return_sale;
    }

    public void setReal_return_sale(int real_return_sale) {
        this.real_return_sale = real_return_sale;
    }

    public int getReal_month_return_sale() {
        return real_month_return_sale;
    }

    public void setReal_month_return_sale(int real_month_return_sale) {
        this.real_month_return_sale = real_month_return_sale;
    }

    public int getCreated_time() {
        return created_time;
    }

    public void setCreated_time(int created_time) {
        this.created_time = created_time;
    }

    public int getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(int updated_time) {
        this.updated_time = updated_time;
    }

    public int getIs_free_shipping() {
        return is_free_shipping;
    }

    public void setIs_free_shipping(int is_free_shipping) {
        this.is_free_shipping = is_free_shipping;
    }

    public int getChoose_count() {
        return choose_count;
    }

    public void setChoose_count(int choose_count) {
        this.choose_count = choose_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SpecsBean getSpecs() {
        return specs;
    }

    public void setSpecs(SpecsBean specs) {
        this.specs = specs;
    }

    public List<String> getCovers() {
        return covers;
    }

    public void setCovers(List<String> covers) {
        this.covers = covers;
    }

    public List<?> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<?> attributes) {
        this.attributes = attributes;
    }

    public static class SpecsBean implements Serializable {
        private List<NamesBean> names;
        private List<ValuesBean> values;
        private List<OptionsBean> options;

        public List<NamesBean> getNames() {
            return names;
        }

        public void setNames(List<NamesBean> names) {
            this.names = names;
        }

        public List<ValuesBean> getValues() {
            return values;
        }

        public void setValues(List<ValuesBean> values) {
            this.values = values;
        }

        public List<OptionsBean> getOptions() {
            return options;
        }

        public void setOptions(List<OptionsBean> options) {
            this.options = options;
        }

        public static class NamesBean implements Serializable {
            /**
             * id : 10354
             * goods_id : 10362
             * name : 默认
             * sort : 0
             */

            private int id;
            private int goods_id;
            private String name;
            private int sort;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }
        }

        public static class ValuesBean implements Serializable {
            /**
             * id : 10354
             * goods_id : 10362
             * spec_name_id : 10354
             * name : 默认
             * sort : 0
             */

            private int id;
            private int goods_id;
            private int spec_name_id;
            private String name;
            private int sort;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public int getSpec_name_id() {
                return spec_name_id;
            }

            public void setSpec_name_id(int spec_name_id) {
                this.spec_name_id = spec_name_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }
        }

        public static class OptionsBean implements Serializable {
            /**
             * id : 10349
             * goods_id : 10362
             * third_id : 5923054
             * spec_value_ids : 10354
             * spec_value_names : 默认
             * market_price : 7200
             * guide_price : 2290
             * activity_price : 2290
             * agreement_price : 2405
             * stock : 0
             * weight : 0
             * image : https://img13.360buyimg.com/n0/jfs/t1/58116/6/10147/147489/5d77308dEc655b240/a4dc06786b433284.jpg
             * status : 0
             */

            private int id;
            private int goods_id;
            private int third_id;
            private String spec_value_ids;
            private String spec_value_names;
            private int market_price;
            private int guide_price;
            private int activity_price;
            private int agreement_price;
            private int stock;
            private int weight;
            private String image;
            private int status;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public int getThird_id() {
                return third_id;
            }

            public void setThird_id(int third_id) {
                this.third_id = third_id;
            }

            public String getSpec_value_ids() {
                return spec_value_ids;
            }

            public void setSpec_value_ids(String spec_value_ids) {
                this.spec_value_ids = spec_value_ids;
            }

            public String getSpec_value_names() {
                return spec_value_names;
            }

            public void setSpec_value_names(String spec_value_names) {
                this.spec_value_names = spec_value_names;
            }

            public int getMarket_price() {
                return market_price;
            }

            public void setMarket_price(int market_price) {
                this.market_price = market_price;
            }

            public int getGuide_price() {
                return guide_price;
            }

            public void setGuide_price(int guide_price) {
                this.guide_price = guide_price;
            }

            public int getActivity_price() {
                return activity_price;
            }

            public void setActivity_price(int activity_price) {
                this.activity_price = activity_price;
            }

            public int getAgreement_price() {
                return agreement_price;
            }

            public void setAgreement_price(int agreement_price) {
                this.agreement_price = agreement_price;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }
}
