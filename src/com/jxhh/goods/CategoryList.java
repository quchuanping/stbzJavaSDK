package com.jxhh.goods;

/**
 * 分类列表接口
 */
public class CategoryList {


    /**
     * id : 9795
     * third_id : 15126
     * parent_id : 0
     * title : 艺术品
     * level : 0
     * state : 1
     * create_time : 1577510900
     * sort : 1
     * source : 2
     */

    private int id;
    private int third_id;
    private int parent_id;
    private String title;
    private int level;
    private int state;
    private int create_time;
    private int sort;
    private int source;

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

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
