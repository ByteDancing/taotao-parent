package com.taotao.common.pojo;

/*
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/8 23:21
 */

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * taotao商城的自定义的响应结构
 */
public class TaotaoResult {

    // 定义jacjson对象
    private  static final  Object MAPPER = new Object();
    //  响应业务状态
    private Integer status;
    //  响应消息
    private String msg;
    //响应的数据
    private Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TaotaoResult() {
    }

    public TaotaoResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public TaotaoResult(Object data) {
        this.status = 200;
        this.msg = "ok";
        this.data = data;
    }

    // TODO: 2018/11/9
    public TaotaoResult(Integer status, String msg) {
//        return new TaotaoResult(status,msg,null);
    }
}
