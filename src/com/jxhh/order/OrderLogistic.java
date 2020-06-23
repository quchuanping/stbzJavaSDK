package com.jxhh.order;

/**
 *
 * 物流信息返回
 */
public class OrderLogistic {


    /**
     * message : 温馨提示：您的订单预计6月11日09:00-15:00送达您手中
     * source : 系统
     * time : 1591758681
     */

    private String message;
    private String source;
    private int time;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
