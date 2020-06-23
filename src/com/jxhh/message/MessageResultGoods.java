package com.jxhh.message;

import java.io.Serializable;
import java.util.List;

public class MessageResultGoods {

    /**
     * id : 20200612100218210512
     * pushTime : 1591927338210
     * type : goods.alter
     * appID : 10
     * data : {"goodsIds":[30430]}
     * times : 1
     * createTime : 1591927323
     * url : http://wx.jxhh.com/api/rrcallback.php?uniacid=4
     */

    private String id;
    private long pushTime;
    private String type;
    private int appID;
    private DataBean data;
    private int times;
    private int createTime;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPushTime() {
        return pushTime;
    }

    public void setPushTime(long pushTime) {
        this.pushTime = pushTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appID) {
        this.appID = appID;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class DataBean implements Serializable {
        private List<Integer> goodsIds;

        public List<Integer> getGoodsIds() {
            return goodsIds;
        }

        public void setGoodsIds(List<Integer> goodsIds) {
            this.goodsIds = goodsIds;
        }
    }
}
