package com.chuxin.pojo;

import java.io.Serializable;

public class Oauths implements Serializable {
    private Integer id;

    private Integer uId;

    private String oauthsType;

    private String oauthsOpenid;

    private String unionid;

    private String accessToken;

    public Oauths() {
    }

    public Oauths(Integer id, Integer uId, String oauthsType, String oauthsOpenid, String unionid, String accessToken) {
        this.id = id;
        this.uId = uId;
        this.oauthsType = oauthsType;
        this.oauthsOpenid = oauthsOpenid;
        this.unionid = unionid;
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "Oauths{" +
                "id=" + id +
                ", uId=" + uId +
                ", oauthsType='" + oauthsType + '\'' +
                ", oauthsOpenid='" + oauthsOpenid + '\'' +
                ", unionid='" + unionid + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getOauthsType() {
        return oauthsType;
    }

    public void setOauthsType(String oauthsType) {
        this.oauthsType = oauthsType == null ? null : oauthsType.trim();
    }

    public String getOauthsOpenid() {
        return oauthsOpenid;
    }

    public void setOauthsOpenid(String oauthsOpenid) {
        this.oauthsOpenid = oauthsOpenid == null ? null : oauthsOpenid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }
}