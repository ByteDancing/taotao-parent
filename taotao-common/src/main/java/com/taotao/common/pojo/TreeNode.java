package com.taotao.common.pojo;

/**
 * 树形控件结点格式
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/8 23:47
 */
public class TreeNode {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TreeNode() {
    }

    public TreeNode(long id, String text, String state) {
        this.id = id;
        this.text = text;
        this.state = state;
    }
}
