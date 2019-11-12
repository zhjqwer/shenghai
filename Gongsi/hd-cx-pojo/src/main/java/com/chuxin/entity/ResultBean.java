package com.chuxin.entity;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

    private Integer code; //规定 0表示成功 1表示失败
    private T data;
    private String message;

    public ResultBean() {
    }

    public ResultBean(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ResultBean successResult(String data){
        ResultBean resultBean=new ResultBean();
        resultBean.setData(data);
        resultBean.setCode(0);
        return resultBean;
    }

    public static ResultBean errResult(String data){
        ResultBean resultBean=new ResultBean();
        resultBean.setData(data);
        resultBean.setCode(1);
        return resultBean;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
