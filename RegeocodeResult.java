package com.qq.weixin.mp.map;

/**
 * Created by young on 2015/9/23.
 */
public class RegeocodeResult {
    private String status;
    private String info;
    private Regeocode regeocode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Regeocode getRegeocode() {
        return regeocode;
    }

    public void setRegeocode(Regeocode regeocode) {
        this.regeocode = regeocode;
    }
}
