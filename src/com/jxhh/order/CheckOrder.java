package com.jxhh.order;

import java.util.List;

/**
 *
 * 下单校验返回
 */
public class CheckOrder {


    /**
     * freight : 0
     * skus : [2033490]
     */

    private Long freight;

    private List<Integer> skus;

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }

    public List<Integer> getSkus() {
        return skus;
    }

    public void setSkus(List<Integer> skus) {
        this.skus = skus;
    }

}
