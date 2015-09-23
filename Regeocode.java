package com.qq.weixin.mp.map;

import java.util.List;

/**
 * Created by young on 2015/9/23.
 */
public class Regeocode {
    private String formatted_address;
    private AddressComponent addressComponent;
    private PoiDO[] pois;
    private Road[] roads;
    private RoadInter[] roadinters;
    private Aoi[] aois;

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public AddressComponent getAddressComponent() {
        return addressComponent;
    }

    public void setAddressComponent(AddressComponent addressComponent) {
        this.addressComponent = addressComponent;
    }

    public PoiDO[] getPois() {
        return pois;
    }

    public void setPois(PoiDO[] pois) {
        this.pois = pois;
    }

    public Road[] getRoads() {
        return roads;
    }

    public void setRoads(Road[] roads) {
        this.roads = roads;
    }

    public RoadInter[] getRoadinters() {
        return roadinters;
    }

    public void setRoadinters(RoadInter[] roadinters) {
        this.roadinters = roadinters;
    }

    public Aoi[] getAois() {
        return aois;
    }

    public void setAois(Aoi[] aois) {
        this.aois = aois;
    }
}
