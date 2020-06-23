package com.jxhh.order;

import java.io.Serializable;
import java.util.List;

public class CheckBanGoods{


    /**
     * msg : 操作成功
     * code : 1
     * data : {"available":[2033490],"ban":[123]}
     */

    private String msg;
    private int code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private List<Integer> available;
        private List<Integer> ban;

        public List<Integer> getAvailable() {
            return available;
        }

        public void setAvailable(List<Integer> available) {
            this.available = available;
        }

        public List<Integer> getBan() {
            return ban;
        }

        public void setBan(List<Integer> ban) {
            this.ban = ban;
        }
    }

}


