package com.chuxin.entity;

import java.io.Serializable;
/*
* 返回执行结果
*
* */
public class Result implements Serializable {
    private boolean success;//是否成功

    private String message;//返回信息

    public Result(boolean success, String massage) {
        this.success = success;
        this.message = massage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return message;
    }

    public void setMassage(String massage) {
        this.message = massage;
    }
}
