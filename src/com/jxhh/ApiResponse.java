package com.jxhh;

import java.util.List;

/**
 * 通用接口相应类
 * @param <T>
 */
public class ApiResponse<T> {


    private Integer code;

    private String msg;

    private String resultString;

    private T object;

    private Long count;

    private List<T> lists;

    /**
     * 获取返回code
     * @return
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取返回msg
     * @return
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取返回的JSON字符串
     * @return
     */
    public String getResultString() {
        return resultString;
    }

    public void setResultString(String resultString) {
        this.resultString = resultString;
    }


    /**
     * 获取返回对象的实体
     * 当返回JSON对象的data为一个对象时调用此方法
     * @return
     */
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    /**
     * 获取列表接口的总条数
     * @return
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 获取接口列表
     * 当接口为列表类型或返回数据为数据时调用此方法
     * @return
     */
    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
    }

}
