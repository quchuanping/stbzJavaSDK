package com.jxhh.goods;

import java.lang.reflect.Type;
import java.util.TreeMap;

import com.google.gson.reflect.TypeToken;
import com.jxhh.InterFaceRequest;
import com.jxhh.exception.MustParamsException;
import com.jxhh.res.ApiResultObject;


/**
 * 商品详情请求类
 * @author Administrator
 *
 */
public class GoodsDetailRequest implements InterFaceRequest {

	private Integer id;

	
	public Integer getId() {
		return id;
	}

	/**
	 * 设置商品ID
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public RequestMethod getMethed() {
		// TODO Auto-generated method stub
		return RequestMethod.GET;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "/v2/Goods/Detail";
	}

	@Override
	public TreeMap<String, Object> getParams() throws MustParamsException {
		// TODO Auto-generated method stub

		if(null == getId()) throw new MustParamsException("对象GoodsDetail: id不能为空");
		TreeMap<String, Object> params = new TreeMap<String,Object>();
		params.put("id", getId());
		return params;
	}

	@Override
	public Integer getResponseType() {
		return 0;
	}

	@Override
	public Type getJsonClassType() {
		return new TypeToken<ApiResultObject<GoodsDetail>>() {}.getType();
	}


}
