package com.qq.weixin.mp.map;

import java.util.List;

/**
 * Created by young on 2015/9/23.
 */
public class AddressComponent {

    private String province;
    private String city;
    private String cityCode;
    private String district;
    private String adcode;
    private String township;
    private Neighborhood neighborhood;
    private Building building;
    private StreetNumber streetNumber;
    private BusinessArea[] businessAreas;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }


    public StreetNumber getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(StreetNumber streetNumber) {
        this.streetNumber = streetNumber;
    }

    public BusinessArea[] getBusinessAreas() {
        return businessAreas;
    }

    public void setBusinessAreas(BusinessArea[] businessAreas) {
        this.businessAreas = businessAreas;
    }
}
