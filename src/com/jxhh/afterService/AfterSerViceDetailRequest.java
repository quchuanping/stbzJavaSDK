package com.jxhh.afterService;

import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;

import java.lang.reflect.Type;
import java.util.TreeMap;

/**
 *
 * 售后详情
 */
public class AfterSerViceDetailRequest implements InterFaceRequest {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public RequestMethod getMethed() {
        return RequestMethod.GET;
    }

    @Override
    public String getUrl() {
        return "/v2/afterSale/"+getId();
    }

    @Override
    public TreeMap<String, Object> getParams() throws MustParamsException {

//        if(null == getId()) throw new MustParamsException("对象"+getClass()+": id不能为空");
//
        TreeMap<String,Object> params = new TreeMap<>();
//        params.put("id",getId());
        return params;
    }

    @Override
    public Integer getResponseType() {
        return 0;
    }

    @Override
    public Type getJsonClassType() {
        return null;
    }
}
