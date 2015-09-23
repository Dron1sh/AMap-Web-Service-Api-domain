package com.qq.weixin.mp.map;

import java.io.Serializable;
import java.util.List;

/**
 * Created by young on 2015/9/23.
 */
public class PoiDO implements Serializable {
    private static final long serialVersionUID = 8685406291113884489L;
    private String id; //兴趣点id
    private String name; //兴趣点名称
    private String type; //兴趣点类型
    private String tel; //电话
    private String direction; //该POI到请求坐标的距离
    private String distance; //方向
    private String location; //坐标点
    private String address; //poi地址信息
    private String poiweight; //
    private String businessarea; //poi所在商圈名称

    public String getTel() {
        return tel;
    }

    public void setTel(Object tel) {
        if(tel instanceof String){
            this.tel = (String) tel;
        }else{
            this.tel = "";
        }
//        if(tel.length == 0){
//            return;
//        }
//        this.tel = tel;
    }

//    public void setTel(String tel){
//        this.tel = new String[1];
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoiweight() {
        return poiweight;
    }

    public void setPoiweight(String poiweight) {
        this.poiweight = poiweight;
    }

    public String getBusinessarea() {
        return businessarea;
    }

    public void setBusinessarea(String businessarea) {
        this.businessarea = businessarea;
    }
}
